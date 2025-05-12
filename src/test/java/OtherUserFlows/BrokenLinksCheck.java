package OtherUserFlows;

import BaseTests.Basetest_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinksCheck extends Basetest_1 {

    @Test(description = "broken links check")
    public void brokenLinksCheck() throws InterruptedException {
        alogin.loginvalid("sp", "sp");

        // Get all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            // Skip if href is null or empty
            if(url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            // Skip non-http links (like mailto: or javascript:)
            if(!url.startsWith("http")) {
                System.out.println("URL belongs to another protocol: " + url);
                continue;
            }

            try {

                // Create connection and check response code
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();

                if(responseCode >= 400) {
                    System.out.println(url + " is a broken link. Response code: " + responseCode);
                } else {
                    System.out.println(url + " is a valid link. Response code: " + responseCode);
                }
            } catch (Exception e) {
                System.out.println("Error checking link " + url + ": " + e.getMessage());
            }
        }
    }
}