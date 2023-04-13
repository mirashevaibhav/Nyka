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

    @FindBy(xpath = "//span[@class='side-count']")
    WebElement makeupSelect;

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

    @FindBy(xpath = "//button[@class='css-1hhqgju']")
    WebElement signInBtn;

    @FindBy(xpath ="//span[text()='Sort By : relevance']")
    WebElement sortByElement;

    @FindBy(xpath ="//span[text()='Sort By : popularity']")
    WebElement sortByPopularity;

    @FindBy(xpath = "//select[@class='css-2t5nwu']")
    WebElement dropDownTab;

   @FindBy(xpath = "//button[@class='css-g4vs13']")
   WebElement bagBtn;

   @FindBy(xpath = "//div[@class='control-indicator radio ']")
   WebElement radioBtn;

   @FindBy(xpath = "//div[text()='Lakme Absolute Skin Natural Mousse Mattreal Foundation']")
   WebElement lakmeProduct;
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

    public void selectDropDown() {

       dropDownTab.click();
        GenericUtility.selectDropDownValueByVisibleText(dropDownTab);
        GenericUtility.waitUntilElementToBeClick(dropDownTab);
    }
    public void setRadioElement(){

       sortByPopularity.click();
        radioBtn.click();

    }

    public void searchMethod(String productName){
        searchTextBox.sendKeys(productName);

    }
    public void scrollByPopularity(){
        GenericUtility.scrollByElement(sortByPopularity);

    }

    public void windowHandle() {
        driver.getWindowHandles();


    }
    public void productClick(){
        lakmeProduct.click();
    }
}
