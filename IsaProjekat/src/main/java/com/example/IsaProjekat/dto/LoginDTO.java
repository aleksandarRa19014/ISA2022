package com.example.IsaProjekat.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LoginDTO {
	@JsonProperty(value = "username")
	private String username; 
	@JsonProperty(value = "password")
	private String password;
}

