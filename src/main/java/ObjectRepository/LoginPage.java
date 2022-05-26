package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By username = By.xpath("//input[contains(@id,'login1')]");
    By password = By.name("passwd");
    By signIn = By.name("proceed");
}
