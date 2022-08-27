package com.example.demo.User.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.Entity.User;
import com.example.demo.UserDataAccess.IUserDal;

@Service
public class UserManager implements IUserService{

	
	private IUserDal userDal;
	
	@Autowired
	
	public UserManager(IUserDal userDal) {
		this.userDal = userDal;
		
	}

	@Override
	@Transactional
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDal.getAll();
		
	}

	@Override
	@Transactional
	public void add(User user) {

		this.userDal.add(user);
		
	}

	@Override
	@Transactional
	public void update(User user) {
		this.userDal.update(user);
		
	}
	

	@Override
	@Transactional
	public User getById(int id) {
		
		return this.userDal.getById(id);
		
	}

	@Override
	@Transactional
	public void delete(User user) {
		this.userDal.delete(user);
		
	}

}
