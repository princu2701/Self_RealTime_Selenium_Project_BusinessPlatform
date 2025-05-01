package dashboard;

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


    WebDriver driver;
    public TotalPlanPage(WebDriver driver) {

        this.driver=driver;

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class='fa fa-eye']")
    private WebElement viewButton;

    @FindBy(xpath = "//button[@id='B63630916852151016']")
    private WebElement insidetotalplanapprovalbyapproverbutton;

    @FindBy(id = "B63630811748151015")
    private WebElement insidetotalplanrejectionbyapproverbutton;

    @FindBy(id = "B63633022167151037")
    private WebElement insidetotalplanraisequerybyapproverbutton;

    public void clickViewButton() {
        viewButton.click();

    }

    public void trainingplanpageprocessbycheckerapproval() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> AssociateData=driver.findElements(By.xpath("(//*[@role=\"gridcell\"])"));

        if (AssociateData.get(0).getText().contains("prince")){

            WebElement trainingplanpageremarksbox= driver.findElement(By.name("P16_REMARKS"));
            trainingplanpageremarksbox.sendKeys("Associate Checked Successfully");
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement approvalbycheckerbutton = driver.findElement(By.xpath("(//*[@type='button'])[13]"));
            actions.moveToElement(approvalbycheckerbutton).build().perform();
            js.executeScript("arguments[0].click();", approvalbycheckerbutton);
        }

    }

    public void latestdocumentstatuscheck() {

        String statusofdocument=driver.findElement(By.xpath("//*[.='Checked']")).getText();

        Assert.assertEquals(statusofdocument, "Checked");
    }

    public void trainingplanpageprocessbyapprover() {

        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> AssociateData = driver.findElements(By.xpath("(//*[@role=\"gridcell\"])"));
        actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();

        if (AssociateData.get(0).getText().contains("prince")) {
            System.out.println("Prince Found inside associate box");
            WebElement trainingplanpageremarksbox = driver.findElement(By.name("P16_REMARKS"));
            trainingplanpageremarksbox.sendKeys("Associate Checked Successfully");
            actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            actions.moveToElement(insidetotalplanapprovalbyapproverbutton).build().perform();
            js.executeScript("arguments[0].click();", insidetotalplanapprovalbyapproverbutton);

        }

    }

}
