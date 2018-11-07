package step;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LandingStep extends DriverFactory {

        @Before
        public void presetup (){
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.gecko.driver", projectLocation +"\\src\\lib\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }


        @Given("^I am a new user$")
        public void setup() throws Throwable {
            driver.get("http://newtours.demoaut.com");
            driver.manage().window().maximize();
            driver.findElement(By.linkText("REGISTER")).click();


        }
}



