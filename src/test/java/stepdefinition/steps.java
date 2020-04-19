package stepdefinition;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.HashMap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import jline.internal.Log;

public class steps {
	
	public static HashMap map=new HashMap();

	
	
	@Given("^I want to write a step with name$")
	public void i_want_to_write_a_step_with_name () {	
	 //GETAPI
		System.out.println("GET API Code");
		Response response= given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City", equalTo("Hyderabad"))
		.header("Content-Type","application/json")
		  .log().all()
		   .extract().response();
		System.out.println(response);
		
	
		
		System.out.println("Test Passed Given");
	
	}



	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) {
		
		//PostAPI	
		
		map.put("FirstName", RestUtils.getFirstName());
		map.put("LastName", RestUtils.LastName());
		map.put("UserName", RestUtils.UserName());
		map.put("Password", RestUtils.Password());
		map.put("Email", RestUtils.Email());
	
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		Response responsepost=given()
		.contentType("application/json")
		.body(map)

		.when()
		.post()

		.then()
		.statusCode(201)
		.and()
		.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
		.and()
		.body("Message", equalTo("Operation completed successfully"))
		.log().all()
		   .extract().response();
		System.out.println(Arrays.asList(map));
		System.out.println(responsepost);
		
		}
	
	
	@Given("^I GET Call is called with value in it$")
	public void i_GET_Call_is_call_with_value_in_it() {
	   
		 //GETAPI
		System.out.println("GET API Code");
		Response response= given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City", equalTo("Hyderabad"))
		.header("Content-Type","application/json")
		  .log().all()
		   .extract().response();
		System.out.println(response);
		System.out.println("Test Passed Given");
		}

	

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() {
		System.out.println("Test Passed Then");
		Log.info(" Then log: ");
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	//@Test
	public void testPost()
	{

	}
}

