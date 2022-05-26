package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class PageFactory {

    WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
        initElements(driver, this);
    }

    /*By username = By.xpath("//input[contains(@id,'login1')]");
    By password = By.name("passwd");
    By signIn = By.name("proceed");
    By home = By.linkText("rediff.com");*/

    @FindBy(xpath = "//input[contains(@id,'login1')]")
    WebElement username;

    @FindBy(name = "passwd")
    WebElement password;

    @FindBy(name = "proceed")
    WebElement signIn;

    @FindBy(linkText = "rediff.com")
    WebElement home;

    public WebElement emailId() {

        return username;
    }

    public WebElement password() {

        return password;
    }

    public WebElement submit() {

        return signIn;
    }

    public WebElement home() {

        return home;
    }

}
