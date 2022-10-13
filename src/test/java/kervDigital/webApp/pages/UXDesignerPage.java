package kervDigital.webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class UXDesignerPage extends HomePage{

    public UXDesignerPage(){

    }
    public UXDesignerPage (WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//a[@href='https://kerv.com/job-details/mp024o5']")
    public WebElement uxDesignerButton;
    @FindBy(xpath = "//h1[text()='UX Designer']")
    public WebElement headOfPage;
    @FindBy(id="input_5_1")
    public WebElement firstNameInputBox;
    @FindBy(id="input_5_12")
    public WebElement lastNameInputBox;
    @FindBy(id="input_5_10")
    public WebElement emailInputBox;

    @FindBy(id="input_5_16")
    public WebElement phoneInputBox;

    @FindBy(id="input_5_18")
    public WebElement coverLetterInputBox;

    @FindBy(id="input_5_19")
    public WebElement cvInputBox;
    @FindBy(id="recaptcha-anchor")
    public WebElement notRobotCheckBox;
    @FindBy(css="#gform_submit_button_5")
    public WebElement submitButton;
    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    public WebElement captcha;
    public void goToUXDesigner() throws InterruptedException {

        browserUtils.scrollToElement(uxDesignerButton);
        browserUtils.waitFor(2);
        uxDesignerButton.click();
        String uxPageTitle="Kerv";

        browserUtils.waitFor(2);
        browserUtils.switchToWindow(uxPageTitle,driver);

    }
    public String getHeadOfPage(){

        return headOfPage.getText();

    }

    //I just used one user, it can be used for many user by using data provider
    public void submitUXDesignerApplication(){

       browserUtils.scrollToElement(submitButton);

       browserUtils.waitForClickablility(firstNameInputBox,5).sendKeys("adem");
       browserUtils.waitForClickablility(lastNameInputBox,5).sendKeys("yildiz");
       browserUtils.waitForClickablility(emailInputBox,5).sendKeys("aykut@gmail.com");

       browserUtils.waitFor(2);
       driver.switchTo().frame(captcha);
       browserUtils.waitFor(2);
       notRobotCheckBox.click();

    }

}
