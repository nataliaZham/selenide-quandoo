package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class RestaurantPage contains all restaurant page locators and methods.
 */
public class RestaurantPage extends Page {

    //locators
    private static final By chooseDateField = By.xpath("//*[@data-qa='widget-date-picker-selection']");
    private static final By nextMonth = By.xpath("//*[@data-qa='day-picker-navbar-next']");
    private static final By firstDayOfTheMonth = By.xpath("//*[@class='DayPicker-Day'][@tabindex='-1']");
    private static final By reserveTableBtn = By.xpath("//*[@data-vwo='reservation-init']");

    //methods
    public void chooseDayAndTimeOfReservation() {
        $(chooseDateField).shouldBe(Condition.visible);
        $(chooseDateField).click();
        $(nextMonth).click();
        $(firstDayOfTheMonth).click();
    }

    public CompleteReservation clickOnReserveTable() {
        $(reserveTableBtn).click();
        return page(CompleteReservation.class);
    }
}
