package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.GenericUtility;


public class ContactPage extends WebTestBase {
    @FindBy(xpath = "//a[text()='Contact Us']")
    WebElement contactUS;

    public ContactPage(){
        PageFactory.initElements(driver,this);
    }
    public String textOfElement(){
        return GenericUtility.getTextOfElement(contactUS);

    }
    public void scrollDownByContactUs(){
        GenericUtility.scrollByElement(contactUS);
    }


}
