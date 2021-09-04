package gmailpages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterPasswordPage extends BasePage{

    @FindBy(xpath = "//*[contains(@content-desc,'Hi Test')]//android.widget.EditText")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[contains(@content-desc, 'Wrong password')]")
    private WebElement wrongPasswordMessage;

    public EnterPasswordPage enterPasswordToPasswordInput(String password) {
        waitForVisibilityOfElement(passwordInput);
        passwordInput.sendKeys(password);
        return this;
    }

    public boolean isWrongPasswordMessageDisplayed(){
        try {
            return wrongPasswordMessage.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public EnterPasswordPage clickOnNextButton() {
        touchActionTap(889, 1212);
        return this;
    }
}