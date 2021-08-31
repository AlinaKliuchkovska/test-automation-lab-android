package gmailpages;

import driver.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected AndroidDriver driver;
    private WebDriverWait wait;
    private TouchAction action;
    public static final long TIME_TO_WAIT = 30;

    public BasePage() {
        this.driver = Driver.getDriver();
        wait = new WebDriverWait(driver, TIME_TO_WAIT);
        action = new TouchAction(driver);
        PageFactory.initElements(driver, this);
    }

    public void waitForVisibilityOfElement(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForElementToBeClickable(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void touchActionTap(int x, int y) {
        action.tap(PointOption.point(x, y)).release().perform();
    }
}