package Admin_Preparer_Trainer_Package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PlantPage {

    WebDriverWait wait;
    WebDriver driver;
    public PlantPage(WebDriver driver){

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.driver=driver;

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[normalize-space()='Plant']")
    private WebElement plantpageoption;

    @FindBy(css = "#R89625922417751829_search_field")
    private WebElement searchplantdatabutton;

    @FindBy(css = "[title='Edit']")
    private List<WebElement> editbutton;

    @FindBy(xpath = "(//*[.='Create'])[2]")
    private WebElement createnewplantdatabox;

    @FindBy(css = "[title='Plant Mdm Form']")
    private WebElement frameboxplant;

    @FindBy(css = "#P6_PLANT_NAME")
    private WebElement insertplantname;

    @FindBy(xpath = "(//*[@type='button'])[6]")
    private WebElement createplantbutton;

    public void plantbutton(){

        plantpageoption.click();

        if (driver.getTitle().equals("Plant Mdm Report")){

            System.out.println("Reached Plant Mdm");
        }
    }

    public void editlatestdata(){

            if (!editbutton.isEmpty()) {
                editbutton.get(0).click();
            } else {
                System.out.println("No edit button found");
            }

    }

    public void createnewplantwithvaliddata(String plantname) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOf(createplantbutton));
        Thread.sleep(500);
        driver.switchTo().frame(frameboxplant);
        insertplantname.sendKeys(plantname);
    }

    public void createplantbutton(){

//        driver.switchTo().frame(frameboxplant);

        createnewplantdatabox.click();
    }

    public void plantnamewithinvaliddata(String invalidname) {
        driver.switchTo().frame(frameboxplant);

        insertplantname.clear();
        insertplantname.sendKeys(invalidname);
        createnewplantdatabox.click();

        try {
            if (insertplantname.isDisplayed()) {
                String value = insertplantname.getAttribute("value");
                if (value == null || value.isEmpty()) {
                    System.out.println("Validation passed: Invalid plant name was not accepted.");
                } else {
                    System.out.println("Validation failed: Invalid plant name was accepted - " + value);
                }
            }
        } catch (Exception e) {
            // If form is closed and element is gone
            System.out.println("Form closed — assuming invalid data was accepted and form moved ahead.");
        }

        driver.switchTo().defaultContent();
    }


    public void plantboxopeningbutton(){

        JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();",createplantbutton);

    }

}
