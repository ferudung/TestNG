package tests.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test2 {
WebDriver driver;
@BeforeMethod
    public void setup(){
        // 4 TEST METODU OLUSTURUN
        // https://www.n11.com/ SAYFASINA GiDİN.
        // https://www.gittigidiyor.com/ SAYFASINA GiDiN
        // https://getir.com/ SAYFASINA GiDiN
        // https://www.sahibinden.com/ SAYFASINA GiDiN
//priority verilmezse harf sırasına göre çalışırı verilirse en küçük olandan başlar hiç verilmiyosa 0 dan başlar
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test(priority = 1)
    public void n11Test(){
        driver.get("https://www.n11.com/");
        System.out.println(driver.getTitle());

    }
    @Test(priority = 2)
    public void gittigidiyorTest(){


        driver.get("https://www.gittigidiyor.com/");
        System.out.println(driver.getTitle());

    }
    @Test
    public void getirTest(){


        driver.get("https://www.getir.com/");
        System.out.println(driver.getTitle());

    }
    @Test
    public void sahibindenTest(){


        driver.get("https://www.sahibinden.com/");
        System.out.println(driver.getTitle());

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
