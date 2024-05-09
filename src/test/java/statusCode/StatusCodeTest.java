package statusCode;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class StatusCodeTest extends BaseTest {


    private final By statusCodeLinkText = By.linkText("Status Codes");
    private final By status200Link = By.linkText("200");
    private final By status200Text = By.xpath("//div[@id='content']/div/p");
    private final By status301Link = By.linkText("301");
    private final By status301Text = By.xpath("//div[@id='content']/div/p");
    private final By status404Link = By.linkText("404");
    private final By status404Text = By.xpath("//div[@id='content']/div/p");
    private final By status500Link = By.linkText("500");
    private final By status500Text = By.xpath("//div[@id='content']/div/p");



    @Test(priority = 1)
    public void testStatusCode200(){

        WebElement clickOnStatusCodeLink = driver.findElement(statusCodeLinkText);
        clickOnStatusCodeLink.click();


        WebElement clickOnStatus200 = driver.findElement(status200Link);
        clickOnStatus200.click();


        WebElement getTextStatus200 = driver.findElement(status200Text);
        String actualStatus200Text = getTextStatus200.getText();
        String expectedStatus200Text = "This page returned a 200 status code.";

        Assert.assertTrue(actualStatus200Text.contains(expectedStatus200Text));
    }

    @Test(priority = 2)
    public void testStatusCode301(){

        WebElement clickOnStatusCodeLink = driver.findElement(statusCodeLinkText);
        clickOnStatusCodeLink.click();


        WebElement clickOnStatus301 = driver.findElement(status301Link);
        clickOnStatus301.click();


        WebElement getTextStatus301 = driver.findElement(status301Text);
        String actualStatus301Text = getTextStatus301.getText();
        String expectedStatus301Text = "This page returned a 301 status code.";

        Assert.assertTrue(actualStatus301Text.contains(expectedStatus301Text));
    }


    @Test(priority = 3)
    public void testStatusCode404(){

        WebElement clickOnStatusCodeLink = driver.findElement(statusCodeLinkText);
        clickOnStatusCodeLink.click();


        WebElement clickOnStatus404 = driver.findElement(status404Link);
        clickOnStatus404.click();


        WebElement getTextStatus404 = driver.findElement(status404Text);
        String actualStatus404Text = getTextStatus404.getText();
        String expectedStatus404Text = "This page returned a 404 status code.";

        Assert.assertTrue(actualStatus404Text.contains(expectedStatus404Text));
    }


    @Test(priority = 4)
    public void testStatusCode500(){

        WebElement clickOnStatusCodeLink = driver.findElement(statusCodeLinkText);
        clickOnStatusCodeLink.click();


        WebElement clickOnStatus500 = driver.findElement(status500Link);
        clickOnStatus500.click();


        WebElement getTextStatus500 = driver.findElement(status500Text);
        String actualStatus500Text = getTextStatus500.getText();
        String expectedStatus500Text = "This page returned a 500 status code.";

        Assert.assertTrue(actualStatus500Text.contains(expectedStatus500Text));
    }


}