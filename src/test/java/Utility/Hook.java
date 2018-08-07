package Utility;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook {

   public static WebDriver driver;


   @Before
    public void setup()
   {
       System.setProperty("webdriver.gecko.driver", "C:\\SDET University\\Software\\geckodriver.exe");
       driver = new FirefoxDriver();
   }


   @After
    public void afterscenario()
   {
       driver.close();
   }


}
