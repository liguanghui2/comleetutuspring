package com.leetutu.vo;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -7112269450953926595L;

    /**
     * 学生ID
     */
    private Long id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生专业
     */
    private String major;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
