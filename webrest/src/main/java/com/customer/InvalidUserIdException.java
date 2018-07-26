package com.customer;

public class InvalidUserIdException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidUserIdException() {
		super("Given User does not exist");
	}
}
