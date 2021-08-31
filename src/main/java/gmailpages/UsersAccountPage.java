package gmailpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersAccountPage extends BasePage {
    //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout
    @FindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.RelativeLayout")
    private WebElement accountButton;

    public UsersAccountPage clickOnAccountButton() {
        waitForElementToBeClickable(accountButton);
        accountButton.click();
        return this;
    }
}