package com.example.ecommerce.controller;

import com.example.ecommerce.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ProductCategoryService categoryService;

    @GetMapping
    public String getAllCategories() {
        return "Categories: " + categoryService.getElectronicsCategory() + ", " +
                categoryService.getClothingCategory() + ", " +
                categoryService.getBooksCategory() + ", " +
                categoryService.getFurnitureCategory();
    }
}
