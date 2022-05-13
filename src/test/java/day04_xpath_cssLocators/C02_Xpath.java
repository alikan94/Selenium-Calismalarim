package day04_xpath_cssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        /*
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //2- Add Element butonuna basin
        //3- Delete butonu’nun gorunur oldugunu test edin
        //4- Delete tusuna basin
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

         */

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        //driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (deleteButonu.isDisplayed()) {
            System.out.println("Delete button test PASSED");
        } else {
            System.out.println("Delete button test FAILED");
        }

        //4- Delete tusuna basin
        deleteButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementsYazisi = driver.findElement(By.xpath("//h3"));

        if (addRemoveElementsYazisi.isDisplayed()) {
            System.out.println("Add/Remove Elements test PASSED");
        } else {
            System.out.println("Add/Remove Elements test FAILED");
        }
        driver.quit();

    }
}
