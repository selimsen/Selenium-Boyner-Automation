import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class ProductPage extends BasePage{

    By productList = By.xpath("//*[@id='pagedListContainer']/div[4]/div[2]/div");
    By acceptCookies = By.className("cookies-accept");

    By favaddButtonLocator = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[2]/div/label/span");
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void selectRandomProduct() throws InterruptedException {
        Random random = new Random();
        int a =random.nextInt(44);
        findAll(productList).get(a).click();
        waitseconds();
        click(acceptCookies);
    }
    public boolean isProductSelected(){
        return isDisplayed(favaddButtonLocator);
    }


}
