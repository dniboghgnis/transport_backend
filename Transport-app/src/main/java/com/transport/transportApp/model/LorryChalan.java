package com.transport.transportApp.model;

import java.util.Date;

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
@Table(name = "tbl_lorrychalan")
public class LorryChalan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Lorry_Chalan_Id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "Date_Time")
	private Date dateTime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "From")
	private Branch from;
	
	@Column(name = "From", insertable = false, updatable = false)
	private Integer branchId1;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "To")
	private Branch to;
	
	@Column(name = "To", insertable = false, updatable = false)
	private Integer branchId2;
	
	@Column(name = "Lorry_Number")
	private String lorryNumber;
	
	@Column(name = "Total_Weight")
	private float totalWeight;
	
	@Column(name = "Rate_Per_Ton")
	private float ratePerTon;
	
	@Column(name = "Freight")
	private float freight;
	
	@Column(name = "Advance_Paid")
	private float advancePaid;
	
	@Column(name = "Balance_Remaining")
	private float balanceRemaining;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Payable_At")
	private Branch payableAt;
	
	@Column(name = "Payable_At", insertable = false, updatable = false)
	private Integer branchId3;
	
	@Column(name = "Payment_Date")
	private Date paymentDate;
	
	public LorryChalan() {
		
	}

	public LorryChalan(int id, Date dateTime, Branch from, Integer branchId1, Branch to, Integer branchId2,
			String lorryNumber, float totalWeight, float ratePerTon, float freight, float advancePaid,
			float balanceRemaining, Branch payableAt, Integer branchId3, Date paymentDate) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.from = from;
		this.branchId1 = branchId1;
		this.to = to;
		this.branchId2 = branchId2;
		this.lorryNumber = lorryNumber;
		this.totalWeight = totalWeight;
		this.ratePerTon = ratePerTon;
		this.freight = freight;
		this.advancePaid = advancePaid;
		this.balanceRemaining = balanceRemaining;
		this.payableAt = payableAt;
		this.branchId3 = branchId3;
		this.paymentDate = paymentDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Branch getFrom() {
		return from;
	}

	public void setFrom(Branch from) {
		this.from = from;
	}

	public Integer getBranchId1() {
		return branchId1;
	}

	public void setBranchId1(Integer branchId1) {
		this.branchId1 = branchId1;
	}

	public Branch getTo() {
		return to;
	}

	public void setTo(Branch to) {
		this.to = to;
	}

	public Integer getBranchId2() {
		return branchId2;
	}

	public void setBranchId2(Integer branchId2) {
		this.branchId2 = branchId2;
	}

	public String getLorryNumber() {
		return lorryNumber;
	}

	public void setLorryNumber(String lorryNumber) {
		this.lorryNumber = lorryNumber;
	}

	public float getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(float totalWeight) {
		this.totalWeight = totalWeight;
	}

	public float getRatePerTon() {
		return ratePerTon;
	}

	public void setRatePerTon(float ratePerTon) {
		this.ratePerTon = ratePerTon;
	}

	public float getFreight() {
		return freight;
	}

	public void setFreight(float freight) {
		this.freight = freight;
	}

	public float getAdvancePaid() {
		return advancePaid;
	}

	public void setAdvancePaid(float advancePaid) {
		this.advancePaid = advancePaid;
	}

	public float getBalanceRemaining() {
		return balanceRemaining;
	}

	public void setBalanceRemaining(float balanceRemaining) {
		this.balanceRemaining = balanceRemaining;
	}

	public Branch getPayableAt() {
		return payableAt;
	}

	public void setPayableAt(Branch payableAt) {
		this.payableAt = payableAt;
	}

	public Integer getBranchId3() {
		return branchId3;
	}

	public void setBranchId3(Integer branchId3) {
		this.branchId3 = branchId3;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "LorryChalan [id=" + id + ", dateTime=" + dateTime + ", from=" + from + ", branchId1=" + branchId1
				+ ", to=" + to + ", branchId2=" + branchId2 + ", lorryNumber=" + lorryNumber + ", totalWeight="
				+ totalWeight + ", ratePerTon=" + ratePerTon + ", freight=" + freight + ", advancePaid=" + advancePaid
				+ ", balanceRemaining=" + balanceRemaining + ", payableAt=" + payableAt + ", branchId3=" + branchId3
				+ ", paymentDate=" + paymentDate + "]";
	}
	
	
}
