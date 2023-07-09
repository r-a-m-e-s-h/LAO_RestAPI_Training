package com.ems.bdd_Style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
//import io.restassured.http.Method.*;

public class Getallemp {
	
	
	@Test(enabled=false)
	public void getAllemp() {
		
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
		.when()
			.get("employees")
		.prettyPrint();
		
		//Without using restAssured (Following static method)
		/*
		given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("employees")
		.prettyPrint();
		*/
	}
	
	@Test(enabled=false)
	public void createAnEmp() // Post method
	{
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
			.header("content-type","application/json")
			.body("{\r\n"
							+ "   \"first_name\": \"Saro\",\r\n"
							+"   \"last_name\": \"ramesh\",\r\n"
							+"   \"email\": \"saro@RB.com\"\r\n"
							+ "\r\n"
							+  "}")
		.when()
			.post("employees")
		.prettyPrint();		
	}
	
	@Test(enabled=false)
	public void UpdateAnEmp()
	{
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
			.header("content-type","application/json")
			.body("{\r\n"
							+ "   \"first_name\": \"Saro\",\r\n"
							+"   \"last_name\": \"ramesh\",\r\n"
							+"   \"email\": \"saro@RB.com\"\r\n"
							+ "\r\n"
							+  "}")
		.when()
			.put("employees/73")
		.prettyPrint();		
	}
	
	@Test
	public void deleteAnEmp()
	{
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
		.when()
			.delete("employees/68")
		.prettyPrint();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
