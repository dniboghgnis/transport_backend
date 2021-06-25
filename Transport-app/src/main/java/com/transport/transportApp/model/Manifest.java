package com.transport.transportApp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Manifest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Manifest_Id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "Manifest_Number")
	private int manifestNumber;
	
	@Column(name = "Date_Time")
	private Date dateTime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Truck_Number")
	private Truck truckNumber;
	
	@Column(name = "Truck_Number", insertable = false, updatable = false)
	private Integer truckId;
	
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
	
	@Column(name = "Eway_Bill")
	private String ewayBill;
	
	@Column(name = "Last_Serial_Number")
	private int lastSerialNumber;
	
	@OneToMany(fetch = FetchType.LAZY)
	@Column(name = "Consignment_Id")
	private List<Consignment> consignmentId;

	
	public Manifest() {
		
	}
	
	public Manifest(int id, int manifestNumber, Date dateTime, Truck truckNumber, Integer truckId, Branch from,
			Integer branchId1, Branch to, Integer branchId2, String ewayBill, int lastSerialNumber,
			List<Consignment> consignmentId) {
		super();
		this.id = id;
		this.manifestNumber = manifestNumber;
		this.dateTime = dateTime;
		this.truckNumber = truckNumber;
		this.truckId = truckId;
		this.from = from;
		this.branchId1 = branchId1;
		this.to = to;
		this.branchId2 = branchId2;
		this.ewayBill = ewayBill;
		this.lastSerialNumber = lastSerialNumber;
		this.consignmentId = consignmentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getManifestNumber() {
		return manifestNumber;
	}

	public void setManifestNumber(int manifestNumber) {
		this.manifestNumber = manifestNumber;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
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

	public String getEwayBill() {
		return ewayBill;
	}

	public void setEwayBill(String ewayBill) {
		this.ewayBill = ewayBill;
	}

	public int getLastSerialNumber() {
		return lastSerialNumber;
	}

	public void setLastSerialNumber(int lastSerialNumber) {
		this.lastSerialNumber = lastSerialNumber;
	}

	public List<Consignment> getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(List<Consignment> consignmentId) {
		this.consignmentId = consignmentId;
	}

	@Override
	public String toString() {
		return "Manifest [id=" + id + ", manifestNumber=" + manifestNumber + ", dateTime=" + dateTime + ", truckNumber="
				+ truckNumber + ", truckId=" + truckId + ", from=" + from + ", branchId1=" + branchId1 + ", to=" + to
				+ ", branchId2=" + branchId2 + ", ewayBill=" + ewayBill + ", lastSerialNumber=" + lastSerialNumber
				+ ", consignmentId=" + consignmentId + "]";
	}
	
	

	
}
