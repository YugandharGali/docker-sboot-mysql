package com.sboot.mysql.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.mysql.app.dto.UserDTO;
import com.sboot.mysql.app.dto.UserList;
import com.sboot.mysql.app.exception.AppException;
import com.sboot.mysql.app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public String testApp() {
		return "User Micro Service is working..";
	}
	
	@PostMapping("/create")
	public UserDTO createUser(@Valid @RequestBody UserDTO userDTO) throws AppException {
		return userService.createUser(userDTO);
	}

	@GetMapping("/allUsers")
	public UserList getAllUsers() throws AppException {
		return userService.getAllUsers();
	}

	@GetMapping("/{userId}")
	public UserDTO getUserById(@PathVariable("userId") long userId) throws AppException {
		return userService.getUserById(userId);
	}

	@PutMapping("/update")
	public String updateUser(@RequestParam("userId") long userId, @Valid @RequestBody UserDTO userDTO) throws AppException {
		return userService.updateUser(userId, userDTO);
	}

	@DeleteMapping("/delete")
	public String deleteUser(@RequestParam("userId") long userId) throws AppException {
		return userService.deleteUser(userId);
	}
}
