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
	
	@Column(name = "Manifest_Date")
	private Date manifestDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Truck_Number")
	private Truck truckNumber;
	
	@Column(name = "Truck_Number", insertable = false, updatable = false)
	private Integer truckId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "From_Branch")
	private Branch fromBranch;
	
	@Column(name = "From_Branch", insertable = false, updatable = false)
	private Integer branchId1;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "To_Branch")
	private Branch toBranch;
	
	@Column(name = "To_Branch", insertable = false, updatable = false)
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
	
	public Manifest(int id, int manifestNumber, Date manifestDate, Truck truckNumber, Integer truckId,
			Branch fromBranch, Integer branchId1, Branch toBranch, Integer branchId2, String ewayBill,
			int lastSerialNumber, List<Consignment> consignmentId) {
		super();
		this.id = id;
		this.manifestNumber = manifestNumber;
		this.manifestDate = manifestDate;
		this.truckNumber = truckNumber;
		this.truckId = truckId;
		this.fromBranch = fromBranch;
		this.branchId1 = branchId1;
		this.toBranch = toBranch;
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

	public Date getManifestDate() {
		return manifestDate;
	}

	public void setManifestDate(Date manifestDate) {
		this.manifestDate = manifestDate;
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

	public Branch getFromBranch() {
		return fromBranch;
	}

	public void setFromBranch(Branch fromBranch) {
		this.fromBranch = fromBranch;
	}

	public Integer getBranchId1() {
		return branchId1;
	}

	public void setBranchId1(Integer branchId1) {
		this.branchId1 = branchId1;
	}

	public Branch getToBranch() {
		return toBranch;
	}

	public void setToBranch(Branch toBranch) {
		this.toBranch = toBranch;
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
		return "Manifest [id=" + id + ", manifestNumber=" + manifestNumber + ", manifestDate=" + manifestDate
				+ ", truckNumber=" + truckNumber + ", truckId=" + truckId + ", fromBranch=" + fromBranch
				+ ", branchId1=" + branchId1 + ", toBranch=" + toBranch + ", branchId2=" + branchId2 + ", ewayBill="
				+ ewayBill + ", lastSerialNumber=" + lastSerialNumber + ", consignmentId=" + consignmentId + "]";
	}

	
	
	
}
