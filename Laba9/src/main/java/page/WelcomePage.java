package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class WelcomePage extends BasePage {

    @FindBy(css = "#account-controls > div.nt-strip__prospect > ul > li:nth-child(1) > a")
    private WebElement buttotLogin;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage selectLogin() {
        waitForElementToBeClickable(driver, buttotLogin);
        buttotLogin.click();
        return new LoginPage(driver);
    }
}
