package com.jjj.mybatis.pojo;

/**
 * @className: com.jjj.mybatis.pojo.User
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-12 7:53
 */
public class User {
    private int id;
    private String name;
    private String gender;
    private String department;

    public User(int id, String name, String gender, String department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    public User() {
    }

    public User(String name, String gender, String department) {
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
