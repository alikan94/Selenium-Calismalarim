package day03_locators;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmazonSearchTest {
    public static void main(String[] args) {
        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a.google web sayfasına gidin. https://www. amazon.com/
        //b. Search(ara) “city bike”
        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        //d. “Shopping” e tıklayın.
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın


        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //a.google web sayfasına gidin. https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        //b. Search(ara) “city bike”

        String searchingKeyWord = "city bike";

        WebElement searchBoxElement = driver.findElement(By.id("twotabsearchtextbox"));
        searchBoxElement.sendKeys(searchingKeyWord + Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
/*
            <div class="a-section a-spacing-small a-spacing-top-small">
            <span>1-16 of 137 results for</span>
            <span> </span>
            <span class="a-color-state a-text-bold">"city bike"</span>
            </div>
 */
        WebElement resultNumbersElement = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        String resultNumbersSentence=resultNumbersElement.getText();
        System.out.println(resultNumbersElement.getText());
        Arrays.stream(reverseArr(resultNumbersSentence.split(" "))).
                skip(2).
                limit(1).
                forEach(System.out::println);

        //d. “Shopping” e tıklayın.
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        /*
        //*[@id="search"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img
         */
        WebElement ilkGorselElementi = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
        ilkGorselElementi.click();
        System.out.println("resme tiklandi");

        driver.quit();
    }
    public static String[] reverseArr(String[] arr){
        String[] reversedArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i]=arr[arr.length-1-i];
        }
        return reversedArr;
    }
}
