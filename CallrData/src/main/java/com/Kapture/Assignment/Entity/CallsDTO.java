package com.Kapture.Assignment.Entity;

import java.time.Instant;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
public class CallsDTO {
	
	private String Mobile;
	@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
	private LocalDateTime Start_Time;
	

	@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")	
	private LocalDateTime end_time;


	
	
}
