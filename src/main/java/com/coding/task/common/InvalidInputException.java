package com.coding.task.common;


/**
 * The InvalidInputExaception class is the customized runtime exception for invalid entry inputs from the client.
 * @author vineet karandikar
 * @version 1.0
 * @since 2017-09-08
 */
public class InvalidInputException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String className;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public InvalidInputException() {
		super();
	}

	public InvalidInputException(String className, String message) {
		super(message);
		this.className = className;

	}

	@Override
	public String getMessage() {
		return super.getMessage() + " for className :" + className ;
	}

	
}
