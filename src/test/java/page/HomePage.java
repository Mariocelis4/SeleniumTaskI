package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver=driver;
    }

    public boolean Singin_success() throws Throwable {
        return driver.findElement(By.cssSelector("a[href='mercurysignoff.php']")).isDisplayed();
    }
}
