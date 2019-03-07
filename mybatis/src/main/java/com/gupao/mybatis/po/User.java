package com.gupao.mybatis.po;

import java.util.Date;

public class User {
    private Integer id;

    private String account;

    private String passwd;

    private String name;

    private String age;

    private Date bithday;

    public User(Integer id, String account, String passwd, String name, String age, Date bithday) {
        this.id = id;
        this.account = account;
        this.passwd = passwd;
        this.name = name;
        this.age = age;
        this.bithday = bithday;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", passwd='" + passwd + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", bithday=" + bithday +
                '}';
    }
}