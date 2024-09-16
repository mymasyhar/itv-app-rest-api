package com.example.itv_app_rest_api.entity;


public class NumResponse {
	private String message;
	private String result;
	
	public NumResponse(String message, String result) {
		super();
		this.message = message;
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
