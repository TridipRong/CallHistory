package com.Kapture.Assignment.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Kapture.Assignment.Entity.Calls;
import com.Kapture.Assignment.Exceptions.CallException;
@Service
public interface CallService {

	public Calls addCall(Calls call) throws CallException;
	
	public String highestCallVolumeOfDay()throws CallException;
	
	public String longestCallOfDay() throws CallException;
	 
	 
	public String highestCallVolumeOfWeek() throws CallException;
	 
	public String longestcallOfWeek() throws CallException;
	public List<Calls> getCalls() throws CallException;
}
