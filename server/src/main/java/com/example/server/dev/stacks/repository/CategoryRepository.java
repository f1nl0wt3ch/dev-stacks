package com.example.server.dev.stacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.server.dev.stacks.bean.CategoryBean;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryBean, Integer> {

}
