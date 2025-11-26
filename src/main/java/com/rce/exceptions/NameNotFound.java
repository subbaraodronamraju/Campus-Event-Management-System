package com.rce.exceptions;

public class NameNotFound extends RuntimeException {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

   public NameNotFound(String message) {
	   super(message);
   }
}
