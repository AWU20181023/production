package com.gree.production.controller;

import com.alibaba.fastjson.JSON;
import com.gree.production.entity.dto.ProductionDtos;
import com.gree.production.entity.dto.Result;
import com.gree.production.entity.po.Category;
import com.gree.production.entity.po.Production;
import com.gree.production.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
public class ProductionController {

    @Autowired
    private ProductionService productionService;

    public Result getList() {
        ProductionDtos productionDtos = new ProductionDtos();
        List<Category> categories = new LinkedList<>();
        List<Production> productions = new ArrayList<>();
        Production production = new Production();
        production.setDescription("好吃的皮蛋粥");
        production.setName("皮蛋粥");
        production.setPrice(1.2D);
        production.setIcon("http://xxx.com");
        production.setId(123456);
        productions.add(production);
        Category category = new Category();
        category.setFoods(productions);
        category.setType(1);
        category.setName("热情");
        categories.add(category);

        production = new Production();
        production.setDescription("美味爽口");
        production.setName("慕斯蛋糕");
        production.setPrice(10.9D);
        production.setIcon("http://xxx.com");
        production.setId(123457);
        productions = new ArrayList<>();
        productions.add(production);
        category = new Category();
        category.setFoods(productions);
        category.setType(1);
        category.setName("热情");
        categories.add(category);

        return new Result(0, "成功", JSON.toJSONString(categories, true));
    }
}
