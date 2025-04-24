package retryanalyzerpackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {

    private int count = 0;
    private static final int MAX_RETRIES = 3; // Number of retries

    @Override
    public boolean retry(ITestResult result) {
        if (count < MAX_RETRIES) {
            count++;
            System.out.println("🔁 Retrying... Attempt " + (count));
            return true; // Retry the test
        }
        return false; // No retries after this
    }
}
