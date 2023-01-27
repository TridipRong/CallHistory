package com.Kapture.Assignment.Service;

import org.springframework.stereotype.Service;

import com.Kapture.Assignment.Entity.Calls;
@Service
public interface CallService {

	public Calls addcall(Calls call);
}
