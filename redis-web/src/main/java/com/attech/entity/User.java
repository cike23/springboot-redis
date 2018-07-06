package com.attech.entity;

/**
 * 用户类
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-06 16:46
 **/
public class User {

    private Integer id;

    private String name;

    private String age;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", password=" + password +"]";
    }
}