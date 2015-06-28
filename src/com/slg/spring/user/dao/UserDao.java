package com.slg.spring.user.dao;

import com.slg.spring.user.model.User;

public interface UserDao {
	 
	User findByUserName(String username);
 
}