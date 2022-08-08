package com.hms.payloads;

public class ApiResponse {

	private String message;
	private boolean sucess;
	

	public ApiResponse(String message, boolean sucess) {
	
		this.message = message;
		this.sucess = sucess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSucess() {
		return sucess;
	}

	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}
	
	
}
