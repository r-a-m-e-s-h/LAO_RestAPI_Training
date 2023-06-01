package com.ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_CreateAnEmployee {

	@Test
	public void post()
	{
		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification requestSpecification =  RestAssured.given()
				.header("Content-Type","application/json")
				.body(" {\r\n"
						+ "   \"first_name\": \"Hinata\",\r\n"
						+"   \"last_name\": \"Hyuga\",\r\n"
						+"   \"email\": \"hinata@leafvillage.com\"\r\n"
						+ "\r\n"
						+  "} ");

		Response response =  requestSpecification.request(Method.POST,"employees");

		System.out.println(response.getStatusLine());

		System.out.println(response.asPrettyString());

	}

}
