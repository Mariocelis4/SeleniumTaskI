package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SignupPage {


    WebDriver driver;
    @FindBy(name = "firstName")
    private WebElement fname;
    @FindBy(name = "lastName")
    private WebElement lname;
    @FindBy(id = "userName")
    private WebElement email;
    @FindBy(name = "phone")
    private WebElement phonenum;
    @FindBy(name = "address1")
    private WebElement address_1;
    @FindBy(name = "city")
    private WebElement city_name;
    @FindBy(name = "state")
    private WebElement state_name;
    @FindBy(name = "postalCode")
    private WebElement postal;
    @FindBy (name = "country")
    private WebElement count;
    @FindBy (id = "email")
    private WebElement username;
    @FindBy (name = "password")
    private WebElement userpass;
    @FindBy (name = "confirmPassword")
    private WebElement confirmpass;
    @FindBy (name ="register")
    private WebElement submit;


    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Fill_form() throws Throwable {
        fname.sendKeys("Mario");
        lname.sendKeys("Celis");
        email.sendKeys("mariopro@email.com");
        phonenum.sendKeys("18000444");
        address_1.sendKeys("Boulevard Ave.");
        city_name.sendKeys("Hollywood");
        state_name.sendKeys("California");
        postal.sendKeys("74800");
        Select  dropdown = new Select(count);
        dropdown.selectByValue("215");
        username.sendKeys("Mario.celis4");
        userpass.sendKeys("4silec.oriaM");
        confirmpass.sendKeys("4silec.oriaM");
        submit.click();
    }

}