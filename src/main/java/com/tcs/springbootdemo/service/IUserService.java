package com.tcs.springbootdemo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tcs.springbootdemo.entity.User;

@Service
public interface IUserService {
	void save(User user);

	Iterable<User> getAllUsers();

	Optional<User> getUser(Integer id);

	void deleteUser(Integer id);

	void update(User user, Integer id);
}
