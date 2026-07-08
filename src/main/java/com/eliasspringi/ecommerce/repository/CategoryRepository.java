package com.eliasspringi.ecommerce.repository;


import com.eliasspringi.ecommerce.model.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends

        JpaRepository<category, Long> {
}
