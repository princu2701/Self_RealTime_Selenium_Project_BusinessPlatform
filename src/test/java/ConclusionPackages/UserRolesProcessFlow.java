package ConclusionPackages;

import BaseTests.Basetest_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserRolesProcessFlow extends Basetest_1 {

    /*
    Workflow with user roles strats from now on
     */

    @Test(description = "Training Plan Case Starting with -> 'Holder Inpection Process' Flow",priority = 1)
    public void workflowuser1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("automate", "automate");
        ahomepage.sidebaropen();
        ahomepage.trainingplanbutton();
        trainingPlanPage.straightflow();

    }


    @Test(description = "Case Workflow with Checker",priority = 2)
    public void workflowuser2() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("automatechecker", "automatechecker");
        ahomepage.pendingforcheckedviewdashboard();
        totalPlanPage.clickViewButton();
        assertEquals(driver.getTitle(), "Training Plan");
        totalPlanPage.trainingplanpageprocessbycheckerapproval();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"http://172.16.30.59:8080/ords/f?p=172:1:1961720481981:::::&success_msg=Q2hlY2tlZC9NYWlsIHNlbnQu%2FemgFA_Hfh1mp6QXO_0pHbvjhXosVc-d0oHUKeoyJiX4iYdPrr7zQwebi_fBFDgGPUfcHE73cdbAvT_cL2aG2Kg","url is not same");
    }

    @Test(description ="Document Status Check for Checker",priority = 3)
    public void checkerdashboardcheck() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("automatechecker", "automatechecker");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.latestdocumentstatuscheck();
    }

    @Test(description = "Case Workflow with Approver",priority = 4)
    public void workflowuser3() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("automateapprover", "automateapprover");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton();
        assertEquals(driver.getTitle(), "Training Plan");
        totalPlanPage.trainingplanpageprocessbyapprover();
        System.out.println("Training Plan Approval of Holder Fixing Process Done");
    }

    @Test(description = "Case Workflow with Trainer")
    public void workflowuser4() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("automate","automate");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton();
        totalPlanPage.trainingplanpageprocessbytrainerfinalapprover();

    }

    /*
    Holder Fixing Happy Workflow Tested Successfully
     */
}
