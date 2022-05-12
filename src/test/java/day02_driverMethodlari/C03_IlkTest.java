package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*  1- https://www.amazon.com url'ine gidin
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url'in "https://www.amazon.com" a esit oldugunu test edin
            4- sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        String actualTitle = driver.getTitle();
        String expectedWord = "Amazon";
        if (actualTitle.contains(expectedWord)) {
            System.out.println("Title \"Amazon\" test PASSED");
        } else System.out.println("Title \"Amazon\" test FAILED");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/";
        if (actualURL.equals(expectedURL)) {
            System.out.println("URL test PASSED");
        } else System.out.println("URL test FAILED");

        driver.quit();

    }
}
