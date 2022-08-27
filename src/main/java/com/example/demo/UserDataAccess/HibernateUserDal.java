package com.example.demo.UserDataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;



@Repository
public class HibernateUserDal implements IUserDal{
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateUserDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	public List<User> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<User> users=session.createQuery("from User",User.class).getResultList();

		return users;
		
	}
	
	@Override
	public void add(User user) {
		
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
		
	}

	@Override
	public void update(User user) {
		
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
		
	}

	@Override
	public void delete(User user) {
		
		Session session = entityManager.unwrap(Session.class);
		User cityToDelete = session.get(User.class, user.getId());
		session.delete(cityToDelete);
		System.out.println(user.getUsername());
	}

	@Override
	public User getById(int id) {
		
		Session session = entityManager.unwrap(Session.class);  
		User city = session.get(User.class, id);
		return city;
	}



	
	

}
