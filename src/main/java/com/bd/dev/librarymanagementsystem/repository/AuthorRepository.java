package com.bd.dev.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bd.dev.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
