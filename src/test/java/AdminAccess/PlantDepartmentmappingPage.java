package AdminAccess;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PlantDepartmentmappingPage {

    WebDriver driver;

    public PlantDepartmentmappingPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "(//*[.='Plant and Department Mapping'])[3]")
    private WebElement adminpanelplantdepartmentmappingbutton;

    @FindBy(xpath = "(//*[@class='t-Button-label'])[2]")
    private WebElement plantdepartmentcreatebutton;

    @FindBy(css = "[title='Search Report']")
    private WebElement plantdepartmentsearchfield;

    @FindBy(xpath = "(//*[@type='button'])[4]")
    private WebElement plantdepartmentsearchgobutton;

    @FindBy(css = "[title='Plant and Department Mapping Mdm Form']")
    private WebElement plantdepartmentmappingframebox;

    @FindBy(css = "[class='t-Button t-Button--hot ']")
    private WebElement plantdeparmentmappingboxcreatebutton;

    @FindBy(css = "[class='t-Button js-ignoreChange']")
    private WebElement plantdepartmentcancelboxbutton;

    @FindBy(css = "[name='P14_DEPARTMENT_NAME']")
    private WebElement plantdeptmappingdeptnameselectbox;

    @FindBy(id = "P14_PLANT_NAME")
    private WebElement plantdeptmappingplantnamebox;

    public void plantdepartmentadminbutton() {

        adminpanelplantdepartmentmappingbutton.click();

    }

    public void plantdepartmenthomecreatebutton() throws InterruptedException {

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();",plantdepartmentcreatebutton);
    }

    public void proceedwithdepartmentnameonly(){

        driver.switchTo().frame(plantdepartmentmappingframebox);
        Select select=new Select(plantdeptmappingdeptnameselectbox);
        select.selectByIndex(1);
        String plantboxddata=driver.findElement(By.id("P14_PLANT_NAME_error")).getText();
        if(plantboxddata.length()>0){
            Assert.assertEquals(plantboxddata,"Plant Name is mandatory.");
            System.out.println("Error displayed is: "+ plantboxddata);
        }
        driver.switchTo().defaultContent();
    }

    public void inboxcreatebuttonfordepartment(){

        driver.switchTo().frame(plantdepartmentmappingframebox);
        if (plantdeparmentmappingboxcreatebutton.isDisplayed()){
            System.out.println("Button found and ready to click");
        }
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();",plantdeparmentmappingboxcreatebutton);
        String deptboxddata=driver.findElement(By.id("P14_DEPARTMENT_NAME_error")).getText();
        if(deptboxddata.length()>0){
            Assert.assertEquals(deptboxddata,"Department Name is mandatory.");
            System.out.println("Error displayed is: "+ deptboxddata);
        }
    }

    public void inboxcreatebuttonforplant(){

//        driver.switchTo().frame(plantdepartmentmappingframebox);
        if (plantdeparmentmappingboxcreatebutton.isDisplayed()){
            System.out.println("Button found and ready to click");
        }
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();",plantdeparmentmappingboxcreatebutton);
        String plantboxdata=driver.findElement(By.id("P14_PLANT_NAME_error")).getText();
        if(plantboxdata.length()>0){
            Assert.assertEquals(plantboxdata,"Plant Name is mandatory.");
            System.out.println("Error displayed is: "+ plantboxdata);
        }
    }

    public void proceedwithplantnameonly(){

        driver.switchTo().frame(plantdepartmentmappingframebox);
        Select select=new Select(plantdeptmappingplantnamebox);
        System.out.println("All availabel Options are :" + select.getOptions());
        for (int i = 1; i < 5; i++) {
            try {
                select.selectByIndex(i);
                inboxcreatebuttonforplant();
            } catch (Exception e) {
                System.out.println("Error encountered: " + e.getMessage());
            }
        }
//        driver.switchTo().defaultContent();
    }



}
