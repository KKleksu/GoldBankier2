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
}
