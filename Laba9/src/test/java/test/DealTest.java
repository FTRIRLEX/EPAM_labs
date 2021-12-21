
package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.*;

import java.util.concurrent.TimeUnit;

public class DealTest {
    private WebDriver driver;
    private TradingPage fxProTradingPage;
    public String countBeforeChanges;
    public String countAfterChanges;
    public Boolean ordersAfterChanges;

    @BeforeMethod
    public void browserSetup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1920,1080");
        driver = new ChromeDriver(options);
        String email = "Egorka002";
        String password = "30132805Egor";
        fxProTradingPage = new StartPage(driver)
                .openPage()
                .choiceRussia()
                .selectLogin()
                .enterEmail(email)
                .enterPassword(password)
                .signIn()
                .openMenu()
                .selectAccount();
    }


    @Test(description = "Buy order")
    public void BuyAndReturnChanges() throws InterruptedException {
        countBeforeChanges = fxProTradingPage.getNumberOfOrders();
        fxProTradingPage.choiceIndices()
                .choiceWallStreet()
                .choiceBuy()
                .confirmDeal();
        Thread.sleep(2000);
        countAfterChanges = fxProTradingPage.getNumberOfOrders();
        Assert.assertNotEquals(countBeforeChanges, countAfterChanges);

    }

    @Test(description = "Sell order")
    public void sellAndReturnChanges() throws InterruptedException {
        countBeforeChanges = fxProTradingPage.getNumberOfOrders();
        fxProTradingPage.choiceIndices()
                .choiceWallStreet()
                .choiceSell()
                .confirmDeal();
        Thread.sleep(2000);
        countAfterChanges = fxProTradingPage.getNumberOfOrders();
        Assert.assertNotEquals(countBeforeChanges, countAfterChanges);
    }

    @AfterMethod
    public void browserShutDown() {
        driver.quit();
        driver = null;
    }
}
