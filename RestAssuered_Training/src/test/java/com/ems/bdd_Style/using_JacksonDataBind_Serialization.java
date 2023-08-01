package com.ems.bdd_Style;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class using_JacksonDataBind_Serialization {
	
	// Jackson-DataBind dependency used to convert or serialize normal java collection into json 
	
	@Test
	public void jackson_Test()
	{
		
		Map<String, Object> jsonBody = new HashMap<String , Object>();
		
		List<String> skills = new ArrayList<String>();
		skills.add("selenium");
		skills.add("java");
		
		jsonBody.put("first-name", "naai");
		jsonBody.put("last-name", "seakr");
		
		jsonBody.put("skills", skills);
		
		System.out.println(jsonBody);
		
		RestAssured
		.given()
			.baseUri("https://gorest.co.in./public/v2")
			.header("Content-Type", "application/json")
			.body(jsonBody)
			.log()
			.all()
		.when()
			.post("/users")
		.then()
			.log()
			.all();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
