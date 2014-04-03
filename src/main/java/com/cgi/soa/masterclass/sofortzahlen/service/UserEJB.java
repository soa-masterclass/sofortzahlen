package com.cgi.soa.masterclass.sofortzahlen.service;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cgi.soa.masterclass.sofortzahlen.model.User;

@Stateless 
public class UserEJB {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(User user) {
		em.persist(user);
	}
	
	@SuppressWarnings("unchecked")
	public List<User> selectAllUser(EntityManager em)
	{
		 
		List<User> users = new LinkedList<User>();
		try
		{
			String query = "select q from from User q";
			Query q = em.createQuery(query);
			users = (List<User>) q.getResultList();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Fehler beim Select Alle Users");
		}
		return users;
		
	}

	
}
