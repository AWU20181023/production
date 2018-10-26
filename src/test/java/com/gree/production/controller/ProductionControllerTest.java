package com.gree.production.controller;

import com.gree.production.ProductionApplicationTests;
import com.gree.production.entity.dto.Result;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductionControllerTest extends ProductionApplicationTests {

    @Test
    public void say() {
        System.out.println("hello");
    }

    @Autowired
    private ProductionController productionController;

    @Test
    public void testProductionController() {
        Result list = productionController.getList();
        System.out.println(list);
    }
}