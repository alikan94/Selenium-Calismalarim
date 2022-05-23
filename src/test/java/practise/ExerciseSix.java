package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExerciseSix {
    /*
    // ...Exercise6...
    1.  https://id.heroku.com/login sayfasina gidin
    2.  Bir mail adersi giriniz
    3.  Bir password giriniz
    4.  Login butonuna tiklayiniz
    5.  "There was a problem with your login." texti gorunur ise
    6.  "kayit yapilamadi" yazdiriniz
    8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
    9.  Tum sayfalari kapatiniz
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://id.heroku.com/login");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ali123@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("zıbızıd");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        if (driver.findElement(By.xpath("//*[text()='There was a problem with your login.']")).isDisplayed()){
            System.out.println("kayit yapilamadi");
        } else {
            System.out.println("Kayit Yapildi");
        }
        driver.quit();
    }
}
