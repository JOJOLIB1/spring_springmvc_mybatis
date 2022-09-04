package com.jjj.spring5.jdbctemplate;

import java.io.Serializable;
import java.util.Objects;

/**
 * @className: com.jjj.spring5.jdbctemplate.User
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-03 21:24
 */
// 应该放在实体(bean)目录中
public class User implements Serializable {
    public String userName;
    public String userPwd;

    public User(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(userPwd, user.userPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userPwd);
    }
}
