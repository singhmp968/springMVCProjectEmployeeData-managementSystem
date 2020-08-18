package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.model.User;


import com.mvc.dao.Userdao;
@Service
public class UserService {

	@Autowired
	private Userdao userDao;
		public void createUser(User user) {
		//return this.userDao.saveUser(user);
			this.userDao.saveUser(user);
	
		}
	
	public boolean Validate(int empNumber) {
		return this.userDao.validateUser(empNumber);
	}
	public void deleteeUser(int empNumber) {
		 this.userDao.deleteUser(empNumber);
	}

//	public void updateUser(int empNumber) {
//		 this.userDao.updateUser(empNumber);
//	}
//	
 public List<User> diaplayAll(){
	 return this.userDao.getAllUser();
 }
 public User getuserById(int empNumber)
	{
		return this.userDao.getProduct(empNumber);
	}

 
}
