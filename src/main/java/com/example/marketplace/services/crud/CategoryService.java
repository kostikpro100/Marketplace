package com.example.marketplace.services.crud;

import com.example.marketplace.dao.model.Category;
import com.example.marketplace.dao.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory() {
        return categoryRepository.save(generateCategory());
    }

    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow();
    }

    private Category generateCategory() {
        Category category = new Category();
        category.setName("приколы");
        return category;
    }
}