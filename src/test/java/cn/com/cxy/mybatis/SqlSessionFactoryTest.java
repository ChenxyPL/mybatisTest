package cn.com.cxy.mybatis;

import cn.com.cxy.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlSessionFactoryTest {

    public static void main(String[] args) throws IOException {
        InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Map paraMap=new HashMap();
        paraMap.put("userId","12341234");
        paraMap.put("userName","ashan");
        List<User> list = sqlSession.selectList("cn.com.cxy.mybatis.dao.UserMapper.selectUserDetail",paraMap);
    }
}
