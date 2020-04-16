package com.covid.services;

import org.springframework.stereotype.Service;

@Service
public class SuspectCaseService {

//	@Autowired	
//	SuspectRepo suspectRepo;
//
//	@CacheEvict( cacheNames = {"suspect"})
//	public SuspectCase createSuspectCase(SuspectCase suspectCase) {
//		
//		return suspectRepo.save(suspectCase);
//	}
//
//	public List<SuspectCase> getSuspectCases() {		
//		return suspectRepo.findAll();
//	}
//	
//	
//	public SuspectCase getSuspectCaseDetails(int id) {
//		Optional<SuspectCase> suspectCase = suspectRepo.findById(id);
//		if(suspectCase.isPresent()) {
//			return suspectCase.get();
//		} else {
//			return null;
//		}
//		
//	}
//	
//	@CacheEvict( cacheNames = {"suspect"})
//	public SuspectCase updateSuspectCase(int id, SuspectCase suspectCase) {
//		Optional<SuspectCase> oldCaseOpt = suspectRepo.findById(id);
//		SuspectCase oldCase=null;
//		if (oldCaseOpt.isPresent()) {
//			// Map Fields
//			oldCase = suspectCase;
//			suspectRepo.save(oldCase);
//		} else {
//			
//		}
//		return oldCase;
//	}
	
}
