package com.covid.repos;

import org.springframework.stereotype.Repository;

import com.covid.models.ConfirmedCase;

@Repository
public interface ConfirmedRepo {//extends JpaRepository<ConfirmedCase, Integer> {
	
	public ConfirmedCase findByCaseId(String caseId);

//	@Query(nativeQuery = true, 
//			value = "select district,status, count(*) as count "
//			+ "from confirmed_case "
//			+ "group by district,status")
//	Object[] findDistrictAndStatusWiseCases();
//	
//	@Query(nativeQuery = true, 
//			value = "select reported_on, status, count(*) as count  "
//			+ "from confirmed_case "
//			+ "group by reported_on, status")
//	Object[] findDateAndStatusWiseCases();
//	
//	@Query(nativeQuery = true, 
//			value = "select status, count(*) as count  "
//			+ "from confirmed_case "
//			+ "group by status")
//	Object[] findStatusWiseCases();
//
//	
//	@Query(nativeQuery = true, 
//			value = "select gender, count(*) as count  "
//			+ "from confirmed_case "
//			+ "group by gender")
//	Object[] fetchGenderData();
//
//	
//	@Query(nativeQuery = true, 
//			value = "select locality, count(*) as count  "
//			+ "from confirmed_case "
//			+ "group by locality")
//	Object[] fetchLocationData();
//	
//	
//	@Query(nativeQuery = true, 
//			value = "select age, count(*) as count  "
//			+ "from confirmed_case "
//			+ "group by age")
//	Object[] fetchAgeData();


}
