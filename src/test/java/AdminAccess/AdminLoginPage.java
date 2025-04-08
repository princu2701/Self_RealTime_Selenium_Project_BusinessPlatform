package AdminAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {

    WebDriver driver;
    public AdminLoginPage(WebDriver driver){

        this.driver=driver;

        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "P9999_USERNAME")
    private WebElement username;

    @FindBy(name = "P9999_PASSWORD")
    private WebElement password;

    @FindBy(name = "B89609463906663664")
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

    public void loginvalid(String usernames,String passwords){

        if (username.isDisplayed()){

            username.sendKeys(usernames);
            password.sendKeys(passwords);
        }
        signinbutton.click();


    }
}
