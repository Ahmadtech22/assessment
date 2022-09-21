package Test.com.brooksource.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.utils.ConfigReader;
import utils.utils.DriverHelper;

public class brooksource_Hook {

    WebDriver driver= DriverHelper.getDriver();
    @Before
    public void setup(){
        driver.navigate().to(ConfigReader.readProperty("jobBrookSourceURL"));
    }

    @After
    public void tearDown(){

        //here i can add screenshot implementation for failed test
      // driver.quit();
    }
}
