package com.example.app.ws.ui.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.ws.ui.mapper.UserMapper;
import com.example.app.ws.ui.model.User;
import com.example.app.ws.ui.to.UserTO;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUsers( @RequestParam(value = "page" , required = false) Integer page , 
			@RequestParam(value = "limit" , defaultValue = "50") int limit) {
		return "[REFRESH]get users was called with page="+page +" and limit="+limit;
	}
	
	@GetMapping(path="/{id}" , 
			produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<User> getUser(@PathVariable String id) {
		return new ResponseEntity<User>(User.generateDefault(),HttpStatus.OK)
				;
	}
	
	
	@PostMapping(
	produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE},
	consumes = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<User> createUser(@RequestBody UserTO to) {
		return new ResponseEntity<User>(UserMapper.fromTo(to),HttpStatus.OK);
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
