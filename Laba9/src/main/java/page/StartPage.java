package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    private static final String HOMEPAGE_URL = "https://demo-deal.ig.com/";

    @FindBy(css = "#RUS > igws-flags")
    private WebElement choiceRus;


    public StartPage(WebDriver driver) {
        super(driver);
    }

    public StartPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }


    public WelcomePage choiceRussia() {
        waitForElementToBeClickable(driver, choiceRus);
        choiceRus.click();
        return new WelcomePage(driver);
    }
}
