package com.rce.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NameNotFound.class)
	public String NameNotFound(NameNotFound ex) {
		return ex.getMessage();
	}
	@ExceptionHandler(IdNotFoundExeception.class)
	public String IdNotFoundExeception(IdNotFoundExeception ex) {
		return ex.getMessage();
	}
	@ExceptionHandler(UserIdNotFoundExeception.class)
	public String UserIdNotFoundExeception(UserIdNotFoundExeception ex) {
		return ex.getMessage();
	}
	

}
