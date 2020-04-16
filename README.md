# Covid-19

Covid-19 is the backend for the state dashboard. It currently uses a google sheet as the database. This can be easily changed, there is code available already, only commented.

## Installation

1. Create a new Google project under Google Console and enable Sheets API
2. Create a API credentials key and download the json
3. Update credentials.json under src/main/resources
```bash
    {"client_id":"",
        "project_id":"",
        "auth_uri":"https://accounts.google.com/o/oauth2/auth",
        "token_uri":"https://oauth2.googleapis.com/token",
        "auth_provider_x509_cert_url":"https://www.googleapis.com/oauth2/v1/certs",
        "client_secret":""
    }
```
4. Update the src/main/java/com/covid/services/DashboardService.java with the correct sheet id
```java
final String SPREAD_SHEET_ID = "1Gd6Q_UdLS3Wj1gPi9-k1UblchS2-kmA3IKs";
```
5. Update your api key in src/main/java/com/covid/GoogleSheetConfig.java
```java
@Bean
	public Sheets getSheetService() throws IOException { 
		Sheets sheet = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, null).
				setSheetsRequestInitializer(new SheetsRequestInitializer("AIzaSyAsjPQpW2VIss6Q9bLgyg")).build();
		
		return sheet; 
	}
```

Install maven and java 8 for the build

```bash
mvn clean install -DskipTests
```

This will create a snapshot jar in the target folder.

## Usage

```bash
java -jar covid-0.0.1-SNAPSHOT.jar
```