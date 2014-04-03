package com.cgi.soa.masterclass.sofortzahlen.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: User
 *
 */

@Entity
@Table
public class User implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(unique=true)
	private String email;
	private String lastname;
	private int accnumber;
	private String accfirstname;
	private String acclastname;
	@Column(columnDefinition="Decimal(20,2)")
	private Long balance;
	
	private static final long serialVersionUID = 1L;

	public User() {
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}

	public String getAccfirstname() {
		return accfirstname;
	}

	public void setAccfirstname(String accfirstname) {
		this.accfirstname = accfirstname;
	}

	public String getAcclastname() {
		return acclastname;
	}

	public void setAcclastname(String acclastname) {
		this.acclastname = acclastname;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
	
	
   
}
