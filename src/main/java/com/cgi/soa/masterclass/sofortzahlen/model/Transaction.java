package com.cgi.soa.masterclass.sofortzahlen.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Transaction
 *
 */
@Entity
@Table
public class Transaction implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	private User sender;
	private User recipient;
	@Temporal(TemporalType.DATE) 
	@Column(name = "DATE_FIELD")
	private java.util.Date transdate;
	private String purpose;
	@Column(columnDefinition="Decimal(20,2)")
	private Long amount;

	
	private static final long serialVersionUID = 1L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	public java.util.Date getTransdate() {
		return transdate;
	}

	public void setTransdate(java.util.Date transdate) {
		this.transdate = transdate;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Transaction() {
		super();
	}
   
}
