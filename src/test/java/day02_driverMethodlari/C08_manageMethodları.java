package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        //maximize iken boyutları alalım
        driver.manage().window().maximize();
        System.out.println("maximize konu : "+driver.manage().window().getPosition());
        System.out.println("maximize boyut : "+driver.manage().window().getSize());

        //fullscreen iken boyutları alalım
        driver.manage().window().fullscreen();
        System.out.println("fullscreen konu : "+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : "+driver.manage().window().getSize());

        driver.manage().window().minimize();//==>Simge durumunda küçültür.



    }
}
