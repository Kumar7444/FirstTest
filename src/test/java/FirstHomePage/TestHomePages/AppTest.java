package FirstHomePage.TestHomePages;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
    	System.setProperty("webdriver.chrome.driver", "/Users/e5110782/Downloads/chromedriver");
    	WebDriver ch= new ChromeDriver();
    	ch.get("https://www.theage.com.au");
    	ch.close();
       
    }
}
