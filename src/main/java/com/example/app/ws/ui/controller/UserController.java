package com.example.app.ws.ui.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.ws.ui.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUsers( @RequestParam(value = "page" , required = false) Integer page , 
			@RequestParam(value = "limit" , defaultValue = "50") int limit) {
		return "[REFRESH]get users was called with page="+page +" and limit="+limit;
	}
	
	@GetMapping(path="/{id}")
	public User getUser(@PathVariable String id) {
		return User.generateDefault();
	}
	
	
	@PostMapping
	public String createUser() {
		return "create user called";
	}
	
	@PutMapping
	public String updateUser() {
		return "update user called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user called";
	}

}
