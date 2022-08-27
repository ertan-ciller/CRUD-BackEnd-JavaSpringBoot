package com.example.demo.restApi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.User.Business.IUserService;


@RestController
@RequestMapping("/api")

public class UserController {
	 
	
	private IUserService userService;
	
	@Autowired
	public UserController(IUserService userService) {
		
		this.userService = userService;
	}
	
	@GetMapping("/user")
	public List<User> get(){
		return userService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody User user) {
		
		userService.add(user);
	}
	@PostMapping("/update")
	public void update(@RequestBody User user) {
		
		userService.update(user);
		
	}
	@DeleteMapping("/delete")
	public void delete(@RequestBody User user ) {
		try {
			userService.delete(user);
			
		} catch (Exception e) {
			System.out.println("Yanlış giriş");
		}
		
	}
	@GetMapping("/user/{id}")
	public User getById(@PathVariable int id) {
		return userService.getById(id);
		
		
	}
	
	

}
