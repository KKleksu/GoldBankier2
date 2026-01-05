package Steps;

import Pages.Common;
import Pages.StockMarketPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StockMarketSteps{
    StockMarketPage stockMarketPage = new StockMarketPage(Setup.driver);
    Common common = new Common(Setup.driver);


@Then("Im on stock market page")
    public void checkOnStockMarket(){
    Assert.assertTrue(stockMarketPage.checkImOnStockMarket());
    }
    @When("In stock market i click on {string} nav tab")
    public void changeNavTabStockMarket(String name){
    common.changeNavTab(name);
    }
    @Then("In stock market nav tab is changed to {string}")
    public void checkChangeNavTabStockMarket(String navName){
    Assert.assertTrue(common.checkChangeNavTab(navName));
    }
    @When("In stock market i click on {string} chart card")
    public void changeMainChartCard(String chartName){
    common.changeMainChartCard(chartName);
    }
    @Then("In stock market chart card is changed to {string}")
    public void checkChangeMainChartCard(String chartName){
    Assert.assertTrue(common.checkChangeMainChartCard(chartName));
    }

}
