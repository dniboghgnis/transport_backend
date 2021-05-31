package com.transport.transportApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_moneyReceipt")
public class MoneyReceipt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Mr_Id", unique = true, nullable = false)
	private long mrId;

	public long getMrId() {
		return mrId;
	}

	public void setMrId(long mrId) {
		this.mrId = mrId;
	}

	@Override
	public String toString() {
		return "MoneyReceipt [mrId=" + mrId + "]";
	}
	
	
}
