package com.overcome.po;

public class Student {
    private Integer id;

    private String name;

    private String salary;

    private Integer departmentid;

    public Student(Integer id, String name, String salary, Integer departmentid) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentid = departmentid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", departmentid=" + departmentid +
                '}';
    }
}