package test;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ContactPage;
import pages.HomePage;
import testbase.WebTestBase;

public class ContactTest extends WebTestBase {
    public ContactPage contactPage;

public ContactTest() {
    super();
}
    @BeforeMethod
    public void beforeMethod () {
        initializations();
        contactPage =new ContactPage();

    }
    @Test
    public void verifyContactPage(){
        SoftAssert softAssert = new SoftAssert();
        contactPage.scrollDownByContactUs();
        softAssert.assertEquals(contactPage.textOfElement(),"Contact Us","Title should be display");
        softAssert.assertAll();
    }
    @AfterMethod
     public void afterMethod(){
      driver.close();
    }
}