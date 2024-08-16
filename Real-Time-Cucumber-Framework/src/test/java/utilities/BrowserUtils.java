package utilities;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BrowserUtils {

    public WebDriver driver;
    public  WebDriverWait wait;

    // Initializing WebDriver for different browsers
    public void initialize(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
               driver = new ChromeDriver();
               driver.get("http://primusbank.qedgetech.com/");
               break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Get the driver instance
    public  WebDriver getDriver() {
        if (driver == null) {
            initialize("chrome"); // Default to Chrome if no browser specified
        }
        return driver;
    }

    // Quit the driver and clean up
    public  void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // Wait for an element to be visible
    public  WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for an element to be clickable
    public  WebElement waitForClickability(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Click an element
    public  void click(By locator) {
        waitForClickability(locator).click();
    }

    // Send keys to an element
    public  void sendKeys(By locator, String text) {
        waitForVisibility(locator).sendKeys(text);
    }

    // Get the text of an element
    public  String getText(By locator) {
        return waitForVisibility(locator).getText();
    }

    // Get the current URL
    public  String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}