package AdminAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApprovalMatrixPage {

    WebDriver driver;

    public ApprovalMatrixPage(WebDriver driver){

        this.driver=driver;

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "(//*[.='Create'])[2]")
    private WebElement CreatenewApprovalMatrixDataButton;

    @FindBy(id = "P18_APPROVER_TYPE")
    private WebElement inboxapprovertypeselection;

    @FindBy(id="P18_USER_NAME")
    private WebElement inboxusernameselection;

    @FindBy(id = "P18_PLANT_NAME")
    private WebElement inboxplantnameselection;

    @FindBy(id = "P18_DEPARTMENT_NAME")
    private WebElement inboxdepartmentnameselection;

    @FindBy(id = "P18_PROCESS_FLOW")
    private WebElement inboxprocessflownmaeselection;

    @FindBy(css = "[class=\"t-Button js-ignoreChange\"]")
    private WebElement inboxdatacancelbuttonselection;

    @FindBy(css = "[class='t-Button t-Button--hot ']")
    private WebElement insideboxdatabcreatebutton;

    public WebElement getApprovalmatrixbutton() {
        return approvalmatrixbutton;
    }

    @FindBy(linkText = "Approval Matrix")
    private WebElement approvalmatrixbutton;

    @FindBy(xpath = "(//*[@type='text'])[1]")
    private WebElement searchdatabutton;

    public WebElement getSearchdatabutton() {
        return searchdatabutton;
    }

    public WebElement getCreatenewApprovalMatrixDataButton() {
        return CreatenewApprovalMatrixDataButton;
    }

    public WebElement getInboxapprovertypeselection() {
        return inboxapprovertypeselection;
    }

    public WebElement getInboxusernameselection() {
        return inboxusernameselection;
    }

    public WebElement getInboxplantnameselection() {
        return inboxplantnameselection;
    }

    public WebElement getInboxdepartmentnameselection() {
        return inboxdepartmentnameselection;
    }

    public WebElement getInboxprocessflownmaeselection() {
        return inboxprocessflownmaeselection;
    }

    public WebElement getInboxdatacancelbuttonselection() {
        return inboxdatacancelbuttonselection;
    }

    public WebElement getInsideboxdatabcreatebutton() {
        return insideboxdatabcreatebutton;
    }

    public void approvalMatrixbutton(){

        approvalmatrixbutton.click();
    }

    public void createapprovalmatrixdatawithfulldetails() throws InterruptedException {

        Thread.sleep(500);

        CreatenewApprovalMatrixDataButton.click();

        Thread.sleep(1000);

        WebElement framebox=driver.findElement(By.cssSelector("[title='Approval Matrix Form']"));

        driver.switchTo().frame(framebox);

        Thread.sleep(500);

        Select select1 = new Select(inboxapprovertypeselection);

        select1.selectByIndex(1);

        Select select2 = new Select(inboxusernameselection);

        select2.selectByIndex(2);

        Select select3 = new Select(inboxplantnameselection);

        select3.selectByIndex(1);

        Select select4 = new Select(inboxdepartmentnameselection);

        select4.selectByIndex(1);

        Select select5 = new Select(inboxprocessflownmaeselection);

        select5.selectByIndex(2);

    }

    public void createapprovalmatrixdatawithoutapprovaltype(){

        CreatenewApprovalMatrixDataButton.click();

        Select select4 = new Select(inboxusernameselection);

        select4.selectByIndex(0);

        Select select2 = new Select(inboxplantnameselection);

        select2.selectByIndex(0);

        Select select1 = new Select(inboxdepartmentnameselection);

        select1.selectByIndex(0);

        Select select3 = new Select(inboxprocessflownmaeselection);

        select3.selectByIndex(0);
    }

    public void createapprovalmatrixdatawithoutusername(){

        CreatenewApprovalMatrixDataButton.click();

        Select select = new Select(inboxapprovertypeselection);

        select.selectByIndex(0);

        Select select2 = new Select(inboxplantnameselection);

        select2.selectByIndex(0);

        Select select1 = new Select(inboxdepartmentnameselection);

        select1.selectByIndex(0);

        Select select3 = new Select(inboxprocessflownmaeselection);

        select3.selectByIndex(0);
    }

    public void createapprovalmatrixdatawithoutplantname(){

        CreatenewApprovalMatrixDataButton.click();

        Select select = new Select(inboxapprovertypeselection);

        select.selectByIndex(0);

        Select select4 = new Select(inboxusernameselection);

        select4.selectByIndex(0);

        Select select1 = new Select(inboxdepartmentnameselection);

        select1.selectByIndex(0);

        Select select3 = new Select(inboxprocessflownmaeselection);

        select3.selectByIndex(0);
    }

    public void createapprovalmatrixdatawithoutdepartmentname(){

        CreatenewApprovalMatrixDataButton.click();

        Select select = new Select(inboxapprovertypeselection);

        select.selectByIndex(0);

        Select select4 = new Select(inboxusernameselection);

        select4.selectByIndex(0);

        Select select2 = new Select(inboxplantnameselection);

        select2.selectByIndex(0);

        Select select3 = new Select(inboxprocessflownmaeselection);

        select3.selectByIndex(0);
    }

    public void createnewdataformatrix(){

        insideboxdatabcreatebutton.click();
    }

    public void cancelnewapprvalmatrixdata(){

        inboxdatacancelbuttonselection.click();
    }

}
