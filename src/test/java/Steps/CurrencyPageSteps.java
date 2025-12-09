package Steps;

import Pages.CurrencyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CurrencyPageSteps {
    CurrencyPage currencyPage = new CurrencyPage(Setup.driver);

    @Then("Im on currency page")
    public void checkOnCurrencyPage() {
        Assert.assertTrue(currencyPage.checkOnCurrencyPage());
    }

    @When("I click on {string} currency in forex")
    public void changeCurrencyInQuotesSectionForex(String currency) {
        currencyPage.changeCurrencyOnQuotesSection(currency);
    }

    @Then("I selected {string} currency on quotes section forex")
    public void checkSelectenCurrencyOnQuotesSectionForex(String currency) {
        Assert.assertTrue(currencyPage.checkSelectedCurrency(currency));
    }

    @When("I click on {string} peroid of time")
    public void changePeroidInQuotesSection(String peroid) {
        currencyPage.changePeroidOnQuotesSection(peroid);
    }

    @Then("Peroid is changed to {string}")
    public void checkSelectedPeroidInQuotesSection(String peroid) throws InterruptedException {
        Assert.assertTrue(currencyPage.checkSelectedPeroid(peroid));
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

    @When("I want to change main chart to {string}")
    public void changeMainChart(String name) {
        currencyPage.changeMainNavChart(name);
    }

    @Then("Chart {string} is selected")
    public void checkMainChart(String chartName) {
        Assert.assertTrue(currencyPage.checkMainChartChange(chartName));
    }

    @When("I click on {string} currency in NBP")
    public void changeCurrencyInQuotesSectionNBP(String currency) {
        currencyPage.changeCurrencyOnQuotesSection(currency);
    }

    @Then("I selected {string} currency on quotes section NBP")
    public void checkSelectenCurrencyOnQuotesSectionNBP(String currency) {
        Assert.assertTrue(currencyPage.checkSelectedCurrency(currency));

    }

    @When("I click on {string} currency in NBP buy")
    public void changeCurrencyInQuotesSectionNBPbuy(String currency) {
        currencyPage.changeCurrencyOnQuotesSectionNBPBuy(currency);
    }

    @Then("I selected {string} currency on quotes section NBP buy")
    public void checkSelectenCurrencyOnQuotesSectionNBPBuy(String currency) {
        Assert.assertTrue(currencyPage.checkSelectedCurrency(currency));
    }
    @When("I click on {string} currency in NBP sell")
    public void changeCurrencyInQuotesSectionNBPsell(String currency) {
        currencyPage.changeCurrencyOnQuotesSectionNBPSell(currency);
    }
    @Then("I selected {string} currency on quotes section NBP sell")
    public void checkSelectenCurrencyOnQuotesSectionNBPsell(String currency) {
        Assert.assertTrue(currencyPage.checkSelectedCurrency(currency));
    }
}
