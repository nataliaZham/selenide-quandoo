package selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import selenide.pages.Homepage;
import selenide.pages.SignUpPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Class SignUpTest contains tests for the Sign Up functionality
 */
public class SignUpTest {

    //classes
    Homepage homepage;
    SignUpPage signUpPage;

    @Test
    /**
     * Negative test which ensures that there is no ability to sign up without ticking Terms checkbox.
     */
    public void signUpWithoutTermsAndPrivacy() {
        homepage = open("https://www.quandoo.de/en", Homepage.class);
        homepage.accCookies();
        signUpPage = homepage.clickOnSignUpBtn();
        signUpPage.fillInSignUpFields();
        signUpPage.clickOnCreateAccountBtn();
        signUpPage.createAccountBtnEl().should(Condition.visible);
    }
}