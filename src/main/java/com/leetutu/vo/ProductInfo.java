package com.leetutu.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Kevin.Lee
 * @create: 2017-12-29 15:48:18
 **/
public class ProductInfo {

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
        return "ProductInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
