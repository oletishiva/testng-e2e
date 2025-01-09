import org.testng.annotations.*;

public class LoginTests {

    @BeforeClass
    public void setupLogin() {
        System.out.println("LoginTests - BeforeClass: Setting up preconditions for login tests.");
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
}
