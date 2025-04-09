package ConclusionPackage;
import AdminAccess.AdminHomepage;
import BaseTests.Basetest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FinalPageTest extends Basetest {

    @Test
    public void adminp() throws InterruptedException {
        Thread.sleep(1000);
        alogin.loginvalid("sp", "sp"); // `alogin` is already initialized in basetest
        ahomepage.sidebaropen();
        ahomepage.adminpaneloption();
        approvalMatrixPage.approvalMatrixbutton();
        approvalMatrixPage.createapprovalmatrixdatawithfulldetails();
        approvalMatrixPage.createnewdataformatrix();

    }
}
