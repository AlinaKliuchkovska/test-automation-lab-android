package tests;

import asserts.AccountPageAsserts;
import asserts.LetterPageAsserts;
import bo.GmailBO;
import csvreader.CSVReaderUsers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailTests extends BaseTest {
    private final GmailBO gmailBO = new GmailBO();
    private final AccountPageAsserts accountPageAsserts = new AccountPageAsserts();
    private final LetterPageAsserts letterPageAsserts = new LetterPageAsserts();
    private static final String EXPECTED_NAME = "Test Kliuchkovska";
    private static final String EMAIL = "test.kliuchkovska@gmail.com";
    private static final String PASSWORD = "A1234567890@!";

    @BeforeMethod
    public void addAccount() {
        gmailBO.skipStartPage()
                .addNewAccount(EMAIL, PASSWORD);
        accountPageAsserts.accountNameIs(EXPECTED_NAME);
    }

    @Test
    public void verifyThatSenderNameIsAsExpected() {
        gmailBO.sendNewLetter(EMAIL);
        letterPageAsserts.senderNameIs(EXPECTED_NAME);
    }

    @AfterMethod
    public void deleteAccount() {
        gmailBO.deleteAccount();
    }
}