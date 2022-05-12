package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazona gidip nutella aratalım

        driver.get("https://www.amazon.com");

        /*
        findElement(Locator) istediğimiz web elementini bize dondurur.
        Biz de o web elementini kullanmak icin bir objeye assign ederiz.
         */

        /*

        <input type="text" id="twotabsearchtextbox" value="nutella" name="field-keywords"
        autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute"
        dir="auto" tabindex="0" aria-label="Search">
         */

         WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        // WebElement aramaKutusu = driver.findElement(By.linkText("   "));
        // WebElement aramaKutusu = driver.findElement(By.className("field-keywords"));
        // bu kod çalışmadı

        /*
        Her hangi bir web elementine istediğimiz bir yazıyı yollamak istersek
         */

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //***olmadı***
        //driver.get("https://www.google.com");
        //WebElement aramaKutusuGoogle = driver.findElement(By.className("gLFyf gsfi"));
        //aramaKutusuGoogle.sendKeys("Sümeyye Şeyma Kan");
        //***olmadı***




    }
}
