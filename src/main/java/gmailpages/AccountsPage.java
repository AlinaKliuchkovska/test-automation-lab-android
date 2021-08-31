package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage {

    @FindBy(id = "setup_addresses_add_another")
    private WebElement addEmailButton;

    @FindBy(id = "action_done")
    private WebElement goToGmailButton;

    @FindBy(id = "account_display_name")
    private WebElement accountName;

    public AccountsPage clickOnAddEmailButton() {
        waitForElementToBeClickable(addEmailButton);
        addEmailButton.click();
        return this;
    }

    public AccountsPage clickOnGoToGmailButton() {
        waitForElementToBeClickable(goToGmailButton);
        goToGmailButton.click();
        return this;
    }

    public String getAccountName() {
        waitForVisibilityOfElement(addEmailButton);
        return accountName.getText();
    }
}