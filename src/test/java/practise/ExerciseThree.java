package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ExerciseThree {
    /*
            ...Exercise3...
            go to url : https://www.techlistic.com/p/selenium-practice-form.html
            fill the firstname
            fill the firstname
            check the gender
            check the experience
            fill the date
            choose your profession -> Automation Tester
            choose your tool -> Selenium Webdriver
            choose your continent -> Antartica
            choose your command  -> Browser Commands
            click submit button
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ali");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kan");
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        driver.findElement(By.xpath("//input[@id='exp-2']")).click();

        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01.01.2020");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();

        Select select = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
        select.selectByVisibleText("Antartica");
        Select select2 = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
        select2.selectByIndex(0);
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        driver.quit();

    }
}
