package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class GenericUtility extends WebTestBase {

    public static Select select;
    public static JavascriptExecutor js;
    public static Actions actions;

    public static final long IMPLICIT_WAIT = 20;
    public static final long PAGE_LOAD_WAIT = 20;
    public static final long EXPLICIT_WAIT = 20;


    public static void waitUntilElementToBeClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static String getTextOfElement(WebElement element) {

        return element.getText();
    }


    public static void mouseOverOnElement(WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }


    public static void selectDropDownValueByVisibleText(WebElement element, String visibleText) {
        select = new Select(element);
        select.selectByVisibleText(visibleText);
    }


    public static void scrollByElement(WebElement element) {

        js = (JavascriptExecutor) driver;
        js.executeScript("arguments [0].scrollIntoView();", element);

    }


    public static boolean isDisplayElement(WebElement element) {
        return element.isDisplayed();
    }

    public static void getFindElements(List<WebElement> elements) {
        for (WebElement e : elements) {
            if (e.getText().equalsIgnoreCase(String.valueOf(elements))) {
                e.click();
                break;
            }
        }
    }

    public static void selectDropDownValueByVisibleText(WebElement makeupSelect) {


    }

    public void getWindowHandles() {
        String parentId = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentId.contentEquals(s)) {
                driver.switchTo().window(s);
                driver.close();
            }
            driver.switchTo().window(parentId);
        }
    }

    public static void selectDropDownByValue(String dropDown) {
        select.selectByValue(dropDown);
    }

    public static void selectDropDownValueByIndex(WebElement element, int index) {
        select = new Select(element);
        select.selectByIndex(index);
    }

    public static void selectDropDownByValue(WebElement element, String value) {
        select = new Select(element);
        select.selectByValue(value);
    }
}
