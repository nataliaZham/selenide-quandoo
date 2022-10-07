package selenide.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Abstract class Page contains common locators, data and methods shared within the Quandoo pages.
 */
public abstract class Page {
    // classes
    static Faker faker = new Faker();

    // constant credentials
    public String VALID_EMAIL = "violetaabramova@yandex.ru";
    public static String VALID_PASS = "8vzN$ht4eFuG45$";

    // constant url
    public static String LOCALISATION_EN = "/en";
    public static String BASE_URL = "https://www.quandoo.de" + LOCALISATION_EN;
    public static String ENQUIRY_URL = "https://www.quandoo.de/en/checkout/enquiry?restaurantUrl=cavallino-rosso-306";

    //test data
    public static String REST_NAME = "cavallino rosso";
    public static String CITY_NAME = "Berlin";
    public static String USER_FIRST_NAME = faker.name().firstName();
    public static String USER_LAST_NAME = faker.name().lastName();

    // locators
    private static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    public static final By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    public static final By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");
    public static final By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");

    // Methods
    public void accCookies() {
        $(accCookiesBtn).click();
    }
}
