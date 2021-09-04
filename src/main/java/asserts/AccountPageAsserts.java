package asserts;

import gmailpages.AccountsPage;
import org.testng.Assert;

public class AccountPageAsserts {
    private final AccountsPage accountsPage = new AccountsPage();

    public AccountPageAsserts accountNameIs(String expectedName) {
        Assert.assertEquals(accountsPage.getAccountName(), expectedName);
        return this;
    }
}