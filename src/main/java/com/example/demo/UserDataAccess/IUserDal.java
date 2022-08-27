package com.example.demo.UserDataAccess;

import java.util.List;

import com.example.demo.Entity.User;

public interface IUserDal {
	
	List<User> getAll();
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById (int id);
	
	

}
