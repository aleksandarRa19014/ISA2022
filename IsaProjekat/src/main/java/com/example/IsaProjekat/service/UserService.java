package com.example.IsaProjekat.service;

import java.util.List;

import com.example.IsaProjekat.dto.SingUpDTO;
import com.example.IsaProjekat.model.User;


public interface UserService {
	User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
	User save(SingUpDTO userRequest);
}


