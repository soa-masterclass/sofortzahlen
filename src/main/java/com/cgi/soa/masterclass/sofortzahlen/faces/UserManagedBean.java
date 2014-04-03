package com.cgi.soa.masterclass.sofortzahlen.faces;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.cgi.soa.masterclass.sofortzahlen.model.User;

@Named
@RequestScoped
public class UserManagedBean {
	ArrayList<User> userList = new ArrayList<User>();
	

	public ArrayList<User> getUserList() {
		return createSampleUser();
	}


	public void setUserList(ArrayList<User> userList) {
		
		this.userList = userList;
	}

	private ArrayList<User> createSampleUser(){
		User user = new User();
		user.setId(1234);
		user.setEmail("a@a.com");
		user.setFirstname("Max");
		user.setLastname("Mustermann");
		user.setAccnumber(1223);
		user.setAccfirstname("Max");
		user.setAcclastname("Mustermann");
		user.setBalance(1000L);
		userList.clear();
		userList.add(user);
		return userList;
	}
	
	
}
