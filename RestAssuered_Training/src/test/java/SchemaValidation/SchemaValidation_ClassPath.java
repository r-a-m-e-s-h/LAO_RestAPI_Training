package SchemaValidation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValidation_ClassPath {
	
	@Test
	public void SchemaValidation_Test()
	{
		
		File inputJson= new File("src/test/resource/input.json");
		
		System.out.println("Hello");
		
		RestAssured
		.given()
			.baseUri("https://gorest.co.in./public/v2/")
			.header("Content-Type", "application/json")
			.body(inputJson)
			.log()
			.all()
		.when()
			.post("users")
		.then()
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"))
			.log()
			.all();
		
		
		
		
		
		
	}

}
