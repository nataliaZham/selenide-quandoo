package selenide.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class ProfilePage contains all profile page locators and methods.
 */
public class ProfilePage extends Page {

    //locators
    private static final By firstNameField = By.xpath("//*[@data-qa='edit-first-name']");
    private static final By lastNameField = By.xpath("//*[@data-qa='edit-last-name']");
    private static final By saveChangesBtn = By.xpath("//*[@data-qa='edit-profile-btn']");
    private static final By userReservationsBtn = By.xpath("//*[@data-qa='navigation-reservations']");

    //methods
    public void changeFirstAndLastName(String firstName, String lastName) {
        $(firstName).clear();
        $(lastName).clear();
        $(firstNameField).setValue(firstName);
        $(lastNameField).setValue(lastName);
        $(saveChangesBtn).click();
    }

    public UserReservationsPage clickOnUserReservationsBtn() {
        $(userReservationsBtn).click();
        return page(UserReservationsPage.class);
    }
}
