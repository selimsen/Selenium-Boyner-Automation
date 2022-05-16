import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;




public class SearchBox extends BasePage{

    By searchBoxLocator = By.xpath("//*[@id='pw-search-input']");
    By searchButtonClickLocator = By.id("pw-search-submit");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void searching (String text){
        click(searchBoxLocator);
        type(searchBoxLocator,text);
        enter(searchBoxLocator);
    }


}
