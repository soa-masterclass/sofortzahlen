
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
@Table(name="FeeTable")
public class Fee implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	private Transaction transaction;
	@Column(columnDefinition="Decimal(20,2)")
	private Long amount;
	
	private static final long serialVersionUID = 1L;

	public Fee() {
		super();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
}
