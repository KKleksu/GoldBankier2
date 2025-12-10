package Steps;

import Pages.Common;
import Pages.CurrencyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CurrencyPageSteps {
    CurrencyPage currencyPage = new CurrencyPage(Setup.driver);
    Common common = new Common(Setup.driver);

    @Then("Im on currency page")
    public void checkOnCurrencyPage() {
        Assert.assertTrue(currencyPage.checkOnCurrencyPage());
    }

    @When("I click on {string} currency in forex")
    public void changeCurrencyInQuotesSectionForex(String currency) {
        common.changeMainChartCard(currency);
    }

    @Then("I selected {string} currency on quotes section forex")
    public void checkSelectedCurrencyOnQuotesSectionForex(String currency) {
        Assert.assertTrue(common.checkChangeMainChartCard(currency));
    }

    @When("I click on {string} period on currency page")
    public void changePeriodInQuotesSection(String period) {
        common.changePeriod(period);
    }

    @Then("Currency period is changed to {string}")
    public void checkSelectedPeroidInQuotesSection(String period) throws InterruptedException {
        Assert.assertTrue(common.checkChangePeriod(period));
    }

    @Then("Currency calculator show value {string}")
    public void checkCurrencyCalculator(String amount) {
        Assert.assertTrue(currencyPage.checkCurrencyCalculatorResult(amount));
    }

    @When("I wanna change {string} {string} to {string}, rate by {string}")
    public void changeCurrency(String amount, String fromCurrency, String toCurrency, String rateBy) {
        currencyPage.sendAmountToCurrencyCalculator(amount);
        currencyPage.chooseChangeFromCurrency(fromCurrency);
        currencyPage.chooseChangeToCurrency(toCurrency);
        currencyPage.changeNbpForex(rateBy);
    }

    @When("I want to change nav chart to {string}")
    public void changeNavChart(String name) {
        common.changeNavTab(name);
    }

    @Then("Nav chart {string} is selected")
    public void checkMainChart(String chartName) {
        Assert.assertTrue(common.checkChangeNavTab(chartName));
    }

    @When("I click on {string} currency in NBP")
    public void changeCurrencyInQuotesSectionNBP(String currency) {
        common.changeMainChartCard(currency);
    }

    @Then("I selected {string} currency on quotes section NBP")
    public void checkSelectedCurrencyOnQuotesSectionNBP(String currency) {
        Assert.assertTrue(common.checkChangeMainChartCard(currency));

    }

    @When("I click on {string} currency in NBP buy, nav number {string}")
    public void changeCurrencyInQuotesSectionNBPbuy(String currency, String numberOfNav) {
        common.changeMainChartCard(currency,numberOfNav);
    }

    @Then("I selected {string} currency on quotes section NBP buy, in this {string} put for EUR 2 rest 1")
    public void checkSelectedCurrencyOnQuotesSectionNBPBuy(String currency,String numberOfNav) {
        Assert.assertTrue(common.checkChangeMainChartCard(currency, numberOfNav));
    }
    @When("I click on {string} currency in NBP sell")
    public void changeCurrencyInQuotesSectionNBPsell(String currency) {
        currencyPage.changeCurrencyOnQuotesSectionNBPSell(currency);
    }
    @Then("I selected {string} currency on quotes section NBP sell")
    public void checkSelectedCurrencyOnQuotesSectionNBPsell(String currency) {
        Assert.assertTrue(currencyPage.checkSelectedCurrency(currency));
    }

}
