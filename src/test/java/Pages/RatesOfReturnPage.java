package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RatesOfReturnPage extends PageObject {
    public RatesOfReturnPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='m-menu-list']//*[contains(text(),'Krótkoterminowe stopy zwrotu')]")
    WebElement shortTermRatesOfReturn;
    @FindBy(xpath = "//*[contains(text(),'YTD')]//*[@class='sort-icons']//*[@class='a-icon a-icon-chevron-down']")
    WebElement sortByYTD;
    @FindBy(xpath = "//*[@class='m-menu-list']//*[contains(text(),'Długoterminowe stopy zwrotu')]")
    WebElement longTermRatesOfReturn;
    @FindBy(xpath = "//*[@class='m-menu-list__item -active']//*[contains(text(),'Długoterminowe stopy zwrotu')]")
    WebElement activeLongTermRatesOfReturn;
    @FindBy(xpath = "//*[contains(text(),'10L')]")
    WebElement sortBy10Y;
    @FindBy(css = ".m-quotes-data-table.js-data-table-sticky-header>tbody>:first-of-type>:nth-of-type(10)")
    WebElement termRateOfReturnFirstYTM;
    @FindBy(css = ".m-quotes-data-table.js-data-table-sticky-header>tbody>:nth-of-type(2)>:nth-of-type(10)")
    WebElement getTermRateOfReturnSecondYTM;
    @FindBy(css = ".m-quotes-data-table.js-data-table-sticky-header>tbody>:first-of-type>:nth-of-type(7)>.a-quote-item")
    WebElement termRateOfReturnFirst10Y;
    @FindBy(css = ".m-quotes-data-table.js-data-table-sticky-header>tbody>:nth-of-type(2)>:nth-of-type(7)>.a-quote-item")
    WebElement termRateOfReturnSecond10Y;
    @FindBy(css = ".m-breadcrumbs-list__item:nth-of-type(2)")
    WebElement breadCrumbsRawMaterials;
    @FindBy(css = ".m-breadcrumbs-list__item")
            WebElement breadCrumbsHomePage;


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public boolean checkOnRatesOfReturnPage() {
        wait.until(ExpectedConditions.visibilityOf(shortTermRatesOfReturn));
        return shortTermRatesOfReturn.isDisplayed();
    }

    public boolean checkOnLongTermRatesOfReturn() {
        wait.until(ExpectedConditions.visibilityOf(activeLongTermRatesOfReturn));
        return activeLongTermRatesOfReturn.isDisplayed();
    }

    public boolean checkSortYTMAsc() {
        wait.until(ExpectedConditions.visibilityOf(termRateOfReturnFirstYTM));
        String a = termRateOfReturnFirstYTM.getText();
        a = a.substring(0, a.length() - 1);
        a = a.replace(",", ".");
        float numberA = Float.parseFloat(a);
        String b = getTermRateOfReturnSecondYTM.getText();
        b = b.substring(0, b.length() - 1);
        b = b.replace(",", ".");
        float numberB = Float.parseFloat(b);
        return numberA < numberB;
    }

    public boolean checkSortYTMDesc() {
        wait.until(ExpectedConditions.visibilityOf(termRateOfReturnFirstYTM));
        String a = termRateOfReturnFirstYTM.getText();
        a = a.substring(0, a.length() - 1);
        a = a.replace(",", ".");
        float numberA = Float.parseFloat(a);
        String b = getTermRateOfReturnSecondYTM.getText();
        b = b.substring(0, b.length() - 1);
        b = b.replace(",", ".");
        float numberB = Float.parseFloat(b);
        return numberA > numberB;
    }

    public void sortByYTD() {
        wait.until(ExpectedConditions.elementToBeClickable(sortByYTD));
        sortByYTD.click();
    }

    public void goToLongTermRatesOFRetun() {
        wait.until(ExpectedConditions.elementToBeClickable(longTermRatesOfReturn));
        longTermRatesOfReturn.click();
    }

    public void sortBy10Y() {
        wait.until(ExpectedConditions.elementToBeClickable(sortBy10Y));
        sortBy10Y.click();
    }

    public boolean checkSort10YAsc() {
        wait.until(ExpectedConditions.visibilityOf(termRateOfReturnFirst10Y));
        String a = termRateOfReturnFirst10Y.getText();
        a = a.substring(0, a.length() - 1);
        a = a.replace(",", ".");
        float numberA = Float.parseFloat(a);
        String b = termRateOfReturnSecond10Y.getText();
        b = b.substring(0, b.length() - 1);
        b = b.replace(",", ".");
        float numberB = Float.parseFloat(b);
        return numberA < numberB;
    }

    public boolean checkSort10YDesc() {
        wait.until(ExpectedConditions.visibilityOf(termRateOfReturnFirst10Y));
        String a = termRateOfReturnFirst10Y.getText();
        a = a.substring(0, a.length() - 1);
        a = a.replace(",", ".");
        float numberA = Float.parseFloat(a);
        String b = termRateOfReturnSecond10Y.getText();
        b = b.substring(0, b.length() - 1);
        b = b.replace(",", ".");
        float numberB = Float.parseFloat(b);
        return numberA > numberB;
    }
    public RawMaterialsPage goToRawMaterialsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(breadCrumbsRawMaterials));
        breadCrumbsRawMaterials.click();
        return new RawMaterialsPage(driver);
    }
    public HomePage homePage(){
        wait.until(ExpectedConditions.elementToBeClickable(breadCrumbsHomePage));
        breadCrumbsHomePage.click();
        return new HomePage(driver);
    }

}


