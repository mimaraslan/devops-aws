package com.mimaraslan.message.request;

import java.util.Date;

import javax.validation.constraints.Size;

public class TransactionMerchantForm {
    
	private Date fromDate;
	
	private Date toDate;
	
	private int merchant;
	
	//@NotBlank
	private int acquirer;

    @Size(max = 64)
    private String status; 

    
    private String fx;

    private String customerlnfo;

    private String ipn;
    
    private String transaction;
        
    private Boolean refundable;

   
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getIpn() {
		return ipn;
	}

	public void setIpn(String ipn) {
		this.ipn = ipn;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public Boolean getRefundable() {
		return refundable;
	}

	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}
	
public TransactionMerchantForm() {
	// TODO Auto-generated constructor stub
}

public TransactionMerchantForm(@Size(max = 64) String status) {
	super();
	this.status = status;
}


}