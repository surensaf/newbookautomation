
import helper.BrowserFactory;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import pages.Login;
import pages.Portfolio;
import pages.RequestTypes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void verifyValidLogin() throws InterruptedException {

        String[] profiles = {"a7b00c28-8f14-4fe0-97b8-ead7c43b60e8", "8dc1b281-9866-411e-b598-89c433d109a2"};
        ProfilesIni p = new ProfilesIni();

        WebDriver driver = BrowserFactory.startBrowser("chrome", "https://stage.newbookmodels.com/auth/signin");
        Login loginPage = PageFactory.initElements(driver, Login.class);

        //Thread.sleep(5000L);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.loginClient("testinpo+2@gmail.com", "newbook123");
        Thread.sleep(5000L);
        Portfolio portfolio = PageFactory.initElements(driver, Portfolio.class);
        driver.get(portfolio.PORTFOLIO_URL + profiles[0]);
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie tempck : cookies) {
            System.out.println(tempck.getName() + "=" + tempck.getValue() + "; " + "path=" + tempck.getPath() + ";");
        }
        Thread.sleep(3000L);
        portfolio.clickContact();
        Thread.sleep(3000L);
        RequestTypes requestTypes = PageFactory.initElements(driver, RequestTypes.class);
        requestTypes.bookingReqClick();


        /*
        https://stage.newbookmodels.com/model/portfolio/
        profile keys
        a7b00c28-8f14-4fe0-97b8-ead7c43b60e8
        8dc1b281-9866-411e-b598-89c433d109a2
        cf75785-4784-4c5f-b566-efda8380c604
         */

    }
}