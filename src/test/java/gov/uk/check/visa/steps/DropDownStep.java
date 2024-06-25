package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.List;

public class DropDownStep {
    private static final Logger log = Logger.getLogger(DropDownStep.class);



    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
        List<List<String>> expectedCountries = dataTable.asLists(String.class);
        for (List<String> expectedCountryList : expectedCountries){
            for (String expectedCountry : expectedCountryList){
                boolean isCountryDisplayed = new SelectNationalityPage().isCountryDisplayed(expectedCountry);
                Assert.assertTrue(isCountryDisplayed,expectedCountry + " is present in dropdown");
            }
        }
    }

}
