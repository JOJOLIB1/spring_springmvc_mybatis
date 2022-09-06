package com.jjj.mvc.pojo;

/**
 * @className: com.jjj.mvc.pojo.User
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-06 23:31
 */
public class User {
    private String id;
    private String username;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
