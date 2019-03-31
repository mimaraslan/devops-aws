package com.mimaraslan.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
@JsonIgnoreProperties( { "id","fromDate","toDate","merchant","acquirer", "status",
	"operation", "merchantId", "acquirerId", 
	"paymentMethod", "errorCode", "filterField", "filterValue", "page" })
public class Query {

    //http://localhost:8080/api/v3/transaction/list
	//TRANSACTION​ ​QUERY  -- Post​ ​parameters
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "txid")
	private int id;
	
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
	
	
	@Column(name = "operation", length = 64)
	private String operation;

	@Column(name = "merchantId")
	private int merchantId;

	@Column(name = "acquirerId")
	private int acquirerId;
	
	
	@Column(name = "paymentMethod", length = 32)
	private String paymentMethod;

	@Column(name = "errorCode", length = 256)
	private String errorCode;

	@Column(name = "filterField", length = 128)
	private String filterField;

	@Column(name = "filterValue", length = 256)
	private String filterValue;

	@Column(name = "page")
	private int page;
	

	@Column(name = "per_page")
	private int per_page;
	
	@Column(name = "current_page")
	private int current_page;
	
	@Column(name = "next_page_url", length = 256)
	private String next_page_url;
	
	@Column(name = "prev_page_url", length = 256)
	private String prev_page_url;
	
	@Column(name = "_from")
	private int _from;
	
	@Column(name = "_to")
	private int _to;
	
	
	@OneToMany(mappedBy = "_transaction")	
	private List<Data> data = new ArrayList<>();

	
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

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public int getAcquirerId() {
		return acquirerId;
	}

	public void setAcquirerId(int acquirerId) {
		this.acquirerId = acquirerId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getFilterField() {
		return filterField;
	}

	public void setFilterField(String filterField) {
		this.filterField = filterField;
	}

	public String getFilterValue() {
		return filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getCurrent_page() {
		return current_page;
	}

	public void setCurrent_page(int current_page) {
		this.current_page = current_page;
	}

	public String getNext_page_url() {
		return next_page_url;
	}

	public void setNext_page_url(String next_page_url) {
		this.next_page_url = next_page_url;
	}

	public String getPrev_page_url() {
		return prev_page_url;
	}

	public void setPrev_page_url(String prev_page_url) {
		this.prev_page_url = prev_page_url;
	}

	public int get_from() {
		return _from;
	}

	public void set_from(int _from) {
		this._from = _from;
	}

	public int get_to() {
		return _to;
	}

	public void set_to(int _to) {
		this._to = _to;
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

}
