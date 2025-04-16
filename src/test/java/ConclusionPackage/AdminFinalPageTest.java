package ConclusionPackage;

import BaseTests.Basetest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdminFinalPageTest extends Basetest {

    @BeforeSuite
    public void bs() throws InterruptedException {

        System.out.println("Driver Activity Opened");

    }

    // Approval Matrix Scenario
    @Test
    public void approvalmatrixtest() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp"); // `alogin` is already initialized in basetest
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
        plantPage.createplantwithoutenteringplantname();

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
        departmentPage.viewdata1();
        departmentPage.viewdata2();

    }

    @Test
    public void PlantDepartmentMappingScenario1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp", "sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();

    }

    // @Test
    // public void PlantDepartmentMappingScenario2() throws InterruptedException {
    //
    // Thread.sleep(500);
    // alogin.loginvalid("sp","sp");
    // ahomepage.sidebaropen();
    // ahomepage.adminpaneloption();
    //
    // }
    //
    // @Test
    // public void UsermasterPageScenario1() throws InterruptedException {
    //
    // Thread.sleep(500);
    // alogin.loginvalid("sp","sp");
    // ahomepage.sidebaropen();
    // ahomepage.adminpaneloption();
    //
    // }
    //
    // public void UsermasterPageScenario2() throws InterruptedException {
    //
    // Thread.sleep(500);
    // alogin.loginvalid("sp","sp");
    // ahomepage.sidebaropen();
    // ahomepage.adminpaneloption();
    //
    // }
    // @DataProvider(name = "data")
    // public Object[][] data(){
    //
    // return new Object[][]{
    // {"csd"},{"xcv"},{"scdscd"},
    // {"csc"},{"xcdscd"},{"scd"},
    // };
    // }
    @AfterSuite
    public void done() {
        System.out.println("Defined Scenarios Executed");
    }
}
