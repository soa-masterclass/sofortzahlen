package com.cgi.soa.masterclass.sofortzahlen.faces;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.cgi.soa.masterclass.sofortzahlen.model.User;

@Named
@RequestScoped
public class UserManagedBean {
	ArrayList<User> userList = new ArrayList<User>();
}
