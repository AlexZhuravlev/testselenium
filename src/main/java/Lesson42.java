import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Lesson42 {
    public static void main(String[] args) {
//      System.setProperty("webdriver.gecko.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/geckodriver");
//      WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(2000,0));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        WebElement donateLink = driver.findElement(By.partialLinkText("Donate"));
        WebElement searchField= driver.findElement(By.name("search"));
        WebElement searchBtn = driver.findElement(By.className("searchButton"));
        WebElement li = driver.findElement(By.id("ca-viewsource"));
        WebElement input = driver.findElement(By.tagName("input"));

        WebElement elem = driver.findElement(By.cssSelector("#p-lang > div > ul > li.interlanguage-link.interwiki-bg > a"));
        WebElement history = driver.findElement(By.xpath("//a[contains(text(),'View history')]"));
        WebElement history2 = driver.findElement(By.xpath("//li[@id = \"ca-history\"]/a"));




        loginLink.click();



        driver.quit();
    }
}