package oauth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OauthDemo {

	String clientId= "AcW357wogaZ3orN3MAVzqZnoJyKSdmhZUTiKl5PpiImCr3gxVIhsgG9UjNBz3zcNrCsh7ZfFfqoc1lR6";
	
	String clientSecret="EH_pSOosvTr4LuAchFXoR_D8iL3PXSGXadIcNiKPTeNw0cunU1pGo_q2dhLy_TifBDOPVmKTe4Gkw6qX";
	
	String accesstoken;
	
	@Test
	public void getBearerToken() {


		Response res = RestAssured.given()
		.baseUri("https://api-m.sandbox.paypal.com")
		.basePath("/v1/oauth2/token")
		.auth().preemptive().basic(clientId, clientSecret)
		.param("grant_type", "client_credentials")
		.when().post();
		
		// res.prettyPrint();
		
		accesstoken =	res.getBody().path("access_token");
		
		System.out.println(accesstoken);
	}
	
	@Test
	public void paypalApitest()
	{
		RestAssured.given()
		.baseUri("https://api-m.sandbox.paypal.com")
		.basePath("/v2/invoicing/invoices")
		.queryParam("page", "3")
		.queryParam("page_size", "4")
		.queryParam("total_required", true)
		.auth().oauth2(accesstoken)
		.when().get()
		.then().statusCode(200).log().all();
	}

}
