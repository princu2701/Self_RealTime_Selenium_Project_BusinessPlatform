package OtherUserFlows;

import BaseTests.Basetest_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RaiseQueryCaseTest extends Basetest_1 {


        @Test(description = "plant",priority = 1,enabled = false)
        public void plantcreation() throws InterruptedException {

            adminactivity();
            plantPage.plantbutton();
            plantPage.plantboxopeningbutton();
            plantPage.createnewplantwithvaliddata("raisequerytestplant");
            plantPage.createplantbutton();
            driver.switchTo().defaultContent();

        }

        @Test(description = "department creation",priority = 2,enabled = false)
        public void departmentfieldcreation() throws InterruptedException {

            adminactivity();
            departmentPage.departmentadminbutton();
            departmentPage.datacreatebutton();
            departmentPage.senddatawithenteringvalue("raisequerytestdepartment");
            departmentPage.finaldepartmentnameokbutton();
        }

        @Test(description = "plant and department mapping",priority = 3,enabled = false)
        public void plantdepartmentmapping() throws InterruptedException {

            adminactivity();
            plantDepartmentmappingPage.plantdepartmentadminbutton();
            plantDepartmentmappingPage.plantdepartmenthomecreatebutton();
            plantDepartmentmappingPage.proceedwithplantnameonly("raisequerytestplant");
            plantDepartmentmappingPage.proceedwithdepartmentnameonly("raisequerytestdepartment");
            plantDepartmentmappingPage.mappinkgokbutton();
//            String errortext=driver.findElement(By.xpath("//div[@id='P14_PLANT_NAME_error']")).getText();
//            if (errortext.contains("already exists")){
//                System.out.println("Data Already Created Before");
//            }else {
                driver.switchTo().defaultContent();

//            }
        }

        @Test(description = "Creation of Preparer Trainer User ",priority = 4,enabled = false)
        public void usermasterpreptraincreation() throws InterruptedException {

            adminactivity();
            userMasterApge.usermasteradminbutton();
            userMasterApge.usermastercreatebutton();
            userMasterApge.preptrainerflowtestingdata("raisequerytestplant","raisequerytestdepartment","raisequery","raisequery");
            userMasterApge.inboxcreatebutton();
        }

        @Test(description = "Creation of Checker User ",priority = 5,enabled = false)
        public void usermastercheckercreation() throws InterruptedException {

            adminactivity();
            userMasterApge.usermasteradminbutton();
            userMasterApge.usermastercreatebutton();
            userMasterApge.CheckerUserCreationflow("raisequerytestplant","raisequerytestdepartment","raisequerychecker","raisequerychecker");
            userMasterApge.inboxcreatebutton();

        }

        @Test(description = "Creation of Approver User ",priority = 6,enabled = false)
        public void usermasterapprovercreation() throws InterruptedException {

            adminactivity();
            userMasterApge.usermasteradminbutton();
            userMasterApge.usermastercreatebutton();
            userMasterApge.ApproverUserMasterCreationflow("raisequerytestplant","raisequerytestdepartment","raisequeryapprover","raisequeryapprover");
            userMasterApge.inboxcreatebutton();

        }

        @Test(description = "Creation of ApprovalMatrixPreparer ",priority =7,enabled = false)
        public void approvalmatrixpreparercreation() throws InterruptedException {

            adminactivity();
            approvalMatrixPage.approvalmatrixpreparercreator();
            Thread.sleep(200);
            approvalMatrixPage.approvalmatrixtrainercreator();
            Thread.sleep(200);

            approvalMatrixPage.approvalmatrixcheckercreator();
            Thread.sleep(200);

            approvalMatrixPage.approvalmatrixapprovercreator();

        }



/*

----------------------------------- Flow of raise query starting below ----------------------------------------------

 */

    @Test(description = "Training pLan Page Creation Flow",priority =8)
    public void raisequeryflowpreparer() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("raisequery","raisequery");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        ahomepage.trainingplanbutton();
        trainingPlanPage.straightflow();
    }


    @Test(description = "Raise Query By Checker",priority =9)
    public void raisequerychecker() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("raisequerychecker","raisequerychecker");
        System.out.println("1. Logged in Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.trainingplanpageprocessbycheckerapproval();
        // For Raise Query By Checker Side
        totalPlanPage.insidetotalplanRaiseQueryByCheckerbutton();

    }

    @Test(description = "Preparer Reapproval",priority =10)
    public void raisequeryreapprovalfromchecker() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("raisequery","raisequery");
        System.out.println("1. Logged in Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.isRemarksVisible();
        trainingPlanPage.approvalremarks();
        totalPlanPage.checkbutton();

    }

    @Test(description = "Approval from Checker",priority =11)
    public void reapprovalfromchecker() throws InterruptedException {

        Thread.sleep(200);
        alogin.loginvalid("raisequerychecker","raisequerychecker");
        System.out.println("1. Logged in Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.isRemarksVisible();
        totalPlanPage.trainingplanpageprocessbycheckerapproval();
        totalPlanPage.checkbutton();

    }

    @Test(description = "Raise query By Approver",priority =12)
    public void approvalfromapprover() throws InterruptedException {

        Thread.sleep(200);
        alogin.loginvalid("raisequeryapprover","raisequeryapprover");
        System.out.println("1. Logged in Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.isRemarksVisible();
        trainingPlanPage.raisequeryremarks();
        // For Raise Query By Approver Side
        totalPlanPage.insidetotalplanraisequerybyapproverbutton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[@class='t-Alert-title' and contains(text(), 'Query Raised')]")
        ));
        Assert.assertTrue(alert.isDisplayed(), "Alert is not visible");

    }

    @Test(description = "Final Approval By Checker",priority =14)
    public void finalapprovalfromchecker() throws InterruptedException {

        Thread.sleep(200);
        alogin.loginvalid("raisequerychecker","raisequerychecker");
        System.out.println("1. Logged in as Checker Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.isRemarksVisible();
        trainingPlanPage.approvalremarks();
        totalPlanPage.checkbutton();

    }


    @Test(description = "Final Approval By Approver",priority =15)
    public void finalapprovalfromapprover() throws InterruptedException {

        Thread.sleep(200);
        alogin.loginvalid("raisequeryapprover","raisequeryapprover");
        System.out.println("1. Logged in as Checker Succesfully");
        ahomepage.totalplanviewdashboard();
        totalPlanPage.clickViewButton(0);
        totalPlanPage.isRemarksVisible();
        trainingPlanPage.approvalremarks();
        totalPlanPage.insidetotalplanapprovalbyapproverbutton();

    }















//*****************************************************************************************************

        /*
        Below is a global type method
         */

        public void adminactivity() throws InterruptedException {

            Thread.sleep(200);
            alogin.loginvalid("gayatri","gayatri");
            ahomepage.sidebaropen();
            ahomepage.adminpaneloption();

        }

//*****************************************************************************************************

    }

