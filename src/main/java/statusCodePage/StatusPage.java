package statusCodePage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusPage {

    WebDriver driver;

    public StatusPage(WebDriver driver){
        this.driver = driver;
    }

    private final By status200Link = By.linkText("200");
    private final By status200Text = By.xpath("//div[@id='content']/div/p");
    private final By status301Link = By.linkText("301");
    private final By status301Text = By.xpath("//div[@id='content']/div/p");
    private final By status404Link = By.linkText("404");
    private final By status404Text = By.xpath("//div[@id='content']/div/p");
    private final By status500Link = By.linkText("500");
    private final By status500Text = By.xpath("//div[@id='content']/div/p");


    @Step
    public StatusPage clickOnStatus200(){

        driver.findElement(status200Link).click();
        return this;
    }

    @Step
    public String getStatus200Text(){
        return driver.findElement(status200Text).getText();
    }


    @Step
    public StatusPage clickOnStatus301(){

        driver.findElement(status301Link).click();
        return this;
    }

    @Step
    public String getStatus301Text(){
        return driver.findElement(status301Text).getText();
    }

    @Step
    public StatusPage clickOnStatus404(){
        driver.findElement(status404Link).click();
        return this;
    }

    @Step
    public String getStatus404Text(){
        return driver.findElement(status404Text).getText();
    }

    @Step
    public StatusPage clickOnStatus500(){
        driver.findElement(status500Link).click();
        return this;
    }

    @Step
    public String getStatus500Text(){
        return driver.findElement(status500Text).getText();
    }

}