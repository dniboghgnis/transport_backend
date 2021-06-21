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
import javax.persistence.Table;



@Entity
@Table(name = "tbl_consigner")
public class Consigner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Consigner_Id")
	private int id;
	
	
	@Column(name = "Account_Type")
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_Id_1")
	private Address partyAddress;
	
	@Column(name = "Address_Id_1", insertable = false, updatable = false)
	private Integer partyAddressId1;
	
	@Column(name = "Opening_Balance")
	private double openingBalance;
	
	@Column(name = "Consigner_Name")
	private String consignerName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_Id_2")
	private Address partyAddress2;
	
	@Column(name = "Address_Id_2", insertable = false, updatable = false)
	private Integer partyAddressId2;
	
	@Column(name = "Tin_Number_Sst_No")
	private String tinNumberSstNo;
	
	@Column(name = "Gst_Number")
	private String gstNumber;
	
	@Column(name = "To_Be_Billed")
	private boolean toBeBilled;
	
	@Column(name = "Bill_Party_Name")
	private String billPartyName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_Id_3")
	private Address billPartyAddress1;
	
	@Column(name = "Address_Id_3", insertable = false, updatable = false)
	private Integer partyAddressId3;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_Id_4")
	private Address billPartyAddress2;
	
	@Column(name = "Address_Id_4", insertable = false, updatable = false)
	private Integer partyAddressId4;
	
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

	public Address getPartyAddress2() {
		return partyAddress2;
	}

	public void setPartyAddress2(Address partyAddress2) {
		this.partyAddress2 = partyAddress2;
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
	
	

	public Integer getPartyAddressId1() {
		return partyAddressId1;
	}

	public void setPartyAddressId1(Integer partyAddressId1) {
		this.partyAddressId1 = partyAddressId1;
	}

	public Integer getPartyAddressId2() {
		return partyAddressId2;
	}

	public void setPartyAddressId2(Integer partyAddressId2) {
		this.partyAddressId2 = partyAddressId2;
	}

	public Integer getPartyAddressId3() {
		return partyAddressId3;
	}

	public void setPartyAddressId3(Integer partyAddressId3) {
		this.partyAddressId3 = partyAddressId3;
	}

	public Integer getPartyAddressId4() {
		return partyAddressId4;
	}

	public void setPartyAddressId4(Integer partyAddressId4) {
		this.partyAddressId4 = partyAddressId4;
	}

	@Override
	public String toString() {
		return "Consigner [id=" + id + ", accountType=" + accountType + ", partyAddress=" + partyAddress
				+ ", partyAddressId1=" + partyAddressId1 + ", openingBalance=" + openingBalance + ", consignerName="
				+ consignerName + ", partyAddress2=" + partyAddress2 + ", partyAddressId2=" + partyAddressId2
				+ ", tinNumberSstNo=" + tinNumberSstNo + ", gstNumber=" + gstNumber + ", toBeBilled=" + toBeBilled
				+ ", billPartyName=" + billPartyName + ", billPartyAddress1=" + billPartyAddress1 + ", partyAddressId3="
				+ partyAddressId3 + ", billPartyAddress2=" + billPartyAddress2 + ", partyAddressId4=" + partyAddressId4
				+ ", accountCode=" + accountCode + ", billPartyGstNumber=" + billPartyGstNumber + ", description="
				+ description + "]";
	}

	
	
}
