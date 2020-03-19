// Работа с таблицами

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lesson49 {

    static WebDriver driver; // вынесли драйвер

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        WebElement table = driver.findElement(By.xpath("//table[@id=\"customers\"]"));








    }
}