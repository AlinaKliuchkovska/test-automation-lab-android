package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveAccountPopup extends BasePage {

    @FindBy(xpath = "//android.widget.Button[2]")
    private WebElement confirmRemoveAccountButton;

    public RemoveAccountPopup clickOnConfirmRemoveAccountButton() {
        waitForElementToBeClickable(confirmRemoveAccountButton);
        confirmRemoveAccountButton.click();
        return this;
    }
}
