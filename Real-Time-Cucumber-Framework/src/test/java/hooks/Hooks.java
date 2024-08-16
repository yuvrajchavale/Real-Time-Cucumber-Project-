package hooks;

import org.junit.After;
import org.junit.Before;

import utilities.BrowserUtils;
public class Hooks {

	BrowserUtils brw;
	 @Before
	    public void setUp() {
	        // Initialize the browser before each scenario
		 brw.initialize("chrome");  // Specify the desired browser here
	    }

	    @After
	    public void tearDown() {
	        // Quit the browser after each scenario
	        brw.quitDriver();
	    }
}
