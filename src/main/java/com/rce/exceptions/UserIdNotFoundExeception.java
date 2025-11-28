package com.rce.exceptions;

public class UserIdNotFoundExeception extends RuntimeException {
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserIdNotFoundExeception(String message) {
		super(message);
	}
}
