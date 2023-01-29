package com.Kapture.Assignment.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kapture.Assignment.Entity.Calls;
import com.Kapture.Assignment.Exceptions.CallException;
import com.Kapture.Assignment.Repository.CallDao;
@Service
public class CallServiceImpl implements CallService{

	@Autowired
	private CallDao callDAO;

	@Override
	public String highestCallVolumeOfDay() throws CallException {
		List<Object[]> callDetails=callDAO.highestCallVolumeOfDay();
		
		if(callDetails==null) {
			throw new CallException("Data not found");
		}
		 Object[] data=callDetails.get(0);
		Integer start=(int)data[0];
		Integer end=(int)data[1];
		
		if(start==0 && end>=0) {
			return "Hour of the day when the call volume is highest is 12-"+(end+1)+" AM";
		}
		else if(start<12 && end<11) {
			return "Hour of the day when the call volume is highest is "+start+"-"+(end+1)+" AM";
		}
		else if(start<=11 && end==11) {
			return "Hour of the day when the call volume is highest is  "+start+" AM-"+(end+1)+"PM";
		}
		else if(start<=11 && end<=12) {
			return "Hour of the day when the call volume is highest is  "+start+" AM-"+(end-11)+"PM";
		}
		else if(start==12) {
			return "Hour of the day when the call volume is highest is  "+start+" PM-"+(end-11)+"PM";
		}
		else if(start<=23 && end==23) {
			return "Hour of the day when the call volume is highest is  "+(start-12)+" PM-"+(end-11)+"AM";
		}
		else if(start<=23 && end>=0) {
			return "Hour of the day when the call volume is highest is  "+(start-12)+" PM-"+(end+1)+"AM";
		}
		else  {
			return"Hour of the day when the calls are longest is  "+(start-12)+"-"+(end-11)+" PM";
		}
	}
	
	@Override
	public String longestCallOfDay() throws CallException {
		List<Object[]> callDetails=callDAO.longestCallOfDay();
		
		if(callDetails==null) {
			throw new CallException("Data not found");
		}
		 Object[] data=callDetails.get(0);
		Integer start=(int)data[0];
		Integer end=(int)data[1];
		
		if(start==0 && end>=0) {
			return "Hour of the day when the calls are longest is 12-"+(end+1)+" AM";
		}
		else if(start<12 && end<11) {
			return "Hour of the day when the calls are longest is "+start+"-"+(end+1)+" AM";
		}
		else if(start<=11 && end==11) {
			return "Hour of the day when the calls are longest is  "+start+" AM-"+(end+1)+"PM";
		}
		else if(start<=11 && end<=12) {
			return "Hour of the day when the calls are longest is  "+start+" AM-"+(end-11)+"PM";
		}
		else if(start==12) {
			return "Hour of the day when the calls are longest is  "+start+" PM-"+(end-11)+"PM";
		}
		else if(start<=23 && end==23) {
			return "Hour of the day when the calls are longest is  "+(start-12)+" PM-"+(end-11)+"AM";
		}
		else if(start<=23 && end>=0) {
			return "Hour of the day when the calls are longest is  "+(start-12)+" PM-"+(end+1)+"AM";
		}
		else  {
			return"Hour of the day when the calls are longest is  "+(start-12)+"-"+(end-11)+" PM";
		}
//		else{
//			return "error";
//		}
	}
	@Override
	public String highestCallVolumeOfWeek() throws CallException {
		List<Object[]> list=callDAO.highestCallVolumeOfWeek();
		if(list==null) {
			throw new CallException("Data not Found");
		}
		
		Object[] data=list.get(0);
		
		String day=(String)data[0];
		
		return "Day of the week when the call volume is highest is "+day;
	}
	@Override
	public String longestcallOfWeek() throws CallException {
		List<Object[]> list=callDAO.longestcallOfWeek();
		if(list==null) {
			throw new CallException("Data not Found");
		}
		
		Object[] data=list.get(0);
		
		String day=(String)data[0];
		
		return "Day of the week when the call volume is highest is "+day;
	}
	
	
	@Override
	public Calls addCall(Calls calldto) throws CallException {
//		Calls newcall = new Calls();
//		newcall.setMobile(calldto.getMobile());
//		newcall.setStart_Time(calldto.getStart_Time());
//		newcall.setEnd_Time(calldto.getEnd_Time());
//		Integer noOfSecounds=(int) calldto.getStart_Time().until(calldto.getEnd_Time(),ChronoUnit.SECONDS);
//		newcall.setDuration(noOfSecounds);
        return callDAO.save(calldto);
	}
	@Override
	public List<Calls> getCalls() throws CallException {
		List<Calls> lcall=callDAO.findAll();
		if (lcall.isEmpty()) {
			throw new CallException("No call data is there in database to show.");
		}
		return lcall;
		
	}

}
