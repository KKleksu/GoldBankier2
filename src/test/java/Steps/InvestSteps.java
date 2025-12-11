package Steps;

import Pages.Common;
import Pages.InvestPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InvestSteps {
    InvestPage investPage = new InvestPage(Setup.driver);
    Common common = new Common(Setup.driver);

@Then("Im on invest page")
    public void imOnInvestPage(){
    Assert.assertTrue(investPage.checkOnInvestPage());
}
@When("I click on {string} period on invest gold page")
    public void clickOnPeriod(String period){
    common.changePeriod(period);
}
@Then("Period on invest gold page is changed to {string}")
    public void checkTimeChanged(String period) throws InterruptedException {
    Assert.assertTrue(common.checkChangePeriod(period));
}
@When("I click on Chart: {string}")
    public void clickOnChart(String chartType){
    investPage.changeChartType(chartType);
}
@Then("Chart is changed to {string}")
    public void checkChartChanged(String chartType){
        Assert.assertTrue(investPage.checkChartType(chartType));
    }
@When("I click on Skale: {string}")
    public void clickOnSkale(String scale){
    investPage.changeScale(scale);
}
@Then("Scale is changed to {string}")
    public void checkScaleChanged(String scale){
    Assert.assertTrue(investPage.checkScaleType(scale));
}
@When("In invest page i click on interval: {string}")
    public void changeInterval(String interval) throws InterruptedException {
    common.changeInterval(interval);
}
@Then("In invest page its {string} and interval is changed to {string}")
    public void checkIntervalChange(String interval, String time){
    Assert.assertTrue(common.checkChangeInterval(interval,time));
}
@When("In invest page i click on theme: {string}")
    public void changeTheme(String theme){
    common.changeThemeInChart(theme);
}
@Then("In invest page theme is changed to {string}")
    public void checkThemeChange(String theme){
    Assert.assertTrue(common.checkThemeInChart(theme));
    }
@Then("Newest news are visible")
    public void checkNews(){
    Assert.assertTrue(investPage.checkNews());
}
}
