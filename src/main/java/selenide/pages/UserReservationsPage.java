package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class UserReservationsPage contains all user reservations page locators and methods.
 */
public class UserReservationsPage extends Page {

    //locators
    private static final By editReservationBtn = By.xpath("//button[contains(.,'Edit reservation')]");

    //methods
    public EditReservationPage clickOnEditReservation() {
        $(editReservationBtn).click();
        return page(EditReservationPage.class);
    }
}
