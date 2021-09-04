package tests;

import asserts.EnterPasswordPageAsserts;
import bo.GmailBO;
import csvreader.CSVReaderUsers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailTestWithDataProvider extends BaseTest {
    @DataProvider
    public Object[][] users() {
        return CSVReaderUsers.usersDataSet();
    }

    @Test(dataProvider = "users")
    public void logInTest(String email, String password, String isErrorMessageDisplayed) {
        new GmailBO().skipStartPage()
                .logIn(email, password);
        new EnterPasswordPageAsserts().isWrongPasswordMessageDisplayed(Boolean.parseBoolean(isErrorMessageDisplayed));
    }
}