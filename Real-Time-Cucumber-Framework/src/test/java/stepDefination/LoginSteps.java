package stepDefination;

import functionLibrary.LoginMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;

public class LoginSteps {

	BrowserUtils brw;
	LoginMethods lgn;
	
	public LoginSteps() {
		  this.brw = new BrowserUtils();
	      this.lgn = new LoginMethods();
	      lgn.loginMethods(brw); 
	}
	
	@Given("Start the Chrome Browser")
	public void start_the_chrome_Browser() {
		brw.initialize("chrome");
	}

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
			
	}

	@When("The user enters a valid username and password")
	public void the_user_enters_a_valid_username_and_password() {
	    lgn.enterCredentials(brw.getDriver(), "Admin", "Admin");
	}

	@When("The user clicks the login button")
	public void the_user_clicks_the_login_button() {
		
		lgn.clickLoginButton(brw.getDriver());
		
	
	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
	    lgn.verifyRedirectionToDashboard();
	}
	
	@When("Click on Logout button")
	public void click_on_logout_button() {
	    lgn.clickLogOutButton(brw.getDriver());
	}
	@Then("Close the browser")
	public void close_the_browser() {
	    lgn.closeBrowser(brw.getDriver());
	}

	@When("The user enters an invalid username and password")
	public void the_user_enters_an_invalid_username_and_password() {
	   lgn.enterCredentials(brw.getDriver(), "Admin", "Admin12");
	}

	@Then("An error message should be displayed and click ok")
	public void an_error_message_should_be_displayed_and_click_ok() {
	    lgn.handleAlert("InCorrect BankerName/Password");
	}

	@Then("The user should be back on the login page")
	public void the_user_should_be_back_on_the_login_page() {
	    lgn.verifyBackToLoginPage();
	}

}
