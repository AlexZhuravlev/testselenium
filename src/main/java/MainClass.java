import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/home/zhuravlev/IdeaProjects/testselenium/drivers/chromedriver");

//        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicitlyWait. Дефолтный таймаут, максимальное время для драйвера на поиск элемента.
                                                                            // Если найден раньше - действие выполнится сразу.
                                                                            // Если не найден - ошибка. Указывется один раз в начале и по умолчанию применяется ко всем поискам элементов



        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(800,600));
        driver.manage().window().setPosition(new Point(2000,0));

        driver.get("https://google.com/");
        driver.navigate().to("https://selenium.dev"); //альтернативный метод навигации. Метод get пердпочтительней

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());





        driver.quit();









    }

}
