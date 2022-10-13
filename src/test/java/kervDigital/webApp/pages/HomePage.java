package kervDigital.webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage extends BasePage {
     public HomePage(){

    }
    public HomePage(WebDriver driver) {

         super(driver);
    }
    @FindBy(xpath="(//a[contains(text(),'Accept all')])[1]")
    public WebElement cookies;

    public void GetRidOfCookies(){
        driver.manage().window().maximize();
        browserUtils.waitForVisibility(cookies,5).click();

    }
}
