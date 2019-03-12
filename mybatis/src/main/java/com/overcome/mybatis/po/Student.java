package com.overcome.mybatis.po;


import lombok.Data;

@Data
public class Student {
    private Integer id;

    private String interest;

    public Student(Integer id, String interest) {
        this.id = id;
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", interest='" + interest + '\'' +
                '}';
    }
}