package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InvestPage extends PageObject{

    public InvestPage(WebDriver driver){
        super(driver);
    }
@FindBy(css = ".m-quotes-tv-chart__view.chart-view")
    WebElement chart;
//@FindBy(css = ".a-quotes-button[data-value='1min']")
//    WebElement interval1Min;
//    @FindBy(css = ".a-quotes-button[data-value='1min'].-active")
//    WebElement checkInterval1Min;
//@FindBy(css = ".a-quotes-button[data-value='5min']")
//    WebElement interval5Min;
//    @FindBy(css = ".a-quotes-button[data-value='5min'].-active")
//    WebElement checkInterval5Min;
//@FindBy(css = ".a-quotes-button[data-value='15min']")
//    WebElement interval15Min;
//    @FindBy(css = ".a-quotes-button[data-value='15min'].-active")
//    WebElement checkInterval15Min;
//@FindBy(css = ".a-quotes-button[data-value='30min']")
//    WebElement interval30Min;
//    @FindBy(css = ".a-quotes-button[data-value='30min'].-active")
//    WebElement checkInterval30Min;
//@FindBy(css = ".a-quotes-button[data-value='1h']")
//    WebElement interval1H;
//    @FindBy(css = ".a-quotes-button[data-value='1h'].-active")
//    WebElement checkInterval1H;
//@FindBy(xpath = "(//*[@class='m-quotes-option__buttons']/*[@data-value='1D'])[2]")
//    WebElement interval1D;
//@FindBy(css = ".a-quotes-button[data-value='1D'].-active")
//    WebElement checkInterval1D;
//@FindBy(xpath = "(//*[@class='m-quotes-option__buttons']//*[contains(text(),'1T')])[2]")
//    WebElement interval1W;
//@FindBy(css = ".a-quotes-button[data-value='1W'].-active")
//    WebElement checkInterval1W;
//@FindBy(xpath = "(//*[@class='m-quotes-option__buttons']//*[contains(text(),'1M')])[2]")
//    WebElement interval1M;
//@FindBy(css = ".a-quotes-button[data-value='1M'].-active")
//    WebElement checkInterval1M;
@FindBy(css = ".m-quotes-option.-range")
        WebElement timeSection;
@FindBy(css = "ul.m-link-with-image-list")
        WebElement newestNews;


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//    public void changeTime(String time){
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("div.a-quotes-button[data-value='"+ time+"']"))));
//        driver.findElement(By.cssSelector("div.a-quotes-button[data-value='"+ time+"']")).click();
//    }
    public void additionalFunction(String function){
        wait.until(ExpectedConditions.visibilityOf(chart));
        driver.findElement(By.cssSelector(".a-quotes-button[data-value='"+function+"']")).click();
    }
//    public void changeTheme(String theme){
//        wait.until(ExpectedConditions.visibilityOf(chart));
//        driver.findElement(By.cssSelector(".a-quotes-button[data-value='"+theme+"']")).click();
//    }
    public void changeChartType(String chartType){
        wait.until(ExpectedConditions.visibilityOf(chart));
        driver.findElement(By.cssSelector(".a-quotes-button.-"+ chartType)).click();
    }
    public void changeScale(String scale){
        wait.until(ExpectedConditions.visibilityOf(chart));
        driver.findElement(By.cssSelector(".a-quotes-button.-"+scale)).click();
    }

//    public void changeInterval(String interval) throws InterruptedException {
//
//
//        switch (interval){
//            case "1min":
//                wait.until(ExpectedConditions.elementToBeClickable(interval1Min));
//                interval1Min.click();
//                break;
//            case "5min":
//                wait.until(ExpectedConditions.elementToBeClickable(interval5Min));
//                interval5Min.click();
//                break;
//            case "15min":
//                wait.until(ExpectedConditions.elementToBeClickable(interval15Min));
//                interval15Min.click();
//                break;
//            case "30min":
//                wait.until(ExpectedConditions.elementToBeClickable(interval30Min));
//                interval30Min.click();
//                break;
//            case "1H":
//                wait.until(ExpectedConditions.elementToBeClickable(interval1H));
//                interval1H.click();
//                break;
//            case "1D":
//                Thread.sleep(10000);
//                wait.until(ExpectedConditions.elementToBeClickable(interval1D));
//                interval1D.click();
//                break;
//            case "1W":
//                wait.until(ExpectedConditions.elementToBeClickable(interval1W));
//                interval1W.click();
//                break;
//            case "1M":
//                wait.until(ExpectedConditions.elementToBeClickable(interval1M));
//                interval1M.click();
//                break;
//        }
//    }

    public boolean checkOnInvestPage(){
        wait.until(ExpectedConditions.visibilityOf(timeSection));
        return timeSection.isDisplayed();
    }
//    public boolean checkTime(String time){
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.a-quotes-button[data-value='"+ time+"'].-active"))));
//        return driver.findElement(By.cssSelector("div.a-quotes-button[data-value='"+ time+"'].-active")).isDisplayed();
//
//    }
    public boolean checkChartType(String chartType){
        wait.until(ExpectedConditions.visibilityOf(chart));
        return driver.findElement(By.cssSelector(".a-quotes-button.-"+ chartType+".-active")).isDisplayed();
}
    public boolean checkScaleType(String scale){
        wait.until(ExpectedConditions.visibilityOf(chart));
        return driver.findElement(By.cssSelector(".a-quotes-button.-"+ scale+".-active")).isDisplayed();
    }
//    public boolean checkInterval(String interval){
//
//
//        if (interval.equals("1min")) {
//            wait.until(ExpectedConditions.elementToBeClickable(interval1Min));
//            return checkInterval1Min.isDisplayed();
//        }
//            else if (interval.equals("5min")) {
//            wait.until(ExpectedConditions.elementToBeClickable(interval5Min));
//               return checkInterval5Min.isDisplayed();
//            }
//            else if (interval.equals("15min")) {
//            wait.until(ExpectedConditions.elementToBeClickable(interval15Min));
//                return checkInterval15Min.isDisplayed();
//            }
//            else if (interval.equals("30min")) {
//            wait.until(ExpectedConditions.elementToBeClickable(interval30Min));
//                return checkInterval30Min.isDisplayed();
//            }
//        else if (interval.equals("1H")) {
//            wait.until(ExpectedConditions.elementToBeClickable(interval1H));
//            return checkInterval1H.isDisplayed();
//        }
//        else if (interval.equals("1D")) {
//            wait.until(ExpectedConditions.elementToBeClickable(interval1D));
//            return checkInterval1D.isDisplayed();
//        }
//        else if (interval.equals("1W")) {
//            wait.until(ExpectedConditions.elementToBeClickable(interval1W));
//            return checkInterval1W.isDisplayed();
//        }
//        else if (interval.equals("1M")) {
//            wait.until(ExpectedConditions.elementToBeClickable(interval1M));
//            return checkInterval1M.isDisplayed();
//        }
//        else {
//            return false;
//        }
//    }
//    public boolean checkTheme(String theme){
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".a-quotes-button[data-value='"+theme+"']")));
//        return driver.findElement(By.cssSelector(".a-quotes-button[data-value='"+theme+"'].-active")).isDisplayed();
//    }
    public boolean checkNews(){
        wait.until(ExpectedConditions.visibilityOf(newestNews));
        return newestNews.isDisplayed();
    }
}
