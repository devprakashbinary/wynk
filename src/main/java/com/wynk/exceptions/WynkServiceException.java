package com.wynk.exceptions;

public class WynkServiceException extends Exception{

	public int status = 500;
	/**
	 * 
	 */
	private static final long serialVersionUID = 6252008437485725655L;

	public WynkServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WynkServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public WynkServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public WynkServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public WynkServiceException(String message,int status) {
		super(message);
		this.status = status;
	}

	public WynkServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
