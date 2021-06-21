package com.transport.transportApp.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ConsignmentNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(ConsignmentNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
	String consignmentNotFoundHandler(ConsignmentNotFoundException e) {
		return e.getMessage();
	}

}
