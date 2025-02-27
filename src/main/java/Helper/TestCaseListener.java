package Helper;
 
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 
public class TestCaseListener implements ITestListener {
 
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Listener: Running test case: " + result.getMethod().getMethodName());
    }
    @Override public void onTestSuccess(ITestResult result) {}
    @Override public void onTestFailure(ITestResult result) {}
    @Override public void onTestSkipped(ITestResult result) {}
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    @Override public void onStart(ITestContext context) {}
    @Override public void onFinish(ITestContext context) {}
<<<<<<< HEAD
}
=======
}
>>>>>>> 954a21f8d08575b4b44f3d4783b34ab593e193e1
