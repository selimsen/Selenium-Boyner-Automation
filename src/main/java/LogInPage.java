import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage{
    By logInPageLocator = By.className("login");
    By userEmailLocator = By.id("customerEmail");
    By userPasswordLocator = By.id("customerPassword");

    By logInButtonLocator = By.xpath("//*[@id='loginForm']/div[2]/div[5]/div");

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void logIn() throws InterruptedException {
        click(logInPageLocator);
        type(userEmailLocator , "testmail2351@gmail.com");
        type(userPasswordLocator , "34455667a");
        click(logInButtonLocator);
        waitseconds();
    }
}
