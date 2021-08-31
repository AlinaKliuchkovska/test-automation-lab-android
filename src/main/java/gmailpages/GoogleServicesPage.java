package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleServicesPage extends BasePage {

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.Button")
    private WebElement acceptButton;

    public GoogleServicesPage clickOnAcceptButton(){
        waitForElementToBeClickable(acceptButton);
        touchActionTap(889,1906);
        return this;
    }
}
