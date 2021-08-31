package asserts;

import gmailpages.LetterPage;
import org.testng.Assert;

public class LetterPageAsserts {
    private final LetterPage letterPage = new LetterPage();

    public LetterPageAsserts senderNameIs(String expectedName) {
        Assert.assertEquals(letterPage.getSenderName(), expectedName);
        return this;
    }
}
