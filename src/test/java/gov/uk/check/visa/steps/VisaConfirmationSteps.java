package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationSteps {

    @Given("I am on uk visa check home page")
    public void i_am_on_uk_visa_check_home_page() {

    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartsNow();
    }

    @And("I Select a Nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().setNationalityDropDownList(nationality);
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickContinueButton();
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new ReasonForTravelPage().clickNextStepButton();
    }

    @Then("verify result {string}")
    public void verifyResult(String result) {
        new ResultPage().confirmResultMessage(result);
    }

    @And("Select intendent to stay for {string}")
    public void selectIntendentToStayFor(String duration) {
        new DurationOfStayPage().selectLengthOfStay(duration);
    }

    @And("Select have planning to work for {string}")
    public void selectHavePlanningToWorkFor(String workType) {
        new WorkTypePage().selectJobType(workType);
    }

    @And("Select state My partner of family member have uk immigration status {string}")
    public void selectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String status) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }

    @And("Select reason {string}")
    public void selectReason(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);

    }
}
