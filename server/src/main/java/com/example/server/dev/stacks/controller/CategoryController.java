package com.example.server.dev.stacks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.dev.stacks.bean.CategoryBean;
import com.example.server.dev.stacks.repository.CategoryRepository;

@RestController
@RequestMapping("/rest/v1")
public class CategoryController {
	
	@Autowired
    private CategoryRepository repo;
	
	@GetMapping("categories")
	public List<CategoryBean> getAllCategories(){
		return repo.findAll();
	}
	
	@GetMapping("category/{id}")
	public CategoryBean findCategoryById(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	@PostMapping("category/create")
	public CategoryBean insertNewCategory(@RequestBody CategoryBean category) {
		CategoryBean savedCategory = repo.save(category);
		return savedCategory;
	}
	
	@DeleteMapping("category/delete/{id}")
	public boolean deleteCategory(@PathVariable("id") int id) {
		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
