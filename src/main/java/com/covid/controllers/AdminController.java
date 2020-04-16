package com.covid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.models.ConfirmedCase;
import com.covid.models.SuspectCase;
import com.covid.services.ConfirmedCaseService;
import com.covid.services.SuspectCaseService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	ConfirmedCaseService confirmService;
	
	@Autowired
	SuspectCaseService suspectService;
	
//	@PostMapping("/confirmed")
//	public void createConfirmed(@RequestBody ConfirmedCase confirmedCase ) {
//		confirmService.createConfirmedCase(confirmedCase);
//		
//	}
//	
//	@GetMapping("/confirmed")
//	public List<ConfirmedCase> getConfirmedList() {
//		
//		return confirmService.getConfirmedCases();
//		
//	}
//	
//	@PutMapping("/confirmed/{id}")
//	public ConfirmedCase updateConfirmed(@PathVariable int id,@RequestBody ConfirmedCase confirmedCase) {
//		
//		return confirmService.updateConfirmedCase(id,confirmedCase);
//		
//	}
//	
//	
//	
//	@PostMapping("/suspect")
//	public void createSuspect(@RequestBody SuspectCase suspectCase ) {
//		// TODO Validate the input object
//		
//		suspectService.createSuspectCase(suspectCase);
//		
//	}
//	
//	@GetMapping("/suspect")
//	public List<SuspectCase> getSuspectList() {
//		
//		return suspectService.getSuspectCases();
//		
//	}
//	
//	@PutMapping("/suspect/{id}")
//	public SuspectCase updateSuspect(@PathVariable int id,@RequestBody SuspectCase suspectCase) {
//		
//		return suspectService.updateSuspectCase(id,suspectCase);
//		
//	}
	

}
