package com.slg.spring.user.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name = "users", catalog = "slg")
public class User {
 
	private String username;
	private String password;
	private Set<UserRole> userRole = new HashSet<UserRole>(0);
 
	public User() {
	}
 
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		
	}
 
	public User(String username, String password, 
		 Set<UserRole> userRole) {
		this.username = username;
		this.password = password;
		
		this.userRole = userRole;
	}
 
	@Id
	@Column(name = "username", unique = true, 
		nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	@Column(name = "password", 
		nullable = false, length = 60)
	public String getPassword() {
		return this.password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
 
 
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserRole> getUserRole() {
		return this.userRole;
	}
 
	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}
 
}