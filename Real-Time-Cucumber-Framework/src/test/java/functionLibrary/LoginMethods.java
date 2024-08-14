package functionLibrary;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import dev.failsafe.internal.util.Assert;
import utilities.BrowserUtils;


public class LoginMethods {

        	
	
	 public static void navigateToLoginPage(WebDriver driver) {
	        driver.get("http://primusbank.qedgetech.com/");
	    }

	    public static void enterCredentials(WebDriver driver, String username, String password) {
	    	BrowserUtils.sendKeys(By.id("username"), username);
	        BrowserUtils.sendKeys(By.id("password"), password);
	    }

	    public static void clickLoginButton(WebDriver driver) {
	        BrowserUtils.click(By.id("loginButton"));
	    }

	    public static void verifyRedirectionToDashboard(WebDriver driver) {
	        String expectedUrl = "https://example.com/dashboard";
	        Assert.assertEquals(expectedUrl, BrowserUtils.getCurrentUrl());
	    }

	    public static void handleAlert(WebDriver driver, String expectedAlertMessage) {
	        try {
	            Alert alert = driver.switchTo().alert();
	            String alertText = alert.getText();
	            Assert.assertEquals(expectedAlertMessage, alertText);
	            alert.accept();
	        } catch (NoAlertPresentException e) {
	            Assert.fail("Expected an alert, but it was not present.");
	        }
	    }

	    public static void verifyBackToLoginPage(WebDriver driver) {
	        String expectedUrl = "https://example.com/login";
	        Assert.assertEquals(expectedUrl, BrowserUtils.getCurrentUrl());
	    }
}
