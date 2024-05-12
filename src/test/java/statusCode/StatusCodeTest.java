package statusCode;

import base.BaseTest;
import homePage.HomePage;
import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import statusCodePage.StatusPage;
public class StatusCodeTest extends BaseTest {


    @Test(priority = 1)
    public void testStatusCode200() {

        Assert.assertTrue(
                homePage.clickOnStatusCodeLink()
                        .clickOnStatus200()
                        .getStatus200Text().contains("This page returned a 200 status code.")

        );

    }

    @Test(priority = 2)
    public void testStatusCode301() {

        Assert.assertTrue(
                homePage.clickOnStatusCodeLink()
                        .clickOnStatus301()
                        .getStatus301Text().contains("This page returned a 301 status code.")
        );
    }



    @Test(priority = 3)
    public void testStatusCode404() {

        Assert.assertTrue(
                homePage.clickOnStatusCodeLink()
                        .clickOnStatus404()
                        .getStatus404Text().contains("This page returned a 404 status code.")

        );
    }



    @Test(priority = 4)
    public void testStatusCode500() {

        Assert.assertTrue(
                homePage.clickOnStatusCodeLink()
                        .clickOnStatus500()
                        .getStatus500Text().contains("This page returned a 500 status code.")
        );

    }

}