// Поиск списка элементов

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lesson48 {

    static WebDriver driver; // вынесли драйвер

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();

        driver.get("https://mebshop.kiev.ua/");
        driver.findElement(By.xpath("//a[@id='cat-menu-comp-stoly']")).click();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class=\"filter-option\"][5]//div[@class=\"filter-check-div\"]"));  // find list of elements
//        checkboxes.get(3).click();
        System.out.println(checkboxes.size());

        if (checkboxes.size() == 11){
            System.out.println("OK");
        }
        else{
            System.out.println("NOT OK");
        }


        //выделим все чекбоксы циклом

        driver.get("https://flash-nika-mebel.ua/furniture/shkafi-kupe");
        List<WebElement> checkboxes2 = driver.findElements(By.xpath("//form[@id=\"filter_form\"]/div[3]//input[@type=\"checkbox\"]"));


        for (WebElement checkbox : checkboxes2){
            checkbox.click();
        }






//        driver.quit();

    }
}