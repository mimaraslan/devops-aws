package com.mimaraslan.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "responses")
public class Response {

	//TRANSACTION​ ​REPOR -- Response​ ​parameters
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    @Column(name = "count")
    int count;
    
    @Column(name = "total")
    int total;
    
    @Column(name = "currency", length = 3)
	String currency;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "txid")
    @JsonIgnore
    private Query transaction;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Query getTransaction() {
		return transaction;
	}

	public void setTransaction(Query transaction) {
		this.transaction = transaction;
	}

	public Response() {
	}
}