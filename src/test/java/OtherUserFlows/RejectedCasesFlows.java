package OtherUserFlows;

import BaseTests.Basetest_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class RejectedCasesFlows extends Basetest_1 {

    @Test(description = "plant",priority = 1,enabled = false )
    public void plantcreation() throws InterruptedException {

        RaiseQueryCaseTest.adminactivity();
        plantPage.plantbutton();
        plantPage.plantboxopeningbutton();
        plantPage.createnewplantwithvaliddata("rejectiontestplant");
        plantPage.createplantbutton();
        driver.switchTo().defaultContent();

    }

    @Test(description = "department creation",priority = 2,enabled = false)
    public void departmentfieldcreation() throws InterruptedException {

        RaiseQueryCaseTest.adminactivity();
        departmentPage.departmentadminbutton();
        departmentPage.datacreatebutton();
        departmentPage.senddatawithenteringvalue("rejectiontestdepartment");
        departmentPage.finaldepartmentnameokbutton();
    }

    @Test(description = "plant and department mapping",priority = 3,enabled = false )
    public void plantdepartmentmapping() throws InterruptedException {

        RaiseQueryCaseTest.adminactivity();
        plantDepartmentmappingPage.plantdepartmentadminbutton();
        plantDepartmentmappingPage.plantdepartmenthomecreatebutton();
        plantDepartmentmappingPage.proceedwithplantnameonly("rejectiontestplant");
        plantDepartmentmappingPage.proceedwithdepartmentnameonly("rejectiontestdepartment");
        plantDepartmentmappingPage.mappinkgokbutton();
//            String errortext=driver.findElement(By.xpath("//div[@id='P14_PLANT_NAME_error']")).getText();
//            if (errortext.contains("already exists")){
//                System.out.println("Data Already Created Before");

//            }else {
        driver.switchTo().defaultContent();

//            }
    }

    @Test(description = "Creation of Preparer Trainer User ",priority = 4,enabled = false )
    public void usermasterpreptraincreation() throws InterruptedException {

        RaiseQueryCaseTest.adminactivity();
        userMasterApge.usermasteradminbutton();
        userMasterApge.usermastercreatebutton();
        userMasterApge.preptrainerflowtestingdata("rejectiontestplant","rejectiontestdepartment","rejection","rejection");
        userMasterApge.inboxcreatebutton();
    }

    @Test(description = "Creation of Checker User ",priority = 5,enabled = false )
    public void usermastercheckercreation() throws InterruptedException {

        RaiseQueryCaseTest.adminactivity();
        userMasterApge.usermasteradminbutton();
        userMasterApge.usermastercreatebutton();
        userMasterApge.CheckerUserCreationflow("rejectiontestplant","rejectiontestdepartment","rejectionchecker","rejectionchecker");
        userMasterApge.inboxcreatebutton();

    }

    @Test(description = "Creation of Approver User ",priority = 6,enabled = false )
    public void usermasterapprovercreation() throws InterruptedException {

        RaiseQueryCaseTest.adminactivity();
        userMasterApge.usermasteradminbutton();
        userMasterApge.usermastercreatebutton();
        userMasterApge.ApproverUserMasterCreationflow("rejectiontestplant","rejectiontestdepartment","rejectionapprover","rejectionapprover");
        userMasterApge.inboxcreatebutton();

    }

    @Test(description = "Creation of ApprovalMatrixPreparer ",priority =7,enabled = false )
    public void approvalmatrixpreparercreation() throws InterruptedException {

        RaiseQueryCaseTest.adminactivity();
        approvalMatrixPage.approvalmatrixpreparercreator();
        Thread.sleep(200);
        approvalMatrixPage.approvalmatrixtrainercreator();
        Thread.sleep(200);

        approvalMatrixPage.approvalmatrixcheckercreator();
        Thread.sleep(200);

        approvalMatrixPage.approvalmatrixapprovercreator();

    }



/*

-----------------------------------Rejections Flow starting below ----------------------------------------------

 */

    @Test(description = "Training plan Page Creation Flow",priority =8)
    public void raisequeryflowpreparer() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("rejection","rejection");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        ahomepage.trainingplanbutton();
        trainingPlanPage.straightflow();
    }


    @Test(description = "Raise Query By Checker",priority =9)
    public void raisequerychecker() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("rejectionchecker","rejectionchecker");
        System.out.println("1. Logged in as Checker Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.trainingplanpageprocessbycheckerapproval();
        // For Raise Query By Checker Side
        totalPlanPage.insidetotalplanRaiseQueryByCheckerbutton();

    }

    @Test(description = "Preparer ReCase Generation",priority =10 )
    public void raisequeryreapprovalfromchecker() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("rejection","rejection");
        System.out.println("1. Logged in as Preparer Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.isRemarksVisible();
        trainingPlanPage.approvalremarks();
        totalPlanPage.checkbutton();

    }

    @Test(description = "Approval from Checker",priority =11 )
    public void reapprovalfromchecker() throws InterruptedException {

        Thread.sleep(200);
        alogin.loginvalid("rejectionchecker","rejectionchecker");
        System.out.println("1. Logged in as Checker Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.isRemarksVisible();
        totalPlanPage.trainingplanpageprocessbycheckerapproval();
        totalPlanPage.checkbutton();

    }

    @Test(description = "Rejection By Approver",priority =12 )
    public void approvalfromapprover() throws InterruptedException {

        Thread.sleep(200);
        alogin.loginvalid("rejectionapprover","rejectionapprover");
        System.out.println("1. Logged in as Approver Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.isRemarksVisible();
        trainingPlanPage.raisequeryremarks();
        // For Rejection By Approver Side
        totalPlanPage.insidetotalplanrejectionbyapprverbutton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[@class='t-Alert-title']")
        ));
        Assert.assertTrue(alert.isDisplayed(), "Alert is not visible");

    }











































}






