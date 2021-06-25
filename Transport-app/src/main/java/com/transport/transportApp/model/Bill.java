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


@Entity
public class Bill {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Bill_Id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "Bill_Number")
	private int billNumber;
	
	@Column(name = "Bill_Date")
	private Date billDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Party_Name")
	private Consigner partyName;
	
	@Column(name = "Party_Name", insertable = false, updatable = false)
	private Integer consignerId;
	
	@Column(name = "Number_Of_Builty")
	private int numberOfBuilty;
	
	@Column(name = "Total_Weight")
	private int totalWeight;
	
	@Column(name = "Total_Freight")
	private float totalFreight;
	
	@Column(name = "Payment_Date")
	private Date paymentDate;
	
	@Column(name = "Received_Amount")
	private float receivedAmount;
	
	@Column(name = "Less_Rebate")
	private float lessRebate;
	
	@Column(name = "Less_TDS")
	private double LessTDS;
	
	@Column(name = "Mr_Number")
	private int mrNumber;
	
	@Column(name = "Pending_Amount")
	private double pendingAmount;
	
	@Column(name = "Payment_Mode")
	private PaymentMode paymentMode;
	
	@Column(name = "Remarks")
	private String remarks;

	public Bill() {
		
	}
	
	public Bill(int id, int billNumber, Date billDate, Consigner partyName, Integer consignerId, int numberOfBuilty,
			int totalWeight, float totalFreight, Date paymentDate, float receivedAmount, float lessRebate,
			double lessTDS, int mrNumber, double pendingAmount, PaymentMode paymentMode, String remarks) {
		super();
		this.id = id;
		this.billNumber = billNumber;
		this.billDate = billDate;
		this.partyName = partyName;
		this.consignerId = consignerId;
		this.numberOfBuilty = numberOfBuilty;
		this.totalWeight = totalWeight;
		this.totalFreight = totalFreight;
		this.paymentDate = paymentDate;
		this.receivedAmount = receivedAmount;
		this.lessRebate = lessRebate;
		LessTDS = lessTDS;
		this.mrNumber = mrNumber;
		this.pendingAmount = pendingAmount;
		this.paymentMode = paymentMode;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Consigner getPartyName() {
		return partyName;
	}

	public void setPartyName(Consigner partyName) {
		this.partyName = partyName;
	}

	public Integer getConsignerId() {
		return consignerId;
	}

	public void setConsignerId(Integer consignerId) {
		this.consignerId = consignerId;
	}

	public int getNumberOfBuilty() {
		return numberOfBuilty;
	}

	public void setNumberOfBuilty(int numberOfBuilty) {
		this.numberOfBuilty = numberOfBuilty;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	public float getTotalFreight() {
		return totalFreight;
	}

	public void setTotalFreight(float totalFreight) {
		this.totalFreight = totalFreight;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public float getReceivedAmount() {
		return receivedAmount;
	}

	public void setReceivedAmount(float receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public float getLessRebate() {
		return lessRebate;
	}

	public void setLessRebate(float lessRebate) {
		this.lessRebate = lessRebate;
	}

	public double getLessTDS() {
		return LessTDS;
	}

	public void setLessTDS(double lessTDS) {
		LessTDS = lessTDS;
	}

	public int getMrNumber() {
		return mrNumber;
	}

	public void setMrNumber(int mrNumber) {
		this.mrNumber = mrNumber;
	}

	public double getPendingAmount() {
		return pendingAmount;
	}

	public void setPendingAmount(double pendingAmount) {
		this.pendingAmount = pendingAmount;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", billNumber=" + billNumber + ", billDate=" + billDate + ", partyName=" + partyName
				+ ", consignerId=" + consignerId + ", numberOfBuilty=" + numberOfBuilty + ", totalWeight=" + totalWeight
				+ ", totalFreight=" + totalFreight + ", paymentDate=" + paymentDate + ", receivedAmount="
				+ receivedAmount + ", lessRebate=" + lessRebate + ", LessTDS=" + LessTDS + ", mrNumber=" + mrNumber
				+ ", pendingAmount=" + pendingAmount + ", paymentMode=" + paymentMode + ", remarks=" + remarks + "]";
	}

	
	
}
