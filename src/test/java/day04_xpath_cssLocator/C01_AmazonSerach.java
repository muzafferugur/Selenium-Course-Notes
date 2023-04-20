package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSerach {
    public static void main(String[] args) {

        /*
        1-Main method oluşturun ve aşağıdaki görevi tamamlayın
        a. https://amazon.com sayfasına gidin.
        b. Search "city bike"
        c. Amazonda görüntülenen ilgili sonuçların görüntülerini yazdırın
        d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. https://amazon.com sayfasına gidin
        driver.get("https://amazon.com");

        //  b. Search "city bike"
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        // c. Amazonda görüntülenen ilgili sonuçların sayısını yazdırın.
        List<WebElement> istenenElementListesi = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi = istenenElementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());

        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ürünResimleriList = driver.findElements(By.className("s-image"));
        WebElement ilkÜrünResmi = ürünResimleriList.get(0);
        ilkÜrünResmi.click();

        driver.close();


    }
}
