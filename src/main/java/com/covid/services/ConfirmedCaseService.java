package com.covid.services;

import org.springframework.stereotype.Service;

@Service
public class ConfirmedCaseService {

//	@Autowired	
//	ConfirmedRepo confirmRepo;
//
//	@CacheEvict( cacheNames = {"geodata","district","dateStatus","status","gender","location","age"})
//	public ConfirmedCase createConfirmedCase(ConfirmedCase confirmedCase) {
//		// Find existing case Id
//		ConfirmedCase cas = confirmRepo.findByCaseId(confirmedCase.getCaseId());
//		if(cas != null) {
//			return null;
//		}
//		return confirmRepo.save(confirmedCase);
//	}
//
//	public List<ConfirmedCase> getConfirmedCases() {		
//		return confirmRepo.findAll();
//	}
//	
//	
//	public ConfirmedCase getConfirmedCaseDetails(int id) {
//		Optional<ConfirmedCase> confirmCase = confirmRepo.findById(id);
//		if(confirmCase.isPresent()) {
//			return confirmCase.get();
//		} else {
//			return null;
//		}
//		
//	}
//	
//	@CacheEvict( cacheNames = {"geodata","district","dateStatus","status","gender","location","age"})
//	public ConfirmedCase updateConfirmedCase(int id, ConfirmedCase confirmedCase) {
//		Optional<ConfirmedCase> oldCaseOpt = confirmRepo.findById(id);
//		ConfirmedCase oldCase=null;
//		if (oldCaseOpt.isPresent()) {
//			// Map Fields
//			oldCase = confirmedCase;
//			confirmRepo.save(oldCase);
//		} else {
//			
//		}
//		return oldCase;
//	}
	
}
