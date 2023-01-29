package com.Kapture.Assignment.Service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Kapture.Assignment.Entity.Calls;
import com.Kapture.Assignment.Entity.CallsDTO;
import com.Kapture.Assignment.Exceptions.CallException;
@Service
public interface CallService {

	public Calls addCall(CallsDTO calldto) throws CallException;
	
	public String highestCallVolumeOfDay()throws CallException;
	
	public String longestCallOfDay() throws CallException;
 
	public String longestCallOfaDay(Date date)throws CallException;
	  
	public String highestCallVolumeOfaDay(Date date) throws CallException;
	 
	public String highestCallVolumeOfWeek() throws CallException;
	 
	public String longestcallOfWeek() throws CallException;
	public List<Calls> getCalls() throws CallException;
}
