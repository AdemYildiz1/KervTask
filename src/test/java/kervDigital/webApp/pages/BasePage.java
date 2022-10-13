package kervDigital.webApp.pages;

import kervDigital.webApp.utilities.BrowserUtils;
import kervDigital.webApp.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.Objects;
public abstract class BasePage {
    protected BrowserUtils browserUtils;
    protected WebDriver driver;

    //this constructor for only UI testing
    public BasePage(){
        browserUtils=new BrowserUtils();
    }

    // this constructor for load testing and UI testing
    public BasePage(WebDriver driver) {
        browserUtils=new BrowserUtils(driver);
        this.driver=driver;

        if(Objects.isNull(driver)){
            driver=Driver.get();
        }

        PageFactory.initElements(driver, this);

    }

}
