package com.leetutu.vo;

import java.io.Serializable;

/**
 * @author: Kevin.Lee
 * @create: 2018-01-01 14:25:55
 **/
public class User implements Serializable {

    private static final long serialVersionUID = 7679805769366149740L;

    private Long id;
    private String name;

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
