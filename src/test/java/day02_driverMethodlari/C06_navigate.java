package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        Eğer testimiz sırasında birden fazla sayfa arasında ileri geri hareket edeceksek
        driver.get() yerine driver.navigate().to("Url") methodunu kullanırız ve sonrasında
        forward(), back() veya refresh() methodlarını kullanabiliriz.
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //==>navigate()'i to() ile kullanabiliriz sonuç olarak driver.get()=driver.navigate().to() sayfalar arasında ileri,geri yenileme için
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        //amazon a geri dönelim
        driver.navigate().back();

        //yeniden facebook'a gidelim
        driver.navigate().forward();

        //sayfayı refresh yapalım
        driver.navigate().refresh();
        Thread.sleep(2000);

        //sayfayı kapatalım
        driver.close();


    }
}
