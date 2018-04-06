package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RequestTypes {
    // To get model booking page
    public static final String BOOKING_URL = "https://stage.newbookmodels.com/booking/type/";
    WebDriver driver;

    public RequestTypes(){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//div[@class='booking-type__image booking-type__image_booking']")
    @CacheLookup
    WebElement bookingRequest;

    @FindBy(how = How.XPATH, using = "//div[@class='booking-type__image booking-type__image_option']")
    @CacheLookup
    WebElement optionRequest;

    public void bookingReqClick(){
        bookingRequest.click();
    }
    public void optionReqClick(){
        optionRequest.click();
    }

}
