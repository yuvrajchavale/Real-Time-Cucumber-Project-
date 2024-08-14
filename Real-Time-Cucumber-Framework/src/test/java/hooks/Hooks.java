package hooks;

import org.junit.After;
import org.junit.Before;

import utilities.BrowserUtils;
public class Hooks {

	 @Before
	    public void setUp() {
	        // Initialize the browser before each scenario
	        BrowserUtils.initialize("chrome");  // Specify the desired browser here
	    }

	    @After
	    public void tearDown() {
	        // Quit the browser after each scenario
	        BrowserUtils.quitDriver();
	    }
}
