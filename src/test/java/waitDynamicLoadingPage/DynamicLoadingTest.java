package waitDynamicLoadingPage;

import base.BaseTest;
import dynamicLoadPage.DynamicLoadingOne;
import dynamicLoadPage.DynamicLoadingTwo;
import dynamicLoadPage.DynamicLodingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTest extends BaseTest {


    @Test
    public void testExampleDynamicPageOne(){

        DynamicLodingPage exampleOne = homePage.clickOnDynamicLoadingLink();
        DynamicLoadingOne onePage = exampleOne.clickOnElementExampleOneBtn();
        onePage.clickOnStartBtnOne();
        String expectedMessage = "Hello World!";
        String actualMessage = onePage.getValidationMessage();
        Assert.assertEquals(actualMessage , expectedMessage);

    }

    @Test
    public void testExampleDynamicPageTwo(){

        DynamicLodingPage exampleTwo = homePage.clickOnDynamicLoadingLink();
        DynamicLoadingTwo secondPage =   exampleTwo.clickOnElementExampleTwoBtn();
        secondPage.clickOnStartBtnTwo();
        Assert.assertTrue(true);



    }

}
