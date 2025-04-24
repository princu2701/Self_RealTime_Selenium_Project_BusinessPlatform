
package BaseTests;

import AdminAccess.*;
import Approver.User2TPPag;
import Approver.User2loginPage;
import Approver.UserHomepage;
import ApproverConrols.*;
import CommonPages.*;
import ConclusionPackages.TrainingPlansFlowTesting;
import OriginAccountCreator.pageclass;
import PreparerTrainer.User1Homepage;
import PreparerTrainer.User1LoginPage;
import TrainingPlanPages.TrainingPlanPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
public class Basetest {

    protected TrainingPlansFlowTesting realtimeFlowTestPage;
    protected PlantPage plantPage;
    protected DepartmentPage departmentPage;
    protected PlantDepartmentmappingPage plantDepartmentmappingPage;
    protected UserMasterApge userMasterApge;
    protected ApprovalMatrixPage approvalMatrixPage;
    protected CaseDetailsPage caseDetailsPage;
    protected CaseListPage caseListPage;
    protected DashboardPage dashboardPage;
    protected AdminLoginPage alogin;
    protected AdminHomepage ahomepage;
    protected ApproverHomepage approverHomepage;
    protected ApproverLoginPage approverLoginPage;
    protected ApproverTrainingPlanPage approverTrainingPlanPage;
    protected User1Homepage user1Homepage;
    protected User1LoginPage user1LoginPage;
    protected UserHomepage userHomepage;
    protected User2loginPage user2loginPage;
    protected User2TPPag user2TPPag;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected TrainingPlanPage trainingPlanPage;
    protected pageclass pclass;

    @BeforeMethod
    public void setup() {

        System.out.println("==== SETUP: Browser is launching ====");

        driver = new FirefoxDriver();

        driver.get("http://172.16.30.59:8080/ords/f?p=172:LOGIN:4323551477942:::::");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        alogin = new AdminLoginPage(driver);

        ahomepage = new AdminHomepage(driver);


        //
        // approverHomepage=new ApproverHomepage(driver);
        //
        // approverLoginPage = new ApproverLoginPage(driver);
        //
        // approverTrainingPlanPage = new ApproverTrainingPlanPage(driver);
        //
        // user1Homepage = new User1Homepage(driver);
        //
        // user1LoginPage = new User1LoginPage(driver);
        //
        //
        // userHomepage = new UserHomepage(driver);
        //
        // user2loginPage = new User2loginPage(driver);
        //
        // user2TPPag = new User2TPPag(driver);
        //
        // caseDetailsPage = new CaseDetailsPage(driver);
        //
        // caseListPage = new CaseListPage(driver);
        //
        // dashboardPage = new DashboardPage(driver);

         trainingPlanPage = new TrainingPlanPage(driver);
        plantPage = new PlantPage(driver);

        departmentPage = new DepartmentPage(driver);

        plantDepartmentmappingPage = new PlantDepartmentmappingPage(driver);

         userMasterApge = new UserMasterApge(driver);

        approvalMatrixPage = new ApprovalMatrixPage(driver);
    }

    @AfterMethod
    public void teardown() throws InterruptedException {

        if (driver != null) {
            Thread.sleep(5000);
            driver.quit(); // ✅ closes all windows and kills chromedriver.exe
        }

    }
}
