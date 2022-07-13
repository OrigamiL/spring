package com.weifang.pojo;

/**
 * @Program: spring
 * @ClassName: Accounts
 * @Version: 1.0
 * @Description: 账户类
 * @Author: zhezhi
 * @Create-Date: 2022-07-13 16:59
 **/

public class Accounts {
    private Integer accountId;
    private String accountName;
    private String accountContent;

    public Accounts() {
    }

    public Accounts(Integer accountId, String accountName, String accountContent) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountContent = accountContent;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountContent() {
        return accountContent;
    }

    public void setAccountContent(String accountContent) {
        this.accountContent = accountContent;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountContent='" + accountContent + '\'' +
                '}';
    }
}
