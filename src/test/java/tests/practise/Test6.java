package tests.practise;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Test6 extends TestBase {


    // "http://automationpractice.com/" ADRESiNE GiDiP UYE OL.
    @Test
    public void test(){

        driver.get("http://automationpractice.com/");
        driver.findElement(By.partialLinkText("Sign in")).click();
       driver.findElement(By.id("email_create")).sendKeys("d2eneme54321@gmail.com"+ Keys.ENTER);
       driver.findElement(By.id("id_gender1")).click();
        Faker faker=new Faker();
        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.TAB).
       sendKeys(faker.name().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).
                sendKeys(Keys.TAB).
                sendKeys(String.valueOf(faker.number().numberBetween(1,31))).
        sendKeys(Keys.TAB).
                sendKeys("May").
                sendKeys(Keys.TAB).
                sendKeys(String.valueOf(faker.number().numberBetween(1950,2003))).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(faker.company().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().state()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();



    }


}
