package io.pivotal.sensor.rest;

import io.pivotal.sensor.model.User;
import io.pivotal.sensor.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersRestAPI {

	@Autowired
	private UsersService usersService;
	
	//http://localhost:8080/get-rfid-by-user/83
	@RequestMapping(value="/get-all-users", method=RequestMethod.GET)
	public Iterable<User> getAllUsers() {
		return usersService.findAllUsers();
	}
	
	
	
}