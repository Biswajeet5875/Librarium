package com.bd.dev.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bd.dev.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
