package com.eliasspringi.ecommerce.Service;


import com.eliasspringi.ecommerce.model.category;
import com.eliasspringi.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

 @Autowired
 private CategoryRepository categoryRepository;
 public List<category> getAllCategories(){
 return categoryRepository.findAll();}

public category saveCategory(category category){
return categoryRepository.save(category);
}
}
