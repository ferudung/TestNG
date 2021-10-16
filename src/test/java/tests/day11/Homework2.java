package tests.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Homework2 extends TestBase {

    //1- https://www.facebook.com adresine gidelim <a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify="/reg/spotlight/" id="u_0_2_2H" data-testid="open-registration-form-button" rel="async">Create New Account</a>
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        WebElement name= driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
        Actions actions= new Actions(driver);
        name.sendKeys("ferudun");
        WebElement genderswoman = driver.findElement(By.xpath("//input[@value = '1']"));
        WebElement gendersman = driver.findElement(By.xpath("//input[@value = '2']"));
        Thread.sleep(2000);
        actions.
                sendKeys(Keys.TAB).
                sendKeys("göğüş").
                sendKeys(Keys.TAB).
                sendKeys("51565").
                sendKeys(Keys.TAB).
                sendKeys("12345").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                click().
                sendKeys(Keys.ARROW_UP).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_UP).
                sendKeys(Keys.TAB).doubleClick(gendersman).
                perform();
        Thread.sleep(2000);
    }
}
