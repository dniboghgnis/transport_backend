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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Truck_Id")
	private Truck ownerSName;
	
	@Column(name = "Consignment_Id")
	private List<String> consignmentId;

}
