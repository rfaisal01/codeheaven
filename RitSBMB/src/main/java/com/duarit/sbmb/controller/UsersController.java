package com.duarit.sbmb.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duarit.sbmb.mapper.UsersMapper;
import com.duarit.sbmb.model.Users;



@RestController
@RequestMapping("/rest/users")
public class UsersController {
	private UsersMapper usersMappers;
	
	
	public UsersController (UsersMapper usersMapper)
	{
		this.usersMappers = usersMapper;
		
	}
	
	@GetMapping(produces="application/json")
	public List<Users> getAll()  throws IOException
	{
		return usersMappers.findAll();
	}
	
	@PostMapping( consumes="application/json", produces = "application/json")
	public List <Users> insertUsers(@RequestBody Users users) throws IOException
	{
		
		usersMappers.insertUsers(users);
		return usersMappers.findByName(users.getName());
	}
}
