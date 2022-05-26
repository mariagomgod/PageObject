package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.xpath("//input[contains(@id,'login1')]");
    By password = By.name("passwd");
    By signIn = By.name("proceed");
    By home = By.linkText("rediff.com");

    public WebElement emailId() {

        return driver.findElement(username);
    }

    public WebElement password() {

        return driver.findElement(password);
    }

    public WebElement submit() {

        return driver.findElement(signIn);
    }

    public WebElement home() {

        return driver.findElement(home);
    }
}
