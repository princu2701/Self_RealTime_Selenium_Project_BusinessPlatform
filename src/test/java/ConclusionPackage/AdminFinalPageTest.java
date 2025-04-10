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
    public void plantfunctionalitytest(String keywords) throws InterruptedException {
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
    public void plantinvalidtests() throws InterruptedException {

        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        plantPage.plantbutton();
        plantPage.plantboxopeningbutton();
        plantPage.plantnamewithinvaliddata("!@)#()!)@#_");
        plantPage.createplantwithoutenteringplantname();

    }

    //Department Sceanrio
    @Test
    public void departemtfunctionality(){


    }
    @DataProvider(name = "data")
    public Object[][] data(){

        return new Object[][]{
                {"csc"},{"xcdscd"},{"scd"}
        };
    }
}
