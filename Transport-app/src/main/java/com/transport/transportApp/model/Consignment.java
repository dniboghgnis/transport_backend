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
@Table(name = "tbl_consigner")
public class Consignment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Consignment_Id", unique = true)
	private int id;
	
	@Column(name = "Cn_Number")
	private int cnNumber;
	
	@Column(name = "Date_Time")
	private Date dateTime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Branch_Id_1")
	private Branch from;
	
	@Column(name = "Branch_Id_1", insertable = false, updatable = false)
	private Integer branchId1;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Branch_Id_2")
	private Branch to;
	
	@Column(name = "Branch_Id_2", insertable = false, updatable = false)
	private Integer branchId2;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Consigner_Id")
	private Consigner consignerCode;
	
	@Column(name = "Consigner_Id", insertable = false, updatable = false)
	private Integer consignerId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Consignee_Id")
	private Consignee consigneeCode;
	
	@Column(name = "Consignee_Id", insertable = false, updatable = false)
	private Integer consigneeId;
	
	@Column(name = "Number_Of_Packages")
	private int numberOfPackages;
	
	@Column(name = "Unit")
	private int unit;
	
	@Column(name = "Nature_Of_Goods")
	private NatureOfGoods natureOfGoods;
	
	@Column(name = "Actual_Weight")
	private double actualWeight;
	
	@Column(name = "Invoice_Number")
	private String invoiceNumber;
	
	@Column(name = "Invoice_Date")
	private Date invoiceDate;
	
	@Column(name = "Goods_Value")
	private double goodsValue;
	
	@Column(name = "Private_Marks")
	private String privateMarks;
	
	@Column(name = "Billing")
	private Billing billing;
	
	@Column(name = "To_Be_Billed")
	private boolean toBeBilled;
	
	@Column(name = "Paid")
	private boolean paid;
	
	@Column(name = "To_Pay")
	private boolean toPay;
	
	@Column(name = "Freight")
	private double freight;
	
	@Column(name = "Rate_Per_Kg")
	private double ratePerKg;
	
	@Column(name = "Chargable_Weight")
	private double chargableWeight;
	
	@Column(name = "Way_Bill_Number")
	private int wayBillNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Truck_Id")
	private Truck truckNumber;
	
	@Column(name = "Truck_Id", insertable = false, updatable = false)
	private Integer truckId;
	
	@Column(name = "Re_Book_Freight")
	private double reBookFreight;
	
	@Column(name = "Collection_Amount")
	private double collectionAmount;
	
	@Column(name = "Mr_Bill_Number")
	private int mrBillNumber;
	
	@Column(name = "Delivery_Date")
	private Date deliveryDate;
	
	@Column(name = "Dr_Number")
	private String drNumber;
	
	@Column(name = "Payment_Date")
	private Date paymentDate;
	
	@Column(name = "Bill_Collection")
	private double billCollection;
	
	@Column(name = "Transport_Diff")
	private double transportDiff;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Manifest_Id")
	private Manifest mfNumber;
	
	@Column(name = "Manifest_Id", insertable = false, updatable = false)
	private Integer manifestId;
	
	@Column(name = "Mf_Date")
	private Date mfDate;
	
	@Column(name = "Delivery_Status")
	private DeliveryStatus deliveryStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCnNumber() {
		return cnNumber;
	}

	public void setCnNumber(int cnNumber) {
		this.cnNumber = cnNumber;
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

	public Consigner getConsignerCode() {
		return consignerCode;
	}

	public void setConsignerCode(Consigner consignerCode) {
		this.consignerCode = consignerCode;
	}

	public Integer getConsignerId() {
		return consignerId;
	}

	public void setConsignerId(Integer consignerId) {
		this.consignerId = consignerId;
	}

	public Consignee getConsigneeCode() {
		return consigneeCode;
	}

	public void setConsigneeCode(Consignee consigneeCode) {
		this.consigneeCode = consigneeCode;
	}

	public Integer getConsigneeId() {
		return consigneeId;
	}

	public void setConsigneeId(Integer consigneeId) {
		this.consigneeId = consigneeId;
	}

	public int getNumberOfPackages() {
		return numberOfPackages;
	}

	public void setNumberOfPackages(int numberOfPackages) {
		this.numberOfPackages = numberOfPackages;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public NatureOfGoods getNatureOfGoods() {
		return natureOfGoods;
	}

	public void setNatureOfGoods(NatureOfGoods natureOfGoods) {
		this.natureOfGoods = natureOfGoods;
	}

	public double getActualWeight() {
		return actualWeight;
	}

	public void setActualWeight(double actualWeight) {
		this.actualWeight = actualWeight;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public double getGoodsValue() {
		return goodsValue;
	}

	public void setGoodsValue(double goodsValue) {
		this.goodsValue = goodsValue;
	}

	public String getPrivateMarks() {
		return privateMarks;
	}

	public void setPrivateMarks(String privateMarks) {
		this.privateMarks = privateMarks;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public boolean isToBeBilled() {
		return toBeBilled;
	}

	public void setToBeBilled(boolean toBeBilled) {
		this.toBeBilled = toBeBilled;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public boolean isToPay() {
		return toPay;
	}

	public void setToPay(boolean toPay) {
		this.toPay = toPay;
	}

	public double getFreight() {
		return freight;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}

	public double getRatePerKg() {
		return ratePerKg;
	}

	public void setRatePerKg(double ratePerKg) {
		this.ratePerKg = ratePerKg;
	}

	public double getChargableWeight() {
		return chargableWeight;
	}

	public void setChargableWeight(double chargableWeight) {
		this.chargableWeight = chargableWeight;
	}

	public int getWayBillNumber() {
		return wayBillNumber;
	}

	public void setWayBillNumber(int wayBillNumber) {
		this.wayBillNumber = wayBillNumber;
	}

	public Truck getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(Truck truckNumber) {
		this.truckNumber = truckNumber;
	}

	public Integer getTruckId() {
		return truckId;
	}

	public void setTruckId(Integer truckId) {
		this.truckId = truckId;
	}

	public double getReBookFreight() {
		return reBookFreight;
	}

	public void setReBookFreight(double reBookFreight) {
		this.reBookFreight = reBookFreight;
	}

	public double getCollectionAmount() {
		return collectionAmount;
	}

	public void setCollectionAmount(double collectionAmount) {
		this.collectionAmount = collectionAmount;
	}

	public int getMrBillNumber() {
		return mrBillNumber;
	}

	public void setMrBillNumber(int mrBillNumber) {
		this.mrBillNumber = mrBillNumber;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDrNumber() {
		return drNumber;
	}

	public void setDrNumber(String drNumber) {
		this.drNumber = drNumber;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getBillCollection() {
		return billCollection;
	}

	public void setBillCollection(double billCollection) {
		this.billCollection = billCollection;
	}

	public double getTransportDiff() {
		return transportDiff;
	}

	public void setTransportDiff(double transportDiff) {
		this.transportDiff = transportDiff;
	}

	public Manifest getMfNumber() {
		return mfNumber;
	}

	public void setMfNumber(Manifest mfNumber) {
		this.mfNumber = mfNumber;
	}

	public Integer getManifestId() {
		return manifestId;
	}

	public void setManifestId(Integer manifestId) {
		this.manifestId = manifestId;
	}

	public Date getMfDate() {
		return mfDate;
	}

	public void setMfDate(Date mfDate) {
		this.mfDate = mfDate;
	}

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@Override
	public String toString() {
		return "Consignment [id=" + id + ", cnNumber=" + cnNumber + ", dateTime=" + dateTime + ", from=" + from
				+ ", branchId1=" + branchId1 + ", to=" + to + ", branchId2=" + branchId2 + ", consignerCode="
				+ consignerCode + ", consignerId=" + consignerId + ", consigneeCode=" + consigneeCode + ", consigneeId="
				+ consigneeId + ", numberOfPackages=" + numberOfPackages + ", unit=" + unit + ", natureOfGoods="
				+ natureOfGoods + ", actualWeight=" + actualWeight + ", invoiceNumber=" + invoiceNumber
				+ ", invoiceDate=" + invoiceDate + ", goodsValue=" + goodsValue + ", privateMarks=" + privateMarks
				+ ", billing=" + billing + ", toBeBilled=" + toBeBilled + ", paid=" + paid + ", toPay=" + toPay
				+ ", freight=" + freight + ", ratePerKg=" + ratePerKg + ", chargableWeight=" + chargableWeight
				+ ", wayBillNumber=" + wayBillNumber + ", truckNumber=" + truckNumber + ", truckId=" + truckId
				+ ", reBookFreight=" + reBookFreight + ", collectionAmount=" + collectionAmount + ", mrBillNumber="
				+ mrBillNumber + ", deliveryDate=" + deliveryDate + ", drNumber=" + drNumber + ", paymentDate="
				+ paymentDate + ", billCollection=" + billCollection + ", transportDiff=" + transportDiff
				+ ", mfNumber=" + mfNumber + ", manifestId=" + manifestId + ", mfDate=" + mfDate + ", deliveryStatus="
				+ deliveryStatus + "]";
	}
	
	
	
	
}
