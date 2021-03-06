package com.cgi.soa.masterclass.sofortzahlen.service;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cgi.soa.masterclass.sofortzahlen.model.Transaction;
import com.cgi.soa.masterclass.sofortzahlen.model.User;

@Stateless 
public class UserEJB {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(User user) {
		em.persist(user);
	}
	
	@SuppressWarnings("unchecked")
	public List<User> selectAllUser(){
		 
		List<User> users = new LinkedList<User>();
		try	{
			String query = "select q from "+User.class.getName()+" q";
			Query q = em.createQuery(query);
			users = (List<User>) q.getResultList();	
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Fehler beim Select Alle Users");
		}
		return users;
		
	}
	
	
	public User findUserById(Integer userId) {
		String query = "select q from "+ User.class.getName()+" q where  q.id = :id" ; 
		
		Query q = em.createQuery(query).setParameter("id", userId);
		User user = (User) q.getResultList().get(0);
		
		 
		return user;
	}
	
	
	
	public void update (User user, int uid)	{
		user = em.find(User.class, uid);
		user.setEmail("email");
		em.merge(user);
	}
	
	public void delete (User user, int uid)	{
		user = em.find(User.class, uid);
		em.remove(user);
	}
	
}