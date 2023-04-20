package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Bir sayfa açılırken ilk başta sayfanın içerisinde bulunan
        elementlere göre bir yüklenme süresine ihtiyaç vardır.
        veya bir webelementin kullanılabilmesi için zamana ihtiyaç olabilir.

        implicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için
        beklenecek MAXIMUM sureyi belirleme olanağı tanır.
         */

    }
}
