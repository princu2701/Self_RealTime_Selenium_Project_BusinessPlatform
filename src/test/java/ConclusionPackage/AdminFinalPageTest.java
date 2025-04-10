package ConclusionPackage;
import BaseTests.Basetest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class AdminFinalPageTest extends Basetest {

    @Test
    public void approvalmatrixtest() throws InterruptedException {
        alogin.loginvalid("sp", "sp"); // `alogin` is already initialized in basetest
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        approvalMatrixPage.approvalMatrixbutton();
        approvalMatrixPage.createapprovalmatrixdatawithfulldetails();
//        approvalMatrixPage.createnewdataformatrix();

    }

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

    @Test(dataProvider = "data")
    public void departmentfunctionalitytest(String keywords) throws InterruptedException {
        Thread.sleep(500);
        alogin.loginvalid("sp","sp");
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();

    }


    @DataProvider(name = "data")
    public Object[][] data(){

        return new Object[][]{
                {"ssss"},{"dicx"},{"ds"}
        };
    }
}
