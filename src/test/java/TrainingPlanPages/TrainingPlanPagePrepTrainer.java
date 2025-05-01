package TrainingPlanPages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TrainingPlanPagePrepTrainer {

    WebDriver driver;
    WebDriverWait wait;
    public TrainingPlanPagePrepTrainer(WebDriver driver) {

        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait= new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//button[@id='B62250207009761428']")
    private WebElement trainingplanformbutton;

    @FindBy(xpath = "//button[@id='B62250394349761429']")
    private WebElement trainingformbackbutton;

    @FindBy(xpath = "//select[@id='P16_PROCESS_FLOW']")
    private WebElement selectprocessflowbutton;

    @FindBy(xpath = "(//*[@role='gridcell'])[2]")
    private WebElement associatenameentrybox;

    @FindBy(xpath = "(//*[@role='gridcell'])[3]")
    private WebElement associateidentrybox;

    @FindBy(xpath = "(//*[@role='gridcell'])[4]")
    private WebElement cp1box;

    @FindBy(xpath = "(//*[@role='gridcell'])[5]")
    private WebElement cp2box;

    @FindBy(xpath = "(//*[@role='gridcell'])[6]")
    private WebElement cp3box;//selec

    @FindBy(xpath = "(//*[@role='gridcell'])[7]")
    private WebElement cp4box;

    @FindBy(xpath = "(//*[@role='gridcell'])[8]")
    private WebElement cp5box;

    @FindBy(xpath = "(//*[@role='gridcell'])[9]")
    private WebElement generalrequirementbox;

    @FindBy(xpath = "(//*[@role='gridcell'])[10]")
    private WebElement generalrequirementbox2;

    @FindBy(xpath = "(//*[@role='gridcell'])[11]")
    private WebElement generalrequirementbox3;

    @FindBy(xpath = "(//*[@role='gridcell'])[12]")
    private WebElement mandatoryrequirementbox1;

    @FindBy(xpath = "(//*[@role='gridcell'])[13]")
    private WebElement mandatoryrequirementbox2;

    @FindBy(xpath = "(//*[@role='gridcell'])[14]")
    private WebElement asscoiateslastcolumnbox;

    @FindBy(css = "[name='P16_REMARKS']")
    private WebElement remarksfield;

    @FindBy(xpath = "//button[@id='B62970910522227323']")
    private WebElement submit;

    @FindBy(xpath = "(//*[.='Add Associates'])[2]")
    private WebElement addassociatesbutton;

    @FindBy(css = "[for=\"igrep_ig_toolbar_m1\"]")
    private WebElement editassociatebutton;

    public WebElement getAddassociatesbutton() {
        return addassociatesbutton;
    }
    public WebElement getTrainingplanformbutton() {
        return trainingplanformbutton;
    }

    public WebElement getTrainingformbackbutton() {
        return trainingformbackbutton;
    }

    public WebElement getSelectprocessflowbutton() {
        return selectprocessflowbutton;
    }

    public WebElement getAssociatenameentrybox() {
        return associatenameentrybox;
    }

    public WebElement getAssociateidentrybox() {
        return associateidentrybox;
    }

    public WebElement getCp1box() {
        return cp1box;
    }

    public WebElement getCp2box() {
        return cp2box;
    }

    public WebElement getCp3box() {
        return cp3box;
    }

    public WebElement getCp4box() {
        return cp4box;
    }

    public WebElement getCp5box() {
        return cp5box;
    }

    public WebElement getGeneralrequirementbox() {
        return generalrequirementbox;
    }

    public WebElement getGeneralrequirementbox2() {
        return generalrequirementbox2;
    }

    public WebElement getGeneralrequirementbox3() {
        return generalrequirementbox3;
    }

    public WebElement getMandatoryrequirementbox1() {
        return mandatoryrequirementbox1;
    }

    public WebElement getMandatoryrequirementbox2() {
        return mandatoryrequirementbox2;
    }

    public WebElement getAsscoiateslastcolumnbox() {
        return asscoiateslastcolumnbox;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public void straightflow() throws InterruptedException {

        trainingplanformbutton.click();
        Select select = new Select(selectprocessflowbutton);
        select.selectByIndex(1);

        Actions action = new Actions(driver);
        action.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();

        if(associatenameentrybox.isDisplayed()){

            Thread.sleep(500);
            action.doubleClick(associatenameentrybox).sendKeys("prince",Keys.TAB).build().perform();
            System.out.println("Target is visible : "+ associatenameentrybox.getAttribute("value"));

        }
        Thread.sleep(200);
        action.moveToElement(associateidentrybox).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp1box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp2box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp3box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp4box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp5box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(generalrequirementbox).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(generalrequirementbox2).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(generalrequirementbox3).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(mandatoryrequirementbox1).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(mandatoryrequirementbox2).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(asscoiateslastcolumnbox).sendKeys("1").build().perform();
        remarksfield.sendKeys("CASE GENERATION IS SUCCESS FROM PREPARER");
        submit.click();

    }

    public void flowscenario2() throws InterruptedException {

        trainingplanformbutton.click();
        Select select = new Select(selectprocessflowbutton);
        select.selectByIndex(1);

        Actions action = new Actions(driver);
        action.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();

        if(associatenameentrybox.isDisplayed()){

            Thread.sleep(500);
            action.doubleClick(associatenameentrybox).sendKeys("prince",Keys.TAB).build().perform();
            System.out.println("Target is visible : "+ associatenameentrybox.getAttribute("value"));

        }
        Thread.sleep(200);
        action.moveToElement(associateidentrybox).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp1box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp2box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp3box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp4box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp5box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(generalrequirementbox).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(generalrequirementbox2).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(generalrequirementbox3).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(asscoiateslastcolumnbox).sendKeys("1").build().perform();
        remarksfield.sendKeys("CASE GENERATION IS SUCCESS FROM PREPARER");
//        submit.click();

        Assert.assertFalse(Boolean.parseBoolean("prince"), "Data is not visible"); // Verify input
        Assert.assertTrue(submit.isEnabled()); // Check if submit is clickable
    }

    public void flowscenario3() throws InterruptedException {

        trainingplanformbutton.click();
        Select select = new Select(selectprocessflowbutton);
        select.selectByIndex(1);

        Actions action = new Actions(driver);
        action.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();

        if(submit.isDisplayed()){

            Thread.sleep(500);
            System.out.println("Target is visible : "+ associatenameentrybox.getAttribute("value"));

        }
        Assert.assertFalse(Boolean.parseBoolean("prince"),"Data is not visible"); // Verify input
        Assert.assertTrue(submit.isEnabled()); // Check if submit is clickable
    }

    public void flowscenario4() throws InterruptedException {

        trainingplanformbutton.click();

        Actions action = new Actions(driver);
        action.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();

        if(associatenameentrybox.isDisplayed()){

            Thread.sleep(500);
            action.doubleClick(associatenameentrybox).sendKeys("prince",Keys.TAB).build().perform();
            System.out.println("Target is visible : "+ associatenameentrybox.getAttribute("value"));

        }
        Thread.sleep(200);
        action.moveToElement(associateidentrybox).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp1box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp2box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp3box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp4box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(cp5box).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(generalrequirementbox).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(generalrequirementbox2).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(generalrequirementbox3).sendKeys("1",Keys.TAB).build().perform();
        Thread.sleep(200);
        action.moveToElement(asscoiateslastcolumnbox).sendKeys("1").build().perform();
        remarksfield.sendKeys("CASE GENERATION IS SUCCESS FROM PREPARER");
//        submit.click();

        Assert.assertTrue(submit.isEnabled()); // Check if submit is clickable
    }

    public void testRemarksMaxLength() {

        trainingplanformbutton.click();

        wait.until(ExpectedConditions.visibilityOf(remarksfield));

        String longText = "A".repeat(1001); // 1001 characters
        remarksfield.sendKeys(longText);

        // System should truncate to 1000 chars
        Assert.assertEquals(remarksfield.getAttribute("value").length(), 1001);
    }

    public void testFormSubmissionSavesData() throws InterruptedException {

        trainingplanformbutton.click();
        // 1. Fill valid data
        Actions actions = new Actions(driver);

        actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(200);
        actions.doubleClick(associatenameentrybox).sendKeys("Prince",Keys.TAB).build().perform();
        Thread.sleep(200);
        actions.moveToElement(associateidentrybox).sendKeys("101").build().perform();
       submit.click();
    }


}
