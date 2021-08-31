package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveAccountPage extends BasePage {

    @FindBy(xpath = "//android.widget.Button")
    private WebElement removeAccountButton;

    public RemoveAccountPage clickOnRemoveAccountButton() {
        waitForElementToBeClickable(removeAccountButton);
        removeAccountButton.click();
        return this;
    }
}