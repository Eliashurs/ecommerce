package com.eliasspringi.ecommerce.controller;


import com.eliasspringi.ecommerce.Service.CategoryService;
import com.eliasspringi.ecommerce.model.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

@Autowired private CategoryService categoryService;

@GetMapping
public List <category> getAllCategories(){
return categoryService.getAllCategories();
}

@PostMapping
public category createCategory(@RequestBody category category){
 return categoryService.saveCategory(category);
 }
}
