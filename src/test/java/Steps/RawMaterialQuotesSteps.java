package Steps;

import Pages.RawMaterialQuotesPage;
import Pages.RawMaterialsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RawMaterialQuotesSteps {
   RawMaterialQuotesPage rawMaterialQuotesPage = new RawMaterialQuotesPage(Setup.driver);

@Then("Im on raw material quotes page")
    public void checkOnQuotesPage(){
    Assert.assertTrue(rawMaterialQuotesPage.checkOnQuotesPage());
}
@When("I click on {string} in most important raw materials table")
    public void mostImportantSortBy(String sortBy){
    rawMaterialQuotesPage.sortMostImportatBy(sortBy);
}
@When("I click on {string} in all raw materials table")
    public void allSortBy(String sortBy){
    rawMaterialQuotesPage.sortAllBy(sortBy);
}
@When("I change date of stocks on 3.12.2025")
    public void changeStockDate(){
    rawMaterialQuotesPage.changeStockDate();
}
@Then("Date is changed on 3.12.2025")
    public void checkUpdateDate(){
    Assert.assertTrue(rawMaterialQuotesPage.checkUpdateDate());
}

}
