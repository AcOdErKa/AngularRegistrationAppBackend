package com.eventregistration.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventregistration.entity.User;
import com.eventregistration.service.AddUserService;
import com.eventregistration.service.GetUsersService;

@RestController
public class RegistrationController {
	
	@CrossOrigin
	@RequestMapping("/ping")
	public void test()
	{
		System.out.println("Ping..");
	}
	
	@CrossOrigin
	@GetMapping(value="/show",headers="Accept=application/json")
	public List<User> getAllUsers()
	{
		return new GetUsersService().getAllUsers();
	}
	
	@CrossOrigin
	@PostMapping(value="/add",headers="Accept=application/json")
	public boolean newUser(@RequestBody User user)
	{
		if(new AddUserService().AddUser(user)==true)
			return true;
		else 
			return false;
	}
	

}
