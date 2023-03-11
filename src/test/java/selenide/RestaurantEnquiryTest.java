package selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import selenide.pages.RestaurantEnquiryPage;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.ENQUIRY_URL;

/**
 * Class RestaurantEnquiryTest contains tests to Send Enquiry functionality
 */
public class RestaurantEnquiryTest {
    //classes
    RestaurantEnquiryPage enqPage;

    @Test
    /**
     * Negative test which ensures that there is no ability to send enquiry without ticking Terms checkbox.
     */
    public void enquiryWithoutTermsAndPrivacy() {
        enqPage = open(ENQUIRY_URL, RestaurantEnquiryPage.class);
        enqPage.accCookies();
        enqPage.sendEnquiryBtnElt().shouldHave(Condition.attribute("disabled"));
        enqPage.chooseEnquiryTimeslot("7:00 pm", "7:30 pm");
        enqPage.fillInDataFields();
        enqPage.sendEnquiryBtnElt().shouldNotHave(Condition.attribute("disabled"));
    }
}