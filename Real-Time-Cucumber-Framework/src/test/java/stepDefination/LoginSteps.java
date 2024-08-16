package stepDefination;

import functionLibrary.LoginMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;

public class LoginSteps {

	BrowserUtils brw;
	LoginMethods lgn;
	
	
	@Given("Start the Chrome Browser")
	public void start_the_chrome_Browser() {
	    brw.initialize("CHROME");
	}

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
			
	}

	@When("The user enters a valid username and password")
	public void the_user_enters_a_valid_username_and_password() {
	    
	}

	@When("The user clicks the login button")
	public void the_user_clicks_the_login_button() {
	    	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
	    
	}

	@When("The user enters an invalid username and password")
	public void the_user_enters_an_invalid_username_and_password() {
	   
	}

	@Then("An error message should be displayed and click ok")
	public void an_error_message_should_be_displayed_and_click_ok() {
	    
	}

	@Then("The user should be back on the login page")
	public void the_user_should_be_back_on_the_login_page() {
	    
	}

}
