package ConclusionPackages;

import BaseTests.Basetest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TrainingPlansFlowTesting extends Basetest {

    @Test(description = "Testing of Training Plant Creation")
    public void realtest1() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            alogin.loginvalid("gayatri", "gayatri");

            // Wait for the "Approved" button to be visible
            String title = driver.getTitle();

            if (title.contains("Skill Matrix Process")) {
                ahomepage.sidebaropen();
                ahomepage.adminpaneloption();
                ahomepage.trainingplanbutton();
                trainingPlanPage.straightflow();

                System.out.println("✅ Success: Test completed. Not retrying.");
                return; // Exit test — success!
            } else {
                System.out.println("❌ Button not displayed.");
                Assert.fail("Approved button was not visible.");
            }

        } catch (Exception e) {
            System.out.println("❌ Exception in test: " + e.getMessage());
            Assert.fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test(description = "Proceeding without adding data in some mandatory fields")
    public void realtest2(){

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            alogin.loginvalid("gayatri", "gayatri");

            // Wait for the "Approved" button to be visible
            String title = driver.getTitle();

            if (title.contains("Skill Matrix Process")) {
                ahomepage.sidebaropen();
                ahomepage.adminpaneloption();
                ahomepage.trainingplanbutton();
                trainingPlanPage.flowscenario2();

                System.out.println("✅ Success: Test completed. Not retrying.");
                return; // Exit test — success!
            } else {
                System.out.println("❌ Button not displayed.");
                Assert.fail("Approved button was not visible.");
            }

        } catch (Exception e) {
            System.out.println("❌ Exception in test: " + e.getMessage());
            Assert.fail("Exception occurred: " + e.getMessage());
        }

    }

    @Test(description = "Testing the Process without adding any associated in Training form page")
    public void realtest3(){

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            alogin.loginvalid("gayatri", "gayatri");

            // Wait for the "Approved" button to be visible
            String title = driver.getTitle();

            if (title.contains("Skill Matrix Process")) {
                ahomepage.sidebaropen();
                ahomepage.adminpaneloption();
                ahomepage.trainingplanbutton();
                trainingPlanPage.flowscenario3();

                System.out.println("✅ Success: Test completed. Not retrying.");
                return; // Exit test — success!
            } else {
                System.out.println("❌ Button not displayed.");
                Assert.fail("Approved button was not visible.");
            }

        } catch (Exception e) {
            System.out.println("❌ Exception in test: " + e.getMessage());
            Assert.fail("Exception occurred: " + e.getMessage());
        }

    }


    @Test(description = "Proceeding with the form without taking the process flow type")
    public void flowcovered4(){

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            alogin.loginvalid("gayatri", "gayatri");

            // Wait for the "Approved" button to be visible
            String title = driver.getTitle();

            if (title.contains("Skill Matrix Process")) {
                ahomepage.sidebaropen();
                ahomepage.adminpaneloption();
                ahomepage.trainingplanbutton();
                trainingPlanPage.flowscenario4();

                System.out.println("✅ Success: Test completed. Not retrying.");
                return; // Exit test — success!
            } else {
                System.out.println("❌ Button not displayed.");
                Assert.fail("Approved button was not visible.");
            }

        } catch (Exception e) {
            System.out.println("❌ Exception in test: " + e.getMessage());
            Assert.fail("Exception occurred: " + e.getMessage());
        }

    }
}
