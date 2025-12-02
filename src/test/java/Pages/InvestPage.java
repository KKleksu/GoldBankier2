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
@FindBy(css = ".a-quotes-button[data-value='1min']")
    WebElement interval1Min;
@FindBy(css = ".a-quotes-button[data-value='5min']")
    WebElement interval5Min;
@FindBy(css = ".a-quotes-button[data-value='15min']")
    WebElement interval15Min;
@FindBy(css = ".a-quotes-button[data-value='30min']")
    WebElement interval30Min;
@FindBy(css = ".a-quotes-button[data-value='1h']")
    WebElement interval1H;
@FindBy(xpath = "(//*[@class='m-quotes-option__buttons']//*[contains(text(),'1D')])[2]")
    WebElement interval1D;
@FindBy(xpath = "(//*[@class='m-quotes-option__buttons']//*[contains(text(),'1T')])[2]")
    WebElement interval1W;
@FindBy(xpath = "(//*[@class='m-quotes-option__buttons']//*[contains(text(),'1M')])[2]")
    WebElement interval1M;
@FindBy(css = ".m-quotes-option.-range")
        WebElement timeSection;


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public void changeTime(String time){
        wait.until(ExpectedConditions.visibilityOf(chart));
        driver.findElement(By.cssSelector("div.a-quotes-button.-\\3"+ time)).click();
    }
    public void additionalFunction(String function){
        wait.until(ExpectedConditions.visibilityOf(chart));
        driver.findElement(By.cssSelector(".a-quotes-button[data-value='"+function+"']")).click();
    }
    public void changeTheme(String theme){
        wait.until(ExpectedConditions.visibilityOf(chart));
        driver.findElement(By.cssSelector(".a-quotes-button[data-value='"+theme+"']")).click();
    }
    public void changeChartType(String chartType){
        wait.until(ExpectedConditions.visibilityOf(chart));
        driver.findElement(By.cssSelector(".a-quotes-button[data-value='Wykres:"+chartType+"']")).click();
    }
    public void changeInterval(String interval){
        wait.until(ExpectedConditions.visibilityOf(interval1D));

        switch (interval){
            case "1min":
                interval1Min.click();
                break;
            case "5min":
                interval5Min.click();
                break;
            case "15min":
                interval15Min.click();
                break;
            case "30min":
                interval30Min.click();
                break;
            case "1H":
                interval1H.click();
                break;
            case "1D":
                interval1D.click();
                break;
            case "1W":
                interval1W.click();
                break;
            case "1M":
                interval1M.click();
                break;
        }
    }

    public boolean checkOnInvestPage(){
        wait.until(ExpectedConditions.visibilityOf(timeSection));
        return timeSection.isDisplayed();
    }
    public boolean checkTime(String time){
        wait.until(ExpectedConditions.visibilityOf(timeSection));
        return driver.findElement(By.cssSelector("div.a-quotes-button.-\\3"+ time+".-active")).isDisplayed();

    }


}
