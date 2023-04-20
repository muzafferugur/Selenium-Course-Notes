package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //.maximize()==>browser'ı tam sayfa yapar.

        //öncelikle driver.get() methodunu göreceğiz
        driver.get("https://amazon.com");

        System.out.println("actual title : " + driver.getTitle()); //==>actual dememizin sebebi benim driver ile aldığım değerler actualdir.
        System.out.println("actual url : " + driver.getCurrentUrl());
        driver.close();//==>bazen sayfada işimizin bittiğini anlamıyoruz bunun için işin bitince kapat komutu


    }
}
