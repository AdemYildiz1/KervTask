package kervDigital.webApp.tests;

import kervDigital.webApp.pages.CareersPage;
import kervDigital.webApp.pages.HomePage;
import kervDigital.webApp.pages.JobOpportunitiesPage;
import kervDigital.webApp.pages.UXDesignerPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ApplyForUXDesignerRoleTest extends TestBase{

    public ApplyForUXDesignerRoleTest() {

    }
    public ApplyForUXDesignerRoleTest(WebDriver driver) {

        super(driver);
    }
    HomePage homePage=new HomePage();
    CareersPage careersPage = new CareersPage(driver);
    JobOpportunitiesPage jobOpportunitiesPage = new JobOpportunitiesPage(driver);
    UXDesignerPage uxDesignerPage =new UXDesignerPage(driver);

    @Test
    public void applyForUXDesigner() throws InterruptedException {
        careersPage.GetRidOfCookies();

        careersPage.goToCareers();
        Assert.assertTrue(careersPage.careersButton.isEnabled(),"Verify that after hover over careers button appears");

        jobOpportunitiesPage.goToJobOpportunities();

        Assert.assertEquals(jobOpportunitiesPage.getTitle(),"Job Opportunities - Kerv","Verify that job opportunities page title");

        uxDesignerPage.goToUXDesigner();

        Assert.assertEquals(uxDesignerPage.getHeadOfPage(),"UX Designer","verify head of Page belongs to UX");

        uxDesignerPage.submitUXDesignerApplication();




    }
}