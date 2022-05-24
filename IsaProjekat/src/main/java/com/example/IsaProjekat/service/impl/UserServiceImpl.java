package com.example.IsaProjekat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IsaProjekat.dto.SingUpDTO;
import com.example.IsaProjekat.model.User;
import com.example.IsaProjekat.repository.UserRepository;
import com.example.IsaProjekat.service.UserService;



@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repozitorijum;
	
	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return repozitorijum.findByUsername(username);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repozitorijum.findAll();
	}

	@Override
	public User save(SingUpDTO userRequest) {
		// TODO Auto-generated method stub
		return null;
	}
}
