package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CurrencyPage extends PageObject{
    public CurrencyPage (WebDriver driver){super(driver);}

@FindBy(css = ".o-quotes-profile-currencies-calculator-aside-box__content")
    WebElement currencyCalculatorBox;
    @FindBy(css = ".m-quotes-loading__container.chart-loading.-hide")
            WebElement chart;
    @FindBy(xpath = "//*[@class='m-input-field-area']//*[@name='amount']")
            WebElement currencyAmountCalculator;
    @FindBy(css = ".m-tabs-nav")
            WebElement navigationTabsChart;







    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


    public void changeCurrencyOnQuotesSection(String currency){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        driver.findElement(By.xpath("//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='"+currency+"']")).click();

    }
    public void changeCurrencyOnQuotesSectionNBPBuy(String currency){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        driver.findElement(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='"+currency+"'])[2]")).click();

    }
    public void changeCurrencyOnQuotesSectionNBPSell(String currency){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        driver.findElement(By.xpath("(//*[@class='m-quotes-section-quotes-card-list__item']//*[@title='"+currency+"'])[3]")).click();

    }

    public void changePeroidOnQuotesSection(String peroid){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@data-value='"+peroid+"']")).click();
    }
    public void sendAmountToCurrencyCalculator(String amount){
        wait.until(ExpectedConditions.visibilityOf(currencyAmountCalculator));
        currencyAmountCalculator.clear();
        currencyAmountCalculator.sendKeys(amount);
    }
    public void chooseChangeFromCurrency(String fromCurrency){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        driver.findElement(By.xpath("//*[@name='currency_i_have']//*[@value='"+fromCurrency+"']")).click();
    }
    public void chooseChangeToCurrency(String toCurrency){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        driver.findElement(By.xpath("//*[@name='currency_i_want']//*[@value='"+toCurrency+"']")).click();
    }
    public void changeNbpForex(String currencyBy){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        driver.findElement(By.cssSelector("option[value='"+currencyBy+"']"));
    }
    public void changeMainNavChart(String name){
        wait.until(ExpectedConditions.visibilityOf(navigationTabsChart));
        driver.findElement(By.xpath("//*[@class='m-tabs-nav__item js-section-main-chart-nav'][contains(text(),'"+name+"')]")).click();
    }

    public boolean checkSelectedCurrency(String currency){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        return driver.findElement(By.xpath("//*[@class='m-quotes-section-quotes-card-list__item']//*[@class='m-section-quotes-card -is-active'][@title='"+currency+"']")).isDisplayed();
    }


    public boolean checkOnCurrencyPage(){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        return currencyCalculatorBox.isDisplayed();
    }
    public boolean checkSelectedPeroid(String peroid) throws InterruptedException {
        Thread.sleep(3000);
        if (peroid.equals("6M")){
            return driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@class='a-quotes-button md-show -"+peroid+" -active'][@data-value='"+peroid+"']")).isDisplayed();
        } else if (peroid.equals("5Y")) {
            return driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@class='a-quotes-button md-show -"+peroid+" -active'][@data-value='"+peroid+"']")).isDisplayed();
        } else if (peroid.equals("Max")) {
            return driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@class='a-quotes-button md-show -"+peroid+" -active'][@data-value='"+peroid+"']")).isDisplayed();
        }else {
        return driver.findElement(By.xpath("//*[@class='m-quotes-option__buttons']//*[@class='a-quotes-button -"+peroid+" -active'][@data-value='"+peroid+"']")).isDisplayed();
    }
    }
public boolean checkCurrencyCalculatorResult(String amount){
        wait.until(ExpectedConditions.visibilityOf(currencyCalculatorBox));
        String a=driver.findElement(By.xpath("//div[@class='o-quotes-profile-currencies-calculator-aside-box__results-value']")).getText();
        a=a.substring(a.length()-3,a.length());
        return amount.equals(a);
}
public boolean checkMainChartChange(String chartName){
        wait.until(ExpectedConditions.visibilityOf(navigationTabsChart));
        return driver.findElement(By.xpath("//*[@class='m-tabs-nav__item js-section-main-chart-nav -is-active'][contains(text(),'"+chartName+"')]")).isDisplayed();
}
}
