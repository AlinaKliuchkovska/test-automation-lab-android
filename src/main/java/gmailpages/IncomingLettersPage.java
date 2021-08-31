package gmailpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomingLettersPage extends BasePage {

    @FindBy(id = "compose_button")
    private WebElement composeButton;

    @FindBy(xpath = "//*[@content-desc='Open navigation drawer']")
    private WebElement menuButton;

    @FindBy(id = "action_bar_root")
    private WebElement actionBar;

    @FindBy(xpath = "(//*[@content-desc='Double tap to select this conversation'])[2]")
    private WebElement manageAccountButton;

    public IncomingLettersPage clickOnLastMessage(String subject) {
        driver.findElement(By.xpath(String.format("//android.view.View[contains(@content-desc,\"%s\")]", subject))).click();
        return this;
    }

    public IncomingLettersPage clickOnComposeButton() {
        waitForElementToBeClickable(composeButton);
        composeButton.click();
        return this;
    }

    public IncomingLettersPage clickOnManageAccountButton() {
        waitForElementToBeClickable(manageAccountButton);
        manageAccountButton.click();
        return this;
    }

    public IncomingLettersPage clickOnActionBar() {
        waitForElementToBeClickable(actionBar);
        touchActionTap(748, 401);
        return this;
    }

    public IncomingLettersPage clickOnMenuButton() {
        waitForElementToBeClickable(menuButton);
        menuButton.click();
        return this;
    }
}
