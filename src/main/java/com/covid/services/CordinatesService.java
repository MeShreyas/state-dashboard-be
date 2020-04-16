package com.covid.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.covid.models.LatLng;

@Service
public class CordinatesService {

	Map<String, String> lookup = new HashMap<String, String>();

	public CordinatesService() {
		super();
		lookup.put("BAGALKOTE", "16.168305,75.6535");
		lookup.put("BALLARI", "15.145211,76.919123");
		lookup.put("BELAGAVI", "15.861418,74.514961");
		lookup.put("BENGALURU URBAN", "12.993565,77.583891");
		lookup.put("BENGALURU RURAL", "13.310233,77.541417");
		lookup.put("BIDAR", "17.912618,77.514974");
		lookup.put("CHAMARAJANAGARA", "11.924999,76.941589");
		lookup.put("CHIKKABALLAPURA", "13.435182,77.731154");
		lookup.put("CHIKKMAGALURU", "13.32072,75.773398");
		lookup.put("CHITRADURGA", "14.226783,76.398339");
		lookup.put("DAKSHINA KANNADA", "12.902034,75.239561");
		lookup.put("DAVANAGERE", "14.462749,75.917812");
		lookup.put("DHARWAD", "15.459566,75.001935");
		lookup.put("GADAGA", "15.430661,75.634494");
		lookup.put("HASSAN", "13.003494,76.100451");
		lookup.put("HAVERI", "14.795127,75.400408");
		lookup.put("KALABURAGI", "17.332653,76.835971");
		lookup.put("KODAGU", "12.307576,75.778837");
		lookup.put("KOLARA", "13.135027,78.126801");
		lookup.put("KOPPALA", "15.34814,76.147883");
		lookup.put("MANDYA", "12.522041,76.896422");
		lookup.put("MYSURU", "12.30481,76.642788");
		lookup.put("RAICHUR", "16.213969,77.354997");
		lookup.put("RAMANAGARA", "12.717018,77.284212");
		lookup.put("SHIVAMOGGA", "13.936008,75.568592");
		lookup.put("TUMAKURU", "13.342679,77.114647");
		lookup.put("UDUPI", "13.338239,74.742379");
		lookup.put("UTTARA KANNADA", "14.770262,74.622334");
		lookup.put("VIJAYAPURA", "16.832175,75.717313");
		lookup.put("YADAGIRI", "16.761366,77.13851");
	}
	
	
	public LatLng fetchLatLng(String district) {
		LatLng latLng = new LatLng(0,0);
		
		if(lookup.containsKey(district.trim().toUpperCase())){
			String latLngStr = lookup.get(district.trim().toUpperCase());
			String[] split = latLngStr.split(",");
			latLng.setLat(Float.parseFloat(split[0]));
			latLng.setLng(Float.parseFloat(split[1]));
		} 
		return latLng;
	}


	public List<String> getDistricts() {
		
		return new ArrayList<String>(lookup.keySet());
	}

}
