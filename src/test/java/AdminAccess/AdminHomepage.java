package AdminAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminHomepage {

     WebDriver driver;
    public AdminHomepage(WebDriver driver) {

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

        AdminPanelbutton.click();

    }

    public void processflowotion(){

        ProcessFlowFormButton.click();
    }

    public void trainingplanbutton(){

        TrainingPlanButton.click();

    }
}
