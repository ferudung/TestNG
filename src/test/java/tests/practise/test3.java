package tests.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class test3 {

    // 1) "https://www.facebook.com/" SAYFASINA GiDiN
    // 2) YENi HESAP OLUSTUR BUTONUNA TIKLAYIN
    // 3) DOGUM TARiHi BOLUMUNDEKi GUNLERiN LiSTESiNi ALIN
    // 4) DOGUM TARiHi BOLUMUNDEKi AYLARIN LiSTESiNi ALIN
    // 5) DOGUM TARiHi BOLUMUNDEKi YILLARIN LiSTESiNi ALIN
    WebDriver driver;
    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void dropDown(){
        driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

        WebElement dropDownGun=driver.findElement(By.cssSelector("#day"));
        Select select= new Select(dropDownGun);
        List<WebElement> daySecenekler=select.getOptions();
        System.out.println("========Gunler=======");
        for (WebElement each:daySecenekler){
            System.out.println(each.getText());
        }

        WebElement dropDownAy=driver.findElement(By.id("month"));
        Select select1= new Select(dropDownAy);
        List<WebElement> aySecenekler=select1.getOptions();
        System.out.println("========Aylar=======");
        for (WebElement each:aySecenekler){
            System.out.println(each.getText());
        }

        WebElement dropdownYear = driver.findElement(By.cssSelector("#year"));
        Select select3 = new Select(dropdownYear);

        List<WebElement> yilSecenekler = select3.getOptions();
        System.out.println("============ YILLAR ==========");
        for (WebElement each : yilSecenekler) {
            System.out.println(each.getText());
        }
    }
}
