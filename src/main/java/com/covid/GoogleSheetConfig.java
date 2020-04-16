package com.covid;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsRequestInitializer;
import com.google.api.services.sheets.v4.SheetsScopes;

@Configuration
public class GoogleSheetConfig {
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    
	private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    
    private static final NetHttpTransport HTTP_TRANSPORT = new NetHttpTransport();

	@Bean
	public Sheets getSheetService() throws IOException { 
		Sheets sheet = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, null).
				setSheetsRequestInitializer(new SheetsRequestInitializer("API KEY HERE")).build();
		
		return sheet; 
	}
}
