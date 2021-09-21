package com.main.admin.dto;

public class AppResponse {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "AppResponse [message=" + message + "]";
	}

}
