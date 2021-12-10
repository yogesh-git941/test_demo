package com.springboot.exception;

public class UserDataAccessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserDataAccessException(String errorMessage) {
		super(errorMessage);
	}

}
