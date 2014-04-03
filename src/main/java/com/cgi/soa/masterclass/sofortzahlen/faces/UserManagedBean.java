package com.cgi.soa.masterclass.sofortzahlen.faces;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.cgi.soa.masterclass.sofortzahlen.model.User;
import com.cgi.soa.masterclass.sofortzahlen.service.UserEJB;

@Named
@RequestScoped
public class UserManagedBean {
	@Inject
	UserEJB userEJB;
	
	ArrayList<User> userList = new ArrayList<User>();
	User user = new User();
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser(){
		return user;		
	}
	
	public List<User> getUserList() {
		return userEJB.selectAllUser();
	}

	public void setUserList(ArrayList<User> userList) {
		
		this.userList = userList;
	}
	
	public String saveUser(){
		user.setBalance(0l);
		userEJB.insert(user);
//		return "success";
		return "/users/index.xhtml";
	}
	
//	private ArrayList<User> createSampleUser(){
//		User user = new User();
//		user.setId(1234);
//		user.setEmail("a@a.com");
//		user.setFirstname("Max");
//		user.setLastname("Mustermann");
//		user.setAccnumber(1223);
//		user.setAccfirstname("Max");
//		user.setAcclastname("Mustermann");
//		user.setBalance(1000L);
//		userList.clear();
//		userList.add(user);
//		return userList;
//	}
	
	
}
