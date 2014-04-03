package com.cgi.soa.masterclass.sofortzahlen.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Transaction
 *
 */
@Entity
@Table(name="TransactionTable")
public class Transaction implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	@JoinColumn
	private User sender;
	@ManyToOne
	@JoinColumn
	private User recipient;
	@Temporal(TemporalType.DATE) 
	@Column(name = "DATE_FIELD")
	private java.util.Date transdate;
	private String purpose;
	@Column(columnDefinition="Decimal(20,2)")
	private Long amount;
	@OneToOne(mappedBy="transaction")
	private Fee fee;

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
