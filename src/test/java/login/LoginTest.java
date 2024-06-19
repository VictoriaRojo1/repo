package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.PlatformAccess;


public class LoginTest extends BaseTest {

    @Test
    public void TestSuccessfulLogin (){
        homePage.sendEmail("nrodriguez@knowland.com");
        homePage.clickNextButton();
        homePage.sendPassword("June@2024");
        PlatformAccess platformAccess = homePage.clickSingInButton();
    }
}
