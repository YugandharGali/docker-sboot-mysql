package com.sboot.mysql.app.exception;

public class AppException extends Exception {

	private static final long serialVersionUID = 1L;

	private String errorCode;

	public AppException(String message) {
		super(message);
	}
	
	public AppException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public AppException(String errorCode, String message, Throwable cause) {
		super(message, cause);
		this.setErrorCode(errorCode);
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	private void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}
