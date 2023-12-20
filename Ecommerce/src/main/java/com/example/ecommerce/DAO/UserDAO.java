package com.example.ecommerce.dao;


import com.example.ecommerce.model.User;

public interface UserDAO {
	public String updateProfile(User user);
	
	public User getUserInfo(String user_id);
	
	public String register(User user);
	
	public User login(String email, String password);
	
	public String getAddressById(String user_id);
}
