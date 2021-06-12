package com.transport.transportApp.exceptionHandling;

public class AddressNotFoundException extends RuntimeException {

	public AddressNotFoundException(int addressId) {
		super("Could not find address with addressId" + addressId + ".");
	}
}
