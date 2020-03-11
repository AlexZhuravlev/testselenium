// ДРОПДАУНЫ

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lesson47 {

    static WebDriver driver; // вынесли драйвер

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();



//        driver.get("https://assetgates.com/");
//        driver.findElement(By.xpath("//div[@class=\"header__right\"]//a[text()=\"Register\"]")).click();
//        driver.findElement(By.xpath("//form[@class=\"form \"]//div[@class=\"form__input select cntr-in\"]")).click();
//        driver.findElement(By.xpath("(//li[@data-name=\"Brunei\"])[1]")).click();
//
//
//        driver.findElement(By.xpath("//div[@data-id=\"live-map-select\"]")).click();
//        driver.findElement(By.xpath("//li[@data-value=\"en\"]")).click();
//        driver.findElement(By.xpath("//label[@for=\"live_edge\"]")).click();
//        driver.findElement(By.xpath("(//div[@class=\"form__row terms\"])[1]")).click();


        driver.get("https://auto.ria.com/");

//        driver.findElement(By.xpath("//select[@aria-label=\"Тип транспорта\"]")).click();
//        driver.findElement(By.xpath("//option[text()=\"Мото\"]")).click();

        setOption("Тип транспорта", "Мото");






    }

    public static void setOption(String list, String option){

        String listXpath = String.format("//select[@aria-label=\"%s\"]", list);
        String optionXpath = String.format("//option[text()=\"%s\"]", option);


        driver.findElement(By.xpath(listXpath)).click();
        driver.findElement(By.xpath(optionXpath)).click();


    }
}
