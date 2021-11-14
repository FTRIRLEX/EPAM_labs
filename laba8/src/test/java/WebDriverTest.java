//import org.junit.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {
   @Test
    public void main() throws InterruptedException{
       System.setProperty("webdriver.gecko.driver","geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       driver.get("https://demo.ig.com/");
       Thread.sleep(1000);
       WebElement searchInput = driver.findElement(By.cssSelector("#RUS > igws-flags:nth-child(1)"));
       searchInput.click();
       Thread.sleep(1000);
       searchInput = driver.findElement(By.cssSelector(".nt-strip__login-cta"));
       searchInput.click();
       Thread.sleep(1000);
       searchInput = driver.findElement(By.cssSelector("#account_id"));
       searchInput.sendKeys("Egorka002");
       searchInput = driver.findElement(By.cssSelector("#nonEncryptedPassword"));
       searchInput.sendKeys("30132805Egor");
       searchInput = driver.findElement(By.cssSelector("#loginbutton"));
       searchInput.click();
       Thread.sleep(5000);
       searchInput = driver.findElement(By.cssSelector(".network-profile-button"));
       searchInput.click();
       Thread.sleep(1000);
       searchInput = driver.findElement(By.cssSelector(".account-switcher-account-list > account-switcher-row:nth-child(2) > li:nth-child(1)"));
       searchInput.click();
       Thread.sleep(4000);
       searchInput = driver.findElement(By.cssSelector("li.platform-navigation_menu-item--asset-class:nth-child(5)"));
       searchInput.click();
       Thread.sleep(2000);
       searchInput = driver.findElement(By.cssSelector(".ig-flyout_add-to-workspace"));
       searchInput.click();
       Thread.sleep(2000);
       searchInput = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/div/div/div[2]/ul/li[1]/div[1]/div"));
       searchInput.click();
       Thread.sleep(2000);
       //searchInput = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/div[3]"));
       //searchInput.click();
       Thread.sleep(2000);
       searchInput = driver.findElement(By.cssSelector("button.btn:nth-child(1)"));
       searchInput.click();
       Thread.sleep(5000);
       driver.quit();
    }
}
