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
@Table(name = "tbl_bill")
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Bill_Id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "Bill_Number")
	private int billNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Consigner_Id")
	private Consigner partyName;
	
	@Column(name = "Number_Of_Builty")
	private int numberOfBuilty;
	
	@Column(name = "Total_Weight")
	private int totalWeight;
	
	@Column(name = "Total_Freight")
	private float totalFreight;
	
	@Column(name = "Less_Rebate")
	private float lessRebate;
	
	@Column(name = "Received_Amount")
	private float receivedAmount;
	
	@Column(name = "Mr_Number")
	private int mrNumber;
	
	@Column(name = "Payment_Mode")
	private PaymentMode paymentMode;

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

	public Consigner getPartyName() {
		return partyName;
	}

	public void setPartyName(Consigner partyName) {
		this.partyName = partyName;
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

	public float getLessRebate() {
		return lessRebate;
	}

	public void setLessRebate(float lessRebate) {
		this.lessRebate = lessRebate;
	}

	public float getReceivedAmount() {
		return receivedAmount;
	}

	public void setReceivedAmount(float receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public int getMrNumber() {
		return mrNumber;
	}

	public void setMrNumber(int mrNumber) {
		this.mrNumber = mrNumber;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", billNumber=" + billNumber + ", partyName=" + partyName + ", numberOfBuilty="
				+ numberOfBuilty + ", totalWeight=" + totalWeight + ", totalFreight=" + totalFreight + ", lessRebate="
				+ lessRebate + ", receivedAmount=" + receivedAmount + ", mrNumber=" + mrNumber + ", paymentMode="
				+ paymentMode + "]";
	}
	
	
	
	

}
