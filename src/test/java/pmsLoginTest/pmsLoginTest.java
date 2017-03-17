package pmsLoginTest;
import org.junit.*;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pmsLogin.CheckLoginPage;
import pmsLogin.ScreenShotRule;
import pmsLogin.pms;

/**
 * Created by sebastian on 10/03/2017
 */
public class pmsLoginTest {
    private static WebDriver driver;
    private pms pmsObj;
    private CheckLoginPage pmsLogin;

    @BeforeClass
    public static void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sindh\\Desktop\\Training\\AllDriversNew\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
    @Rule
    public ScreenShotRule screenShotRule = new ScreenShotRule(driver);
    @Test
    public void testHeading_PageObjectDesignPattern() throws Exception {
       pms pmsObj = new pms(driver);
       pmsLogin = pmsObj.trylogin("sunny@gmail.com","12345");
       String actualHeading =  pmsLogin.getCurrentPage();
       String expectedHeading ="http://localhost:8080/pms/viewparish.action";
       assertEquals(expectedHeading, actualHeading);
    }
}