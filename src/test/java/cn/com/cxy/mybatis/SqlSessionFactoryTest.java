package cn.com.cxy.mybatis;

import cn.com.cxy.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlSessionFactoryTest {

    SqlSession sqlSession = null;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void selectOne() {
        Map paraMap = new HashMap();
        paraMap.put("userId", 1);
        paraMap.put("userName", "abcd");
        List<User> list = sqlSession.selectOne("cn.com.cxy.mybatis.dao.UserMapper.selectUserDetail", paraMap);
    }

    @Test
    public void selectInclude() {
        Map paraMap = new HashMap();
        paraMap.put("userId", "12341234");
        paraMap.put("userName", "abcd");
        List<User> list = sqlSession.selectList("cn.com.cxy.mybatis.dao.UserMapper.selectUserDetailInclude", paraMap);
    }
}
