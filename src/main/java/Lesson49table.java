import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Lesson49table {

    private WebElement tableElement;
    private WebDriver driver;

    public Lesson49table(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }


    public void getRows() {
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
    }

}
