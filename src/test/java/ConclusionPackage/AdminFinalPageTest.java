package ConclusionPackage;
import BaseTests.Basetest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class AdminFinalPageTest extends Basetest {

    //Approval Matrix Scenario
    @Test
    public void approvalmatrixtest() throws InterruptedException {
        alogin.loginvalid("sp", "sp"); // `alogin` is already initialized in basetest
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        approvalMatrixPage.approvalMatrixbutton();
        approvalMatrixPage.createapprovalmatrixdatawithfulldetails();
//        approvalMatrixPage.createnewdataformatrix();

    }

    //Plant Scenario
    @Test(dataProvider = "data")
    public void plantscenario1(String keywords) throws InterruptedException {
        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        plantPage.plantbutton();
        plantPage.plantboxopeningbutton();
        plantPage.createnewplantwithvaliddata(keywords);
    }

    //Plant Scenario
    @Test
    public void plantscenario2() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        plantPage.plantbutton();
        plantPage.plantboxopeningbutton();
        plantPage.plantnamewithinvaliddata("!@)#()!)@#_");
        plantPage.createplantwithoutenteringplantname();

    }

    //Department Scenario
    @Test
    public void departmentscenario1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
    }

    @Test
    public void departmentscenario2() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();


    }

    @Test
    public void PlantDepartmentMappingSceanrio1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();

    }

    @Test
    public void PlantDepartmentMappingScenario2() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();

    }

    @Test
    public void UsermasterPageScenario1() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();

    }

    public void UsermasterPageScenario2() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();

    }
    @DataProvider(name = "data")
    public Object[][] data(){

        return new Object[][]{
                {"csd"},{"xcv"},{"scdscd"},
                {"csc"},{"xcdscd"},{"scd"},
        };
    }
}
