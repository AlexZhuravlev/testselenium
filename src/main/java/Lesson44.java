//ТЕКСТОВЫЕ ПОЛЯ

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Lesson44 {
    public static void main(String[] args) {
//      System.setProperty("webdriver.gecko.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/geckodriver");
//      WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();

//        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//        WebElement searchField =  driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
//        searchField.sendKeys("Selenium webdriver");
//        driver.findElement(By.xpath("//input[@id=\"searchButton\"]")).click();
//
//        WebElement searchResultInput = driver.findElement(By.xpath("//div[@id=\"searchText\"]/input"));
//        System.out.println(searchResultInput.getAttribute("value")); // достаем содержимое инпута, выводим в консоль. value - css атрибут в который записывается текст из инпута
//                                                                        // после нажатия на кнопку поиска. Передаем конкретный атрибут, type, name, id ...
//
//        searchResultInput.clear();
//        searchResultInput.sendKeys("sdsda");

//        driver.get("https://github.com");
//        driver.findElement(By.xpath("//input[@id=\"user[login]\"]")).sendKeys("asdasd");
//        driver.findElement(By.xpath("//input[@id=\"user[email]\"]")).sendKeys("sdasdasd");
//        driver.findElement(By.xpath("//input[@id=\"user[password]\"]")).sendKeys("asdaszxczxczxczc");
//        driver.findElement(By.xpath("//form[@class=\"home-hero-signup text-gray-dark js-signup-form js-signup-form-submit\"]/button")).click();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("testemail");
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("testpass");

        driver.findElement(By.xpath("//label[@id=\"loginbutton\"]/input")).click();
        driver.findElement(By.xpath("//a[@id=\"back\"]")).click();




//        driver.quit();

    }
}
