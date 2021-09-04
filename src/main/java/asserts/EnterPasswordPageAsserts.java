package asserts;

import gmailpages.EnterPasswordPage;
import org.testng.Assert;

public class EnterPasswordPageAsserts {
    private final EnterPasswordPage enterPasswordPage = new EnterPasswordPage();

    public EnterPasswordPageAsserts isWrongPasswordMessageDisplayed(boolean expected) {
        Assert.assertEquals(enterPasswordPage.isWrongPasswordMessageDisplayed(), expected);
        return this;
    }
}