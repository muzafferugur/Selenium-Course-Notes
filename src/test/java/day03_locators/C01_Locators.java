package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon'a gidip nutella aratalım
        driver.get("https://amazon.com");
        //findElement(By .... locator)-->istediğimiz web elementini bize döndürür.
        //biz de o webelementini kullanmak için bir objeye assing ederiz
       // WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));//=>By.id() ile locate aldık
        //WebElement aramaKutusu= driver.findElement(By.className("nav-search-field"));//=>By.className() ile locate aldık className'i olmadığı için bulamadık.

        //İlla her yazdığımız locator ile bulacağız diye bir şey yok. Doğru çalışıncaya kadar farklı farklı locatorları(Alternatif) deneriz.
        //html code ile ilgili bazı farklılıklar olabiliyor.Çalışan bir tane unique bulduk mu gerisi önemli değil.
        //Eğer yanlış locate edilirse NoSuchElentException fıydırır.-Bunu gördüysek locator'ımızı gözden geçirmeliyiz.

        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));//=>By.name() ile locate aldık.

        //herhangi bir webelementine istediğimiz yazıyı yollamak istersek
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);







    }
}
