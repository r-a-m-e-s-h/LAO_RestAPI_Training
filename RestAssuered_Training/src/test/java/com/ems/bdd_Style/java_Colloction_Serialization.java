package com.ems.bdd_Style;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class java_Colloction_Serialization {
	
	
	
	@Test
	public void javaSerialization_Test()
	{
		
		Map<String , Object> jsonbody =  new HashMap<String, Object>();
	
		List<String> skills = new ArrayList<String>();
		skills.add("selenium");
		skills.add("Java");
		
		jsonbody.put("first-name", "Tom");
		jsonbody.put("last-name", "smasher");
		
		jsonbody.put("skills", skills);
		
		System.out.println(jsonbody);
		
//		RestAssured
//		.given()
//			.baseUri("https://gorest.co.in./public/v2")
//			.header("Content-Type", "application/json")
//			.body(jsonbody)
//			.log()
//			.all()
//		.when()
//			.put("/users")
//		.then()
//			.log()
//			.all();
		
		
	}

}
