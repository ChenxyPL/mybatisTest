package cn.com.cxy.mybatis.dao;

import cn.com.cxy.mybatis.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectUserDetail(@Param("userId") String id);
}
