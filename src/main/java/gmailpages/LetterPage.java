package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetterPage extends BasePage {

    @FindBy(id = "sender_name")
    private WebElement senderName;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement navigateUpButton;

    public LetterPage clickOnNavigateUpButton(){
        waitForElementToBeClickable(navigateUpButton);
        navigateUpButton.click();
        return this;
    }

    public String getSenderName() {
        return senderName.getText();
    }
}
