package cn.com.cxy.mybatis.domain;

import lombok.Data;

@Data
public class Acct {

    private String id;

    private String payName;

    /**
     * 银行账号
     */
    private String bankNo;
}
