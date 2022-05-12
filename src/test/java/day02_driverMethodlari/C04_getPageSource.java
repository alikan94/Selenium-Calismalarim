package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_getPageSource {
    public static void main(String[] args) {
        // amazon sitesine gidip Kaynek kodlarinda "Gateway" yazdigini test edin

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        String arananKelime = "Gateway";
        String sayfaKaynakKodlari=driver.getPageSource();

        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynak Kodu Testi PASSED");
        }else {
            System.out.println("Kaynak kodlarinda " + arananKelime + " keimesi yok, Kaynak Kodu Testi FAILED");
        }

        driver.quit();

    }
}
