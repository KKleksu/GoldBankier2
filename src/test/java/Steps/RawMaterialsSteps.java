package Steps;

import Pages.RawMaterialsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RawMaterialsSteps {
    RawMaterialsPage rawMaterialsPage = new RawMaterialsPage(Setup.driver);

    @Then("Im on raw material page")
    public void imOnRawMaterialPage(){
        Assert.assertTrue(rawMaterialsPage.imOnRawMaterialPage());
    }
    @When("I click on {string}")
    public void goToMaterial(String material){
        rawMaterialsPage.goToInvestPage(material);

    }
    @When("I click on Quotes")
    public void goToQutes(){
        rawMaterialsPage.goToQuotesPage();
    }
    @When("I click on rates of return")
    public void goToRatesOfReturn(){
        rawMaterialsPage.goToRatesOfReturnPage();
    }
    @When("I click on home page bread crumbs")
    public void goToHomePageByBreadCrumbs(){
        rawMaterialsPage.goToHomePageByBreadCrumbs();
    }
    @When("I click on {string} in quotes section")
    public void selectRawMaterialInQuotes(String quotesSelectionRawMaterial){
        rawMaterialsPage.selectRawMaterialOnQuotesSection(quotesSelectionRawMaterial);
    }
    @Then("Selected raw material is {string}")
    public void checkSelectedRawMaterial(String quotesCheckRawMaterial){
        rawMaterialsPage.checkRawMaterialQuotesSectionSelection(quotesCheckRawMaterial);
    }
    @When("I click on {string} in fuel quotes section")
    public void selectFuelInQuotes(String quotesSelectionFuel){
        rawMaterialsPage.selectFuelOnQuotesSection(quotesSelectionFuel);
    }
    @Then("Selected fuel is {string}")
    public void checkSelectedFuel(String quotesCheckFuel){
        rawMaterialsPage.checkFuelQuotesSectionSelection(quotesCheckFuel);
    }
    @When("I click fuel price")
    public void changeToFuelPrice(){
        rawMaterialsPage.changeQuotesOnFuel();
    }
@Then("Fuel price is visible")
    public void checkFuelPriceIsActive(){
        Assert.assertTrue(rawMaterialsPage.checkFuelQuotesActive());
}

}
