package step;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SignupPage;


public class SignupPageStep extends DriverFactory {
    @When("^I register my data correctly in the page for a new user$")
    public void Fill_form() throws Throwable {
        new SignupPage(driver).Fill_form();
    }
}
