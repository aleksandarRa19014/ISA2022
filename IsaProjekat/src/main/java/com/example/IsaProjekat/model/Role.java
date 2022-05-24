package com.example.IsaProjekat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String name;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

