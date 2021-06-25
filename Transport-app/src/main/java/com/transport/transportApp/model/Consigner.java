package com.transport.transportApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Consigner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Consigner_Id")
	private int id;
	
	
	@Column(name = "Account_Type")
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Party_Address")
	private Address partyAddress;
	
	@Column(name = "Party_Address", insertable = false, updatable = false)
	private Integer partyAddressId;
	
	@Column(name = "Opening_Balance")
	private double openingBalance;
	
	@Column(name = "Consigner_Name")
	private String consignerName;
	
	@Column(name = "Tin_Number_Sst_No")
	private String tinNumberSstNo;
	
	@Column(name = "Gst_Number")
	private String gstNumber;

	@Column(name = "Pan_Number")
	private String panNumber;
	
	@Column(name = "To_Be_Billed")
	private boolean toBeBilled;
	
	@Column(name = "Bill_Party_Name")
	private String billPartyName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Bill_Party_Address")
	private Address billPartyAddress;
	
	@Column(name = "Bill_Party_Address", insertable = false, updatable = false)
	private Integer billPartyAddressId;
	
	
	@Column(name = "Account_Code")
	private String accountCode;
	
	@Column(name = "Bill_Party_Gst_Number")
	private String billPartyGstNumber;
	
	@Column(name = "Bill_Party_Pan_Number")
	private String billPartyPanNumber;
	
	@Column(name = "Description")
	private String description;

	public Consigner() {
		
	}
	
	public Consigner(int id, AccountType accountType, Address partyAddress, Integer partyAddressId,
			double openingBalance, String consignerName, String tinNumberSstNo, String gstNumber, String panNumber,
			boolean toBeBilled, String billPartyName, Address billPartyAddress, Integer billPartyAddressId,
			String accountCode, String billPartyGstNumber, String billPartyPanNumber, String description) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.partyAddress = partyAddress;
		this.partyAddressId = partyAddressId;
		this.openingBalance = openingBalance;
		this.consignerName = consignerName;
		this.tinNumberSstNo = tinNumberSstNo;
		this.gstNumber = gstNumber;
		this.panNumber = panNumber;
		this.toBeBilled = toBeBilled;
		this.billPartyName = billPartyName;
		this.billPartyAddress = billPartyAddress;
		this.billPartyAddressId = billPartyAddressId;
		this.accountCode = accountCode;
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

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
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

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getConsignerName() {
		return consignerName;
	}

	public void setConsignerName(String consignerName) {
		this.consignerName = consignerName;
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

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
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

	public Address getBillPartyAddress() {
		return billPartyAddress;
	}

	public void setBillPartyAddress(Address billPartyAddress) {
		this.billPartyAddress = billPartyAddress;
	}

	public Integer getBillPartyAddressId() {
		return billPartyAddressId;
	}

	public void setBillPartyAddressId(Integer billPartyAddressId) {
		this.billPartyAddressId = billPartyAddressId;
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

	@Override
	public String toString() {
		return "Consigner [id=" + id + ", accountType=" + accountType + ", partyAddress=" + partyAddress
				+ ", partyAddressId=" + partyAddressId + ", openingBalance=" + openingBalance + ", consignerName="
				+ consignerName + ", tinNumberSstNo=" + tinNumberSstNo + ", gstNumber=" + gstNumber + ", panNumber="
				+ panNumber + ", toBeBilled=" + toBeBilled + ", billPartyName=" + billPartyName + ", billPartyAddress="
				+ billPartyAddress + ", billPartyAddressId=" + billPartyAddressId + ", accountCode=" + accountCode
				+ ", billPartyGstNumber=" + billPartyGstNumber + ", billPartyPanNumber=" + billPartyPanNumber
				+ ", description=" + description + "]";
	}

	
}
