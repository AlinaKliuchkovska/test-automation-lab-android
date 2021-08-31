package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    @FindBy(id = "welcome_tour_got_it")
    private WebElement gotItButton;

    public StartPage clickOnGotItButton() {
        waitForElementToBeClickable(gotItButton);
        gotItButton.click();
        return this;
    }
}
