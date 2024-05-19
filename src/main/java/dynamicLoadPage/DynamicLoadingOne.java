package dynamicLoadPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class DynamicLoadingOne {

    WebDriver driver;

    WebDriverWait wait;

    public DynamicLoadingOne(WebDriver driver){

        this.driver = driver;
    }


    public By startBtnOne = By.cssSelector("#start > button");
    public final By getValidationMs = By.cssSelector("#finish > h4");



    @Step
    public void clickOnStartBtnOne(){
        driver.findElement(startBtnOne).click();
    }

    @Step
    public String getValidationMessage(){
        wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(getValidationMs)));
        return driver.findElement(getValidationMs).getText();
    }

}
