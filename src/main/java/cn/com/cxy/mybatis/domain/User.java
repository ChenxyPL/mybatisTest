package cn.com.cxy.mybatis.domain;

import lombok.Data;

import java.util.List;

@Data
public class User {

    /**
     * 用户id，主键
     */
    private String id;

    private String username;

    /**
     * 用户号码
     */
    private String svcnum;

    private String password;

    /**
     * 一个用户只能对应一个客户
     */
    private Cust cust;

    /**
     * 一个用户可以有多个账户
     */
    private List<Acct> accts;

    /**
     * 用户类型，两种：普通用户和重要用户
     */
    private UserType type;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }
}
