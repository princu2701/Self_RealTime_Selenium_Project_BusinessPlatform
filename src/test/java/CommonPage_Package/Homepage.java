package CommonPage_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {

    WebDriverWait wait;
     WebDriver driver;
    public Homepage(WebDriver driver) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "t_Button_navControl")
    private WebElement sidebarbutton;

    @FindBy(xpath = "//button[@id=\"L89613939704663679\"]")
    private WebElement logoutdropdownbutton;

    @FindBy(name = "menu_L89613939704663679_1i")
    private WebElement signoutoption;

    @FindBy(css = "[class='a-TreeView-toggle']")
    private WebElement AdminPanelbutton;

    @FindBy(xpath = "(//*[.='Process Flow Form'])[3]")
    private WebElement ProcessFlowFormButton;

    @FindBy(xpath = "(//*[.='Training Plan'])[3]")
    private WebElement TrainingPlanButton;

    @FindBy(linkText = "Total Plan")
    private WebElement TotalPlanViewDashboard;

    @FindBy(linkText = "Approved Plan")
    private WebElement ApprovedPlanViewDashboard;

    @FindBy(linkText = "Rejected Plan")
    private WebElement RejectedPlanViewDashboard;

    @FindBy(linkText = "Query Raised")
    private WebElement QueryRaisedViewDashboard;

    @FindBy(linkText = "Training Complete")
    private WebElement TrainingCompleteViewDashboard;

    public WebElement getPendingForCheckedViewDashboard() {
        return PendingForCheckedViewDashboard;
    }

    public WebElement getTrainingCompleteViewDashboard() {
        return TrainingCompleteViewDashboard;
    }

    public WebElement getQueryRaisedViewDashboard() {
        return QueryRaisedViewDashboard;
    }

    public WebElement getRejectedPlanViewDashboard() {
        return RejectedPlanViewDashboard;
    }

    public WebElement getApprovedPlanViewDashboard() {
        return ApprovedPlanViewDashboard;
    }

    public WebElement getTotalPlanViewDashboard() {
        return TotalPlanViewDashboard;
    }

    @FindBy(linkText = "Pending For Checked")
    private WebElement PendingForCheckedViewDashboard;


    public WebElement getSidebarbutton() {
        return sidebarbutton;
    }

    public WebElement getLogoutdropdownbutton() {
        return logoutdropdownbutton;
    }

    public WebElement getSignoutoption() {
        return signoutoption;
    }

    public WebElement getAdminPanelbutton() {
        return AdminPanelbutton;
    }

    public WebElement getProcessFlowFormButton() {
        return ProcessFlowFormButton;
    }

    public WebElement getTrainingPlanButton() {
        return TrainingPlanButton;
    }

    public void sidebaropen(){


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sidebarbutton)).click();

    }

    public void adminpaneloption(){

        wait.until(ExpectedConditions.visibilityOf(AdminPanelbutton));
        AdminPanelbutton.click();
    }

    public void processflowotion(){

        ProcessFlowFormButton.click();
    }

    public void trainingplanbutton(){

        TrainingPlanButton.click();

    }

    public void totalplanviewdashboard(){

        TotalPlanViewDashboard.click();
    }

    public void approvedplanviewdashboard(){

        ApprovedPlanViewDashboard.click();
    }

    public void rejectedplanviewdashboard(){

        RejectedPlanViewDashboard.click();
    }

    public void queryraisedviewdashboard(){

        QueryRaisedViewDashboard.click();
    }

    public void trainingcompleteviewdashboard(){

        TrainingCompleteViewDashboard.click();
    }

    public void pendingforcheckedviewdashboard(){

        PendingForCheckedViewDashboard.click();
    }
}
