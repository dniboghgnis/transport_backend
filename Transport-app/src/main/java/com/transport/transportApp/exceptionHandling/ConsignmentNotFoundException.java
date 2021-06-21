package com.transport.transportApp.exceptionHandling;

import java.io.Serializable;

public class ConsignmentNotFoundException extends RuntimeException implements Serializable{

	static final long serialVersionUID = 1L;
	
	public ConsignmentNotFoundException(int consignmentId) {
		super("Could not find Consignment with consignmentId" + consignmentId + ".");
	}
}
