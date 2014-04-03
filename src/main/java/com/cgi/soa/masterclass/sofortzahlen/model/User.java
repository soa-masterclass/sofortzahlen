
package com.cgi.soa.masterclass.sofortzahlen.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: User
 *
 */

@Entity
@Table(name="UserTable")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	@Column(unique=true)
	private String email;
	private String firstname;
	private String lastname;
	private int accnumber;
	private String accfirstname;
	private String acclastname;
	@Column(columnDefinition="Decimal(20,2)")
	private Long balance;
	
	@OneToMany(mappedBy="sender")
	public List<Transaction> transactionList;

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	public User() {
		
		
	}

	public User(int id, String email, String lastname, int accnumber,
			String accfirstname, String acclastname, Long balance) {
		super();
		this.id = id;
		this.email = email;
		this.lastname = lastname;
		this.accnumber = accnumber;
		this.accfirstname = accfirstname;
		this.acclastname = acclastname;
		this.balance = balance;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
   
}
