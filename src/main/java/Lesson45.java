//ССЫКИ

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Lesson45 {
    public static void main(String[] args) {
//      System.setProperty("webdriver.gecko.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/geckodriver");
//      WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement link = driver.findElement(By.xpath("//li[@id=\"n-aboutsite\"]/a"));
        System.out.println(link.getText());
        link.click();

        driver.get("https://github.com/");
        driver.findElement(By.xpath("//ul[@class=\"d-lg-flex list-style-none\"]//a[@href=\"/marketplace\"]")).click();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()=\"Forgot account?\"]")).click();





    }

}