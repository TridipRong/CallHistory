package com.Kapture.Assignment.Entity;

import java.security.Timestamp;

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
	private Integer Id;
	private String Mobile;
	private Timestamp Start_Time;
	private Timestamp End_Time;
	private Integer Duration;
	
}
