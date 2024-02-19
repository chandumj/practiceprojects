package hamcrestMethods;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class HamcreastMethodsDemo {

	String PMkey="PMAK-65c9a3e21a39c10001f505c1-da03c2ea33b2a744b1c24f540823c4a2fd";
	
	@Test
	public void container_method_demo()
	{
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMkey)
		.when().get()
		.then()
		.statusCode(200)
		.body("workspaces.name", contains("My Workspace", "Phase3Demo1", "Workspace-12feb", "Workspace-12feb", "Workspace-12feb"));	

	}
	
	/*
	@Test
	public void empyMehtoddemo()
	{
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMkey)
		.when().get()
		.then()
		.statusCode(200)
		.body("workspaces.name", empty());
		// assertion will occur as response body is not empty
		// if response body is empty , our test will be success
	}
	
	*/
	
	@Test  // validate if the response body is empty or not
	public void IsNotEmpyMehtoddemo()
	{
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMkey)
		.when().get()
		.then()
		.statusCode(200)
		.body("workspaces.name", is(not(empty())));
		// assertion will occur as response body is not empty
		// if response body is empty , our test will be success
	}
	
	@Test  // validate if the response body is empty or not
	public void hasItemsMehtoddemo()
	{
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMkey)
		.when().get()
		.then()
		.statusCode(200)
		.body("workspaces.name", hasItem("Phase3Demo1"));
		// assertion will occur as response body is not empty
		// if response body is empty , our test will be success
	}
	
	@Test  // validate if the response body is empty or not
	public void hasKeyMehtoddemo()
	{
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMkey)
		.when().get()
		.then()
		.statusCode(200)
		.body("workspaces[0]",hasKey("id"));
		// assertion will occur as response body is not empty
		// if response body is empty , our test will be success
	}
	
	@Test  // validate if the response body is empty or not
	public void hasValueMehtoddemo()
	{
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMkey)
		.when().get()
		.then()
		.statusCode(200)
		.body("workspaces[0]",hasValue("My Workspace"));
		// assertion will occur as response body is not empty
		// if response body is empty , our test will be success
	}
	
	@Test  // validate if the response body is empty or not
	public void hasEntryMehtoddemo()
	{
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMkey)
		.when().get()
		.then()
		.statusCode(200)
		.body("workspaces[0]",hasEntry("name","My Workspace"));
		// assertion will occur as response body is not empty
		// if response body is empty , our test will be success
	}
	
	@Test  // validate if the response body is empty or not
	public void anyOfMehtoddemo()
	{
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMkey)
		.when().get()
		.then()
		.statusCode(200)
		.body("workspaces.name[0]",anyOf(startsWith("My"),containsString("workspace")));
		// assertion will occur as response body is not empty
		// if response body is empty , our test will be success
	}
	
	@Test
	public void hasSizeMehtoddemo()
	{
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMkey)
		.when().get()
		.then()
		.statusCode(200)
		.body("workspaces.name", hasSize(5));
		
		
	}
	/*
		@Test
		public void everyItemMehtoddemo()
		{
			RestAssured.given()
			.baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("x-api-key",PMkey)
			.when().get()
			.then()
			.statusCode(200)
			.body("workspaces.name", everyItem(startsWith("Team")));
			
		}
*/

}
