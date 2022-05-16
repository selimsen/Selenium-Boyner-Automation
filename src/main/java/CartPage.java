import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    By addToBasketLocator = By.xpath(
            "//*[@id='mainBody']/div[1]/div[1]/div[2]/section[1]/div[2]/form/div[5]/div[2]/button");
    By goToTheBasketLocator = By.className("b-text");

    By ProductQuantityMainLocator = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[3]/div[1]/div/select");
    By ProductQuantitySubLocator = By.xpath(
            "/html/body/div[1]/div[1]/div/div[1]/div[2]/div[3]/div[1]/div/select/option");
    By deleteBasketLocator = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[2]/button");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void addToBasket() throws InterruptedException {
        click(addToBasketLocator);
        waitseconds();
    }
    public void goToBasket(){
        click(goToTheBasketLocator);
    }
    public void IncreaseProduct() throws InterruptedException {
        click(ProductQuantityMainLocator);
        waitseconds();
        findAll(ProductQuantitySubLocator).get(1).click();
        waitseconds();

    }
    public void DecreaseProduct() throws InterruptedException {
        click(ProductQuantityMainLocator);
        waitseconds();
        findAll(ProductQuantitySubLocator).get(0).click();

    }
    public void deleteToBasket() throws InterruptedException {
        waitseconds();
        click(deleteBasketLocator);

    }
}
