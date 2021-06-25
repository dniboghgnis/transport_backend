package com.transport.transportApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Truck {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Truck_Id")
	private int id;
	
	@Column(name = "Licence_Number")
	private String licenceNumber;
	
	@Column(name = "Owner_Name")
	private String ownerName;
	
	@Column(name = "Driver_Name")
	private String driverName;
	
	@Column(name = "Truck_Number")
	private String truckNumber;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	@Override
	public String toString() {
		return "Truck [id=" + id + ", licenceNumber=" + licenceNumber + ", ownerName=" + ownerName + ", driverName="
				+ driverName + ", truckNumber=" + truckNumber + "]";
	}
	
	

}
