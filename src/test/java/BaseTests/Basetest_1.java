
package BaseTests;

import Admin_Preparer_Trainer_Package.*;
import ApproverModule_Pages.*;
import CommonPage_Package.*;
import ConclusionPackages.TrainingPlan_Page_FlowTesting;
import GlobalMethodstoUse.GlobalMethods;
import TrainingPlanPages.TrainingPlanPagePrepTrainer;
import dashboard.TotalPlanPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import GlobalMethodstoUse.GlobalMethods;

public  class  Basetest_1 {

    protected static TrainingPlan_Page_FlowTesting realtimeFlowTestPage;
    protected static PlantPage plantPage;
    protected static DepartmentPage departmentPage;
    protected static PlantDepartmentmappingPage plantDepartmentmappingPage;
    protected static UserMasterPage userMasterApge;
    protected static ApprovalMatrixPage approvalMatrixPage;
    protected static CaseDetailsPage caseDetailsPage;
    protected static CaseListPage caseListPage;
    protected static DashboardPage dashboardPage;
    protected static LoginPage alogin;
    protected static Homepage ahomepage;
    protected static ApproverHomepage approverHomepage;
    protected static ApproverTrainingPlanPage approverTrainingPlanPage;
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static TrainingPlanPagePrepTrainer trainingPlanPage;
    protected static TotalPlanPage totalPlanPage;
    protected static GlobalMethods globalMethods;

    @BeforeMethod
    public static void setup() {

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

        totalPlanPage = new TotalPlanPage(driver);

        globalMethods = new GlobalMethods();

    }

    @AfterMethod
    public void teardown() throws InterruptedException {

        if (driver != null) {
            Thread.sleep(2000);
            driver.quit(); // ✅ closes all windows and kills chromedriver.exe
        }

    }
}
