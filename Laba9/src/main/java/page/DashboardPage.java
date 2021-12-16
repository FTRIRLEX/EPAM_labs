package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DashboardPage extends BasePage {

    @FindBy(css = "#my-ig > div.navigation-wrapper > network-strip > div.network-strip.demi-bold-extra-small.row > div.col.col-5 > div > network-profile > div")
    private WebElement openDropMenu;
    @FindBy(css = "#my-ig > div.navigation-wrapper > network-strip > div:nth-child(2) > div > account-switcher > div.account-switcher-block.account-switcher-list-block > account-switcher-list > ul > account-switcher-row > li > div:nth-child(2)\n")
    private WebElement choiceAccount;


    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public DashboardPage openMenu() {
        waitForElementToBeClickable(driver, openDropMenu);
        openDropMenu.click();
        return this;
    }

    public TradingPage selectAccount() {
        waitForElementToBeClickable(driver, choiceAccount);
        choiceAccount.click();
        return new TradingPage(driver);
    }
}
