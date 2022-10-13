package kervDigital.webApp.tests;

import kervDigital.webApp.utilities.ConfigurationReader;
import kervDigital.webApp.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.util.Objects;
public class TestBase {
    protected  WebDriver driver;

    public TestBase(){
        if(Objects.isNull(driver)){
            driver=Driver.get();
        }
    }
    public TestBase(WebDriver driver){

        this.driver=driver;
    }

    @BeforeMethod
    public void setUp() {
        if(Objects.isNull(driver)){
            driver=Driver.get();
        }

        driver.get(ConfigurationReader.get("url"));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }
}
