package com.rce.exceptions;

public class EventNotFoundExeception extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EventNotFoundExeception(String message) {
		super(message);
	}

}
