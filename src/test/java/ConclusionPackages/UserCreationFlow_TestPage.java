package ConclusionPackages;

import BaseTests.Basetest_1;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.UUID;

import static org.testng.Assert.assertEquals;

public class UserCreationFlow_TestPage extends Basetest_1 {

    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void reports(){

         extent = new ExtentReports("C:\\Users\\Gayatri\\IdeaProjects\\SkillMatrixSelenium\\src\\test\\java\\ExtentReports\\extentreport.html", true);
         test = extent.startTest("User Creation Flow");
    }
    @Test(description = "Creation of PlantName",priority = 1)
    public void fullflowtestingplantcreation() throws InterruptedException {

        test.log(LogStatus.INFO,"Starting User Creation Flow");
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
        plantPage.createnewplantwithvaliddata("automateplant");
        System.out.println("4. Plant Created Successfully");

    }

    @Test(description = "Creation of DepartmentName",priority = 2)
    public void fullflowtestingdepartmentcreation() throws InterruptedException {

        System.out.println("Starting Department Creation");

        Thread.sleep(500);
        alogin.loginvalid("gayatri", "gayatri");
        System.out.println("1. Logged in Succesfully");
        ahomepage.sidebaropen();
        System.out.println("2. Sidebaropened Successfully");
        Thread.sleep(2000);
        ahomepage.adminpaneloption();
        System.out.println("3.Clicked Successfully on the PlantPage admin Panel Button");
        departmentPage.senddatawithenteringvalue("automatedepartment");
        System.out.println("4.Department Data created Successfully");
        System.out.println("Process done till Department Page");

    }

    @Test(description = "Creation of TrainerName",priority = 3)
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

//        plantDepartmentmappingPage.proceedwithplantnameonly();
//        System.out.println("6. Process done till Data Entry in Plant of mapping Page");
//
//        plantDepartmentmappingPage.proceedwithdepartmentnameonly();
//        System.out.println("7. Process done till Data Entry in Department of mapping Page");

    }

    @Test(description = "Creation of UserMaster",priority = 4)
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
//        userMasterApge.preptrainerflowtestingdata();

    }

    @Test(description = "Approval Matrix Flow",priority = 5)
    public void approvalmatrixflow() throws InterruptedException {

        System.out.println("Approval Matrix Flow Started");
        Thread.sleep(500);
        alogin.loginvalid("gayatri","gayatri");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
//        approvalMatrixPage.approvalmatrix();
    }

    @Test(description = "User Master Checker Creation",priority = 6)
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
//        userMasterApge.CheckerUserCreationflow();

    }

    @Test(description = "User Master Approver Creator",priority = 7)
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
//        userMasterApge.ApproverUserMasterCreationflow();

    }

    @Test(description = "Approval Matrix Trainer Creation",priority = 8)
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

    @Test(description = "Approval Matrix Checker Creation",priority = 9)
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

    @Test(description = "Approval Matrix Approver Creation",priority = 10)
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

    @AfterClass
    public void afterClass() {

        extent.endTest(test);
        extent.flush();
    }

}
