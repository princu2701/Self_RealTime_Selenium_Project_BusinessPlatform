package ConclusionPackages;

import BaseTests.Basetest_1;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserRolesProcessFlow extends Basetest_1 {

    /*
    Workflow with user roles strats from now on
     */

    @Test(description = "Training Plan Case Starting with -> 'Holder Fixing Process' Flow")
    public void workflowuser1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("selenium", "selenium");
//        ahomepage.sidebaropen();
//        ahomepage.trainingplanbutton();
//        trainingPlanPage.straightflow();

    }


    @Test(description = "Case Workflow with Checker")
    public void workflowuser2() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("seleniumchecker", "seleniumchecker");
        ahomepage.pendingforcheckedviewdashboard();
        totalPlanPage.clickViewButton();
        assertEquals(driver.getTitle(), "Training Plan");
        totalPlanPage.trainingplanpageprocessbycheckerapproval();
        Assert.assertEquals(driver.getCurrentUrl(),"http://172.16.30.59:8080/ords/f?p=172:1:510387321311:::::","url is not same");
    }

    @Test(description ="Document Status Check for Checker")
    public void checkerdashboardcheck() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("seleniumchecker", "seleniumchecker");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.latestdocumentstatuscheck();
    }

    @Test(description = "Case Workflow with Approver")
    public void workflowuser3() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("seleniumapprover", "seleniumapprover");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton();
        assertEquals(driver.getTitle(), "Training Plan");
        totalPlanPage.trainingplanpageprocessbyapprover();
        System.out.println("Training Plan Approval of Holder Fixing Process Done");
    }

    /*
    Holder Fixing Happy Workflow Tested Successfully
     */
}
