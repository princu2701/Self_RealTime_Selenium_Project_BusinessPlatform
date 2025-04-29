package Admin_Preparer_Trainer_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class UserMasterApge {

    WebDriver driver;

    WebDriverWait wait;
    public UserMasterApge(WebDriver driver){

        this.driver=driver;
         wait = new  WebDriverWait(driver, Duration.ofSeconds(10));

        PageFactory.initElements(driver, this);
    }

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

    @FindBy(id="P10_USER_NAME")
    private WebElement usermastercreateboxusernamebox;

    @FindBy(id="P10_EMAIL")
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

    public void searchboxvalidandinvalidentries(){

//        WebElement framebox = driver.findElement(By.xpath("//iframe[@class='t-Dialog-iFrame']"));
//        driver.switchTo().frame(framebox);


        wait.until(ExpectedConditions.elementToBeClickable(usermastersearchfield));
        usermastersearchfield.click();
        usermastersearchfield.sendKeys("depth1");
        usermastersearchgobutton.click();

        String searchboxresult=driver.findElement(By.cssSelector("[class='a-IRR-controlsLabel']")).getText();

        Assert.assertEquals(searchboxresult,"Row text contains 'depth1'");
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

    public void invalidnamesincreatebox(){

        WebElement framebox = driver.findElement(By.xpath("//iframe[@class='t-Dialog-iFrame']"));
        driver.switchTo().frame(framebox);

        usermastercreatebutton.click();

        usermastercreateboxfirstnamebox.sendKeys("****");
        usermastercreateboxlastnamebox.sendKeys("@)#!)@#_!@#OP@)PWLDFKGTOREP#WLDFCKVMBGKTREIKFGV<BMGRKELOCVGKREOWPSDFOKREO@#($RTOIGKFR#)@_!)@(#$OERFVBTREODKC");
        usermastercreateboxusernamebox.sendKeys("      wsodewosd!@#ERF             fgkr2034rog");
        inboxcreatebutton.click();
//        driver.switchTo().defaultContent();
    }
    public void withfirstnameonly(){

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

    public void withlastnameonly(){

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

    public void withusernameonly(){

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

    public void usermastercreateboxpasswordbox(){

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

    public void flowtestingdata() throws InterruptedException {

        Thread.sleep(1000);
        usermastercreateboxfirstnamebox.sendKeys("test1");
        usermastercreateboxlastnamebox.sendKeys("test2");
        usermastercreateboxusernamebox.sendKeys("selenium");
        usermastercreateboxpasswordbox.sendKeys("selenium");


    }




}
