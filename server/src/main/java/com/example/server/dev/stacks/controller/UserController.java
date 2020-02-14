package com.example.server.dev.stacks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.dev.stacks.bean.UserBean;
import com.example.server.dev.stacks.repository.UserRepository;

@RestController
@RequestMapping("/rest/v1/")
public class UserController {
	@Autowired
	private UserRepository repo;
	
	@GetMapping("users")
	public List<UserBean> getAllUsers(){
		return repo.findByInactive(false);
	}
	
	@GetMapping("user/{id}")
	public UserBean findUserById(@PathVariable("id") long id) {
		return repo.findByIdAndInactive(id, false);
	}
	
	@PostMapping("user/create")
	public UserBean insertNewUser(@RequestBody UserBean user) {
		UserBean savedUser = repo.save(user);
		return savedUser;
	}
	
	@PutMapping("user/delete/{id}")
	public boolean deleteUser(@PathVariable("id") long id) {
		try {
			UserBean user = repo.findByIdAndInactive(id, false);
			user.setInactive(true);
			repo.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
