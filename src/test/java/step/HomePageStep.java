package step;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import page.HomePage;
import page.SignupPage;

public class HomePageStep extends DriverFactory{


    @Then("^I should get a welcome page$")
    public void Finish_signup() throws Throwable {

        new HomePage(driver).Singin_success();
    }
}
