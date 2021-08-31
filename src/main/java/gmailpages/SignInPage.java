package gmailpages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//*[contains(@content-desc, 'Sign in')]//android.widget.EditText")
    private WebElement emailInput;

    public SignInPage clickOnNextButton() {
        touchActionTap(914, 1886);
        return this;
    }

    public SignInPage enterEmailToEmailInput(String email) {
        waitForVisibilityOfElement(emailInput);
        emailInput.sendKeys(email);
        return this;
    }
}
