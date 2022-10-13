package kervDigital.webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CareersPage extends HomePage {

    //the constructor is not used for each subclass is because we may need to have more dynamic POM classes
    public CareersPage(){

    }
    public CareersPage(WebDriver driver) {

        super(driver);
    }
    @FindBy(xpath = "//div[@data-id='18659']")
    public WebElement careersModule;

    @FindBy(xpath = "(//a[@href='https://kerv.com/careers-at-kerv/'])[1]")
    public WebElement careersButton;

    public void goToCareers(){

        browserUtils.hover(careersModule);

    }
}
