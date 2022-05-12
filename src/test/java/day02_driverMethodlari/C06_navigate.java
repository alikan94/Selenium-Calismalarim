package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        /*
            Eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
            driver.get() yerine driver.navigate().to() method'unu kullaniriz
            ve sonrasinda forward(), back() veya refresh() method'larini kullanabiliriz
         */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        driver.navigate().to("https://amerikadahukuk.com");
        Thread.sleep(5000);
        driver.navigate().back(); // faceye geri dönüyoruz
        Thread.sleep(2000);
        driver.navigate().back(); // amazona dönüyoruz
        Thread.sleep(2000);
        driver.navigate().forward(); // faceye ileri dönüyoruz
        Thread.sleep(2000);
        driver.navigate().refresh(); // sayfayı yeniliyoruz

        driver.quit();


    }

}
