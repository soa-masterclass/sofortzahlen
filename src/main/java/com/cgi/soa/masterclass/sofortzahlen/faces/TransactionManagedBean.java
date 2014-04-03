package com.cgi.soa.masterclass.sofortzahlen.faces;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.cgi.soa.masterclass.sofortzahlen.model.User;

@Named
@RequestScoped
public class TransactionManagedBean 
{
	
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
