package com.transport.transportApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_consigner")
public class Consignment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Consignment_Id", unique = true)
	private int id;
}
