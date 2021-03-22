package com.tiagomaia.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tiagomaia.workshopmongo.domain.User;
import com.tiagomaia.workshopmongo.repository.UserRepository;

public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}
