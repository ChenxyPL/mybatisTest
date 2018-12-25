package cn.com.cxy.mybatis.dao;

import cn.com.cxy.mybatis.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectUserDetail(@Param("userId") String id, @Param("userName") String userName);

    User selectUserDetailInclude(@Param("userId") String id, @Param("userName") String userName);
}
