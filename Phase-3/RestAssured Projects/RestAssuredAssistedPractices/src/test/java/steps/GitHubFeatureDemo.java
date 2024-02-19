package steps;

import java.io.File;

import io.cucumber.java.en.Given;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


public class GitHubFeatureDemo {
	RequestSpecification ra=given().baseUri("https://api.github.com")
		    .basePath("/user/repos")
		    .header("Authorization","Bearer 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");
	
	@Given("User executes Get method for github and validates the code")
	public void user_executes_get_method_for_github_and_validates_the_code() {
		 
		
		    ra.when().get()
		    .then().statusCode(200);

	}

	@Given("User executes Post method and User validates status code for creation")
	public void user_executes_post_method_and_user_validates_status_code_for_creation() {


		File file = new File("resources/githubData.json");
		 
		    ra.contentType(ContentType.JSON)
			.body(file)
		    .when().post()
		    .then().statusCode(201).log().all();
	}

	@Given("User executes delete method and User validates status code for Deletion")
	public void user_executes_delete_method_and_user_validates_status_code_for_deletion() {
		 given().baseUri("https://api.github.com/repos")
		    .basePath("/chandumj/Myrepo-16feb-restassured")
		    .header("Authorization","Bearer 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")
		    .when().delete().then().statusCode(204).log().all();
	}

}
