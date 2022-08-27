package com.example.demo.User.Business;

import java.util.*;

import com.example.demo.Entity.User;


public interface IUserService {
	
	List<User> getAll();
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById (int id);
	

}
