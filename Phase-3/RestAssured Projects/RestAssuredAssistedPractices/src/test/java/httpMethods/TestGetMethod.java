package httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGetMethod {
	public static void main(String[] args) {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
				System.out.println("Response Code" + response.getStatusCode());
				
				System.out.println("Response Status" + response.getStatusLine());
				System.out.println("Response Body" + response.getBody().asPrettyString());
				
				
				System.out.println("Response TIME" + response.getTime());
				
				
		// Write the above code in BDD format


		RestAssured.baseURI = "https://reqres.in/api/users";
				RestAssured.given()    // given above base URL
				.queryParam("page", "2")  // attach query paramters to URL
				.when().get()    // exeucte a get http method
				.then().statusCode(200).log().all();
				


			}

}
