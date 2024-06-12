package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }



    @AndroidFindBy(xpath = "//android.widget.Button[@text='Login']")
    public WebElement loginButton;

}
