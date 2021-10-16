package tests.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Homework extends TestBase {

    @Test
    public void test() throws InterruptedException {
        //  Go to http://demo.guru99.com/test/drag_drop.html url
        driver.get("http://demo.guru99.com/test/drag_drop.html");


        //  Drag and drop the BANK button to the Account section in DEBIT SIDE
////a[text()=' BANK ']
        Actions actions=new Actions(driver);

        WebElement dragBankElementi=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement dropBankAlani=driver.findElement(By.xpath("(//*[@class='placeholder'])[1]"));
        actions.dragAndDrop(dragBankElementi,dropBankAlani).perform();
        Thread.sleep(1000);
        //  Drag and drop the SALES button to the Account section in CREDIT SIDE
        WebElement dragSalesElementi=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
        WebElement dropSalesAlani=driver.findElement(By.xpath("(//*[@class='placeholder'])[3]"));
        actions.dragAndDrop(dragSalesElementi,dropSalesAlani).perform();
        Thread.sleep(1000);
        //  Drag and drop the 5000 button to the Amount section in DEBIT SIDE
//        WebElement dragFirst5000Elementi=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//        WebElement dropFirst5000Alani=driver.findElement(By.xpath("(//*[@class='placeholder'])[2]"));
//        actions.dragAndDrop(dragFirst5000Elementi,dropFirst5000Alani).perform();
        //  Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
//        WebElement dragSecond5000Elementi=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
//        WebElement dropSecond5000Alani=driver.findElement(By.xpath("(//*[@class='placeholder'])[4]"));
//        actions.dragAndDrop(dragSecond5000Elementi,dropSecond5000Alani).perform();
        Thread.sleep(5000);
    }



}
