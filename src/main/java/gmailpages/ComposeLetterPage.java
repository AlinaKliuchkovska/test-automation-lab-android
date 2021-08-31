package gmailpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ComposeLetterPage extends BasePage {

    @FindBy(id = "to")
    private WebElement toInput;

    @FindBy(id = "subject")
    private WebElement subjectInput;

    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout")
    private WebElement messageBodyInput;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Send']")
    private WebElement sendButton;

    public ComposeLetterPage clickOnSendButton() {
        waitForElementToBeClickable(sendButton);
        touchActionTap(885, 137);
        return this;
    }

    public ComposeLetterPage enterEmailToEmailInput(String email) {
        waitForVisibilityOfElement(toInput);
        toInput.sendKeys(email);
        return this;
    }

    public ComposeLetterPage enterMessageToMessageBodyInput(String messageBody) {
        waitForVisibilityOfElement(messageBodyInput);
        messageBodyInput.click();
        Actions action = new Actions(driver);
        action.sendKeys(messageBody).perform();
        return this;
    }

    public ComposeLetterPage enterSubjectToSubjectInput(String subject) {
        waitForVisibilityOfElement(subjectInput);
        subjectInput.sendKeys(subject);
        return this;
    }
}
