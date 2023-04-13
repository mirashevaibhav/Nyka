package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.GenericUtility;

import java.util.List;


public class HomePage extends WebTestBase {


    @FindBy(xpath = "//a[text()='brands']")
    WebElement brandsElement;

    @FindBy(xpath = "//a[@title='logo']")
    WebElement logo;

    @FindBy(xpath = "//div[@class='css-xdicx1']")
    WebElement categorySelect;

    @FindBy(xpath = "//li[@class='css-1do4irw']")
    WebElement faceClick;

    @FindBy(xpath = "//a[text()='Lakme']")
    WebElement lakmeSelect;

    @FindBy(xpath = "//img[@alt='Facebook']")
    WebElement facebookLogo;

    @FindBy(xpath = "//span[text()='Foundation']")
    WebElement selectFoundation;

    @FindBy(xpath = "//input[@placeholder='Search on Nykaa']")
    WebElement searchTextBox;

    @FindBy(xpath = "//span[text()='Sort By : popularity']")
    WebElement sortByPopularity;

    @FindBy(xpath = "//div[@class='css-xdicx1'][1]")
    WebElement dropDownTab;

    @FindBy(xpath = "//div[@class='control-indicator radio ']")
    WebElement radioBtn;

    @FindBy(xpath = "//div[text()='All Products']")
    WebElement scrollAllProduct;


    public HomePage() {

        PageFactory.initElements(driver, this);
    }


    public void mouseOverOnBrand() {
        logo.click();
        GenericUtility.mouseOverOnElement(brandsElement);
        GenericUtility.waitUntilElementToBeClick(lakmeSelect);
    }

    public void scrollDownByFacebookLogo() {
        GenericUtility.scrollByElement(facebookLogo);
        facebookLogo.click();
    }

    public boolean isDisplayFacebookLogo() {
        return GenericUtility.isDisplayElement(facebookLogo);
    }

    public void selectByValue(String value) {
        GenericUtility.selectDropDownByValue(dropDownTab, value);
    }

    public void setRadioElement() {

        radioBtn.click();
    }

    public void setDropDownTab() {
        GenericUtility.selectDropDownValueByVisibleText(dropDownTab);
        GenericUtility.waitUntilElementToBeClick(dropDownTab);
        dropDownTab.click();
    }

    public void searchMethod(String productName) {
        searchTextBox.sendKeys(productName);
        searchTextBox.sendKeys(Keys.ENTER);

    }

    public void scrollByPopularity() {
        GenericUtility.scrollByElement(sortByPopularity);

    }

    public void scrollByAll() {
        sortByPopularity.click();
        GenericUtility.scrollByElement(scrollAllProduct);
    }

    public void windowHandle() {
        driver.getWindowHandles();


    }
}
