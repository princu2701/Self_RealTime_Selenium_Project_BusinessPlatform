package ConclusionPackage;
import BaseTests.basetest;
import org.testng.annotations.Test;

public class FinalPageTest extends basetest {

    @Test
    public void adminp(){

        alogin.loginvalid("sp", "sp"); // `alogin` is already initialized in basetest

    }
}
