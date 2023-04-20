package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {

        /*
        1- "https://the-internet.herokuapp.com/add_remove_elements/" adresine gidin
        2- Add Element butonuna basın.
        3- Delete butonunun görünür olduğunu test edin
        4- Delete tuşuna basın
        5- "Add/Remove Elements yazısının görünür olduğunu test edin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://the-internet.herokuapp.com/add_remove_elements/" adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna basın.
        driver.findElement(By.className("example")).click();

        // Delete butonunun görünür olduğunu test edin.
        WebElement deleteButton = driver.findElement(By.id("elements"));

        if (deleteButton.isDisplayed()) {
            System.out.println("deleteButton testi PASSED");

        } else System.out.println("deleteButton testi FAILED");

        // Delete tuşuna basın
        deleteButton.click();

        //"Add/Remove Elements yazısının görünür olduğunu test edin
        WebElement arElements = driver.findElement(By.xpath("//h3"));

        if (arElements.isDisplayed()) {
            System.out.println("Add/Remove Elements yazısı testi PASSED");

        } else System.out.println("Add/Remove Elements yazısı testi FAILED");

        driver.close();


    }
}
