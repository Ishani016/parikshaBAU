package com.pariksha.api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pariksha.api.dataModels.UserEntity;
import com.pariksha.api.services.UserService;

@RestController
public class UserController {
	private Logger logger = LoggerFactory.getLogger(Logger.class);
	
	@Autowired
	UserService userService;
	
	@PostMapping("/signUp")
	public ResponseEntity<UserEntity> userSignUp(@RequestBody UserEntity user) {
		if(user.getUserName().isBlank() || user.getPassword().isBlank())  {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} 
		UserEntity userEntity = userService.addUser(user);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(userEntity);
	}

}
