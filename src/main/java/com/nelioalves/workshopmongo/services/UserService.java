package com.nelioalves.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.repository.UserRepositoy;

@Service
public class UserService {
	
	@Autowired
	private UserRepositoy repo;
	

	public List<User> findAll() {
		return repo.findAll();
	}
}
