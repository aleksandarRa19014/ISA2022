package com.example.IsaProjekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IsaProjekat.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}

