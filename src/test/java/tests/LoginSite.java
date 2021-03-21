package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class LoginSite {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = Web.createChrome();
    }

    @Test
    public void login(){

        new LoginPage(driver)
                .clickSignIn()
                .typeLogin("julio0001")
                .typePassword("123456")
                .clickSignIn();

    }

    @After
    public void tearDowwn(){
        driver.quit();
    }

}
