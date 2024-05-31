package hovers;

import base.BaseTest;
import hoversPage.Hovers;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.FigureCaption;

public class HoversTest extends BaseTest {


    @Test
    public void testHoversFiguresCaption(){
        Hovers hover = homePage.clickOnHoverLinkText();
        FigureCaption figureCaption =  hover.hoverOnFigure(3);
        Assert.assertEquals(figureCaption.getUserNameFigureText() , "name: user3");
        Assert.assertEquals(figureCaption.getProfileFigureText() , "View profile");
    }
}
