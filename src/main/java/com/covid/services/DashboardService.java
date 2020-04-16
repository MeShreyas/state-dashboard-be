package com.covid.services;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.models.AgeData;
import com.covid.models.AgeResponse;
import com.covid.models.CardData;
import com.covid.models.GenderData;
import com.covid.models.LineData;
import com.covid.models.LocationData;
import com.covid.models.MapData;
import com.covid.models.SuspectData;
import com.covid.models.SuspectResponse;
import com.covid.models.TableData;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.BatchGetValuesResponse;

@Service
public class DashboardService {

//	@Autowired
//	ConfirmedRepo confirmRepo;
//
//	@Autowired
//	SuspectRepo suspectRepo;

	@Autowired
	CordinatesService cordinatesService;

	@Autowired
	Sheets sheetService;
	
	final String SPREAD_SHEET_ID = "Google SpreadSheet ID";

//	@Cacheable("geoData")
	public List<MapData> fetchMapData() throws IOException {
		Map<String, MapData> data = new HashMap<String, MapData>();

//		Object[] results = confirmRepo.findDistrictAndStatusWiseCases();
		

		BatchGetValuesResponse ss = sheetService.spreadsheets().values().batchGet(SPREAD_SHEET_ID)
				.setRanges(Arrays.asList("DistrictLevel!A2:Z")).execute();

		List<List<Object>> values = ss.getValueRanges().get(0).getValues();

		for (List<Object> indivRec : values) {
			if (indivRec.get(0) == null || ((String) indivRec.get(0)).length() < 1) {
				continue;
			}
			String district = ((String) indivRec.get(0)).toUpperCase();
			String status = (String) indivRec.get(1);
			int count = Integer.parseInt((String) indivRec.get(2));

			if (data.containsKey(district.toString())) {
				MapData ld = data.get(district);
				switch (status) {
				case "Deceased":
					ld.setDeceasedCases(count);
					break;
				case "In Hospital":
					ld.setHospitalCases(count);
					break;
				case "Recovered":
					ld.setRecoveredCases(count);
					break;
				}
				ld.setTotalCases(ld.getTotalCases() + count);
				data.put(district, ld);
			} else {
				MapData ld = new MapData();
				ld.setDistrict(district);

				switch (status) {
				case "Deceased":
					ld.setDeceasedCases(count);
					break;
				case "In Hospital":
					ld.setHospitalCases(count);
					break;
				case "Recovered":
					ld.setRecoveredCases(count);
					break;
				}
				ld.setTotalCases(count);
				data.put(district, ld);
			}
		}

		List<MapData> finalList = new ArrayList<MapData>(data.values());

		for (MapData t : finalList) {
			t.setCordinates(cordinatesService.fetchLatLng(t.getDistrict()));
		}

		System.out.println(finalList);

		return finalList;
	}

//	@Cacheable("district")
	public List<TableData> fetchTableData() throws IOException {

		BatchGetValuesResponse ss = sheetService.spreadsheets().values().batchGet(SPREAD_SHEET_ID)
				.setRanges(Arrays.asList("DistrictLevel!A2:Z")).execute();

		List<List<Object>> values = ss.getValueRanges().get(0).getValues();

		Map<String, TableData> data = new HashMap<String, TableData>();

		for (String district : cordinatesService.getDistricts()) {
			data.put(district, new TableData(district));
		}

		for (List<Object> indivRec : values) {
			if (indivRec.get(0) == null || ((String) indivRec.get(0)).length() < 1) {
				continue;
			}
			String district = ((String) indivRec.get(0)).toUpperCase();
			String status = (String) indivRec.get(1);
			int count = Integer.parseInt((String) indivRec.get(2));

			if (data.containsKey(district.toString())) {
				TableData ld = data.get(district);
				switch (status) {
				case "Deceased":
					ld.setDeceasedCases(count);
					break;
				case "In Hospital":
					ld.setHospitalCases(count);
					break;
				case "Recovered":
					ld.setRecoveredCases(count);
					break;
				}
				ld.setTotalCases(ld.getTotalCases() + count);
				data.put(district, ld);
			} else {
				TableData ld = new TableData();
				ld.setDistrict(district);

				switch (status) {
				case "Deceased":
					ld.setDeceasedCases(count);
					break;
				case "In Hospital":
					ld.setHospitalCases(count);
					break;
				case "Recovered":
					ld.setRecoveredCases(count);
					break;
				}
				ld.setTotalCases(count);
				data.put(district, ld);
			}

		}

//		Object[] results = confirmRepo.findDistrictAndStatusWiseCases();
//		for (Object obj : results) {
//			Object[] a = (Object[]) obj;
//			String district = (String) a[0];
//			String status = (String) a[1];
//			int count = ((BigInteger) a[2]).intValue();
//
//			if (data.containsKey(district.toString())) {
//				TableData ld = data.get(district);
//				switch (status) {
//				case "Deceased":
//					ld.setDeceasedCases(count);
//					break;
//				case "Hospital":
//					ld.setHospitalCases(count);
//					break;
//				case "Recovered":
//					ld.setRecoveredCases(count);
//					break;
//				}
//				ld.setTotalCases(ld.getTotalCases() + count);
//				data.put(district, ld);
//			} else {
//				TableData ld = new TableData();
//				ld.setDistrict(district);
//
//				switch (status) {
//				case "Deceased":
//					ld.setDeceasedCases(count);
//					break;
//				case "Hospital":
//					ld.setHospitalCases(count);
//					break;
//				case "Recovered":
//					ld.setRecoveredCases(count);
//					break;
//				}
//				ld.setTotalCases(count);
//				data.put(district, ld);
//			}
//
//		}

		List<TableData> finalList = new ArrayList<TableData>(data.values());

		Collections.sort(finalList);
		Collections.reverse(finalList);

		return finalList;
	}

//	@Cacheable("dateStatus")
	public List<LineData> fetchLineChartData() throws IOException, ParseException {

		Map<String, LineData> data = new HashMap<String, LineData>();


		

		BatchGetValuesResponse ss = sheetService.spreadsheets().values().batchGet(SPREAD_SHEET_ID)
				.setRanges(Arrays.asList("Timeline!A2:Z")).execute();

		List<List<Object>> values = ss.getValueRanges().get(0).getValues();

		for (List<Object> indivRec : values) {
			if (indivRec.get(0) == null || ((String) indivRec.get(0)).length() < 1) {
				continue;
			}
			Date reportedOn = new SimpleDateFormat("dd-MM-yyyy").parse((String) indivRec.get(0));
			System.out.println("Date is " + reportedOn);
			String status = (String) indivRec.get(1);
			int count = Integer.parseInt((String) indivRec.get(2));

			if (data.containsKey(reportedOn.toString())) {
				LineData ld = data.get(reportedOn.toString());
				switch (status) {
				case "Deceased":
					ld.setTotalDeceased(count);
					break;
				case "In Hospital":
					ld.setTotalInHospital(count);
					break;
				case "Recovered":
					ld.setTotalRecovered(count);
					break;
				}
				ld.setTotalCases(ld.getTotalCases() + count);
				data.put(reportedOn.toString(), ld);
			} else {
				LineData ld = new LineData();
				ld.setReportDate(reportedOn);
				switch (status) {
				case "Deceased":
					ld.setTotalDeceased(count);
					break;
				case "In Hospital":
					ld.setTotalInHospital(count);
					break;
				case "Recovered":
					ld.setTotalRecovered(count);
					break;
				}
				ld.setTotalCases(count);
				data.put(reportedOn.toString(), ld);
			}

		}

		List<LineData> finalList = new ArrayList<LineData>(data.values());

		Collections.sort(finalList);

		return finalList;
	}

//	@Cacheable("status")
	public List<CardData> fetchCardData() throws IOException {
		int count = 0;
		List<CardData> cards = new ArrayList<>();
		

		BatchGetValuesResponse ss = sheetService.spreadsheets().values().batchGet(SPREAD_SHEET_ID)
				.setRanges(Arrays.asList("StatusLevel!A2:Z")).execute();

		List<List<Object>> values = ss.getValueRanges().get(0).getValues();

		for (List<Object> indivRec : values) {
			if (indivRec.get(0) == null || ((String) indivRec.get(0)).length() < 1) {
				continue;
			}
			CardData cd = new CardData();
			cd.setStatus((String) indivRec.get(0));
			int cnt = (Integer.parseInt((String) indivRec.get(1)));
			count += cnt;
			cd.setCount(cnt);
			cards.add(cd);
		}


		CardData cd = new CardData("Total", count);
		cards.add(cd);
		return cards;
	}

//	@Cacheable("gender")
	public List<GenderData> fetchGenderData() throws IOException {
		List<GenderData> genderData = new ArrayList<>();

		

		BatchGetValuesResponse ss = sheetService.spreadsheets().values().batchGet(SPREAD_SHEET_ID)
				.setRanges(Arrays.asList("GenderLevel!A2:Z")).execute();

		List<List<Object>> values = ss.getValueRanges().get(0).getValues();

		for (List<Object> indivRec : values) {
			if (indivRec.get(0) == null || ((String) indivRec.get(0)).length() < 1) {
				continue;
			}

			String gender = (String) indivRec.get(0);
			int count = Integer.parseInt((String) indivRec.get(1));
			genderData.add(new GenderData(gender, count));

		}

		return genderData;
	}

//	
	public List<SuspectResponse> fetchSuspectData() throws IOException {
		SuspectData sd = new SuspectData();
		
		

		BatchGetValuesResponse ss = sheetService.spreadsheets().values().batchGet(SPREAD_SHEET_ID)
				.setRanges(Arrays.asList("Suspect!A2:Z")).execute();

		List<List<Object>> values = ss.getValueRanges().get(0).getValues();
		
		for (List<Object> indivRec : values) {
			if (indivRec.get(0) == null || ((String) indivRec.get(0)).length() < 1) {
				continue;
			}
			int home = Integer.parseInt((String) indivRec.get(0));
			int hospital = Integer.parseInt((String) indivRec.get(1));
			int completed = Integer.parseInt((String) indivRec.get(2));
			int totalCount = Integer.parseInt((String) indivRec.get(3));
			
			sd.setTotalCount(totalCount);
			sd.setHomeQuarantine(home);
			sd.setCompeletedQuarantine(completed);
			sd.setHospitalQuarantine(hospital);
			
		}
		
		

		List<SuspectResponse> sr = new ArrayList<>();
		sr.add(new SuspectResponse("Total Suspect", sd.getTotalCount()));
		sr.add(new SuspectResponse("Home Quarantine", sd.getHomeQuarantine()));
		sr.add(new SuspectResponse("InHospital Quarantine", sd.getHospitalQuarantine()));
		sr.add(new SuspectResponse("Completed Quarantine", sd.getCompeletedQuarantine()));

		return sr;
	}

//	@Cacheable("location")
	public List<LocationData> fetchLocationData() throws IOException {
		List<LocationData> locationData = new ArrayList<>();

		

		BatchGetValuesResponse ss = sheetService.spreadsheets().values().batchGet(SPREAD_SHEET_ID)
				.setRanges(Arrays.asList("LocalityLevel!A2:Z")).execute();

		List<List<Object>> values = ss.getValueRanges().get(0).getValues();

		for (List<Object> indivRec : values) {
			if (indivRec.get(0) == null || ((String) indivRec.get(0)).length() < 1) {
				continue;
			}

			String location = (String) indivRec.get(0);
			int count = Integer.parseInt((String) indivRec.get(1));
			locationData.add(new LocationData(location, count));

		}

		return locationData;

	}

//	@Cacheable("age")
	public List<AgeResponse> fetchAgeData() throws IOException {
		List<AgeData> ageData = new ArrayList<>();

		

		BatchGetValuesResponse ss = sheetService.spreadsheets().values().batchGet(SPREAD_SHEET_ID)
				.setRanges(Arrays.asList("AgeLevel!A2:Z")).execute();

		List<List<Object>> values = ss.getValueRanges().get(0).getValues();

		for (List<Object> indivRec : values) {
			if (indivRec.get(0) == null || ((String) indivRec.get(0)).length() < 1) {
				continue;
			}

			float age = Float.parseFloat((String) indivRec.get(0));
			int count = Integer.parseInt((String) indivRec.get(1));
			ageData.add(new AgeData(age, count));
		}

		List<AgeResponse> aR = new ArrayList<AgeResponse>();
		AgeResponse L1 = new AgeResponse("< 19", 0);
		AgeResponse L2 = new AgeResponse("20-49", 0);
		AgeResponse L3 = new AgeResponse("50-69", 0);
		AgeResponse L4 = new AgeResponse("70+", 0);

		for (AgeData ad : ageData) {
			if (ad.getAge() <= 19) {
				L1.setCount(L1.getCount() + ad.getCount());
			} else if (ad.getAge() <= 49 && ad.getAge() >= 20) {
				L2.setCount(L2.getCount() + ad.getCount());
			} else if (ad.getAge() <= 69 && ad.getAge() >= 50) {
				L3.setCount(L3.getCount() + ad.getCount());
			} else if (ad.getAge() >= 70) {
				L4.setCount(L4.getCount() + ad.getCount());
			}

		}

		aR.add(L1);
		aR.add(L2);
		aR.add(L3);
		aR.add(L4);

		return aR;
	}

}
