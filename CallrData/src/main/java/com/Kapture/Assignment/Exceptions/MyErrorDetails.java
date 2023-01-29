package com.Kapture.Assignment.Exceptions;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;


import lombok.Data;


@Data
public class MyErrorDetails {
	
	private LocalDateTime timeStamp;
	private String message;
	private HttpStatus httpStatus;
	private String details;
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}