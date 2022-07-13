package com.weifang.pojo;

/**
 * @Program: spring
 * @ClassName: Users
 * @Version: 1.0
 * @Description: 用户实体类
 * @Author: zhezhi
 * @Create-Date: 2022-07-13 16:11
 **/

public class Users {
    private Integer userId;
    private String username;
    private String password;

    public Users() {
    }

    public Users(Integer userId, String username, String upass) {
        this.userId = userId;
        this.username = username;
        this.password = upass;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
