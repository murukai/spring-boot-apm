package com.example.springbootapm.repository;

import com.example.springbootapm.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
