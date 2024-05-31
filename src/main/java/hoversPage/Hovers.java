package hoversPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.FigureCaption;

public class Hovers {
    WebDriver driver;
    Actions action;

    public Hovers(WebDriver driver){

        this.driver = driver;
    }



    private final By figure = By.cssSelector(".figure");
    private final By figCaption = By.cssSelector(".figcaption");



    @Step
    public FigureCaption hoverOnFigure(int index){
        WebElement element = driver.findElements(figure).get(index-1);
        action = new Actions(driver);
        action.moveToElement(element).perform();
        return new FigureCaption(element.findElement(figCaption));
    }
}
