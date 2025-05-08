package ConclusionPackages;

import BaseTests.Basetest_1;
import org.testng.annotations.Test;

public class Admin_AlllPagesTest extends Basetest_1 {

    // Approval Matrix Scenario
    @Test
    public void approvalmatrixtest() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp"); // `login` is already initialized in basetest
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        approvalMatrixPage.approvalMatrixbutton();
        approvalMatrixPage.createapprovalmatrixdatawithfulldetails();
        // approvalMatrixPage.createnewdataformatrix();

    }

    // Plant Scenario
    @Test()
    public void plantscenario1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        plantPage.plantbutton();
        plantPage.plantboxopeningbutton();
        plantPage.createnewplantwithvaliddata("eiwfkmd");

    }

    // Plant Scenario
    @Test
    public void plantscenario2() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        plantPage.plantbutton();
        plantPage.plantboxopeningbutton();
        plantPage.plantnamewithinvaliddata("!@)#()!)@#_");
//        plantPage.createplantwithoutenteringplantname();

    }

    // Department Scenario
    @Test
    public void departmentscenario1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        departmentPage.senddatawithoutenteringvalue();

    }

    @Test
    public void departmentscenario2() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        plantDepartmentmappingPage.plantdepartmentadminbutton();
        plantDepartmentmappingPage.plantdepartmenthomecreatebutton();
//        plantDepartmentmappingPage.proceedwithdepartmentnameonly();
        plantDepartmentmappingPage.inboxcreatebuttonforplant();
        Thread.sleep(500);
        alogin.loginvalid("sp", "sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        departmentPage.viewdata1();
        departmentPage.viewdata2();

    }

    @Test
    public void PlantDepartmentMappingScenario1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        plantDepartmentmappingPage.plantdepartmentadminbutton();
        plantDepartmentmappingPage.plantdepartmenthomecreatebutton();
    }

    @Test
    public void PlantDepartmentMappingScenario2() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        plantDepartmentmappingPage.plantdepartmentadminbutton();
        plantDepartmentmappingPage.plantdepartmenthomecreatebutton();
//        plantDepartmentmappingPage.proceedwithplantnameonly();

    }

    @Test
    public void UsermasterPageScenario1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        userMasterApge.usermasteradminbutton();
        userMasterApge.searchboxvalidandinvalidentries();

    }

     public void UsermasterPageScenario2() throws InterruptedException {

     Thread.sleep(500);
     alogin.loginvalid("sp","sp");
     ahomepage.sidebaropen();
     ahomepage.adminpaneloption();
     userMasterApge.usermasteradminbutton();
     userMasterApge.createboxinternaldatanamesvalidentries();

     }
    // @DataProvider(name = "data")
    // public Object[][] data(){
    //
    // return new Object[][]{
    // {"csd"},{"xcv"},{"scdscd"},
    // {"csc"},{"xcdscd"},{"scd"},
    // };
    // }
}
