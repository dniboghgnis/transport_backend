package com.transport.transportApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tbl_address")
public class Address {
	
	
	
	@Id
	@Column(name = "Address_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Address_Line_1")
	private String addressLine1;
	
	@Column(name = "Address_Line_2")
	private String addressLine2;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "District")
	private String district;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "Postal_Code")
	private String postalCode;
	
	@Column(name = "Phone")
	private String phone;
	
	@Column(name = "Location")
	private String location;
	
	public Address() {
		
	}

	public Address(int id, String address, String addressLine1, String addressLine2, String city, String district,
			String state, String postalCode, String phone, String location) {
		super();
		this.id = id;
		this.address = address;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.district = district;
		this.state = state;
		this.postalCode = postalCode;
		this.phone = phone;
		this.location = location;
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

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
		return "Address [id=" + id + ", address=" + address + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", district=" + district + ", state=" + state + ", postalCode="
				+ postalCode + ", phone=" + phone + ", location=" + location + "]";
	}
	
	
	
}
