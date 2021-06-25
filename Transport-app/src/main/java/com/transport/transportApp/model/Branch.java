package com.transport.transportApp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Branch_ID", unique = true, nullable = false)
	private int id;
	
	@Column(name = "Branch_Code" , nullable = false)
	private String branchCode;
	
	@Column(name = "Branch_Name", nullable = false)
	private String branchName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address")
	private Address address;
	
	@Column(name = "Address", insertable = false, updatable = false)
	private Integer addressId;

	@Column(name = "Local_Out")
	private String localOut;
	
	public Branch() {
		
	}

	public Branch(int id, String branchCode, String branchName, Address address, Integer addressId,String localOut) {
		super();
		this.id = id;
		this.branchCode = branchCode;
		this.branchName = branchName;
		this.address = address;
		this.addressId = addressId;
		this.localOut = localOut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	



	public String getLocalOut() {
		return localOut;
	}

	public void setLocalOut(String localOut) {
		this.localOut = localOut;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", branchCode=" + branchCode + ", branchName=" + branchName + ", address=" + address
				+ ", addressId=" + addressId + ",  localOut=" + localOut + "]";
	}
	
	

	
}
