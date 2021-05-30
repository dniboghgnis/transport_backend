package com.transport.transportApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_consignee")
public class Consignee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Consignee_Id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "Account_Type")
	private String accountType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_Id")
	private Address partyAddress;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_Id")
	private Address partyAddress2;
	
	@Column(name = "Opening_Balance")
	private float openingBalance;
	
	@Column(name = "Consignee_Name")
	private String ConsigneeName;
	
	@Column(name = "Tin_Number_Sst_No")
	private String tinNumberSstNo;
	
	@Column(name = "Gst_Number")
	private String gstNumber;
	
	@Column(name = "To_Be_Billed")
	private String toBeBilled;
	
	@Column(name = "Bill_Party_Name")
	private String billPartyName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_Id")
	private Address billPartyAddress1;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_Id")
	private Address billPartyAddress2;
	
	@Column(name = "Account_Code")
	private String accountCode;
	
	@Column(name = "Bill_Party_Gst_Number")
	private String billPartyGstNumber;
	
	@Column(name = "Description")
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Address getPartyAddress() {
		return partyAddress;
	}

	public void setPartyAddress(Address partyAddress) {
		this.partyAddress = partyAddress;
	}

	public Address getPartyAddress2() {
		return partyAddress2;
	}

	public void setPartyAddress2(Address partyAddress2) {
		this.partyAddress2 = partyAddress2;
	}

	public float getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(float openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getConsigneeName() {
		return ConsigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		ConsigneeName = consigneeName;
	}

	public String getTinNumberSstNo() {
		return tinNumberSstNo;
	}

	public void setTinNumberSstNo(String tinNumberSstNo) {
		this.tinNumberSstNo = tinNumberSstNo;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getToBeBilled() {
		return toBeBilled;
	}

	public void setToBeBilled(String toBeBilled) {
		this.toBeBilled = toBeBilled;
	}

	public String getBillPartyName() {
		return billPartyName;
	}

	public void setBillPartyName(String billPartyName) {
		this.billPartyName = billPartyName;
	}

	public Address getBillPartyAddress1() {
		return billPartyAddress1;
	}

	public void setBillPartyAddress1(Address billPartyAddress1) {
		this.billPartyAddress1 = billPartyAddress1;
	}

	public Address getBillPartyAddress2() {
		return billPartyAddress2;
	}

	public void setBillPartyAddress2(Address billPartyAddress2) {
		this.billPartyAddress2 = billPartyAddress2;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getBillPartyGstNumber() {
		return billPartyGstNumber;
	}

	public void setBillPartyGstNumber(String billPartyGstNumber) {
		this.billPartyGstNumber = billPartyGstNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Consignee [id=" + id + ", accountType=" + accountType + ", partyAddress=" + partyAddress
				+ ", partyAddress2=" + partyAddress2 + ", openingBalance=" + openingBalance + ", ConsigneeName="
				+ ConsigneeName + ", tinNumberSstNo=" + tinNumberSstNo + ", gstNumber=" + gstNumber + ", toBeBilled="
				+ toBeBilled + ", billPartyName=" + billPartyName + ", billPartyAddress1=" + billPartyAddress1
				+ ", billPartyAddress2=" + billPartyAddress2 + ", accountCode=" + accountCode + ", billPartyGstNumber="
				+ billPartyGstNumber + ", description=" + description + "]";
	}
	
	

}
