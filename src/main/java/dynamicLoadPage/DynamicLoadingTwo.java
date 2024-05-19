package dynamicLoadPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingTwo {

    WebDriver driver;
    WebDriverWait wait;


    public DynamicLoadingTwo(WebDriver driver){
        this.driver = driver;
    }


    public final By startBtnTwo = By.cssSelector("#start > button");


    @Step
    public void clickOnStartBtnTwo(){

        wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(startBtnTwo))).click();
    }
}
