package com.gree.production.controller;

import com.gree.production.entity.dto.Result;
import com.gree.production.entity.po.Category;
import com.gree.production.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductionController {

    @Autowired
    private ProductionService productionService;

    public Result getList() {
        return null;
    }
}
