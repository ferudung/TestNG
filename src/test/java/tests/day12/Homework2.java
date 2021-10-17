package tests.day12;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.Set;

public class Homework2 extends TestBase {

  @Test
    public void test() throws InterruptedException {
      driver.get("http://demo.guru99.com/popup.php");
      String ilkSayfaHandle=driver.getWindowHandle();
      driver.findElement(By.linkText("Click Here")).click();
      Set<String> tumWindowHandlelari = driver.getWindowHandles();

      String ikinciSayfaHandle="";
      for (String each:tumWindowHandlelari
      ) {
          if (!each.equals(ilkSayfaHandle)){
              ikinciSayfaHandle=each;
          }
      }
      driver.switchTo().window(ikinciSayfaHandle);
      WebElement text =driver.findElement(By.xpath("//input[@name='emailid']"));
      Faker faker=new Faker();
      String email=faker.internet().emailAddress();
      Actions actions=new Actions(driver);
      text.click();
      actions.sendKeys(email)
              .sendKeys(Keys.TAB)
              .sendKeys(Keys.ENTER)


              .perform();

String expectedTitle="Guru99 Bank Home Page";
String actualtitle=driver.getTitle();
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertEquals(expectedTitle,actualtitle,"beklenen başlık ile aktif başlık aynı değil");
    softAssert.assertAll();
    driver.switchTo().window(ilkSayfaHandle);



  }






}
