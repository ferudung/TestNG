package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Test12_DataProviderCift extends TestBase {


    @DataProvider
    public static Object[][] signInTest() {
        Object[][] gmiBankData=new Object[2][2];
        gmiBankData[0][0]="username1@gmail.com";
        gmiBankData[0][1]="password1";
        gmiBankData[1][0]="username2@gmail.com";
        gmiBankData[1][1]="password2";
        return  gmiBankData;
    }

    @Test(dataProvider = "signInTest")
    public void test(String username,String password){
        driver.get("https://www.gmibank.com/");

        driver.findElement(By.xpath("(//a[@class='dropdown-toggle nav-link'])[2]")).click();

        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();

    }
}
