package com.transport.transportApp.exceptionHandling;

import java.io.Serializable;

public class AddressNotFoundException extends RuntimeException implements Serializable{
	
	static final long serialVersionUID = 2L;
	
	public AddressNotFoundException(int addressId) {
		super("Could not find address with addressId" + addressId + " "+".");
	}
}
