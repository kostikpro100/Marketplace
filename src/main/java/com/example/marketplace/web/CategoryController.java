package com.example.marketplace.web;

import com.example.marketplace.dao.model.Category;
import com.example.marketplace.services.crud.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/insertCategory")
    public ResponseEntity<Category> insertCategory() {
        return new ResponseEntity<>(categoryService.createCategory(), HttpStatus.OK);
    }

    @GetMapping("/getCategory")
    public ResponseEntity<Category> getCategory(@RequestParam("category_id") Long id) {
        return new ResponseEntity<>(categoryService.findCategoryById(id), HttpStatus.OK);
    }
}