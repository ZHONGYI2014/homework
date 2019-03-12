package com.overcome.mybatis.po;


import lombok.Data;

@Data
public class User {

    private Integer id;

    private String account;

    private String passwd;

    private String name;

    private String age;


}