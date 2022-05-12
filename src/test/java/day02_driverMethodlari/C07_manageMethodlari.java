package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("pencere olculeri : "+ driver.manage().window().getSize());
        System.out.println("pencere konumu : "+ driver.manage().window().getPosition());
        Thread.sleep(2000);

        // pencerenin konumunu ve buyuklugunu degistirelim

        driver.manage().window().setPosition(new Point (0,0));
        Thread.sleep(1000);
        driver.manage().window().setSize(new Dimension(100,100));
        Thread.sleep(1000);

        System.out.println("yeni pencere olculeri : "+ driver.manage().window().getSize());
        System.out.println("yeni pencere konumu : "+ driver.manage().window().getPosition());
        Thread.sleep(2000);

        driver.quit();

    }
}
