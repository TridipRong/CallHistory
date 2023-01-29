package com.Kapture.Assignment.Entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calls {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="callerId")
	private Integer Id;
	
	@Column(name="mobileNumber")
	private String Mobile;
	

	@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
	private LocalDateTime Start_Time;
	

	@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")	
	private LocalDateTime end_time;
	
	@Column(name="duration")
	private Integer Duration;
	
}
