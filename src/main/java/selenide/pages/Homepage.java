package selenide.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class Homepage contains all homepage locators and methods.
 */
public class Homepage extends Page {

    // locators
    private static final By searchCityField = By.cssSelector("[class='gtjh6w-3 tsxAj']");
    private static final By searchRestaurantField = By.cssSelector("[class='gtjh6w-3 hcihFO']");
    private static final By findBtn = By.xpath("//*[@data-qa='button-search-find-hero']");

    // methods
    public SignUpPage clickOnSignUpBtn() {
        $(signUpBtn).click();
        return page(SignUpPage.class);
    }

    public LoginPage clickOnLoginBtn() {
        $(loginBtn).click();
        return page(LoginPage.class);
    }

    public void userIconPresent() {
        $(userIcon).should(Condition.exist);
    }

    public FilterPage searchRestaurant(String restName,String cityName){
        $(searchRestaurantField).setValue(restName);
        $(searchCityField).setValue(cityName);
        $(findBtn).click();
        return page(FilterPage.class);
    }
}