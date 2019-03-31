package com.mimaraslan.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="transactions")
@JsonIgnoreProperties( { "id","fromDate","toDate","merchant","acquirer" })
public class Report {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "txid")
	private int id;

	// http://localhost:8080/api/v3/transaction
	//TRANSACTION​ ​REPORT -- Post​ ​parameters
	@Column(name = "fromDate")
	private Date fromDate;
	
	@Column(name = "toDate")
	private Date toDate;
	
	@Column(name = "merchant")
	private int merchant;
	
	@Column(name = "acquirer")
	private int acquirer;
	
	@Column(name = "status", length = 64)
	private String status; 
		
	
	@OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL, orphanRemoval = true)	
	private List<Response> responses = new ArrayList<>();
	
	public Report() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getMerchant() {
		return merchant;
	}

	public void setMerchant(int merchant) {
		this.merchant = merchant;
	}

	public int getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(int acquirer) {
		this.acquirer = acquirer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
	
}
