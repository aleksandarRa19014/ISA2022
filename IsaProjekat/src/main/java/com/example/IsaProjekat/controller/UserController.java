package com.example.IsaProjekat.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.IsaProjekat.dto.LoginDTO;
import com.example.IsaProjekat.model.User;
import com.example.IsaProjekat.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@RequestMapping(value="/all",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	public  ResponseEntity<List<User>> loadAll(){
		
		for (User u : this.userService.findAll()) {
			System.out.println(u.getIme());
		}
		
		return new ResponseEntity<> (this.userService.findAll(),HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/login",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> loginUser(@RequestBody LoginDTO userLogRequest ){
		System.out.println(""
				+ ""
				+ ""
				+ "ssssssssssss"
				+ ""
				+ ""
				+ ""
				+ " "+ userLogRequest.getUsername() +"  " + userLogRequest.getPassword());
		
		User user = this.userService.findByUsername(userLogRequest.getUsername());
		
		System.out.println(""
				+ ""
				+ ""
				+ "ssssssssssss"
				+ ""
				+ ""
				+ ""
				+ " "+ user.getPassword() +"  " + userLogRequest.getPassword());
		
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userLogRequest.getUsername(),userLogRequest.getPassword()));
		
		SecurityContextHolder.getContext().setAuthentication(authentication);        
		
		return new ResponseEntity<> ("User signed-in successfully!." + authentication.toString(),HttpStatus.OK);
		
		
	}
	

	
	
	@RequestMapping(value="/logout",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	public  ResponseEntity<String> logoutUser(){
		System.out.println(""
				+ ""
				+ ""
				+ "ssssssssssss"
				+ ""
				+ ""
				+ ""
				+ " ");
		
		
		return new ResponseEntity<> ("SSdhsS",HttpStatus.OK);
	}
	
	
	
	
	
	public String enkriptuj(String sifra) throws NoSuchAlgorithmException {
		System.out.println("Usao da enkriptuje sifru " + sifra );
		MessageDigest md = MessageDigest.getInstance("SHA-256"); 
		  
		 //pretvori sifru  u bajteove
         byte[] messageDigest = md.digest(sifra.getBytes()); 
         
         StringBuilder sb = new StringBuilder();
         for (byte b : messageDigest) {
             sb.append(String.format("%02x", b));
         }
        String povratna=sb.toString();
        System.out.println("Rezultat enkripcije je "+povratna);
    	
        return povratna;
	}
}
