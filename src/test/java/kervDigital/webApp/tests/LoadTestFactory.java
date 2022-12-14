package kervDigital.webApp.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Factory;

public class LoadTestFactory {
    @Factory
    public Object[] createInstances() {
        WebDriverManager.firefoxdriver().setup();
        Object[] obj = new Object[250];

        for (int iter = 0; iter < 250; iter++) {
            obj[iter] = new ApplyForUXDesignerRoleTest(new FirefoxDriver());
        }

        return obj;
    }
}
