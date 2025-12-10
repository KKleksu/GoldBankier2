package Steps;

import Pages.Common;
import Pages.RatesOfReturnPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RatesOfReturnSteps {
    RatesOfReturnPage ratesOfReturnPage = new RatesOfReturnPage(Setup.driver);
    Common common = new Common(Setup.driver);

    @Then("Im on rates of return page")
    public void checkOnRatesOfReturnPage() {
        Assert.assertTrue(ratesOfReturnPage.checkOnRatesOfReturnPage());
    }

    @When("I click on long term rates of return")
    public void goToLongTermRatesOfReturn() {
        ratesOfReturnPage.goToLongTermRatesOFRetun();
    }

    @Then("Im on long term rates of return")
    public void checkOnLongTermRatesOfReturn() {
        ratesOfReturnPage.checkOnLongTermRatesOfReturn();
    }

    @When("I double click on sort by {string} in short rates of return")
    public void sortShortRatesOfReturnByDesc(String sortBy) {
        common.sortQuotesBy1TableDesc(sortBy);
    }
    @Then("Short rates of return are sorted by {string} desc")
    public void checkSortByDesc(String sortBy) {
        Assert.assertTrue(common.checkSortQuotesDesc(sortBy));
    }

    @When("I click on sort by {string} in short rates of return")
    public void sortShortRatesOfReturnByAsc(String sortBy) {
        common.sortQuotesBy1TableAsc(sortBy);
    }

    @Then("Short rates of return are sorted by {string} asc")
    public void checkSortByAsc(String sortBy) {
        Assert.assertTrue(common.checkSortQuotesAsc(sortBy));
    }

    @When("I click sort by {string} in long rates of return")
    public void sortLongRatesOfReturnByAsc(String sortBy) {
        common.sortQuotesBy1TableAsc(sortBy);
    }
    @Then("Long rates of return are sorted by {string} asc")
    public void checkSortLongRatesOfReturnByAsc(String sortBy){
        Assert.assertTrue(common.checkSortQuotesAsc(sortBy));
    }
    @When("I double click sort by {string} in long rates of return")
    public void sortLongRatesOfReturnByDesc(String sortBy) {
        common.sortQuotesBy1TableDesc(sortBy);
    }
    @Then("Long rates of return are sorted by {string} desc")
    public void checkLongTermSortDesc(String sortBy){
        Assert.assertTrue(common.checkSortQuotesDesc(sortBy));
    }
    @When("I click raw material bread crumbs")
    public void goToRawMaterials(){
        ratesOfReturnPage.goToRawMaterialsPage();
    }
    @When("I click home page bread crumbs")
    public void goToHomePage(){
        ratesOfReturnPage.homePage();
    }
}