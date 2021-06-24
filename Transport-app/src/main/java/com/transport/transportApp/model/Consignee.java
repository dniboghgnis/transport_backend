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
	
	@Column(name = "Account_Code")
	private String accountCode;
	
	@Column(name = "Consignee_Name")
	private String ConsigneeName;
	
	@Column(name = "Account_Type")
	private String accountType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Party_Address")
	private Address partyAddress;
	
	@Column(name = "Party_Address", insertable = false, updatable = false)
	private Integer partyAddressId;
	
	@Column(name = "Gst_Number")
	private String gstNumber;
	
	@Column(name = "Pan_Number")
	private String panNumber;
	
	@Column(name = "Opening_Balance")
	private float openingBalance;

	@Column(name = "Tin_Number_Sst_No")
	private String tinNumberSstNo;
	
	@Column(name = "To_Be_Billed")
	private boolean toBeBilled;
	
	@Column(name = "Bill_Party_Name")
	private String billPartyName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Bill_Party_Address")
	private Address billPartyAddress1;
	
	@Column(name = "Bill_Party_Address", insertable = false, updatable = false)
	private Integer partyAddressId3;
	
	@Column(name = "Bill_Party_Gst_Number")
	private String billPartyGstNumber;
	
	@Column(name = "Bill_Party_Pan_Number")
	private String billPartyPanNumber;
	
	@Column(name = "Description")
	private String description;
	
	public Consignee() {
		
	}
	
	
	public Consignee(int id, String accountCode, String consigneeName, String accountType, Address partyAddress,
			Integer partyAddressId, String gstNumber, String panNumber, float openingBalance, String tinNumberSstNo,
			boolean toBeBilled, String billPartyName, Address billPartyAddress1, Integer partyAddressId3,
			String billPartyGstNumber, String billPartyPanNumber, String description) {
		super();
		this.id = id;
		this.accountCode = accountCode;
		ConsigneeName = consigneeName;
		this.accountType = accountType;
		this.partyAddress = partyAddress;
		this.partyAddressId = partyAddressId;
		this.gstNumber = gstNumber;
		this.panNumber = panNumber;
		this.openingBalance = openingBalance;
		this.tinNumberSstNo = tinNumberSstNo;
		this.toBeBilled = toBeBilled;
		this.billPartyName = billPartyName;
		this.billPartyAddress1 = billPartyAddress1;
		this.partyAddressId3 = partyAddressId3;
		this.billPartyGstNumber = billPartyGstNumber;
		this.billPartyPanNumber = billPartyPanNumber;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAccountCode() {
		return accountCode;
	}


	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}


	public String getConsigneeName() {
		return ConsigneeName;
	}


	public void setConsigneeName(String consigneeName) {
		ConsigneeName = consigneeName;
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


	public Integer getPartyAddressId() {
		return partyAddressId;
	}


	public void setPartyAddressId(Integer partyAddressId) {
		this.partyAddressId = partyAddressId;
	}


	public String getGstNumber() {
		return gstNumber;
	}


	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}


	public String getPanNumber() {
		return panNumber;
	}


	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}


	public float getOpeningBalance() {
		return openingBalance;
	}


	public void setOpeningBalance(float openingBalance) {
		this.openingBalance = openingBalance;
	}


	public String getTinNumberSstNo() {
		return tinNumberSstNo;
	}


	public void setTinNumberSstNo(String tinNumberSstNo) {
		this.tinNumberSstNo = tinNumberSstNo;
	}


	public boolean isToBeBilled() {
		return toBeBilled;
	}


	public void setToBeBilled(boolean toBeBilled) {
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


	public Integer getPartyAddressId3() {
		return partyAddressId3;
	}


	public void setPartyAddressId3(Integer partyAddressId3) {
		this.partyAddressId3 = partyAddressId3;
	}


	public String getBillPartyGstNumber() {
		return billPartyGstNumber;
	}


	public void setBillPartyGstNumber(String billPartyGstNumber) {
		this.billPartyGstNumber = billPartyGstNumber;
	}


	public String getBillPartyPanNumber() {
		return billPartyPanNumber;
	}


	public void setBillPartyPanNumber(String billPartyPanNumber) {
		this.billPartyPanNumber = billPartyPanNumber;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	

	
}
