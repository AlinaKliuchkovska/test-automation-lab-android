package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetUpEmailPage extends BasePage {

    @FindBy(id = "account_setup_item")
    private WebElement googleButton;

    public SetUpEmailPage clickOnGoogleButton() {
        waitForElementToBeClickable(googleButton);
        googleButton.click();
        return this;
    }
}