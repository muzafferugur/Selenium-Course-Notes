package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*
        1-)https://www.amazon.com url'sine gidin.
        2-)Baslığın amazon kelimesi içerdiğini test edin.
        3-)Url'nin "https://www.amazon.com" a eşit olduğunu test edin.
        4-)Sayfayı kapatın.
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1.adım: https://www.amazon.com url'sine gidelim
        driver.get("https://amazon.com");

        //2.adım: Baslığın amazon kelimesi içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";

        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASSED");

        } else System.out.println("Title" + arananKelime + "'yi içermiyor, title testi FAILED.");

        //3.adım: Url'nin "https://www.amazon.com" a eşit olduğunu test edelim
        String actualUrl=driver.getCurrentUrl();                    //==>Aslında olan
        String expectedUrl="https://www.amazon.com/"; //==>Beklenen

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Actual Url : "+actualUrl +" beklenen url'den farklı, test FAILED.");

        //4.adım: Sayfayı kapatalım.
        driver.close();
    }
}
