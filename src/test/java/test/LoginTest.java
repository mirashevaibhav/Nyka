package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ContactPage;
import pages.LoginPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {
    public LoginPage loginPage;
    LoginTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod () {
        initializations();
        loginPage=new LoginPage();

    }
    @Test
    public void verifyContactPage(){
        SoftAssert softAssert = new SoftAssert();
        loginPage.textOfElement();
        softAssert.assertEquals(loginPage.textOfElement(),"Sign in","Title should be Display");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}

