package tests.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Homework2 extends TestBase {

    //1- https://www.facebook.com adresine gidelim
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.facebook.com ");
        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.linkText("Create New Account")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        Actions actions=new Actions(driver);
        WebElement name= driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
        name.sendKeys("ferudun");

        actions.sendKeys(Keys.TAB).
                sendKeys("göğüş").
                sendKeys(Keys.TAB).
                sendKeys("55555555").
                sendKeys(Keys.TAB).
                sendKeys("123").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).click().sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).click().sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).click().sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).click().
                sendKeys(Keys.ARROW_RIGHT).
                perform();
        Thread.sleep(5000);


    }
}
