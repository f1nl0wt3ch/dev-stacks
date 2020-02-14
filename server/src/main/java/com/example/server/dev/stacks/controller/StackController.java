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

import com.example.server.dev.stacks.bean.StackBean;
import com.example.server.dev.stacks.repository.StackRepository;

@RestController
@RequestMapping("/rest/v1/")
public class StackController {
	@Autowired
    private StackRepository repo;
	
	@GetMapping("stacks")
	public List<StackBean> getAllCategories(){
		return repo.findAll();
	}
	
	@GetMapping("stack/{id}")
	public StackBean findCategoryById(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	@PostMapping("stack/create")
	public StackBean insertNewCategory(@RequestBody StackBean category) {
		StackBean savedCategory = repo.save(category);
		return savedCategory;
	}
	
	@DeleteMapping("stack/delete/{id}")
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
