package AdminAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DepartmentPage {

  protected WebDriver driver;

  public DepartmentPage(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//a[normalize-space()='Department']")
  private WebElement Departmentadminpanelbutton;

  @FindBy(xpath = "//input[@id=\"R89780314606113744_search_field\"]")
  private WebElement deparmentsearchbutton;

  @FindBy(xpath = "//button[@id=\"R89780314606113744_search_button\"]")
  private WebElement departmentgobutton;

  @FindBy(xpath = "//button[@id='B89782199066113750']")
  private WebElement createdepartmentdataboxbutton;

  @FindBy(xpath = "//tbody/tr/td/a/span/span")
  private List<WebElement> viewdatabuttonbynumberbutton;

  @FindBy(css = "#P3_DEPARTMENT_NAME")
  private WebElement dataentrydeparmentbox;

  @FindBy(css = "[class='t-Button t-Button--hot ']")
  private WebElement okbuttondepartmentdatabutton;

  @FindBy(xpath = "(//*[.='Cancel'])[1]")
  private WebElement canceldepartmentdatabutton;

  public void departmentadminbutton() {

    Departmentadminpanelbutton.click();
  }

  public void datacreatebutton() {

    createdepartmentdataboxbutton.click();

  }

  public void searchmultipledataboxes(String data) {

    deparmentsearchbutton.sendKeys(data);

    departmentgobutton.click();
  }

  public void viewexistingdata() {

    viewdatabuttonbynumberbutton.get(0).click();
  }

  public void cancelcreatingnewdepartmentname() {

    canceldepartmentdatabutton.click();
  }

  public void finaldepartmentnameokbutton() {

    okbuttondepartmentdatabutton.click();

  }

  public void enterdepartmentnamedatafield(String data) {

    dataentrydeparmentbox.sendKeys(data);

  }

  public void senddatawithoutenteringvalue() throws InterruptedException {

    Departmentadminpanelbutton.click();
    createdepartmentdataboxbutton.click();
    WebElement framebox = driver.findElement(By.cssSelector("[title='Department Mdm Form']"));
    driver.switchTo().frame(framebox);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(okbuttondepartmentdatabutton));
    okbuttondepartmentdatabutton.click();
    String errortext = driver.findElement(By.cssSelector("#P3_DEPARTMENT_NAME_error")).getText();
    Assert.assertEquals(errortext, "Department Name is mandatory.");
  }

  public void viewdata1() throws InterruptedException {

    Departmentadminpanelbutton.click();
    viewdatabuttonbynumberbutton.get(0).click();

    WebElement framebox = driver.findElement(By.cssSelector("[title='Department Mdm Form']"));
    driver.switchTo().frame(framebox);

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    WebElement deptboxname = wait
        .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[for='P3_DEPARTMENT_NAME']")));

    if (deptboxname.isDisplayed()) {
      Assert.assertTrue(true);
      canceldepartmentdatabutton.click();
      // Switch back to the main content before clicking the next button
      driver.switchTo().defaultContent();
    }
  }

  public void viewdata2() throws InterruptedException {

    Departmentadminpanelbutton.click();
    viewdatabuttonbynumberbutton.get(1).click();

    WebElement framebox = driver.findElement(By.cssSelector("[title='Department Mdm Form']"));
    driver.switchTo().frame(framebox);

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    WebElement deptboxname = wait
        .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[for='P3_DEPARTMENT_NAME']")));

    if (deptboxname.isDisplayed()) {
      Assert.assertTrue(true);
      canceldepartmentdatabutton.click();
      // Switch back to the main content before clicking the next button
      driver.switchTo().defaultContent();
    }
  }

}
