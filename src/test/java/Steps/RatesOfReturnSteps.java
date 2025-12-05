package Steps;

import Pages.RatesOfReturnPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RatesOfReturnSteps {
    RatesOfReturnPage ratesOfReturnPage = new RatesOfReturnPage(Setup.driver);

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


    @Then("Short term is sorted by desc")
    public void checkSortByDesc() {
        Assert.assertTrue(ratesOfReturnPage.checkSortYTMDesc());
    }

    @When("I click on sort by YTD")
    public void sortRatesByYTD() {
        ratesOfReturnPage.sortByYTD();
    }

    @Then("Short term sorted by asc")
    public void checkSortByAsc() {
        Assert.assertTrue(ratesOfReturnPage.checkSortYTMAsc());
    }

    @When("I click on 10Y")
    public void sortLongTermBy10Y() {
        ratesOfReturnPage.sortBy10Y();
    }
    @Then("Long term is sorted asc")
    public void checkLongTermSortAsc(){
        Assert.assertTrue(ratesOfReturnPage.checkSort10YAsc());
    }
    @Then("Long term is sorted desc")
    public void checkLongTermSortDesc(){
        Assert.assertTrue(ratesOfReturnPage.checkSort10YDesc());
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