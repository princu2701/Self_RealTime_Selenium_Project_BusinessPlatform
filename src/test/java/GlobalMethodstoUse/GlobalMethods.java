package GlobalMethodstoUse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GlobalMethods {

    WebDriver driver;

    public void javascriptclickmethod(WebElement element){

        JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();",element);
    }
    public void WebDriverWaitMethod(WebElement element){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void forcestop() throws InterruptedException {

        Thread.sleep(2000);
    }

}
