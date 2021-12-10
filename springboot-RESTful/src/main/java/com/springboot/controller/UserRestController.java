package com.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;
import com.springboot.exception.UserDataAccessException;
import com.springboot.service.UserService;


@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	
	//CRUD
	//@RequestMapping(path = "user/create",method = RequestMethod.POST)
	@PostMapping(path = "/user")
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}
	
	@PostMapping(path = "multiUsers/create")
	public void createUsers(@RequestBody  Iterable<User> users) {
		userService.createUsers(users);
	}
	
	@GetMapping(path = "id/{id}")
	public User getUserById(@PathVariable("id") Integer id) throws UserDataAccessException {
		return userService.findUserById(id);
	}
	
	@GetMapping(path = "/allusers")
	public Iterable<User> getAllUsers() {
		return userService.findAllUsers();
	}
	
	@PutMapping(path = "id/{id}/newAge/{newAge}")
	public void updateUserAgeById(@PathVariable("id") Integer userId,@PathVariable("newAge") Integer newAge) {
		userService.updateUserAgeById(userId, newAge);
	}
	
	@DeleteMapping(path = "delete/id/{id}")
	public void deleteUserById(@PathVariable("id") Integer userId) {
		userService.deleteUserById(userId);
	}
}