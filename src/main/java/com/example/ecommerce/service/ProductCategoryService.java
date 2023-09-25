package com.example.ecommerce.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryService {

    @Value("${category.electronics}")
    private String electronicsCategory;

    @Value("${category.clothing}")
    private String clothingCategory;

    @Value("${category.books}")
    private String booksCategory;

    @Value("${category.furniture}")
    private String furnitureCategory;

    public String getElectronicsCategory() {
        return electronicsCategory;
    }

    public String getClothingCategory() {
        return clothingCategory;
    }

    public String getBooksCategory() {
        return booksCategory;
    }

    public String getFurnitureCategory() {
        return furnitureCategory;
    }
}
