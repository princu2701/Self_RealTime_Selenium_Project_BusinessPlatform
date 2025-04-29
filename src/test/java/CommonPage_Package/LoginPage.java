package CommonPage_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriverWait wait;
    WebDriver driver;

    public LoginPage(WebDriver driver){

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        this.driver=driver;

        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "P9999_USERNAME")
    private WebElement username;

    @FindBy(name = "P9999_PASSWORD")
    private WebElement password;


    @FindBy(xpath = "//*[.='Sign In']")
    private WebElement signinbutton;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSigninbutton() {
        return signinbutton;
    }

    public void loginvalid(String usernames,String passwords) throws InterruptedException {

        if (username.isDisplayed()){

            wait.until(ExpectedConditions.visibilityOf(username));

            Thread.sleep(2000);
            username.sendKeys(usernames);
            password.sendKeys(passwords);
        }
        signinbutton.click();


    }
}
