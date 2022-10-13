package kervDigital.webApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class JobOpportunitiesPage extends HomePage {

    public JobOpportunitiesPage() {

    }
    public JobOpportunitiesPage(WebDriver driver) {

        super(driver);
    }
    @FindBy(xpath = "//a[.='Job Opportunities']")
    public WebElement jobOpportunitesButton;

    public void goToJobOpportunities() {
        browserUtils.waitForClickablility(jobOpportunitesButton, 10).click();

    }
    public String getTitle() {
       return driver.getTitle();
    }

}
