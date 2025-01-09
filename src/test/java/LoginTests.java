import org.testng.annotations.*;

public class LoginTests {

    @BeforeClass
    public void setupLogin() {
        System.out.println("LoginTests - BeforeClass: Setting up preconditions for login tests.");
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("LoginTests - Before Method: Setting up log  functionality.");
    }

    @Test
    public void testValidLogin() {
        System.out.println("Executing LoginTests - Test: Valid Login Test.");
    }

    @Test
    public void testInvalidLogin() {
        System.out.println("Executing LoginTests - Test: Invalid Login Test.");
    }

    @AfterClass
    public void tearDownLogin() {
        System.out.println("LoginTests - AfterClass: Cleaning up after login tests.");
    }

    @AfterMethod
    public void teardownLog() {
        System.out.println("LoginTests - AfterMethod: teardown log after method.");
    }

    @BeforeTest
    public void checkNetworkSignal() {
        System.out.println("BeforeTest - check network signal.");
    }

    @AfterTest
    public void turnOffSignal() {
        System.out.println("AfterTest - turn off wifi network signal.");
    }

    @BeforeSuite
    public void installAPk() {
        System.out.println("Beforesuite - installApk.");
    }
}
