package com.ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_AnEmployee {
	
	@Test
	public void delete() 
	{
		
		RestAssured.baseURI =  "http://localhost:3000/";
				
			RequestSpecification requestSpecification =	RestAssured.given();
			
			Response response = requestSpecification.request(Method.DELETE,"employees/32");
			
			System.out.println(response.asPrettyString());
			
			System.out.println(response.getStatusLine());
			
			
		
		
	}

}
