package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class);

    //nationality dropdown list
    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDownList;

    //continue button
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    //country list
    @CacheLookup
    @FindBy(xpath = "//select[@class='govuk-select']//option")
    List<WebElement> countryList;

    //this method will check country is present or not into country dropdown field
    public boolean isCountryDisplayed(String country) {
        List<WebElement> countryOptions = countryList;
        for (WebElement countryOption : countryOptions) {
            if (countryOption.getText().equalsIgnoreCase(country)) {
                return true;
            }
        }
        log.info("Check available countries");
        return false;
    }

    //this method will select nationality
    public void setNationalityDropDownList(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        Reporter.log("Select " + nationality + " nationality from Nationality dropdown field" + nationalityDropDownList.toString());
        log.info("Select " + nationality + " nationality from Nationality dropdown field");
    }

    //this method will click on continue button
    public void clickContinueButton() {
        clickOnElement(continueButton);
        Reporter.log("Click on Continue button" + continueButton.toString());
        log.info("Click on Continue button");
    }
}
