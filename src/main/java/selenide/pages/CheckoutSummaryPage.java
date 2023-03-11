package selenide.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class CheckoutSummaryPage contains all checkout summary page locators and methods.
 */
public class CheckoutSummaryPage extends Page {

    //locators
    private static final By userProfileBtn = By.xpath("//*[@data-qa='header-navigation-profile']");

    //methods
    public ProfilePage clickOnProfileBtn() {
        $(userIcon).click();
        $(userProfileBtn).click();
        return page(ProfilePage.class);
    }
}
