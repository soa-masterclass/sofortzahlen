package com.cgi.soa.masterclass.sofortzahlen.faces;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.cgi.soa.masterclass.sofortzahlen.model.User;
import com.cgi.soa.masterclass.sofortzahlen.service.BankWS;
import com.cgi.soa.masterclass.sofortzahlen.service.UserEJB;

@Named
@RequestScoped
public class UserManagedBean {
	@Inject
	UserEJB userEJB;
	
	@Inject
	BankWS bankWs;
	
	ArrayList<User> userList = new ArrayList<User>();
	User user = new User();
	
	public void setUser(User user) {
		this.user = user;
		bankWs.getWebServices().isAccountExist(1);
	}
	
	public User getUser(){
		return user;		
	}
	
	public int getUderId(){
		
		return user.getId();
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

	
	
}
