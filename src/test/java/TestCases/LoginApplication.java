package TestCases;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {

    @Test
    public void login() {

        // LoginPage class implemented in normal page object pattern style
        // HomePage class implemented in page object factory methods

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        LoginPage rd = new LoginPage(driver);
        rd.emailId().sendKeys("hello");
        rd.password().sendKeys("hello");
        //rd.submit().click();
        rd.home().click();

        HomePage rh = new HomePage(driver);
        rh.search().sendKeys("kids toys");

    }
}
