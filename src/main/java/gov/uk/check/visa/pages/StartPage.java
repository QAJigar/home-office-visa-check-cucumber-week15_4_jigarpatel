package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class);

    //accept cookies
    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button' and @data-track-action ='Cookie banner accepted']")
    WebElement acceptAdditionalCookiesButton;

    //hide cookies message
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideThisMessageCookiesButton;

    //startNow button
    @CacheLookup
    @FindBy(className = "govuk-button--start")
    WebElement startNowButton;


    //this method will click on Accept cookies button
    public void clickAcceptAdditionalCookies() {
        clickOnElement(acceptAdditionalCookiesButton);
        Reporter.log("Click on additional cookies" + acceptAdditionalCookiesButton.toString());
        log.info("Click on additional cookies");
    }

    public void clickHideThisMessage() {
        clickOnElement(hideThisMessageCookiesButton);
        Reporter.log("Click on hide this messa" + hideThisMessageCookiesButton.toString());
        log.info("Click on hide this message");
    }

    public void clickStartsNow() {
        clickOnElement(startNowButton);
        Reporter.log("Click on StartNow Button" + startNowButton.toString());
        log.info("click on StartNow button");
    }
}
