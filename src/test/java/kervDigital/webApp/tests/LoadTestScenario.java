package kervDigital.webApp.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.Objects;
public class LoadTestScenario {
    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        if(Objects.isNull(this.driver)){
            WebDriverManager.firefoxdriver().setup();
            this.driver=new FirefoxDriver();
        }
    }
    @AfterClass
    public void afterClass() {
        this.driver.quit();
    }

    @Test(enabled = true, description = "Kerv Web site testing")
    public void testcase() {
        driver.get("https://kerv.com/");

    }
}
