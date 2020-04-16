package com.covid.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.models.AgeResponse;
import com.covid.models.CardData;
import com.covid.models.GenderData;
import com.covid.models.LineData;
import com.covid.models.LocationData;
import com.covid.models.MapData;
import com.covid.models.SuspectResponse;
import com.covid.models.TableData;
import com.covid.services.DashboardService;
import com.google.api.services.sheets.v4.Sheets;

@RestController
public class DashboardController {
	
	@Autowired
	DashboardService dashboardService;
	
	@Autowired
	Sheets sheetService;
	
	@GetMapping("/lineData")
	public List<LineData> fetchLineChartData() throws IOException, ParseException{
		return dashboardService.fetchLineChartData();
	}
	
	@GetMapping("/cards")
	public List<CardData> fetchCardData() throws IOException{
		return dashboardService.fetchCardData();
	}
	
	@GetMapping("/tableData")
	public List<TableData> fetchTableData() throws IOException{
		return dashboardService.fetchTableData();
	}
	
	@GetMapping("/mapData")
	public List<MapData> fetchMapData() throws IOException{
		return dashboardService.fetchMapData();
	}
	
	@GetMapping("/gender")
	public List<GenderData> fetchGenderData() throws IOException{
		return dashboardService.fetchGenderData();
	}
	
	@GetMapping("/locations")
	public List<LocationData> fetchLocationData() throws IOException{
		return dashboardService.fetchLocationData();
	}
	
	@GetMapping("/age")
	public List<AgeResponse> fetchAgeData() throws Exception{
		return dashboardService.fetchAgeData();
	}
	
	
	@GetMapping("/suspect")
	public List<SuspectResponse> fetchSuspectData() throws IOException {
		return dashboardService.fetchSuspectData();
	}
	

}
