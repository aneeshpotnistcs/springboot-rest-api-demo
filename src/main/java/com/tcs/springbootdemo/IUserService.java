package com.tcs.springbootdemo;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface IUserService {
	void save(User user);

	Iterable<User> getAllUsers();

	Optional<User> getUser(Integer id);

	void deleteUser(Integer id);
}
