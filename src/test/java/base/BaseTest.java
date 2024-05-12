package base;

import homePage.HomePage;
import loginPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected String url = "https://the-internet.herokuapp.com/";

    protected HomePage homePage;
    protected LoginPage loginPage;




    @BeforeMethod
    public void testSetUp(){

        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void testTearDown(){
        //driver.quit();
    }
}