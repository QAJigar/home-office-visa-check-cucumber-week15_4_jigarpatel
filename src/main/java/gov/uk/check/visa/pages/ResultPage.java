package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"result-info\"]/div[2]/div/h2")
    WebElement resultMessage;

  public String getResultMessage() {
       return getTextFromElement(resultMessage);
    }
    public void confirmResultMessage(String expectedMessage){
        Assert.assertEquals(getResultMessage(),expectedMessage,"Text Not Found");
    }



}
