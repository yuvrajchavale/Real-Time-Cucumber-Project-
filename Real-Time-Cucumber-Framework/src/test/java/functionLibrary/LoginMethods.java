package functionLibrary;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import utilities.BrowserUtils;


public class LoginMethods {

        	
    public BrowserUtils browserUtils;

    // Constructor to initialize BrowserUtils
    public LoginMethods(BrowserUtils browserUtils) {
        this.browserUtils = browserUtils;
    }

	    public  void enterCredentials(WebDriver driver, String username, String password) {
	    	browserUtils.sendKeys(By.id("txtuId"), username);
	    	browserUtils.sendKeys(By.id("txtPword"), password);
	    }

	    public  void clickLoginButton(WebDriver driver) {
	    	browserUtils.click(By.id("login"));
	    	//add 
	    }

	    public void verifyRedirectionToDashboard() {
	        String expectedUrl = "http://primusbank.qedgetech.com/adminflow.aspx";
	        Assert.assertEquals(browserUtils.getCurrentUrl(), expectedUrl);
	    }

	    public void handleAlert(String expectedAlertMessage) {
	        try {
	            Alert alert = browserUtils.getDriver().switchTo().alert();
	            String alertText = alert.getText();
	            Assert.assertEquals(alertText, expectedAlertMessage);
	            alert.accept();
	        } catch (NoAlertPresentException e) {
	            Assert.fail("Expected an alert, but it was not present.");
	        }
	    }

	    public void verifyBackToLoginPage() {
	        String expectedUrl = "http://primusbank.qedgetech.com/adminflow.aspx";
	        Assert.assertEquals(browserUtils.getCurrentUrl(), expectedUrl);
	    }
	}

