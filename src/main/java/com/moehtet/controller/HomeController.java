package com.moehtet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moehtet.model.LoginUser;
import com.moehtet.service.UserService;

@RestController
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "Api is starting .... ";
	}
	
	@GetMapping("/user")
	public ResponseEntity<Object> getUser(){
		List<LoginUser> user = userService.findAll();
		
		return ResponseEntity.ok().body(user);
	}
}
