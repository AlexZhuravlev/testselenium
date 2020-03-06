import okio.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Lesson46 {

    static WebDriver driver; // вынесли драйвер

    public static void main(String[] args) {
//      System.setProperty("webdriver.gecko.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/geckodriver");
//      WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);



//        driver.get("https://rozetka.com.ua");
//        driver.findElement(By.xpath("//div[@class='menu-outer js-rz-fat-menu']")).click();
//        driver.findElement(By.xpath("//a[text()=\"Ноутбуки\"]")).click();
//        driver.findElement(By.xpath("//label[@for=\"Acer\"]")).click();
//        driver.findElement(By.xpath("//span[@class=\"catalog-selection__remove-icon\"]")).click();
//        driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("Ноутбук Asus ROG Strix");
//        driver.findElement(By.xpath("//button[@class=\"button button_color_green button_size_medium search-form__submit\"]")).click();
//        driver.findElement(By.xpath("//span[text()=\"Ноутбуки\"][1]")).click();

//        System.out.println(driver.findElement(By.xpath("//input[@id='15\"-15.6\"']")).isSelected()); // метод проверки селектед. применяется только к инпутам (вроде)
//        driver.findElement(By.xpath("//label[contains(text(),'15\"-15.6\"')]")).click();
//        System.out.println(driver.findElement(By.xpath("//input[@id='15\"-15.6\"']")).isSelected());

        // обернем проверку в if

//        if (!driver.findElement(By.xpath("//input[@id='15\"-15.6\"']")).isSelected()){
//            driver.findElement(By.xpath("//label[contains(text(),'15\"-15.6\"')]")).click();
//        }
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='15\"-15.6\"']")));
//
//        if (!driver.findElement(By.xpath("//input[@id='15\"-15.6\"']")).isSelected()){
//            driver.findElement(By.xpath("//label[contains(text(),'15\"-15.6\"')]")).click();
//        }
//
//
//
//        System.out.println("finish");


        driver.get("https://sokol.energy/lampy");  //input[@id="as4c_5_592"]


        System.out.println("Feron start");
        selectCheckbox("Feron");
        deSelectCheckbox("Feron");
        System.out.println("Feron end");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"as4c_5_1021\"]")));

        System.out.println("Delux start");
        selectCheckbox("Delux");
        deSelectCheckbox("Delux");
        System.out.println("Delux end");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"as4c_5_1021\"]")));

        System.out.println("Powerlux start");
        selectCheckbox("Powerlux");
        deSelectCheckbox("Powerlux");
        System.out.println("Powerlux end");

//        if (!driver.findElement(By.xpath("//input[@id=\"as4c_5_592\"]")).isSelected()){
//            System.out.println("CHECKBOX IS NOT SELECTED");
//            driver.findElement(By.xpath("//input[@id=\"as4c_5_592\"]")).click();
//        }
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"as4c_5_592\"]")));
//
//        if (driver.findElement(By.xpath("//input[@id=\"as4c_5_592\"]")).isSelected()){
//            System.out.println("CHECKBOX IS SELECTED ALREADY");
//            driver.findElement(By.xpath("//input[@id=\"as4c_5_592\"]")).click();
//        }


        System.out.println("FINISH");

//        driver.quit();

        }


    public static void selectCheckbox(String name){
        String xpath = "//div[@id=\"left-column\"]//a[contains(text(),'%s')]";
        if (!driver.findElement(By.xpath(String.format(xpath, name) + "/preceding::input[1]")).isSelected()){
            System.out.println("CHECKBOX IS NOT SELECTED");
            driver.findElement(By.xpath(String.format(xpath,name))).click();
            System.out.println("CHECKBOX IS SELECTED ALREADY");
        }

    }

    public static void deSelectCheckbox(String name){
        String xpath = "//div[@id=\"left-column\"]//a[contains(text(),'%s')]";
        if (driver.findElement(By.xpath(String.format(xpath, name) + "/preceding::input[1]")).isSelected()){
            driver.findElement(By.xpath(String.format(xpath,name))).click();
            System.out.println("CHECKBOX UNSELECTED!");

        }

    }




}
