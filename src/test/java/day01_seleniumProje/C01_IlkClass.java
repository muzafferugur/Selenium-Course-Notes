package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        En ilkel haliyle bir otomasyon yapmak için
        Class'ımıza otomasyon için gerekli olan webdirver'ın yerini göstermemiz gerekir.
        Bunun için Java kütüphanesinden System.setProperty() methodu kullanırız.Method iki parametre istemektedir.

        ilki kullanacağımız driver : webdriver.chorme.driver
        ikincisi ise bu driverin fiziki yolu :
         */

        System.setProperty("webdriver.chorme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com");
    }
}
