import asserts.AccountPageAsserts;
import asserts.LetterPageAsserts;
import bo.GmailBO;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailTests extends BaseTest {
    GmailBO gmailBO = new GmailBO();
    AccountPageAsserts accountPageAsserts = new AccountPageAsserts();
    LetterPageAsserts letterPageAsserts = new LetterPageAsserts();
    private static final String EXPECTED_NAME = "Test Kliuchkovska";

    @BeforeMethod
    public void addAccount() {
        gmailBO.skipStartPage()
                .addNewAccount();
        accountPageAsserts.accountNameIs(EXPECTED_NAME);
    }

    @Test
    public void verifyThatSenderNameIsAsExpected() {
        gmailBO.sendNewLetter();
        letterPageAsserts.senderNameIs(EXPECTED_NAME);
    }

    @AfterMethod
    public void deleteAccount() {
        gmailBO.deleteAccount();
    }
}