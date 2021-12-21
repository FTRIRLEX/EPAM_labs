package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TradingPage extends BasePage{

    @FindBy(css = "#ember28 > div.platform-navigation_menu > ul > li.platform-navigation_menu-item--asset-class.platform-navigation_item.platform-navigation_menu-item--INDICES.has-action")
    private WebElement selectIndices;
    @FindBy(css = "#ember192 > div")
    private WebElement selectWallStreet;
    @FindBy(xpath = "/html/body/div[2]/div[1]/nav/div[1]/div/div[3]/div/div/div[2]/section/div[2]")
    private WebElement selectBuy;
    @FindBy(xpath = "/html/body/div[2]/div[1]/nav/div[1]/div/div[3]/div/div/div[2]/div[2]/div[1]/div/div/section/button")
    private WebElement placeDeal;
    @FindBy(xpath = "/html/body/div[2]/div[1]/nav/div[2]/ul/li[13]/div")
    private WebElement countOfPositions;
    @FindBy(xpath = "/html/body/div[2]/div[1]/nav/div[1]/div/div[3]/div/div/div[2]/section/div[1]")
    private WebElement selectSell;


    public TradingPage(WebDriver driver) {
        super(driver);
    }
    public TradingPage choiceIndices() {
        waitForElementToBeClickable(driver, selectIndices);
        selectIndices.click();
        return this;
    }

    public TradingPage choiceWallStreet() {
        waitForElementToBeClickable(driver, selectWallStreet);
        selectWallStreet.click();
        return this;
    }

    public TradingPage choiceBuy() {
        waitForVisibilityOfElement(driver, selectBuy);
        selectBuy.click();
        return this;
    }

    public TradingPage confirmDeal() {
        waitForElementToBeClickable(driver, placeDeal);
        placeDeal.click();
        return this;
    }

    public String getNumberOfOrders() {
        waitForVisibilityOfElement(driver, countOfPositions);
        return countOfPositions.getText();
    }

    public TradingPage chekOrders(){
        getNumberOfOrders();
        return this;
    }

    public TradingPage choiceSell() {
        waitForVisibilityOfElement(driver, selectSell);
        selectSell.click();
        return this;
    }


}
