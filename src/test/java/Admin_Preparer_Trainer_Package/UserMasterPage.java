package Admin_Preparer_Trainer_Package;

import GlobalMethodstoUse.GlobalMethods;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class UserMasterPage extends GlobalMethods {

    WebDriver driver;

    WebDriverWait wait;

    public UserMasterPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[role='listbox']")
    private List<WebElement> rolelistbox;

    @FindBy(xpath = "(//*[@class='popup_lov apex-item-text apex-item-popup-lov'])")
    private WebElement usermasterroleoptionsbutton;

    @FindBy(css = "[id='P10_ROLE_NAME_lov_btn']")
    private WebElement rolesideptionsbutton;


    @FindBy(xpath = "//a[normalize-space()='User Master']")
    private WebElement usermasteradminbutton;

    @FindBy(xpath = "//button[@id='B89643340335807742']")
    private WebElement usermastercreatebutton;

    @FindBy(id = "R89639854850807740_search_field")
    private WebElement usermastersearchfield;

    @FindBy(id = "R89639854850807740_search_button")
    private WebElement usermastersearchgobutton;

    @FindBy(id = "P10_FIRST_NAME")
    private WebElement usermastercreateboxfirstnamebox;

    @FindBy(id = "P10_LAST_NAME")
    private WebElement usermastercreateboxlastnamebox;

    @FindBy(id = "P10_USER_NAME")
    private WebElement usermastercreateboxusernamebox;

    @FindBy(name = "P10_EMAIL_ID")
    private WebElement usermastercreateboxemailbox;

    @FindBy(xpath = "//button[@id='B89638033759807714']")
    private WebElement inboxcreatebutton;

    @FindBy(xpath = "//input[@id='P10_USER_PASSWORD']")
    private WebElement usermastercreateboxpasswordbox;

    public WebElement getUsermasteradminbutton() {
        return usermasteradminbutton;
    }

    public WebElement getUsermastercreatebutton() {
        return usermastercreatebutton;
    }

    public WebElement getUsermastersearchfield() {
        return usermastersearchfield;
    }

    public WebElement getUsermastersearchgobutton() {
        return usermastersearchgobutton;
    }

    public void usermasteradminbutton() {
        usermasteradminbutton.click();
    }

    public void usermastercreatebutton() {
        usermastercreatebutton.click();
    }

    public void usermastersearchgobutton() {
        usermastersearchgobutton.click();
    }

    public void inboxcreatebutton() {
        inboxcreatebutton.click();
    }

    public void createboxinternaldatanamesvalidentries() {

        WebElement framebox = driver.findElement(By.xpath("//iframe[@class='t-Dialog-iFrame']"));
        driver.switchTo().frame(framebox);

        usermastercreatebutton.click();

        usermastercreateboxfirstnamebox.sendKeys("test1");
        usermastercreateboxlastnamebox.sendKeys("test2");
        usermastercreateboxusernamebox.sendKeys("test3");

//        driver.switchTo().defaultContent();
    }

    public void searchboxvalidandinvalidentries() {

//        WebElement framebox = driver.findElement(By.xpath("//iframe[@class='t-Dialog-iFrame']"));
//        driver.switchTo().frame(framebox);


        wait.until(ExpectedConditions.elementToBeClickable(usermastersearchfield));
        usermastersearchfield.click();
        usermastersearchfield.sendKeys("depth1");
        usermastersearchgobutton.click();

        String searchboxresult = driver.findElement(By.cssSelector("[class='a-IRR-controlsLabel']")).getText();

        Assert.assertEquals(searchboxresult, "Row text contains 'depth1'");
        wait.until(ExpectedConditions.elementToBeClickable(usermastersearchfield));
        usermastersearchfield.click();
        usermastersearchfield.sendKeys("test1");
        usermastersearchgobutton.click();


        wait.until(ExpectedConditions.elementToBeClickable(usermastersearchfield));
        usermastersearchfield.click();
        usermastersearchfield.sendKeys("***");
        usermastersearchgobutton.click();

        wait.until(ExpectedConditions.elementToBeClickable(usermastersearchfield));
        usermastersearchfield.click();
        usermastersearchfield.sendKeys("()()()(     )()()()()(");
        usermastersearchgobutton.click();

        wait.until(ExpectedConditions.elementToBeClickable(usermastersearchfield));
        usermastersearchfield.click();
        usermastersearchfield.sendKeys("_+_+_+1231031-ASWMXC   SK");
        usermastersearchgobutton.click();

        wait.until(ExpectedConditions.elementToBeClickable(usermastersearchfield));
        usermastersearchfield.click();
        usermastersearchfield.sendKeys("                           ");
        usermastersearchgobutton.click();

//        driver.switchTo().defaultContent();
    }

    public void invalidnamesincreatebox() {

        WebElement framebox = driver.findElement(By.xpath("//iframe[@class='t-Dialog-iFrame']"));
        driver.switchTo().frame(framebox);

        usermastercreatebutton.click();

        usermastercreateboxfirstnamebox.sendKeys("****");
        usermastercreateboxlastnamebox.sendKeys("@)#!)@#_!@#OP@)PWLDFKGTOREP#WLDFCKVMBGKTREIKFGV<BMGRKELOCVGKREOWPSDFOKREO@#($RTOIGKFR#)@_!)@(#$OERFVBTREODKC");
        usermastercreateboxusernamebox.sendKeys("      wsodewosd!@#ERF             fgkr2034rog");
        inboxcreatebutton.click();
//        driver.switchTo().defaultContent();
    }

    public void withfirstnameonly() {

        WebElement framebox = driver.findElement(By.xpath("//iframe[@class='t-Dialog-iFrame']"));
        driver.switchTo().frame(framebox);

        usermastercreatebutton.click();
        usermastercreateboxfirstnamebox.sendKeys("test1");
        inboxcreatebutton.click();
        usermastercreateboxfirstnamebox.clear();
        usermastercreateboxfirstnamebox.sendKeys("lewktgjfeo0239432039i4eodfkireldkfoer");
        inboxcreatebutton.click();
        usermastercreateboxfirstnamebox.clear();
        usermastercreateboxfirstnamebox.sendKeys("1123230949301030940201203");
        inboxcreatebutton.click();
        usermastercreateboxfirstnamebox.clear();
        usermastercreateboxfirstnamebox.sendKeys("ERQEOIRQPWOEORPWEOOD");
        inboxcreatebutton.click();
        usermastercreateboxfirstnamebox.clear();
        usermastercreateboxfirstnamebox.sendKeys("()()()()()()()()()()()()()()");
        inboxcreatebutton.click();
//        driver.switchTo().defaultContent();
    }

    public void withlastnameonly() {

        WebElement framebox = driver.findElement(By.xpath("//iframe[@class='t-Dialog-iFrame']"));
        driver.switchTo().frame(framebox);

        usermastercreatebutton.click();
        usermastercreateboxlastnamebox.sendKeys("test1");
        inboxcreatebutton.click();
        usermastercreateboxlastnamebox.clear();
        usermastercreateboxlastnamebox.sendKeys("lewktgjfeo0239432039i4eodfkireldkfoer");
        inboxcreatebutton.click();
        usermastercreateboxlastnamebox.clear();
        usermastercreateboxlastnamebox.sendKeys("1123230949301030940201203");
        inboxcreatebutton.click();
        usermastercreateboxlastnamebox.clear();
        usermastercreateboxlastnamebox.sendKeys("ERQEOIRQPWOEORPWEOOD");
        inboxcreatebutton.click();
        usermastercreateboxlastnamebox.clear();
        usermastercreateboxlastnamebox.sendKeys("()()()()()()()()()()()()()()");
        inboxcreatebutton.click();

//        driver.switchTo().defaultContent();
    }

    public void withusernameonly() {

        WebElement framebox = driver.findElement(By.xpath("//iframe[@class='t-Dialog-iFrame']"));
        driver.switchTo().frame(framebox);

        usermastercreatebutton.click();
        usermastercreateboxusernamebox.sendKeys("test1");
        inboxcreatebutton.click();
        usermastercreateboxusernamebox.clear();
        usermastercreateboxusernamebox.sendKeys("lewktgjfeo0239432039i4eodfkireldkfoer");
        inboxcreatebutton.click();
        usermastercreateboxusernamebox.clear();
        usermastercreateboxusernamebox.sendKeys("1123230949301030940201203");
        inboxcreatebutton.click();
        usermastercreateboxusernamebox.clear();
        usermastercreateboxusernamebox.sendKeys("ERQEOIRQPWOEORPWEOOD");
        inboxcreatebutton.click();
        usermastercreateboxusernamebox.clear();
        usermastercreateboxusernamebox.sendKeys("()()()()()()()()()()()()()()");
        inboxcreatebutton.click();
//        driver.switchTo().defaultContent();

    }

    public void usermastercreateboxpasswordbox() {

        WebElement framebox = driver.findElement(By.xpath("//iframe[@class='t-Dialog-iFrame']"));
        driver.switchTo().frame(framebox);

        usermastercreatebutton.click();

        usermastercreateboxpasswordbox.sendKeys("test1");
        inboxcreatebutton.click();
        usermastercreateboxpasswordbox.clear();
        usermastercreateboxpasswordbox.sendKeys("lewktgjfeo0239432039i4eodfkireldkfoer");
        inboxcreatebutton.click();
        usermastercreateboxpasswordbox.clear();
        usermastercreateboxpasswordbox.sendKeys("1123230949301030940201203");
        inboxcreatebutton.click();
        usermastercreateboxpasswordbox.clear();
        usermastercreateboxpasswordbox.sendKeys("ERQEOIRQPWOEORPWEOOD");
        inboxcreatebutton.click();
        usermastercreateboxpasswordbox.clear();
        usermastercreateboxpasswordbox.sendKeys("()()()()()()()()()()()()()()");
        inboxcreatebutton.click();

//        driver.switchTo().defaultContent();

    }
    /// ///////////////////////////////////////////////////////////////
    public void flowtestingdata() throws InterruptedException {

        WebElement framebox = driver.findElement(By.cssSelector("[title='User Master Form']"));
        driver.switchTo().frame(framebox);
        wait.until(ExpectedConditions.visibilityOf(usermastercreateboxemailbox));

        // Fill in user details
        usermastercreateboxfirstnamebox.sendKeys("test1");
        usermastercreateboxlastnamebox.sendKeys("test2");
        usermastercreateboxusernamebox.sendKeys("selenium");
        usermastercreateboxpasswordbox.sendKeys("selenium");
        usermastercreateboxemailbox.sendKeys("selenium@yopmail.com");

        Assert.assertEquals("selenium@yopmail.com", usermastercreateboxemailbox.getAttribute("value"));

        usermasterroleoptionsbutton.click();

        forcestop();

        Actions actions = new Actions(driver);
        System.out.println("Using Actions for hovering on Preparer Option");
        driver.switchTo().defaultContent();
        WebElement prepselect = driver.findElement(By.cssSelector("[data-id='Preparer']"));
        actions.moveToElement(driver.findElement(By.cssSelector("[class='a-IconList-item']"))).build().perform();
        System.out.println("Hovered Successfully on Preparer Option");
        if (driver.findElement(By.cssSelector("[class='a-IconList-item']")).isDisplayed()) {
            Assert.assertTrue(true);
            if (prepselect.isDisplayed()) {

                prepselect.click();
            }
        }

        forcestop();
         forcestop();

         driver.switchTo().frame(framebox);
        rolesideptionsbutton.click();
         driver.switchTo().defaultContent();

        WebElement trainerselect = driver.findElement(By.cssSelector("[data-id='Trainer']"));
        actions.moveToElement(driver.findElement(By.cssSelector("[class='a-IconList-item']"))).build().perform();
        System.out.println("Hovered Successfully on Preparer Option");
        if (driver.findElement(By.cssSelector("[class='a-IconList-item']")).isDisplayed()) {
            Assert.assertTrue(true);
            if (trainerselect.isDisplayed()) {

                trainerselect.click();
            }
        }

            driver.switchTo().frame(framebox);
        forcestop();
            WebElement plantname = driver.findElement(By.id("P10_PLANT_NAME"));
            Select plant = new Select(plantname);
            plant.selectByVisibleText("seleniumplant");

            WebElement departmentname = driver.findElement(By.id("P10_DEPARTMENT_NAME"));
            Select department = new Select(departmentname);
            department.selectByVisibleText("seleniumdepartment");

            WebElement adminpermssion = driver.findElement(By.name("P10_IS_ADMIN"));
            Select admin = new Select(adminpermssion);
            admin.selectByVisibleText("No");
        System.out.println("Username is : " + usermastercreateboxusernamebox.getAttribute("value"));
        System.out.println("Password is : " + usermastercreateboxpasswordbox.getAttribute("value"));
        forcestop();
        inboxcreatebutton.click();
        Assert.assertFalse(usermastercreateboxfirstnamebox.getAttribute("value").isEmpty());
        driver.switchTo().defaultContent();

    }
////////////////////////////////////////////////////////////////////////


    public void CheckerUserCreationflow() throws InterruptedException {

        WebElement framebox = driver.findElement(By.cssSelector("[title='User Master Form']"));
        driver.switchTo().frame(framebox);
        wait.until(ExpectedConditions.visibilityOf(usermastercreateboxemailbox));

        // Fill in user details
        usermastercreateboxfirstnamebox.sendKeys("test1");
        usermastercreateboxlastnamebox.sendKeys("test2");
        usermastercreateboxusernamebox.sendKeys("seleniumchecker");
        usermastercreateboxpasswordbox.sendKeys("seleniumchecker");
        usermastercreateboxemailbox.sendKeys("selenium@yopmail.com");

        Assert.assertEquals("selenium@yopmail.com", usermastercreateboxemailbox.getAttribute("value"));

        usermasterroleoptionsbutton.click();

        forcestop();

        Actions actions = new Actions(driver);
        System.out.println("Using Actions for hovering on Preparer Option");
        driver.switchTo().defaultContent();
        WebElement checkerselect = driver.findElement(By.cssSelector("[data-id='Checker']"));
        actions.moveToElement(driver.findElement(By.cssSelector("[class='a-IconList-item']"))).build().perform();
        System.out.println("Hovered Successfully on Preparer Option");
        if (driver.findElement(By.cssSelector("[class='a-IconList-item']")).isDisplayed()) {
            Assert.assertTrue(true);
            if (checkerselect.isDisplayed()) {

                checkerselect.click();
            }
        }

       ;

        forcestop();

        driver.switchTo().frame(framebox);
        forcestop();
        WebElement plantname = driver.findElement(By.id("P10_PLANT_NAME"));
        Select plant = new Select(plantname);
        plant.selectByVisibleText("seleniumplant");

        WebElement departmentname = driver.findElement(By.id("P10_DEPARTMENT_NAME"));
        Select department = new Select(departmentname);
        department.selectByVisibleText("seleniumdepartment");

        WebElement adminpermssion = driver.findElement(By.name("P10_IS_ADMIN"));
        Select admin = new Select(adminpermssion);
        admin.selectByVisibleText("No");
        System.out.println("Username is : " + usermastercreateboxusernamebox.getAttribute("value"));
        System.out.println("Password is : " + usermastercreateboxpasswordbox.getAttribute("value"));
        forcestop();
        inboxcreatebutton.click();
        Assert.assertFalse(usermastercreateboxfirstnamebox.getAttribute("value").isEmpty());
        driver.switchTo().defaultContent();

    }
/// ///////////////////////////////////////////////////////////
    public void ApproverUserMasterCreationflow() throws InterruptedException {

        WebElement framebox = driver.findElement(By.cssSelector("[title='User Master Form']"));
        driver.switchTo().frame(framebox);
        wait.until(ExpectedConditions.visibilityOf(usermastercreateboxemailbox));

        // Fill in user details
        usermastercreateboxfirstnamebox.sendKeys("test1");
        usermastercreateboxlastnamebox.sendKeys("test2");
        usermastercreateboxusernamebox.sendKeys("seleniumapprover");
        usermastercreateboxpasswordbox.sendKeys("seleniumapprover");
        usermastercreateboxemailbox.sendKeys("selenium@yopmail.com");

        Assert.assertEquals("selenium@yopmail.com", usermastercreateboxemailbox.getAttribute("value"));

        usermasterroleoptionsbutton.click();

        forcestop();

        Actions actions = new Actions(driver);
        System.out.println("Using Actions for hovering on Preparer Option");
        driver.switchTo().defaultContent();
        WebElement approverselect = driver.findElement(By.cssSelector("[data-id='Approver']"));
        actions.moveToElement(driver.findElement(By.cssSelector("[class='a-IconList-item']"))).build().perform();
        System.out.println("Hovered Successfully on Preparer Option");
        if (driver.findElement(By.cssSelector("[class='a-IconList-item']")).isDisplayed()) {
            Assert.assertTrue(true);
            if (approverselect.isDisplayed()) {

                approverselect.click();
            }
        }

        forcestop();

        driver.switchTo().frame(framebox);
        forcestop();
        WebElement plantname = driver.findElement(By.id("P10_PLANT_NAME"));
        Select plant = new Select(plantname);
        plant.selectByVisibleText("seleniumplant");

        WebElement departmentname = driver.findElement(By.id("P10_DEPARTMENT_NAME"));
        Select department = new Select(departmentname);
        department.selectByVisibleText("seleniumdepartment");

        WebElement adminpermssion = driver.findElement(By.name("P10_IS_ADMIN"));
        Select admin = new Select(adminpermssion);
        admin.selectByVisibleText("No");
        System.out.println("Username is : " + usermastercreateboxusernamebox.getAttribute("value"));
        System.out.println("Password is : " + usermastercreateboxpasswordbox.getAttribute("value"));
        forcestop();
        inboxcreatebutton.click();
        Assert.assertFalse(usermastercreateboxfirstnamebox.getAttribute("value").isEmpty());
        driver.switchTo().defaultContent();

    }
}