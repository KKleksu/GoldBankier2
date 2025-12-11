package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageObject {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='m-menu-list__sublist js-item-container']//*[@class='m-menu-list__subitem']//*[contains(text(),'Surowce')]")
    WebElement marketsSubMenuRawMaterials;
    @FindBy(css = ".m-menu-list__item")
    WebElement menuMarkets;
    @FindBy(css = ".m-home-article-item")
    WebElement homeArticle;
    @FindBy(css = "div.didomi-popup-container")
    WebElement popup;
    @FindBy(css = "#didomi-notice-agree-button")
    WebElement cookieAccept;
    @FindBy(css = ".m-menu-list__item:nth-of-type(4)")
            WebElement menuComparisonSites;
    @FindBy(css = ".m-menu-list__anchor[href*='kredyty-gotowkowe'")
            WebElement comparisonSitesSubMenuCashLoans;
    @FindBy(xpath = "//*[@class='m-menu-list__sublist js-item-container']//*[@class='m-menu-list__subitem']//*[contains(text(),'Waluty')]")
            WebElement marketsSubMenuCurrency;
    @FindBy(xpath = "//*[@class='m-menu-list__sublist js-item-container']//*[@class='m-menu-list__subitem']//*[contains(text(),'Giełda')]")
            WebElement marketsSubMenuStockMarket;


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public RawMaterialsPage goToRawMaterialsPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(menuMarkets);
        actions.moveToElement(marketsSubMenuRawMaterials).click().build().perform();
        return new RawMaterialsPage(driver);
    }
    public StockMarketPage gotoStockMarketPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(menuMarkets);
        actions.moveToElement(marketsSubMenuStockMarket).click().build().perform();
        return new StockMarketPage(driver);
    }
    public ComparisonLoanPage goToComparisonLoanPage(){
        wait.until(ExpectedConditions.visibilityOf(menuComparisonSites));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuComparisonSites);
        actions.moveToElement(comparisonSitesSubMenuCashLoans).click().build().perform();
        return new ComparisonLoanPage(driver);
    }

    public boolean checkOnHomePageWithCookiePopUp() {

        wait.until(ExpectedConditions.visibilityOf(popup));
        popup.click();
        cookieAccept.click();
        wait.until(ExpectedConditions.visibilityOf(homeArticle));
        return homeArticle.isDisplayed();
    }

    public boolean checkOnHomePage() {
        wait.until(ExpectedConditions.visibilityOf(homeArticle));
        return homeArticle.isDisplayed();


    }
    public CurrencyPage goToCurrencyPage(){
        wait.until(ExpectedConditions.visibilityOf(menuMarkets));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuMarkets);
        actions.moveToElement(marketsSubMenuCurrency).click().build().perform();
        return new CurrencyPage(driver);
    }
}
