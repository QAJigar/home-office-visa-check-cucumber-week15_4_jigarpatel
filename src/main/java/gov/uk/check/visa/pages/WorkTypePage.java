package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"response-0\"]")
    WebElement selectJobTypeList;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"current-question\"]/button")
    WebElement nextStepButton;

    public void selectJobType(String job){
        clickOnElement(selectJobTypeList);
    }
  public  void clickNextStepButton(){
        clickOnElement(nextStepButton);
  }


}
