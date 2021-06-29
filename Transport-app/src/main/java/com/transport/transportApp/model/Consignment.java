package com.transport.transportApp.model;

import java.util.Date;

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
@Table(name = "Consignment")
public class Consignment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Consignment_Id", unique = true)
	private int id;
	
	@Column(name = "Cn_Number")
	private Integer cnNumber;
	
	@Column(name = "Booking_Date")
	private Date bookingDateTime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "From_Branch")
	private Branch from;
	
	@Column(name = "From_Branch", insertable = false, updatable = false)
	private Integer branchId1;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "To_Branch")
	private Branch to;
	
	@Column(name = "To_Branch", insertable = false, updatable = false)
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
	private Integer numberOfPackages;
	
	@Column(name = "Unit")
	private Integer unit;
	
	//@Enumerated(EnumType.STRING)
	@Column(name = "Nature_Of_Goods")
	private String natureOfGoods;
	//private NatureOfGoods natureOfGoods;
	
	@Column(name = "Private_Marks")
	private String privateMarks;
	
	@Column(name = "Goods_Value")
	private double goodsValue;
	
	@Column(name = "Invoice_Number")
	private String invoiceNumber;
	
	@Column(name = "Invoice_Date")
	private Date invoiceDate;
	
	@Column(name = "Actual_Weight")
	private Double actualWeight;
	
	@Column(name = "Chargable_Weight")
	private Double chargableWeight;
	
	@Column(name = "Freight")
	private Double freight;
	
	@Column(name = "Rate_Per_Kg")
	private Double ratePerKg;
	
	@Column(name = "Sur")
	private Double sur;
	
	@Column(name = "Ham")
	private Double ham;
	
	@Column(name = "Sta")
	private Double sta;
	
	@Column(name = "Del")
	private Double del; 	
	
	//@Enumerated(EnumType.STRING)
	@Column(name = "Billing")
	private String billing;
	//private Billing billing;
	
	@Column(name = "To_Be_Billed")
	private Boolean toBeBilled;
	
	@Column(name = "Paid")
	private Boolean paid;
	
	@Column(name = "To_Pay")
	private Boolean toPay;
	
	@Column(name = "Way_Bill_Number")
	private Integer wayBillNumber;
	
	@Column(name = "Bill_Number")
	private String billNumber;
	
	@Column(name = "Bill_Date")
	private Date billDate;
	
	@Column(name = "Mf_Number")
	private String mfNumber;
	
	@Column(name = "Mf_Date")
	private Date mfDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Truck_Number")
	private Truck truckNumber;
	
	@Column(name = "Truck_Number", insertable = false, updatable = false)
	private Integer truckId;
	
	@Column(name = "Bill_Collection")
	private Double billCollection;
	
	@Column(name = "Transport_Diff")
	private Double transportDiff;
	
	@Column(name = "Re_Book_Freight")
	private Double reBookFreight;
	
	@Column(name = "Delivery_Date")
	private Date deliveryDate;
	
	@Column(name = "Dr_Number")
	private String drNumber;
	
	@Column(name = "Payment_Date")
	private Date paymentDate;

	@Column(name = "Collection_Amount")
	private Double collectionAmount;
	
	@Column(name = "Mr_Bill_Number")
	private Integer mrBillNumber;
	
	@Column(name = "Remarks")
	private String remarks;
	
	//@Enumerated(EnumType.STRING)
	@Column(name = "Delivery_Status")
	private String deliveryStatus;
	//private DeliveryStatus deliveryStatus;
	
	public Consignment() {
		
	}
	public Consignment(int id, Integer cnNumber, Date bookingDateTime, Branch from, Integer branchId1, Branch to,
			Integer branchId2, Consigner consignerCode, Integer consignerId, Consignee consigneeCode,
			Integer consigneeId, Integer numberOfPackages, Integer unit, String natureOfGoods, String privateMarks,
			double goodsValue, String invoiceNumber, Date invoiceDate, Double actualWeight, Double chargableWeight,
			Double freight, Double ratePerKg, Double sur, Double ham, Double sta, Double del, String billing,
			Boolean toBeBilled, Boolean paid, Boolean toPay, Integer wayBillNumber, String billNumber, Date billDate,
			String mfNumber, Date mfDate, Truck truckNumber, Integer truckId, Double billCollection,
			Double transportDiff, Double reBookFreight, Date deliveryDate, String drNumber, Date paymentDate,
			Double collectionAmount, Integer mrBillNumber, String remarks, String deliveryStatus) {
		super();
		this.id = id;
		this.cnNumber = cnNumber;
		this.bookingDateTime = bookingDateTime;
		this.from = from;
		this.branchId1 = branchId1;
		this.to = to;
		this.branchId2 = branchId2;
		this.consignerCode = consignerCode;
		this.consignerId = consignerId;
		this.consigneeCode = consigneeCode;
		this.consigneeId = consigneeId;
		this.numberOfPackages = numberOfPackages;
		this.unit = unit;
		this.natureOfGoods = natureOfGoods;
		this.privateMarks = privateMarks;
		this.goodsValue = goodsValue;
		this.invoiceNumber = invoiceNumber;
		this.invoiceDate = invoiceDate;
		this.actualWeight = actualWeight;
		this.chargableWeight = chargableWeight;
		this.freight = freight;
		this.ratePerKg = ratePerKg;
		this.sur = sur;
		this.ham = ham;
		this.sta = sta;
		this.del = del;
		this.billing = billing;
		this.toBeBilled = toBeBilled;
		this.paid = paid;
		this.toPay = toPay;
		this.wayBillNumber = wayBillNumber;
		this.billNumber = billNumber;
		this.billDate = billDate;
		this.mfNumber = mfNumber;
		this.mfDate = mfDate;
		this.truckNumber = truckNumber;
		this.truckId = truckId;
		this.billCollection = billCollection;
		this.transportDiff = transportDiff;
		this.reBookFreight = reBookFreight;
		this.deliveryDate = deliveryDate;
		this.drNumber = drNumber;
		this.paymentDate = paymentDate;
		this.collectionAmount = collectionAmount;
		this.mrBillNumber = mrBillNumber;
		this.remarks = remarks;
		this.deliveryStatus = deliveryStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getCnNumber() {
		return cnNumber;
	}
	public void setCnNumber(Integer cnNumber) {
		this.cnNumber = cnNumber;
	}
	public Date getBookingDateTime() {
		return bookingDateTime;
	}
	public void setBookingDateTime(Date bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
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
	public Integer getNumberOfPackages() {
		return numberOfPackages;
	}
	public void setNumberOfPackages(Integer numberOfPackages) {
		this.numberOfPackages = numberOfPackages;
	}
	public Integer getUnit() {
		return unit;
	}
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	public String getNatureOfGoods() {
		return natureOfGoods;
	}
	public void setNatureOfGoods(String natureOfGoods) {
		this.natureOfGoods = natureOfGoods;
	}
	public String getPrivateMarks() {
		return privateMarks;
	}
	public void setPrivateMarks(String privateMarks) {
		this.privateMarks = privateMarks;
	}
	public double getGoodsValue() {
		return goodsValue;
	}
	public void setGoodsValue(double goodsValue) {
		this.goodsValue = goodsValue;
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
	public Double getActualWeight() {
		return actualWeight;
	}
	public void setActualWeight(Double actualWeight) {
		this.actualWeight = actualWeight;
	}
	public Double getChargableWeight() {
		return chargableWeight;
	}
	public void setChargableWeight(Double chargableWeight) {
		this.chargableWeight = chargableWeight;
	}
	public Double getFreight() {
		return freight;
	}
	public void setFreight(Double freight) {
		this.freight = freight;
	}
	public Double getRatePerKg() {
		return ratePerKg;
	}
	public void setRatePerKg(Double ratePerKg) {
		this.ratePerKg = ratePerKg;
	}
	public Double getSur() {
		return sur;
	}
	public void setSur(Double sur) {
		this.sur = sur;
	}
	public Double getHam() {
		return ham;
	}
	public void setHam(Double ham) {
		this.ham = ham;
	}
	public Double getSta() {
		return sta;
	}
	public void setSta(Double sta) {
		this.sta = sta;
	}
	public Double getDel() {
		return del;
	}
	public void setDel(Double del) {
		this.del = del;
	}
	public String getBilling() {
		return billing;
	}
	public void setBilling(String billing) {
		this.billing = billing;
	}
	public Boolean getToBeBilled() {
		return toBeBilled;
	}
	public void setToBeBilled(Boolean toBeBilled) {
		this.toBeBilled = toBeBilled;
	}
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	public Boolean getToPay() {
		return toPay;
	}
	public void setToPay(Boolean toPay) {
		this.toPay = toPay;
	}
	public Integer getWayBillNumber() {
		return wayBillNumber;
	}
	public void setWayBillNumber(Integer wayBillNumber) {
		this.wayBillNumber = wayBillNumber;
	}
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public String getMfNumber() {
		return mfNumber;
	}
	public void setMfNumber(String mfNumber) {
		this.mfNumber = mfNumber;
	}
	public Date getMfDate() {
		return mfDate;
	}
	public void setMfDate(Date mfDate) {
		this.mfDate = mfDate;
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
	public Double getBillCollection() {
		return billCollection;
	}
	public void setBillCollection(Double billCollection) {
		this.billCollection = billCollection;
	}
	public Double getTransportDiff() {
		return transportDiff;
	}
	public void setTransportDiff(Double transportDiff) {
		this.transportDiff = transportDiff;
	}
	public Double getReBookFreight() {
		return reBookFreight;
	}
	public void setReBookFreight(Double reBookFreight) {
		this.reBookFreight = reBookFreight;
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
	public Double getCollectionAmount() {
		return collectionAmount;
	}
	public void setCollectionAmount(Double collectionAmount) {
		this.collectionAmount = collectionAmount;
	}
	public Integer getMrBillNumber() {
		return mrBillNumber;
	}
	public void setMrBillNumber(Integer mrBillNumber) {
		this.mrBillNumber = mrBillNumber;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	@Override
	public String toString() {
		return "Consignment [id=" + id + ", cnNumber=" + cnNumber + ", bookingDateTime=" + bookingDateTime + ", from="
				+ from + ", branchId1=" + branchId1 + ", to=" + to + ", branchId2=" + branchId2 + ", consignerCode="
				+ consignerCode + ", consignerId=" + consignerId + ", consigneeCode=" + consigneeCode + ", consigneeId="
				+ consigneeId + ", numberOfPackages=" + numberOfPackages + ", unit=" + unit + ", natureOfGoods="
				+ natureOfGoods + ", privateMarks=" + privateMarks + ", goodsValue=" + goodsValue + ", invoiceNumber="
				+ invoiceNumber + ", invoiceDate=" + invoiceDate + ", actualWeight=" + actualWeight
				+ ", chargableWeight=" + chargableWeight + ", freight=" + freight + ", ratePerKg=" + ratePerKg
				+ ", sur=" + sur + ", ham=" + ham + ", sta=" + sta + ", del=" + del + ", billing=" + billing
				+ ", toBeBilled=" + toBeBilled + ", paid=" + paid + ", toPay=" + toPay + ", wayBillNumber="
				+ wayBillNumber + ", billNumber=" + billNumber + ", billDate=" + billDate + ", mfNumber=" + mfNumber
				+ ", mfDate=" + mfDate + ", truckNumber=" + truckNumber + ", truckId=" + truckId + ", billCollection="
				+ billCollection + ", transportDiff=" + transportDiff + ", reBookFreight=" + reBookFreight
				+ ", deliveryDate=" + deliveryDate + ", drNumber=" + drNumber + ", paymentDate=" + paymentDate
				+ ", collectionAmount=" + collectionAmount + ", mrBillNumber=" + mrBillNumber + ", remarks=" + remarks
				+ ", deliveryStatus=" + deliveryStatus + "]";
	}
	
	
}
