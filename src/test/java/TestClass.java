import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestClass extends BaseTest{

    LogInPage logInPage;
    SearchBox searchBox;
    ProductPage productPage;
    CartPage cartPage;

    @Order(1)
    @Test
    public void openLoginPage() throws InterruptedException {
    logInPage = new LogInPage(driver);
    logInPage.logIn();
    }
    @Order(2)
    @Test
    public void search_a_product() throws InterruptedException {
        searchBox = new SearchBox(driver);
        productPage = new ProductPage(driver);
        Thread.sleep(3000);
        searchBox.searching("Çanta");
        productPage.selectRandomProduct();
    }
    @Order(3)
    @Test
    public void add_To_Basket() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.addToBasket();
    }
    @Order(4)
    @Test
    public void go_to_Basket(){
        cartPage = new CartPage(driver);
        cartPage.goToBasket();
    }
    @Order(5)
    @Test
    public void Increase_to_Basket() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.IncreaseProduct();
    }
    @Order(6)
    @Test
    public void Decrase_to_Basket() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.DecreaseProduct();
    }
    @Order(7)
    @Test
    public void Delete_To_Basket() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.deleteToBasket();
    }

}
