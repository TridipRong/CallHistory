package com.Kapture.Assignment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kapture.Assignment.Entity.Calls;
import com.Kapture.Assignment.Repository.CallDao;
@Service
public class CallServiceImpl implements CallService{

	@Autowired
	private CallDao callDAO;
	@Override
	public Calls addcall(Calls call) {
		
		return callDAO.save(call);
	}

}
