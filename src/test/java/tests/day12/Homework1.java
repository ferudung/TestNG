package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class Homework1 extends TestBase {
    //1. Bir class olusturun : EnableTest
    //2. Bir metod olusturun : isEnabled()
    @Test
    public void isEnabled(){
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //4. Textbox’in etkin olmadigini(enabled) dogrulayın
        SoftAssert softAssert=new SoftAssert();
        WebElement sonucYazisi=driver.findElement(By.xpath("//button[text()='Enable']"));
        softAssert.assertTrue(sonucYazisi.isDisplayed());
        //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        sonucYazisi.click();
        // WebElement yaziLocateIleBirlikt= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        //        Assert.assertTrue(yaziLocateIleBirlikt.isDisplayed());
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement waitText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-example\"]/input")));
        Assert.assertTrue(waitText.isDisplayed());
        //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        WebElement sonucYazisi2=driver.findElement(By.xpath("//button[text()='Disable']"));
        softAssert.assertTrue(sonucYazisi2.isDisplayed());
//7. Textbox’in etkin oldugunu(enabled) dogrulayın
        WebElement textYazisiEnable=driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
        softAssert.assertTrue(textYazisiEnable.isDisplayed());
        softAssert.assertAll();
    }








}
