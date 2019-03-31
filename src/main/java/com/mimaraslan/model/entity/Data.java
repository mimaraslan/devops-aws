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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "data")
@JsonIgnoreProperties( { "id" })
public class Data {

	// GET​ ​TRANSACTION -- http://localhost:8080/api/v3/transaction
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    
    @Column(name = "fx")
    private String fx;

    @Column(name = "customerlnfo")
    private String customerlnfo;

    @Column(name = "merchant")
    private String merchant;
    
    @Column(name = "ipn")
    private String ipn;
    
    @Column(name = "transaction")
    private String transaction;
    
    @Column(name = "acquirer")
    private String acquirer;
    
    @Column(name = "refundable")
    private Boolean refundable;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "txid")
    @JsonIgnore
    private Query _transaction;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFx() {
		return fx;
	}

	public void setFx(String fx) {
		this.fx = fx;
	}

	public String getCustomerlnfo() {
		return customerlnfo;
	}

	public void setCustomerlnfo(String customerlnfo) {
		this.customerlnfo = customerlnfo;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public String getIpn() {
		return ipn;
	}

	public void setIpn(String ipn) {
		this.ipn = ipn;
	}



	public String getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(String acquirer) {
		this.acquirer = acquirer;
	}

	public Boolean getRefundable() {
		return refundable;
	}

	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public Query get_transaction() {
		return _transaction;
	}

	public void set_transaction(Query _transaction) {
		this._transaction = _transaction;
	}
	
}
