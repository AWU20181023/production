package com.gree.production.entity.dto;

/**
 * Created by 260152(AWU) on 2018/11/14 14:49.
 */
public class CartDto {
    private String id;
    private Integer num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "CartDto{" +
                "id='" + id + '\'' +
                ", num=" + num +
                '}';
    }
}
