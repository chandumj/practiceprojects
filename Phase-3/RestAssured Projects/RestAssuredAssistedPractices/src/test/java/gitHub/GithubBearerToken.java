package gitHub;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GithubBearerToken {

	@Test
	public void githubaipi_test()
	{
	Response res= 	RestAssured.given()
		.baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
	res.prettyPrint();
		
	}
	
	@Test(priority='2')
	public void githubaipi_Getonerepo()
	{
		String ownerRepo = "/chandumj/APITestDemo-14Feb";
	
		
	Response res= 	RestAssured.given()
		.baseUri("https://api.github.com/repos")
		.basePath(ownerRepo)
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
	res.prettyPrint();
		
	}

}
