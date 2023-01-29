package com.Kapture.Assignment.Entity;

import java.security.Timestamp;
import java.time.Instant;

import org.apache.logging.log4j.CloseableThreadContext.Instance;

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
	
	@Column(name="start_time")
	private Instant Start_Time;
	
	@Column(name="end_time")
	private Instant End_Time;
	
	@Column(name="duration")
	private Integer Duration;
	
}
