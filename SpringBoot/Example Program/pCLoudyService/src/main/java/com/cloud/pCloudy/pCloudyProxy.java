package com.cloud.pCloudy;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.cloud.cloudbase.rest.WebClient;

public class pCloudyProxy {

	JSONObject jSonBody;
	String body;
	org.json.JSONObject headers;

	public pCloudyProxy(JSONObject jSonBody) throws ParseException {
		this.jSonBody = jSonBody;

		this.headers = new org.json.JSONObject(jSonBody.get("header").toString());
		System.out.println("HHHEEEDER: " + jSonBody.get("header").toString());
		this.body = jSonBody.get("body").toString();
		
		System.out.println("BOBOBO: " + this.body);
		System.out.println("Not going here");
	}

	public String pass() {
		this.beforePass();
		String response = "";
//		String endpoint = "https://device.pcloudy.com/appiumcloud/wd/hub" + this.headers.getString("endpoint");
		String endpoint = "http://localhost:1234" + this.headers.getString("endpoint");
		if(this.headers.get("type").toString().equalsIgnoreCase("post")) {
			WebClient webClient = new WebClient(endpoint, this.body);
			response = webClient.doPostApi();
			System.out.println("@@Response: " + response);
		}else if(this.headers.get("type").toString().equalsIgnoreCase("post")) {
			
		}
		System.out.println("Not POST Request");
		return response;
	}

	private void beforePass() {

	}
	
	public static void main(String[] args) throws ParseException {
		String value = "{\n" + 
				"  \"desiredCapabilities\": {\n" + 
				"    \"appActivity\": \"com.ba.mobile.LaunchActivity\",\n" + 
				"    \"appPackage\": \"com.pcloudy.appiumdemo\",\n" + 
				"    \"pCloudy_DeviceManafacturer\": \"Samsung\",\n" + 
				"    \"pCloudy_ApplicationName\": \"pCloudyAppiumDemo.apk\",\n" + 
				"    \"pCloudy_DeviceVersion\": \"8.0.0\",\n" + 
				"    \"pCloudy_Username\": \"ahmad.sayeed@sstsinc.com\",\n" + 
				"    \"newCommandTimeout\": 2000,\n" + 
				"    \"pCloudy_DurationInMinutes\": 10,\n" + 
				"    \"platformName\": \"Android\",\n" + 
				"    \"launchTimeout\": 90000,\n" + 
				"    \"pCloudy_ApiKey\": \"s6bxrj8jgmyz848k6h4my3k9\"\n" + 
				"  },\n" + 
				"  \"capabilities\": {\n" + 
				"    \"firstMatch\": [\n" + 
				"      {\n" + 
				"        \"appium:appActivity\": \"com.ba.mobile.LaunchActivity\",\n" + 
				"        \"appium:appPackage\": \"com.pcloudy.appiumdemo\",\n" + 
				"        \"appium:launchTimeout\": 90000,\n" + 
				"        \"appium:newCommandTimeout\": 2000,\n" + 
				"        \"pCloudy_ApiKey\": \"s6bxrj8jgmyz848k6h4my3k9\",\n" + 
				"        \"pCloudy_ApplicationName\": \"pCloudyAppiumDemo.apk\",\n" + 
				"        \"pCloudy_DeviceManafacturer\": \"Samsung\",\n" + 
				"        \"pCloudy_DeviceVersion\": \"8.0.0\",\n" + 
				"        \"pCloudy_DurationInMinutes\": 10,\n" + 
				"        \"pCloudy_Username\": \"ahmad.sayeed@sstsinc.com\",\n" + 
				"        \"platformName\": \"android\"\n" + 
				"      }\n" + 
				"    ]\n" + 
				"  }\n" + 
				"}";
		JSONParser parser = new JSONParser();
		JSONObject jSonBody = (JSONObject) parser.parse(value);
		
		System.out.println(jSonBody.toString());
	}

}
