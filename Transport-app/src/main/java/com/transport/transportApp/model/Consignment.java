package com.transport.transportApp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_consignment")
public class Consignment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Consignment_Id", unique = true)
	private int id;
	
	@Column(name = "Cn_Number")
	private int cnNumber;
	
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
	private int numberOfPackages;
	
	@Column(name = "Unit")
	private int unit;
	
	@Column(name = "Nature_Of_Goods")
	private NatureOfGoods natureOfGoods;
	
	@Column(name = "Private_Marks")
	private String privateMarks;
	
	@Column(name = "Goods_Value")
	private double goodsValue;
	
	@Column(name = "Invoice_Number")
	private String invoiceNumber;
	
	@Column(name = "Invoice_Date")
	private Date invoiceDate;
	
	@Column(name = "Actual_Weight")
	private double actualWeight;
	
	@Column(name = "Chargable_Weight")
	private double chargableWeight;
	
	@Column(name = "Freight")
	private double freight;
	
	@Column(name = "Rate_Per_Kg")
	private double ratePerKg;
	
	@Column(name = "Sur")
	private double sur;
	
	@Column(name = "Ham")
	private double ham;
	
	@Column(name = "Sta")
	private double sta;
	
	@Column(name = "Del")
	private double del; 	
	
	@Column(name = "Billing")
	private Billing billing;
	
	@Column(name = "To_Be_Billed")
	private boolean toBeBilled;
	
	@Column(name = "Paid")
	private boolean paid;
	
	@Column(name = "To_Pay")
	private boolean toPay;
	
	@Column(name = "Way_Bill_Number")
	private int wayBillNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Bill_Number")
	private Bill billNumber;
	
	@Column(name = "Bill_Number", insertable = false, updatable = false)
	private Integer billId;
	
	@Column(name = "Bill_Date")
	private Date billDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Mf_Number")
	private Manifest mfNumber;
	
	@Column(name = "Mf_Number", insertable = false, updatable = false)
	private Integer manifestId;
	
	@Column(name = "Mf_Date")
	private Date mfDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Truck_Number")
	private Truck truckNumber;
	
	@Column(name = "Truck_Number", insertable = false, updatable = false)
	private Integer truckId;
	
	@Column(name = "Bill_Collection")
	private double billCollection;
	
	@Column(name = "Transport_Diff")
	private double transportDiff;
	
	@Column(name = "Re_Book_Freight")
	private double reBookFreight;
	
	@Column(name = "Delivery_Date")
	private Date deliveryDate;
	
	@Column(name = "Dr_Number")
	private String drNumber;
	
	@Column(name = "Payment_Date")
	private Date paymentDate;

	@Column(name = "Collection_Amount")
	private double collectionAmount;
	
	@Column(name = "Mr_Bill_Number")
	private int mrBillNumber;
	
	@Column(name = "Remarks")
	private String remarks;
	
	@Column(name = "Delivery_Status")
	private DeliveryStatus deliveryStatus;
	
	public Consignment() {
		
	}

	public Consignment(int id, int cnNumber, Date bookingDateTime, Branch from, Integer branchId1, Branch to,
			Integer branchId2, Consigner consignerCode, Integer consignerId, Consignee consigneeCode,
			Integer consigneeId, int numberOfPackages, int unit, NatureOfGoods natureOfGoods, String privateMarks,
			double goodsValue, String invoiceNumber, Date invoiceDate, double actualWeight, double chargableWeight,
			double freight, double ratePerKg, double sur, double ham, double sta, double del, Billing billing,
			boolean toBeBilled, boolean paid, boolean toPay, int wayBillNumber, Bill billNumber, Integer billId,
			Date billDate, Manifest mfNumber, Integer manifestId, Date mfDate, Truck truckNumber, Integer truckId,
			double billCollection, double transportDiff, double reBookFreight, Date deliveryDate, String drNumber,
			Date paymentDate, double collectionAmount, int mrBillNumber, String remarks,
			DeliveryStatus deliveryStatus) {
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
		this.billId = billId;
		this.billDate = billDate;
		this.mfNumber = mfNumber;
		this.manifestId = manifestId;
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

	public int getCnNumber() {
		return cnNumber;
	}

	public void setCnNumber(int cnNumber) {
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

	public double getActualWeight() {
		return actualWeight;
	}

	public void setActualWeight(double actualWeight) {
		this.actualWeight = actualWeight;
	}

	public double getChargableWeight() {
		return chargableWeight;
	}

	public void setChargableWeight(double chargableWeight) {
		this.chargableWeight = chargableWeight;
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

	public double getSur() {
		return sur;
	}

	public void setSur(double sur) {
		this.sur = sur;
	}

	public double getHam() {
		return ham;
	}

	public void setHam(double ham) {
		this.ham = ham;
	}

	public double getSta() {
		return sta;
	}

	public void setSta(double sta) {
		this.sta = sta;
	}

	public double getDel() {
		return del;
	}

	public void setDel(double del) {
		this.del = del;
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

	public int getWayBillNumber() {
		return wayBillNumber;
	}

	public void setWayBillNumber(int wayBillNumber) {
		this.wayBillNumber = wayBillNumber;
	}

	public Bill getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(Bill billNumber) {
		this.billNumber = billNumber;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
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

	public double getReBookFreight() {
		return reBookFreight;
	}

	public void setReBookFreight(double reBookFreight) {
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
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
				+ wayBillNumber + ", billNumber=" + billNumber + ", billId=" + billId + ", billDate=" + billDate
				+ ", mfNumber=" + mfNumber + ", manifestId=" + manifestId + ", mfDate=" + mfDate + ", truckNumber="
				+ truckNumber + ", truckId=" + truckId + ", billCollection=" + billCollection + ", transportDiff="
				+ transportDiff + ", reBookFreight=" + reBookFreight + ", deliveryDate=" + deliveryDate + ", drNumber="
				+ drNumber + ", paymentDate=" + paymentDate + ", collectionAmount=" + collectionAmount
				+ ", mrBillNumber=" + mrBillNumber + ", remarks=" + remarks + ", deliveryStatus=" + deliveryStatus
				+ "]";
	}

	
	
}
