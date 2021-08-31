package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage {

    @FindBy(xpath = "//*[@content-desc='I agree']")
    private WebElement confirmButton;

    public ConfirmationPage clickOnConfirmButton() {
        waitForElementToBeClickable(confirmButton);
        confirmButton.click();
        return this;
    }
}