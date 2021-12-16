package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(css = "#account_id")
    private WebElement inputEmail;

    @FindBy(css = "#nonEncryptedPassword")
    private WebElement inputPassword;

    @FindBy(css = "#loginbutton")
    private WebElement submitLogInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterEmail(String email) {
        waitForVisibilityOfElement(driver, inputEmail);
        inputEmail.sendKeys(email);
        return this;
    }


    public LoginPage enterPassword(String password) {
        waitForVisibilityOfElement(driver, inputPassword);
        inputPassword.sendKeys(password);
        return this;
    }

    public DashboardPage signIn() {
        waitForElementToBeClickable(driver, submitLogInButton);
        submitLogInButton.click();
        return new DashboardPage(driver);
    }



}
