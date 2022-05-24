package com.example.IsaProjekat.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;




@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "ime", nullable = false)
	private String ime;

	@Column(name = "prezime", nullable = false)
	private String prezime;
	
	@Column(name = "username", nullable = false)  // meil je username
	private String username;  
	
	@Column(name="telefon", nullable = false)
	private String telefon;
	
	@Column(name="adresa")
	private String adresa;
	
	@Column(name="enabled")
	private boolean enabled;
		
	
	@Column(name="bodovi")
	private int bodovi;
	
	@Column(name="password")
	private String password;
	
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
            )
    private Set<Role> roles = new HashSet<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String ime, String prezime, String username, String telefon, String adresa, boolean enabled,
			int bodovi, String password, Set<Role> roles) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.username = username;
		this.telefon = telefon;
		this.adresa = adresa;
		this.enabled = enabled;
		this.bodovi = bodovi;
		this.password = password;
		this.roles = roles;
	}
}


