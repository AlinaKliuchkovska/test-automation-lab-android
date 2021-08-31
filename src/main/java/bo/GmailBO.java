package bo;

import asserts.AccountPageAsserts;
import gmailpages.*;
import utils.RandomGenerators;

public class GmailBO {
    private final StartPage startPage = new StartPage();
    private final AccountsPage accountsPage = new AccountsPage();
    private final SetUpEmailPage setUpEmailPage = new SetUpEmailPage();
    private final IncomingLettersPage incomingLettersPage = new IncomingLettersPage();
    private final SignInPage signInPage = new SignInPage();
    private final EnterPasswordPage enterPasswordPage = new EnterPasswordPage();
    private final ConfirmationPage confirmationPage = new ConfirmationPage();
    private final GoogleServicesPage googleServicesPage = new GoogleServicesPage();
    private final ComposeLetterPage composeLetterPage = new ComposeLetterPage();
    private final LetterPage letterPage = new LetterPage();
    private final UsersAccountPage usersAccountPage = new UsersAccountPage();
    private final RemoveAccountPage removeAccountPage = new RemoveAccountPage();
    private final RemoveAccountPopup removeAccountPopup = new RemoveAccountPopup();
    private static final String EMAIL = "test.kliuchkovska@gmail.com";
    private static final String PASSWORD = "A1234567890@!";
    AccountPageAsserts asserts = new AccountPageAsserts();

    public GmailBO skipStartPage() {
        startPage.clickOnGotItButton();
        return this;
    }

    public GmailBO addNewAccount() {
        accountsPage.clickOnAddEmailButton();
        setUpEmailPage.clickOnGoogleButton();
        signInPage.enterEmailToEmailInput(EMAIL)
                .clickOnNextButton();
        enterPasswordPage.enterPasswordToPasswordInput(PASSWORD)
                .clickOnNextButton();
        confirmationPage.clickOnConfirmButton();
        googleServicesPage.clickOnAcceptButton();
        return this;
    }

    public GmailBO sendNewLetter() {
        accountsPage.clickOnGoToGmailButton();
        incomingLettersPage.clickOnComposeButton();
        String subject = RandomGenerators.randomStringGenerator();
        String message = RandomGenerators.randomStringGenerator();
        composeLetterPage.enterEmailToEmailInput(EMAIL)
                .enterSubjectToSubjectInput(subject)
                .enterMessageToMessageBodyInput(message)
                .clickOnSendButton();
        incomingLettersPage.clickOnLastMessage(subject);
        return this;
    }

    public GmailBO deleteAccount() {
        letterPage.clickOnNavigateUpButton();
        incomingLettersPage.clickOnMenuButton()
                .clickOnActionBar()
                .clickOnManageAccountButton();
        usersAccountPage.clickOnAccountButton();
        removeAccountPage.clickOnRemoveAccountButton();
        removeAccountPopup.clickOnConfirmRemoveAccountButton();
        return this;
    }
}