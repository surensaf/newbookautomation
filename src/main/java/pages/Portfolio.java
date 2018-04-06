package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Portfolio {

    public static final String PORTFOLIO_URL = "https://stage.newbookmodels.com/model/portfolio/";

    WebDriver driver;
    public Portfolio(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(how = How.XPATH, using = "//div[@class='favorites__like favorites__like_filled favorites__like_type_light-xs-dark-lg']")
    @CacheLookup
    WebElement favorite;

    @FindBy(how = How.XPATH, using = "//div[@class='d-flex align-items-center justify-content-center flex-lg-column model-actions__action model-actions__action_type_contact']")
    @CacheLookup
    WebElement contact;

    public void clickContact(){
        contact.click();
    }

    public void clickFavorite(){
        favorite.click();
    }
}
