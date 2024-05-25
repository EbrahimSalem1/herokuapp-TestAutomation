package entryAdPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAd {
    WebDriver driver;
    WebDriverWait wait;

    public EntryAd(WebDriver driver){
        this.driver = driver;
    }

    private By entryAdCloseBtn = By.xpath("//p[normalize-space()='Close']");
    private final By getEntryAdText = By.cssSelector("div[class='example'] h3");





    @Step
    public void clickOnEntryAdCloseBtn(){
        wait = new WebDriverWait(driver , Duration.ofSeconds(7));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(entryAdCloseBtn)));
        driver.findElement(entryAdCloseBtn).click();
    }

    @Step
    public String getEntryAdTxt(){
        return driver.findElement(getEntryAdText).getText();
    }
}
