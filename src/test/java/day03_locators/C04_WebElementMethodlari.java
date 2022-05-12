package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /*
        1   Amazon.coma gidip arama kutusunu locate edin
        2   arama kutusunun tagNamenin input oldugunu test edin
        3   arama kutusunun name arttributenun degerinin field-keywords oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        //         1   Amazon.coma gidip arama kutusunu locate edin
        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        //        2   arama kutusunun tagNamenin input oldugunu test edin
        String actualTagName = aramaKutusuElementi.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("Tag Name Testi PASSED");
        } else {
            System.out.println("Tag Name Testi FAILED");
        }
        //        3   arama kutusunun name arttributenun degerinin field-keywords oldugunu test edin
        String actualNameAttr = aramaKutusuElementi.getAttribute("name");
        String expectedNameAttr = "field-keywords";
        if (actualNameAttr.equals(expectedNameAttr)) {
            System.out.println("Name Arttribute Testi PASSED");
        } else {
            System.out.println("Name Arttribute Testi FAILED");
        }

        System.out.println("Konum : " + aramaKutusuElementi.getLocation());
        System.out.println("Yukseklik : " + aramaKutusuElementi.getSize().height);
        System.out.println("Genislik : " + aramaKutusuElementi.getSize().width);


        driver.quit();
    }
}
