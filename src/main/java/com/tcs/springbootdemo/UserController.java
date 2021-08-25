package com.tcs.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController { //spring bean, act as request receiver
	@Autowired  //DI
	IUserService userService;

	@GetMapping("/getuser")
	private Iterable<User> getUser() {
		return userService.getAllUsers();
	}
	@PostMapping("/user")
	private void saveUser(@RequestBody User user) {
		userService.save(user);
		System.out.println(user.getFirstName());
	}
	@PutMapping("/user")//Method+Path should be unique
	private void saveUser1(@RequestBody User user) {
		userService.save(user);
		System.out.println(user.getFirstName());
	}
}