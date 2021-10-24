package tests.practise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.Set;

public class Test4 extends TestBase {
    // 1) https://www.ntv.com.tr/ ADRESİNE GİT
    // 2) SAYFANIN TiTLE'NIN "NTV HABER - Haberler, Son Dakika Haberleri" OLDUGUNU DOGRULA
    // 3) SAYFANIN HANDLE DEGERiNi AL.
    // 4) SPOR SAYFASINA TIKLA
    // 5) URL'iN "https://www.ntvspor.net/" OLDUGUNU DOGRULA
    // 6) ANA SAYFAYA GERi DON
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.ntv.com.tr/");
        System.out.println("sayfa title :"+driver.getTitle());
        String expectedTitle="NTV HABER - Haberler, Son Dakika Haberleri";
        String actualTitle=driver.getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"title istenenden farkli");

        String ilkSayfaHandleDegeri=driver.getWindowHandle();
        System.out.println("1. sayfanın handle degeri :"+ilkSayfaHandleDegeri);
        driver.findElement(By.xpath("//a[@class='header-category-link spor']")).click();
Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());

        Set <String> tumWindowHandles=driver.getWindowHandles();
        System.out.println("tüm handles :"+tumWindowHandles);
        String ikinciWindowHandle = "";
        for (String each:tumWindowHandles
        ) {
            if (!each.equals(ilkSayfaHandleDegeri)){
                ikinciWindowHandle=each;
            }
        }
        System.out.println("ikinici sayfa handle degeri :"+ikinciWindowHandle);

        driver.switchTo().window(ikinciWindowHandle);

        //sayfaların unique handle  değerleri vardır
        //switch to komutu ile bunların aradın geçişler yapılabilir

        System.out.println("sayfa url :"+driver.getCurrentUrl());

        String actualUrl=driver.getCurrentUrl();
        String  expectedUrl="https://www.ntvspor.net/";
        softAssert.assertEquals(actualUrl,expectedUrl,"Url istenenden farkli");

        driver.switchTo().window(ilkSayfaHandleDegeri);
        Thread.sleep(2000);
        System.out.println("sayfa url :"+driver.getCurrentUrl());

        softAssert.assertAll();
    }
}
