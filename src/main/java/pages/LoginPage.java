package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.GenericUtility;

public class LoginPage extends WebTestBase {

    @FindBy(xpath = "//button[@aria-label='Kebab menu']")
    WebElement loginBtn;
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    public String textOfElement(){
        return GenericUtility.getTextOfElement(loginBtn);
    }
}


