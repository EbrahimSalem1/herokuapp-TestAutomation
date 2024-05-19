package dynamicLoadPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLodingPage {


    WebDriver driver;

    public DynamicLodingPage(WebDriver driver){

        this.driver = driver;
    }



    public final By elementExampleOne = By.partialLinkText("Example 1");
    public final By elementExampleTwo = By.partialLinkText("Example 2");





    @Step
    public DynamicLoadingOne clickOnElementExampleOneBtn(){
        driver.findElement(elementExampleOne).click();
        return new DynamicLoadingOne(driver);
    }

    @Step
    public DynamicLoadingTwo clickOnElementExampleTwoBtn(){
        driver.findElement(elementExampleTwo).click();
        return new DynamicLoadingTwo(driver);
    }



}
