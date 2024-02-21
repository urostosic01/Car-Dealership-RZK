package com.pmf.rzk.exception;

public class ErrorDetails {

	private String message;
	private String value;
	
	public ErrorDetails() {
		super();
	}

	public ErrorDetails(String message, String value) {
		super();
		this.message = message;
		this.value = value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
