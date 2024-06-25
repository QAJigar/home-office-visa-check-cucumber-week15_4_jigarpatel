package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//input[@name='response' and @value='yes']")  //(xpath = "//*[@id='result-info']/div[2]/div/div/p[5]/a")
    WebElement yes;

    @CacheLookup
    @FindBy(xpath = "//input[@name='response' and @value='no']")
    WebElement no;


  public void clickStartNow() {
        clickOnElement(startNowButton);
    }

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "Yes":
                clickOnElement(yes);
                break;
            case "No":
                clickOnElement(no);
                break;
            default:
                System.out.println("not select any stay time");
        }
    }

    //nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
    //  (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'


}
