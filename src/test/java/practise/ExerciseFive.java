package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExerciseFive {
    public static void main(String[] args) {
        /*
       // ...Exercise5...
       // Navigate to website  https://testpages.herokuapp.com/styled/index.html
       // Under the  ORIGINAL CONTENTS
       // click on Alerts
       // print the URL
       // navigate back
       // print the URL
       // Click on Basic Ajax
       // print the URL
       // enter value-> 20 and Enter
       // and then verify Submitted Values is displayed open page
       // close driver
        */

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='alerts']")).click();

        System.out.println("URL : "+driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("URL : "+driver.getCurrentUrl());
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        System.out.println("URL : "+driver.getCurrentUrl());
        driver.findElement(By.xpath("//input[@id='lteq30']")).sendKeys("20"+ Keys.ENTER);
        if (driver.findElement(By.xpath("//p[text()='Submitted Values']")).isDisplayed()) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.quit();

    }
}
