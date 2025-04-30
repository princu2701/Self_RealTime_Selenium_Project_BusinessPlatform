package ConclusionPackages;

import BaseTests.Basetest_1;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Admin_Preparer_Trainer_Package.UserMasterPage;
public class FullFlow_Test extends Basetest_1{

    @Test(description = "Creation of PlantName",priority = 1,groups = "preparertrainercreator")
    public void fullflowtestingplantcreation() throws InterruptedException {

        System.out.println("Starting Plant Creation");

        Thread.sleep(500);
        alogin.loginvalid("gayatri","gayatri");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        ahomepage.adminpaneloption();
        System.out.println("3. Clicked Successfully on the PlantPage admin Panel Button");
        plantPage.plantbutton();
        System.out.println("Clicked on the Admin Panel Option Successfully");
        plantPage.plantboxopeningbutton();
        System.out.println("Create Box Clicked Successfully");
        plantPage.createnewplantwithvaliddata("seleniumplant");
        System.out.println("4. Plant Created Successfully");

    }

    @Test(description = "Creation of DepartmentName",priority = 2,dependsOnGroups = "preparertrainercreator")
    public void fullflowtestingdepartmentcreation() throws InterruptedException {

        System.out.println("Starting Department Creation");

        Thread.sleep(500);
        alogin.loginvalid("gayatri", "gayatri");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        Thread.sleep(2000);
        ahomepage.adminpaneloption();
        System.out.println("3. Clicked Successfully on the PlantPage admin Panel Button");
        departmentPage.senddatawithenteringvalue("seleniumdepartment");
        System.out.println("4. Departemnt Data created Successfully");
        System.out.println("Process done till Department Page");

    }

    @Test(description = "Creation of TrainerName",priority = 3,dependsOnGroups = "preparertrainercreator")
    public void fullflowtestingplantdepartmentmapping() throws InterruptedException {

        System.out.println("Starting Plant Department Creation");

        Thread.sleep(500);
        alogin.loginvalid("gayatri", "gayatri");
        if (driver.getCurrentUrl().contains("http://172.16.30.59:8080/ords/f?p=172:1:9818840939305:::::")){
            System.out.println("1. Logged in Succesfully");

        }

        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");

        ahomepage.adminpaneloption();
        System.out.println("3. Clicked Successfully on the PlantPage admin Panel Button");

        plantDepartmentmappingPage.plantdepartmentadminbutton();
        System.out.println("4. Process done till Entry in mapping Page");

        plantDepartmentmappingPage.plantdepartmenthomecreatebutton();
        System.out.println("5. Process done till create button clciking in mapping Page");

        plantDepartmentmappingPage.proceedwithplantnameonly();
        System.out.println("6. Process done till Data Entry in Plant of mapping Page");

        plantDepartmentmappingPage.proceedwithdepartmentnameonly();
        System.out.println("7. Process done till Data Entry in Department of mapping Page");

    }

    @Test(description = "Creation of UserMaster",priority = 4,dependsOnGroups = "preparertrainercreator")
    public void fullflowtestingusermastercreation() throws InterruptedException {

        System.out.println("Starting UserMaster Creation");

        Thread.sleep(500);
        alogin.loginvalid("gayatri", "gayatri");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        ahomepage.adminpaneloption();
        System.out.println("3. Clicked Successfully on the PlantPage admin Panel Button");
        userMasterApge.usermasteradminbutton();
        System.out.println("4. Clicked on the UserMaster Button Successfully");
        userMasterApge.usermastercreatebutton();
        userMasterApge.flowtestingdata();

    }

    @Test(description = "Approval Matrix Flow",priority = 5,dependsOnGroups = "preparertrainercreator")
    public void approvalmatrixflow() throws InterruptedException {

        System.out.println("Approval Matrix Flow Started");
        Thread.sleep(500);
        alogin.loginvalid("gayatri","gayatri");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        approvalMatrixPage.approvalmatrix();
    }

    @Test(description = "User Master Checker Creation")
    public void checkerusermastercreator() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("gayatri", "gayatri");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        ahomepage.adminpaneloption();
        System.out.println("3. Clicked Successfully on the PlantPage admin Panel Button");
        userMasterApge.usermasteradminbutton();
        System.out.println("4. Clicked on the UserMaster Button Successfully");
        userMasterApge.usermastercreatebutton();
        userMasterApge.CheckerUserCreationflow();

    }

    @Test(description = "User Master Approver Creator")
    public void usermasterapprovercreator() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("gayatri", "gayatri");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        ahomepage.adminpaneloption();
        System.out.println("3. Clicked Successfully on the PlantPage admin Panel Button");
        userMasterApge.usermasteradminbutton();
        System.out.println("4. Clicked on the UserMaster Button Successfully");
        userMasterApge.usermastercreatebutton();
        userMasterApge.ApproverUserMasterCreationflow();

    }

    @Test(description = "Approval Matrix Trainer Creation")
    public void approvalmatrixtrainercreation() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("gayatri", "gayatri");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        ahomepage.adminpaneloption();
        System.out.println("3. Clicked Successfully on the PlantPage admin Panel Button");
        approvalMatrixPage.approvalmatrixtrainercreator();


    }

    @Test(description = "Approval Matrix Checker Creation")
    public void approvalmatrixcheckercreation() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("gayatri", "gayatri");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        ahomepage.adminpaneloption();
        System.out.println("3. Clicked Successfully on the PlantPage admin Panel Button");
        approvalMatrixPage.approvalmatrixcheckercreator();

    }

    @Test(description = "Approval Matrix Approver Creation")
    public void approvalmatrixapprovercreation() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("gayatri", "gayatri");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        ahomepage.adminpaneloption();
        System.out.println("3. Clicked Successfully on the PlantPage admin Panel Button");
        approvalMatrixPage.approvalmatrixapprovercreator();

    }

    /*
    Workflow with user roles strats from now on
     */

    @Test
    public void workflow() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("selenium", "selenium");
        ahomepage.sidebaropen();
        ahomepage.trainingplanbutton();
        trainingPlanPage.straightflow();

    }





}
