package Steps;

import Pages.Common;
import Pages.RawMaterialQuotesPage;
import Pages.RawMaterialsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class RawMaterialQuotesSteps {
    RawMaterialQuotesPage rawMaterialQuotesPage = new RawMaterialQuotesPage(Setup.driver);
    Common common = new Common(Setup.driver);

    @Then("Im on raw material quotes page")
    public void checkOnQuotesPage() {
        Assert.assertTrue(rawMaterialQuotesPage.checkOnQuotesPage());
    }

    @When("I click on {string} in most important raw materials table")
    public void mostImportantSortByAsc(String sortBy) {
        common.sortQuotesBy1TableAsc(sortBy);
    }

    @Then("Most important table is sorted asc by {string}")
    public void checkMostImportantSortByAsc(String sortBy) {
        Assert.assertTrue(common.checkSortQuotesAsc(sortBy));
    }

    @When("I double click on {string} in most important raw materials table")
    public void mostImportantSortByDesc(String sortBy) throws InterruptedException {
        common.sortQuotesBy1TableDesc(sortBy);
    }

    @Then("Most important table is sorted desc by {string}")
    public void checkMostImportantSortByDesc(String sortBy) {
        Assert.assertTrue(common.checkSortQuotesDesc(sortBy));
    }

    @When("I click on {string} in all raw materials table")
    public void allSortByAsc(String sortBy) {
        common.sortQuotesBy2TableAsc(sortBy);
    }
    @Then("All raw material table is sorted asc by {string}")
    public void checkAllSortByAsc(String sortBy){
        Assert.assertTrue(common.checkSortQuotesAsc(sortBy));
    }
    @When("I double click on {string} in all raw materials table")
    public void allSortByDesc(String sortBy) {
        common.sortQuotesBy2TableDesc(sortBy);
    }
    @Then("All raw material table is sorted desc by {string}")
    public void checkAllSortByDesc(String sortBy) {
        Assert.assertTrue(common.checkSortQuotesDesc(sortBy));
    }

    @When("I change date of stocks on 3.12.2025")
    public void changeStockDate() {
        rawMaterialQuotesPage.changeStockDate();
    }

    @Then("Date is changed on 3.12.2025")
    public void checkUpdateDate() {
        Assert.assertTrue(rawMaterialQuotesPage.checkUpdateDate());
    }

}
