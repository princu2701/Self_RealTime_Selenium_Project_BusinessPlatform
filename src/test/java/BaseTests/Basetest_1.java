
package BaseTests;

import Admin_Preparer_Trainer_Package.*;
import ApproverModule_Pages.*;
import CommonPage_Package.*;
import ConclusionPackages.TrainingPlan_Page_FlowTesting;
import TrainingPlanPages.TrainingPlanPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Basetest_1 {

    protected TrainingPlan_Page_FlowTesting realtimeFlowTestPage;
    protected PlantPage plantPage;
    protected DepartmentPage departmentPage;
    protected PlantDepartmentmappingPage plantDepartmentmappingPage;
    protected UserMasterApge userMasterApge;
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
    protected TrainingPlanPage trainingPlanPage;

    @BeforeMethod
    public void setup() {

        System.out.println("==== SETUP: Browser is launching ====");

        driver = new ChromeDriver();

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.default_content_setting_values.notifications", 2);
        prefs.put("autofill.profile_enabled", false);
        prefs.put("autofill.credit_card_enabled", false);
        prefs.put("password_manager_enabled", false);
        ChromeOptions  options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

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
         trainingPlanPage = new TrainingPlanPage(driver);
        plantPage = new PlantPage(driver);

        departmentPage = new DepartmentPage(driver);

        plantDepartmentmappingPage = new PlantDepartmentmappingPage(driver);

         userMasterApge = new UserMasterApge(driver);

        approvalMatrixPage = new ApprovalMatrixPage(driver);
    }

    @AfterMethod
    public void teardown() throws InterruptedException {

//        if (driver != null) {
//            Thread.sleep(5000);
//            driver.quit(); // ✅ closes all windows and kills chromedriver.exe
//        }

    }
}
