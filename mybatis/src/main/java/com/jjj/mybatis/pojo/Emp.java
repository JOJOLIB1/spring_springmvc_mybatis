package com.jjj.mybatis.pojo;

/**
 * @className: com.jjj.mybatis.pojo.Emp
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-12 20:54
 */
public class Emp {
    private int eid;

    private String empName;

    private String gender;

    private String email;

    private String did;

    public Emp(int eId, String empName, String gender, String email, String dId) {
        this.eid = eId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.did = dId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", did='" + did + '\'' +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }
}
