package entryAd;

import base.BaseTest;
import entryAdPage.EntryAd;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryAdTest extends BaseTest {


    @Test
    public void testCloseEntryAdFrameBoxAndGetEntryAdText(){
        EntryAd entryAds = homePage.clickOnEntryAdTextLink();
        entryAds.clickOnEntryAdCloseBtn();
        Assert.assertEquals(entryAds.getEntryAdTxt() , "Entry Ad");
    }
}