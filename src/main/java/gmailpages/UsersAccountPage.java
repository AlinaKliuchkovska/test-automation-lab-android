package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersAccountPage extends BasePage {
    @FindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.RelativeLayout")
    private WebElement accountButton;

    public UsersAccountPage clickOnAccountButton() {
        waitForElementToBeClickable(accountButton);
        accountButton.click();
        return this;
    }
}