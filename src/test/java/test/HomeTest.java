package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {

    public HomePage homePage;

    public HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initializations();
        homePage = new HomePage();
    }

    @Test()
    public void verifyMouseover() {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseOverOnBrand();
        softAssert.assertEquals("Nykaa","Nykaa","mouseover is tested successfully");
        softAssert.assertAll();
    }

    @Test()
    public void verifyScrollMethod()  {
        SoftAssert softAssert = new SoftAssert();
        homePage.scrollDownByFacebookLogo();
        homePage.windowHandle();
        softAssert.assertTrue(homePage.isDisplayFacebookLogo(), "facebook logo should be displayed");
        softAssert.assertAll();

    }
    @Test
    public void verifySearchBox(){
        SoftAssert softAssert = new SoftAssert();
        homePage.searchMethod(prop.getProperty("productName"));
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}



