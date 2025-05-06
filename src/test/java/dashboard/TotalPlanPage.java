package dashboard;

import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class TotalPlanPage {

    Actions actions;

    WebDriver driver;
    public TotalPlanPage(WebDriver driver) {

        this.driver=driver;

        PageFactory.initElements(driver, this);

         actions = new Actions(driver);
    }

    @FindBy(css = "[class='fa fa-eye']")
    private List<WebElement> viewButton;

    @FindBy(xpath = "//button[@id='B63630916852151016']")
    private WebElement insidetotalplanapprovalbyapproverbutton;

    @FindBy(id = "B63630811748151015")
    private WebElement insidetotalplanrejectionbyapproverbutton;

    @FindBy(id = "B63633022167151037")
    private WebElement insidetotalplanraisequerybyapproverbutton;

    public void clickViewButton() {
        viewButton.get(0).click();

    }

    public void trainingplanpageprocessbycheckerapproval() throws InterruptedException {

        // Wait for at least one grid cell to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Proceed only if the list is not empty
            actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();

            // Scroll to the remarks textbox
            WebElement remarkstextbox = driver.findElement(By.xpath("//label[@id='P16_REMARKS_LABEL']"));
            wait.until(ExpectedConditions.visibilityOf(remarkstextbox));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", remarkstextbox);

            // Locate remarks input and approval button
            WebElement trainingplanpageremarksbox = driver.findElement(By.name("P16_REMARKS"));
            WebElement approvalbycheckerbutton = driver.findElement(By.xpath("(//*[@type='button'])[13]"));

            // Fill in the remarks and click the approval button
            trainingplanpageremarksbox.sendKeys("Associate Checked Successfully");
            js.executeScript("arguments[0].click();", approvalbycheckerbutton);


    }

    public void latestdocumentstatuscheck() {

        String statusofdocument=driver.findElement(By.xpath("//*[.='Checked']")).getText();

        Assert.assertEquals(statusofdocument, "Checked");
    }

    public void trainingplanpageprocessbyapprover() {

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();

            System.out.println("Prince Found inside associate box");
            WebElement trainingplanpageremarksbox = driver.findElement(By.name("P16_REMARKS"));
            trainingplanpageremarksbox.sendKeys("Associate Checked Successfully");
            actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
            insidetotalplanapprovalbyapproverbutton.click();

    }

    public void trainingplanpageprocessbytrainerfinalapprover() throws InterruptedException {

        Actions actions = new Actions(driver);

        Thread.sleep(500);
        String revnumber=driver.findElement(By.cssSelector("[name='P16_REPORT_NUMBERR']")).getText();
        Assert.assertEquals(revnumber,"");
        Thread.sleep(500);
        actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        WebElement traincompletebutton=driver.findElement(By.xpath("(//*[.='Training Complete'])[3]"));
        Thread.sleep(500);
        actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        WebElement remarkfield=driver.findElement(By.name("P16_REMARKS"));
        remarkfield.sendKeys("Train Done");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()",traincompletebutton);
        System.out.println(driver.getCurrentUrl());

    }

}
