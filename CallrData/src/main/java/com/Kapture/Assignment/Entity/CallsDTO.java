package com.Kapture.Assignment.Entity;

import java.time.Instant;

import lombok.Data;
@Data
public class CallsDTO {
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public Instant getStart_Time() {
		return Start_Time;
	}
	public void setStart_Time(Instant start_Time) {
		Start_Time = start_Time;
	}
	public Instant getEnd_Time() {
		return End_Time;
	}
	public void setEnd_Time(Instant end_Time) {
		End_Time = end_Time;
	}
	private String Mobile;
	private Instant Start_Time;
	private Instant End_Time;
}
