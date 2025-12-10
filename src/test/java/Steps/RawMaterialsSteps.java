package Steps;

import Pages.Common;
import Pages.RawMaterialsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;

public class RawMaterialsSteps {
    RawMaterialsPage rawMaterialsPage = new RawMaterialsPage(Setup.driver);
    Common common = new Common(Setup.driver);

    @Then("Im on raw material page")
    public void imOnRawMaterialPage() {
        Assert.assertTrue(rawMaterialsPage.imOnRawMaterialPage());
    }

    @When("I click on {string}")
    public void goToMaterial(String material) {
        rawMaterialsPage.goToInvestPage(material);

    }

    @When("I click on Quotes")
    public void goToQutes() {
        rawMaterialsPage.goToQuotesPage();
    }

    @When("I click on rates of return")
    public void goToRatesOfReturn() {
        rawMaterialsPage.goToRatesOfReturnPage();
    }

    @When("I click on home page bread crumbs")
    public void goToHomePageByBreadCrumbs() {
        rawMaterialsPage.goToHomePageByBreadCrumbs();
    }

    @When("I click on {string} material in quotes section")
    public void selectRawMaterialInQuotes(String quotesSelectionRawMaterial) {
        common.changeMainChartCard(quotesSelectionRawMaterial);
    }

    @Then("Selected raw material is {string}")
    public void checkSelectedRawMaterial(String quotesCheckRawMaterial) {
        Assert.assertTrue(common.checkChangeMainChartCard(quotesCheckRawMaterial));
    }

    @When("I click on {string} in fuel quotes section")
    public void selectFuelInQuotes(String quotesSelectionFuel) {
        common.changeMainChartCard(quotesSelectionFuel);
    }

    @Then("Selected fuel is {string}")
    public void checkSelectedFuel(String quotesCheckFuel) {
        Assert.assertTrue(common.checkChangeMainChartCard(quotesCheckFuel));
    }

    @When("I click fuel price")
    public void changeToFuelPrice() {
        common.changeNavTab("Ceny paliw");
    }

    @Then("Fuel price is visible")
    public void checkFuelPriceIsActive() {
        Assert.assertTrue(common.checkChangeNavTab("Ceny paliw"));
    }

    @When("I click on {string} period raw material")
    public void changePeriodRawMaterial(String period) {
        common.changePeriod(period);
    }

    @Then("Raw material period is changed to {string}")
    public void checkChangePeriodRawMaterial(String period) throws InterruptedException {
        Assert.assertTrue(common.checkChangePeriod(period));
    }

    @When("I click on {string} period fuel")
    public void changePeriodFuel(String period) {
        common.changePeriod(period);
    }
    @Then("Fuel period is changed to {string}")
    public void checkChangePeriodFueal(String period) throws InterruptedException {
        Assert.assertTrue(common.checkChangePeriod(period));
    }
}