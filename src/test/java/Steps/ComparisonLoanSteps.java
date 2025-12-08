package Steps;

import Pages.ComparisonLoanPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComparisonLoanSteps {
    ComparisonLoanPage comparisonLoanPage = new ComparisonLoanPage(Setup.driver);

    @Then("Im on cash loan comparison page")
    public void checkOnLoanComparisonPage(){
        Assert.assertTrue(comparisonLoanPage.checkOnLoanComparisonPage());
    }
@When("I want to take {string} loan")
    public void sendKeysToLoan(String amount){
        comparisonLoanPage.sendLoanAmount(amount);

}
@When("I want loan to be on {string} months")
      public void sendKeysToPeroid(String months) {
    comparisonLoanPage.sendLoanPeroid(months);
    comparisonLoanPage.serchLoanOffers();
}
@Then("Site show {float} me offers")
    public void checkSearch(Float amount) throws InterruptedException {
        Assert.assertTrue(comparisonLoanPage.checkSerchedLoanOffers(amount));
}
@When("I want to change main filter {string} and sub filter {string}")
    public void setFilters(String mainFilter, String subFilter){
        comparisonLoanPage.chooseFiltersInTable(mainFilter, subFilter);
}
@Then("Main Filter {string} and sub filter {string} are selected")
    public void checkFilters(String mainFilter, String subFilter) throws InterruptedException {
        Assert.assertTrue(comparisonLoanPage.checkChooseFiltersInTable(mainFilter, subFilter));
}
}
