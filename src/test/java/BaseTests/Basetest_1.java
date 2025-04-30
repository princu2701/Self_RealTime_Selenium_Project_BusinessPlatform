
package BaseTests;

import Admin_Preparer_Trainer_Package.*;
import ApproverModule_Pages.*;
import CommonPage_Package.*;
import ConclusionPackages.TrainingPlan_Page_FlowTesting;
import TrainingPlanPages.TrainingPlanPagePrepTrainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Basetest_1 {

    protected TrainingPlan_Page_FlowTesting realtimeFlowTestPage;
    protected PlantPage plantPage;
    protected DepartmentPage departmentPage;
    protected PlantDepartmentmappingPage plantDepartmentmappingPage;
    protected UserMasterPage userMasterApge;
    protected ApprovalMatrixPage approvalMatrixPage;
    protected CaseDetailsPage caseDetailsPage;
    protected CaseListPage caseListPage;
    protected DashboardPage dashboardPage;
    protected LoginPage alogin;
    protected Homepage ahomepage;
    protected ApproverHomepage approverHomepage;
    protected ApproverTrainingPlanPage approverTrainingPlanPage;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected TrainingPlanPagePrepTrainer trainingPlanPage;

    @BeforeMethod
    public void setup() {

        System.out.println("==== SETUP: Browser is launching ====");

        driver = new FirefoxDriver();

        driver.get("http://172.16.30.59:8080/ords/f?p=172:LOGIN:4323551477942:::::");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        alogin = new LoginPage(driver);

        ahomepage = new Homepage(driver);
        /*
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
*/
         trainingPlanPage = new TrainingPlanPagePrepTrainer(driver);

        plantPage = new PlantPage(driver);

        departmentPage = new DepartmentPage(driver);

        plantDepartmentmappingPage = new PlantDepartmentmappingPage(driver);

         userMasterApge = new UserMasterPage(driver);

        approvalMatrixPage = new ApprovalMatrixPage(driver);
    }

    @AfterMethod
    public void teardown() throws InterruptedException {

        if (driver != null) {
            Thread.sleep(2000);
            driver.quit(); // ✅ closes all windows and kills chromedriver.exe
        }

    }
}
