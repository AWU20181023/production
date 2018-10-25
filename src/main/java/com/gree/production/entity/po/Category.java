package com.gree.production.entity.po;

import java.util.List;

public class Category {
    private Integer id;
    private Integer type;
    private List<Production> foods;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Production> getFoods() {
        return foods;
    }

    public void setFoods(List<Production> foods) {
        this.foods = foods;
    }
}
