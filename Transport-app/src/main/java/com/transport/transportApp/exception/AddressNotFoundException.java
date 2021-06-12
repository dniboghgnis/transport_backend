package com.transport.transportApp.exception;

public class AddressNotFoundException extends RuntimeException {

	public AddressNotFoundException(int addressId) {
		super("Could not find address with addressId" + addressId + ".");
	}
}
