package com.ems.bdd_Style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class practise_bddStyle {



	@Test(enabled=true)
	public void getRequest()
	{
		RestAssured
		.given()
			.baseUri("https://fakerestapi.azurewebsites.net/index.html")
		.when()
			.get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
		.prettyPrint();
		
		
	}
	@Test(enabled=false)
	public void postRequest()
	{
		RestAssured
		.given()
			.baseUri("https://fakerestapi.azurewebsites.net/index.html")
			.header("Content-Type", "application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"title\": \"string\",\r\n"
					+ "  \"dueDate\": \"2023-11-16T07:13:09.920Z\",\r\n"
					+ "  \"completed\": true\r\n"
					+ "}")
		.when()
			.post("https://fakerestapi.azurewebsites.net/api/v1/Activities")
		.prettyPrint();
	}
	@Test(enabled=false)
	public void putRequest()
	{
		RestAssured
		.given()
			.baseUri("https://fakerestapi.azurewebsites.net/index.html")
			.header("Content-Type", "application/json")
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"title\": \"Test-rest\",\r\n"
					+ "  \"dueDate\": \"2023-11-16T07:25:10.854Z\",\r\n"
					+ "  \"completed\": true\r\n"
					+ "}")
		.when()
			.put("https://fakerestapi.azurewebsites.net/api/v1/Activities/0")
		.prettyPrint();
			
	}
	@Test(enabled=false)
	public void deleteRequest()
	{
		RestAssured
		.given()
			.baseUri("https://fakerestapi.azurewebsites.net/index.html")
			.header("Content-Type", "application/json")
		.when()
			.delete("https://fakerestapi.azurewebsites.net/api/v1/Activities/0")
		.prettyPrint();
		
	}




}
