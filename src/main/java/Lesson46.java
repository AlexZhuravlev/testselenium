import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Lesson46 {
    public static void main(String[] args) {
//      System.setProperty("webdriver.gecko.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/geckodriver");
//      WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();

        driver.get("https://rozetka.com.ua");
        driver.findElement(By.xpath("//div[@class='menu-outer js-rz-fat-menu']")).click();
        driver.findElement(By.xpath("//a[text()=\"Ноутбуки\"]")).click();
        driver.findElement(By.xpath("//label[@for=\"Acer\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"catalog-selection__remove-icon\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("Ноутбук Asus ROG Strix");
        driver.findElement(By.xpath("//button[@class=\"button button_color_green button_size_medium search-form__submit\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Ноутбуки\"][1]")).click();

        System.out.println("finish");









//        driver.quit();

    }
}