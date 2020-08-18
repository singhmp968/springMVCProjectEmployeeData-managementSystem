package com.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.model.User;




@Repository
public class Userdao {
	@Autowired
	private HibernateTemplate hibernateTemplate; // its a way to reach to DBase;
	@Transactional
	public void saveUser(User user) {
		//int id = (Integer)this.hibernateTemplate.saveOrUpdate(user);
		this.hibernateTemplate.saveOrUpdate(user);
		//return id;
	}
		public boolean validateUser(int empNumber) {
			if(this.hibernateTemplate.get(User.class,empNumber) != null) {
			return true;
			}
	
		else {
			return false;
		}
			
			
}

		//delete the single product
		@Transactional
		public void deleteUser(int empNumber) {
			User p = this.hibernateTemplate.load(User.class, empNumber);
			this.hibernateTemplate.delete(p);
			
		}
	//public int updateUser(int empNumber) {
//	
//	this.hibernateTemplate.update(empNumber);
//}

		// Displaying all
		public List<User> getAllUser(){
			List<User> users = this.hibernateTemplate.loadAll(User.class);
			
			return users;
			}
// display by Id
		public User getProduct(int empNumber)
		{
			return this.hibernateTemplate.get(User.class, empNumber);
		}




}
