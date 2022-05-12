package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_getWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println(driver.getWindowHandle());   // CDwindow-F4A35FD5413FE52C6DEB0B03CA6DFB9F
                                                        // benzersiz olarak acilan window'a ait hashcode'unu
                                                        // verir
        driver.quit();
    }
}
