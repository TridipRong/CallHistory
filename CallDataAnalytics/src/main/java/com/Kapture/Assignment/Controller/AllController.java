package com.Kapture.Assignment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Kapture.Assignment.Entity.Calls;
import com.Kapture.Assignment.Service.CallService;


@RestController
public class AllController {
	@Autowired
	private CallService callservice;
	@PostMapping("/addcall")
	public ResponseEntity<Calls> addRoute(@RequestBody Calls call){
		Calls res = callservice.addcall(call);
		return new ResponseEntity<Calls>(call,HttpStatus.OK);
	}
}
