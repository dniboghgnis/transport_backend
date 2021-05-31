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
import javax.persistence.Table;

@Entity
@Table(name = "tbl_manifest")
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
	@JoinColumn(name = "Truck_Id")
	private Truck truckRef;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Branch_Id")
	private Branch from;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Branch_Id")
	private Branch to;
	
	@Column(name = "Eway_Bill")
	private String ewayBill;
	
	@Column(name = "Last_Serial_Number")
	private int lastSerialNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Truck_Id")
	private Truck ownerSName;
	
	@Column(name = "Consignment_Id")
	private List<String> consignmentId;

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

	public Truck getTruckRef() {
		return truckRef;
	}

	public void setTruckRef(Truck truckRef) {
		this.truckRef = truckRef;
	}

	public Branch getFrom() {
		return from;
	}

	public void setFrom(Branch from) {
		this.from = from;
	}

	public Branch getTo() {
		return to;
	}

	public void setTo(Branch to) {
		this.to = to;
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

	public Truck getOwnerSName() {
		return ownerSName;
	}

	public void setOwnerSName(Truck ownerSName) {
		this.ownerSName = ownerSName;
	}

	public List<String> getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(List<String> consignmentId) {
		this.consignmentId = consignmentId;
	}

	@Override
	public String toString() {
		return "Manifest [id=" + id + ", manifestNumber=" + manifestNumber + ", dateTime=" + dateTime + ", truckRef="
				+ truckRef + ", from=" + from + ", to=" + to + ", ewayBill=" + ewayBill + ", lastSerialNumber="
				+ lastSerialNumber + ", ownerSName=" + ownerSName + ", consignmentId=" + consignmentId + "]";
	}
	
	

}
