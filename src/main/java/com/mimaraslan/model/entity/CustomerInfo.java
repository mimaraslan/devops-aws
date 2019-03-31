package com.mimaraslan.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerInfo")
public class CustomerInfo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "txid")
	private int id​;	
	
	@Column(name = "created_at")
	private Date created_at;

	@Column(name = "updated_at")
	private Date updated_at;

	@Column(name = "deleted_at")
	private Date deleted_at;

	@Column(name = "number")
	private String number;

	@Column(name = "expiryMonth")
	private String expiryMonth;

	@Column(name = "expiryYear​")
	private String expiryYear​;

	@Column(name = "startMonth")
	private String startMonth;

	@Column(name = "startYear")
	private String startYear;

	@Column(name = "issueNumber")
	private String issueNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "birthday")
	private String birthday;

	@Column(name = "gender")
	private String gender; 

	@Column(name = "billingTitle")
	private String billingTitle;

	@Column(name = "billingFirstName")
	private String billingFirstName; 

	@Column(name = "billingLastName")
	private String billingLastName; 

	@Column(name = "billingCompany")
	private String billingCompany; 

	@Column(name = "billingAddressl")
	private String billingAddressl; 

	@Column(name = "billingAddress2")
	private String billingAddress2; 

	@Column(name = "billingCity")
	private String billingCity; 

	@Column(name = "billingPostcode")
	private String billingPostcode; 

	@Column(name = "billingState")
	private String billingState; 

	@Column(name = "billingCountry")
	private String billingCountry; 

	@Column(name = "billingPhone")
	private String billingPhone; 

	@Column(name = "billingFax")
	private String billingFax; 

	@Column(name = "shippingTitle")
	private String shippingTitle; 

	@Column(name = "shippingFirstName")
	private String shippingFirstName; 

	@Column(name = "shippingLastName")
	private String shippingLastName; 

	@Column(name = "shippingCompany")
	private String shippingCompany; 

	@Column(name = "shippingAddressl")
	private String shippingAddressl; 

	@Column(name = "shippingAddress2")
	private String shippingAddress2; 

	@Column(name = "shippingCity")
	private String shippingCity; 

	@Column(name = "shippingPostcode")
	private String shippingPostcode; 

	@Column(name = "shippingState")
	private String shippingState; 

	@Column(name = "shippingCountry")
	private String shippingCountry; 

	@Column(name = "shippingPhone")
	private String shippingPhone; 

	@Column(name = "shippingFax")
	private String shippingFax;

	public CustomerInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId​() {
		return id​;
	}

	public void setId​(int id​) {
		this.id​ = id​;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear​() {
		return expiryYear​;
	}

	public void setExpiryYear​(String expiryYear​) {
		this.expiryYear​ = expiryYear​;
	}

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBillingTitle() {
		return billingTitle;
	}

	public void setBillingTitle(String billingTitle) {
		this.billingTitle = billingTitle;
	}

	public String getBillingFirstName() {
		return billingFirstName;
	}

	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}

	public String getBillingLastName() {
		return billingLastName;
	}

	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}

	public String getBillingCompany() {
		return billingCompany;
	}

	public void setBillingCompany(String billingCompany) {
		this.billingCompany = billingCompany;
	}

	public String getBillingAddressl() {
		return billingAddressl;
	}

	public void setBillingAddressl(String billingAddressl) {
		this.billingAddressl = billingAddressl;
	}

	public String getBillingAddress2() {
		return billingAddress2;
	}

	public void setBillingAddress2(String billingAddress2) {
		this.billingAddress2 = billingAddress2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingPostcode() {
		return billingPostcode;
	}

	public void setBillingPostcode(String billingPostcode) {
		this.billingPostcode = billingPostcode;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	public String getBillingPhone() {
		return billingPhone;
	}

	public void setBillingPhone(String billingPhone) {
		this.billingPhone = billingPhone;
	}

	public String getBillingFax() {
		return billingFax;
	}

	public void setBillingFax(String billingFax) {
		this.billingFax = billingFax;
	}

	public String getShippingTitle() {
		return shippingTitle;
	}

	public void setShippingTitle(String shippingTitle) {
		this.shippingTitle = shippingTitle;
	}

	public String getShippingFirstName() {
		return shippingFirstName;
	}

	public void setShippingFirstName(String shippingFirstName) {
		this.shippingFirstName = shippingFirstName;
	}

	public String getShippingLastName() {
		return shippingLastName;
	}

	public void setShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
	}

	public String getShippingCompany() {
		return shippingCompany;
	}

	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	public String getShippingAddressl() {
		return shippingAddressl;
	}

	public void setShippingAddressl(String shippingAddressl) {
		this.shippingAddressl = shippingAddressl;
	}

	public String getShippingAddress2() {
		return shippingAddress2;
	}

	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingPostcode() {
		return shippingPostcode;
	}

	public void setShippingPostcode(String shippingPostcode) {
		this.shippingPostcode = shippingPostcode;
	}

	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public String getShippingCountry() {
		return shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public String getShippingPhone() {
		return shippingPhone;
	}

	public void setShippingPhone(String shippingPhone) {
		this.shippingPhone = shippingPhone;
	}

	public String getShippingFax() {
		return shippingFax;
	}

	public void setShippingFax(String shippingFax) {
		this.shippingFax = shippingFax;
	}
	
}