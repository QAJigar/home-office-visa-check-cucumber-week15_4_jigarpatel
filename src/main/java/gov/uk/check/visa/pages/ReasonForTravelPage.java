package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {


    @CacheLookup
    @FindBy(id="response-0")
    WebElement reasonForVisitListTourism;

    @CacheLookup
    @FindBy(id="response-1")
    WebElement reasonForVisitListWork;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement reasonForVisitListJoin;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectReasonForVisit(String reason) {
        switch (reason) {
            case "Tourism":
                clickOnElement(reasonForVisitListTourism);
                break;
            case "Work, academic visit or business":
                clickOnElement(reasonForVisitListWork);
                break;
            case "Join partner or family for a long stay":
                clickOnElement(reasonForVisitListJoin);
            default:
                System.out.println("not select any stay time");
        }
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }
}
