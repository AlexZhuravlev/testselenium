//КНОПКИ

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Lesson43 {
    public static void main(String[] args) {
//      System.setProperty("webdriver.gecko.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/geckodriver");
//      WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(2000,0));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();

        driver.get("https://github.com/");
        WebElement button = driver.findElement(By.xpath("//form[@class=\"home-hero-signup js-signup-form\"]//button"));
        // мы хотим убедиться что текст на кнопке нужный нам
        System.out.println("Button text is: " + button.getText());
        // можем добавить проверку
        if (button.getText().equals("Sign up for GitHub")){ // equals - проверка, гениально
            System.out.println("Success");
        }
        else{
            System.out.println("Failed");
        }

        button.submit(); // если у элемента type submit - можно юзать submit вместо click()
        driver.navigate().back();

        driver.get("https://github.com/login");

        driver.findElement(By.xpath("//a[text()=\"Create an account\"]")).click();  // ищем по тексту в котором a

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//label[@id=\"loginbutton\"]/input")).click();












//        driver.quit();
    }
}