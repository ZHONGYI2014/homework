package com.overcome.mybatis.po;

import java.util.List;

public class Student {
    private Integer id;

    private List<String> interest;

    public Student(Integer id, List<String> interest) {
        this.id = id;
        this.interest = interest;
    }

    public Student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getInterest() {
        return interest;
    }

    public void setInterest(List<String> interest) {
        this.interest = interest ;
    }
}