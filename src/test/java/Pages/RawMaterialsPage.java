package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RawMaterialsPage extends PageObject {

    public RawMaterialsPage(WebDriver driver) {
        super(driver);
    }

@FindBy (css = ".m-quotes-section-quotes-card-list")
    WebElement quotesSection;
@FindBy(xpath = "//*[@class='m-link-list__item']//*[contains(text(),'Notowania')]")
    WebElement quotesPage;
@FindBy(xpath = "//*[@class='m-link-list__item']//*[contains(text(),'Stopy zwrotu')]")
    WebElement ratesOfReturn;
@FindBy(css = ".m-breadcrumbs-list__item")
    WebElement breadCrumbsHomePage;
//@FindBy(css=".m-quotes-section-quotes-card-list__item")
//    WebElement quotesSectionGold;
//@FindBy(css=".m-quotes-section-quotes-card-list__item:nth-of-type(2)")
//    WebElement quotesSectionCooper;
//@FindBy(css=".m-quotes-section-quotes-card-list__item:nth-of-type(3)")
//    WebElement quotesSectionOil;
//@FindBy(css = ".m-quotes-section-quotes-card-list__item:nth-of-type(4)")
//    WebElement quotesSectionSilver;
//@FindBy(xpath = "//*[contains(text(),'Ceny paliw')]")
//        WebElement fuelPriceQuotes;
//@FindBy(css = ".m-quotes-section-quotes-card-list__item>[title='Euro 95']")
//        WebElement quotesEuro95;
//@FindBy(css = ".m-quotes-section-quotes-card-list__item>[title='Superplus 98']")
//        WebElement quotesSuperplus98;
//@FindBy(css = ".m-quotes-section-quotes-card-list__item>[title='Olej napędowy']")
//        WebElement quotesOlejNapedowy;
//@FindBy(css = ".m-quotes-section-quotes-card-list__item>[title='LPG']")
//        WebElement quotesLPG;
//@FindBy(xpath = "//*[@class='m-tabs-nav__item js-section-main-chart-nav -is-active'][contains(text(),'Ceny paliw')]")
//        WebElement fuelPriceQuotesActive;



    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public InvestPage goToInvestPage(String rawMaterial){
    wait.until(ExpectedConditions.visibilityOf(quotesSection));
    driver.findElement(By.xpath("//*[@class='m-quotes-section-quotes-card-list__item']//*[contains(text(),'"+rawMaterial+"')]")).click();
    return new InvestPage(driver);
    }
    public boolean imOnRawMaterialPage(){
        wait.until(ExpectedConditions.visibilityOf(quotesSection));
        return quotesSection.isDisplayed();
    }
    public RawMaterialQuotesPage goToQuotesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(quotesPage));
        quotesPage.click();
        return new RawMaterialQuotesPage(driver);
    }
    public RatesOfReturnPage goToRatesOfReturnPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ratesOfReturn));
        ratesOfReturn.click();
        return new RatesOfReturnPage(driver);
    }
    public HomePage goToHomePageByBreadCrumbs(){
        wait.until(ExpectedConditions.elementToBeClickable(breadCrumbsHomePage));
        breadCrumbsHomePage.click();
        return new HomePage(driver);
    }
//    public void selectRawMaterialOnQuotesSection(String quotesSelectionRawMaterial){
//        switch(quotesSelectionRawMaterial) {
//            case "Złoto":
//                wait.until(ExpectedConditions.elementToBeClickable(quotesSectionGold));
//                quotesSectionGold.click();
//                break;
//            case "Miedź":
//                wait.until(ExpectedConditions.elementToBeClickable(quotesSectionCooper));
//                quotesSectionCooper.click();
//                break;
//            case "Ropa":
//                wait.until(ExpectedConditions.elementToBeClickable(quotesSectionOil));
//                quotesSectionOil.click();
//                break;
//            case "Srebro":
//                wait.until(ExpectedConditions.elementToBeClickable(quotesSectionSilver));
//                quotesSectionSilver.click();
//                break;
//        }
//
//    }
//    public boolean checkRawMaterialQuotesSectionSelection(String quotesCheckRawMaterial){
//        wait.until(ExpectedConditions.elementToBeClickable(quotesSectionSilver));
//        return driver.findElement(By.xpath("//*[@class='m-section-quotes-card -is-active'][@title='"+quotesCheckRawMaterial+"']")).isDisplayed();
//    }
//    public void selectFuelOnQuotesSection(String quotesSelectionRawMaterial){
//        switch(quotesSelectionRawMaterial) {
//            case "Euro 95":
//                wait.until(ExpectedConditions.elementToBeClickable(quotesEuro95));
//                quotesEuro95.click();
//                break;
//            case "Superplus 98":
//                wait.until(ExpectedConditions.elementToBeClickable(quotesSuperplus98));
//                quotesSuperplus98.click();
//                break;
//            case "Olej napędowy":
//                wait.until(ExpectedConditions.elementToBeClickable(quotesOlejNapedowy));
//                quotesOlejNapedowy.click();
//                break;
//            case "LPG":
//                wait.until(ExpectedConditions.elementToBeClickable(quotesLPG));
//                quotesLPG.click();
//                break;
//
//        }
//    }
//    public boolean checkFuelQuotesSectionSelection(String quotesCheckFuel){
//        wait.until(ExpectedConditions.elementToBeClickable(quotesLPG));
//        return driver.findElement(By.xpath("//*[@class='m-section-quotes-card -is-active'][@title='"+quotesCheckFuel+"']")).isDisplayed();
//    }
//
//    public void changeQuotesOnFuel(){
//        wait.until(ExpectedConditions.elementToBeClickable(fuelPriceQuotes));
//        fuelPriceQuotes.click();
//    }
//public boolean checkFuelQuotesActive(){
//        wait.until(ExpectedConditions.visibilityOf(fuelPriceQuotesActive));
//        return fuelPriceQuotesActive.isDisplayed();
//}
}


