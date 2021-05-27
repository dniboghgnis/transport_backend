package com.transport.transportApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_branch")
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Branch_ID")
	private int id;
	
	@Column(name = "Branch_Code" , nullable = false)
	private String branchCode;
	
	@Column(name = "Branch_Name", nullable = false)
	private String branchName;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_ID")
	private Address address;
	
	@Column(name = "Local_Out")
	private String localOut;

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

	public String getLocalOut() {
		return localOut;
	}

	public void setLocalOut(String localOut) {
		this.localOut = localOut;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", branchCode=" + branchCode + ", branchName=" + branchName + ", address=" + address
				+ ", localOut=" + localOut + "]";
	}
	
	
}
