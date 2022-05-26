package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        initElements(driver, this);
    }

    //By search = By.id("srchword");

    @FindBy(id = "srchword")
    WebElement search;

    public WebElement search() {

        return search();
    }
}
