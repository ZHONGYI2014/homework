package com.overcome.po;


import lombok.Data;

@Data
public class User {

    private Integer id;

    private String account;

    private String passwd;

    private String name;

    private String age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", passwd='" + passwd + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}