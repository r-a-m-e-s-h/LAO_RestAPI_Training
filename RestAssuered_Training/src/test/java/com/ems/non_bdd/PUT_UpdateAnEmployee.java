package com.ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT_UpdateAnEmployee {
	
	@Test
	public void update()
	{


		RestAssured.baseURI = "http://localhost:3000/";

		RequestSpecification requestSpecification = RestAssured
				.given()
				.header("Content-Type","application/json")
				.body(
						"{\r\n"
								+ "   \"first_name\": \"Ramesh\",\r\n"
								+"   \"last_name\": \"uzumaki\",\r\n"
								+"   \"email\": \"ramesh@leafvillage.com\"\r\n"
								+ "\r\n"
								+  "} "

						);
		
		Response response =  requestSpecification.request(Method.PUT,"employees/1");
		
		System.out.println(response.getStatusLine());
		
		System.out.println(response.asPrettyString());



	}

}
