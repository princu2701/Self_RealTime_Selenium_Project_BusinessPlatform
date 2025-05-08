package OtherUserFlows;

import BaseTests.Basetest_1;
import  GlobalMethodstoUse.GlobalMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlowCaseTest1 extends Basetest_1{

    @Test(description = "plant",priority = 1)
    public void plantcreation() throws InterruptedException {

        adminactivity();
          ahomepage.adminpaneloption();
          plantPage.plantbutton();
         plantPage.plantboxopeningbutton();
        plantPage.createnewplantwithvaliddata("falseplant");
        driver.switchTo().defaultContent();

    }

   @Test(description = "department creation",priority = 2)
    public void departmentfieldcreation() throws InterruptedException {

        adminactivity();
        ahomepage.adminpaneloption();
        departmentPage.departmentadminbutton();
        departmentPage.datacreatebutton();
        departmentPage.senddatawithenteringvalue("falsedepartment");
   }

   @Test(description = "plant and department mapping",priority = 3)
    public void plantdepartmentmapping() throws InterruptedException {

        adminactivity();
        plantDepartmentmappingPage.plantdepartmentadminbutton();
        plantDepartmentmappingPage.plantdepartmenthomecreatebutton();
        plantDepartmentmappingPage.proceedwithplantnameonly("falseplant");
        plantDepartmentmappingPage.proceedwithdepartmentnameonly("falsedepartment");
        String errortext=driver.findElement(By.xpath("//div[@id='P14_PLANT_NAME_error']")).getText();
        if (errortext.contains("already exists")){
            System.out.println("Data Already Created Before");
        }
        driver.switchTo().defaultContent();
   }

   @Test
   public void usermasterpreptraincreation() throws InterruptedException {

        adminactivity();
        userMasterApge.usermasteradminbutton();
        userMasterApge.usermastercreatebutton();
//        userMasterApge.preptrainerflowtestingdata("falseplant","falsedepartment");

   }

   @Test
   public void usermastercheckercreation() throws InterruptedException {

        adminactivity();
        userMasterApge.usermasteradminbutton();
       userMasterApge.usermastercreatebutton();
//       userMasterApge.CheckerUserCreationflow();

   }

    @Test
    public void usermasterapprovercreation() throws InterruptedException {

        adminactivity();
        userMasterApge.usermasteradminbutton();
        userMasterApge.usermastercreatebutton();
//        userMasterApge.ApproverUserMasterCreationflow();
    }























   /*
   Below is a global type method
    */
   public void adminactivity() throws InterruptedException {

        Thread.sleep(200);
        alogin.loginvalid("gayatri","gayatri");
        ahomepage.sidebaropen();
       ahomepage.adminpaneloption();


   }



}


