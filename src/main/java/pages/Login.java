package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "(//div[@class='form-group__content']//input)[1]")
    @CacheLookup
    WebElement username;

    @FindBy(how = How.XPATH, using = "(//div[@class='form-group__content']//input)[2]")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.XPATH, using = "//button[@class='button button_type_default']")
    @CacheLookup
    WebElement loginButton;

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void loginClient(String userId, String pass){
        username.sendKeys(userId);
        password.sendKeys(pass);
        loginButton.click();
    }
}
