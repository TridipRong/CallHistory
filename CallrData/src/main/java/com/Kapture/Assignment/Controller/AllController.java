package com.Kapture.Assignment.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Kapture.Assignment.Entity.Calls;
import com.Kapture.Assignment.Entity.CallsDTO;
import com.Kapture.Assignment.Exceptions.CallException;
import com.Kapture.Assignment.Service.CallService;


@RestController()
public class AllController {
	@Autowired
	private CallService callservice;
	
	@PostMapping("/addcall")
	public ResponseEntity<Calls> addcall(@RequestBody CallsDTO calldto) throws CallException{
		Calls response = callservice.addCall(calldto);
        return ResponseEntity.ok(response);
	}
	
//	 @GetMapping("/longestCallOfaDay/{date}")
//	 public ResponseEntity<String> longestCallOfaDay(@PathVariable("date") Date date) throws CallException{
//		 return ResponseEntity.ok(callservice.longestCallOfaDay(date));
//	 }
//	 
//	 
//	 @GetMapping("/highestCallVolumeOfaDay/{date}")
//	 public ResponseEntity<String> highestCallVolumeOfaDay(@PathVariable("date") Date date) throws CallException{
//		 return ResponseEntity.ok(callservice.highestCallVolumeOfaDay(date));
//	 }
//
	@GetMapping("/getallcall")
	 public ResponseEntity<List<Calls>> getCalls() throws CallException{
		List<Calls> callList = callservice.getCalls();
		return new ResponseEntity<List<Calls>>(callList,HttpStatus.OK);
	 }
	 
	 
	 @GetMapping("/longestCallOfDay")
	 public ResponseEntity<String> longestCallOfDay() throws CallException{
		 return ResponseEntity.ok(callservice.longestCallOfDay());
	 }
	 
	 @GetMapping("/highestCallVolumeOfDay")
	 public ResponseEntity<String> highestCallVolumeOfDay() throws CallException{
		 return ResponseEntity.ok(callservice.highestCallVolumeOfDay());
	 }
	 @GetMapping("/highestCallVolumeOfWeek")
	 public ResponseEntity<String> highestCallVolumeOfWeek() throws CallException{
		 return ResponseEntity.ok(callservice.highestCallVolumeOfWeek());
	 }
	 
	 @GetMapping("/longestcallOfWeek")
	 public ResponseEntity<String> longestcallOfWeek() throws CallException{
		 return ResponseEntity.ok(callservice.longestcallOfWeek());
	 }
}
