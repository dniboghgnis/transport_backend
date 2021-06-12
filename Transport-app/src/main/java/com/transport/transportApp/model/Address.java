package com.transport.transportApp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tbl_address")
public class Address implements Serializable {
	
	//private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Address_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Address1")
	private String address1;
	
	@Column(name = "Address2")
	private String address2;
	
	@Column(name = "District")
	private String disctrict;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "Postal_Code")
	private String postalCode;
	
	@Column(name = "Phone")
	private String phone;
	
	@Column(name = "Location")
	private String location;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "Branch_Id")
	private Branch branch;
	
	
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDisctrict() {
		return disctrict;
	}

	public void setDisctrict(String disctrict) {
		this.disctrict = disctrict;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", address1=" + address1 + ", address2=" + address2
				+ ", disctrict=" + disctrict + ", city=" + city + ", postalCode=" + postalCode + ", phone=" + phone
				+ ", location=" + location + "]";
	}
	
	

}
