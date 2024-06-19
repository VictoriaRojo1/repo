package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final By EnterEmail = By.cssSelector("#user");
    private final By NextButton = By.cssSelector("#sso-button");
    private final By EnterPassword = By.cssSelector("#user-password-input");
    private final By SingInButton = By.cssSelector("#sign-in-button");


     public HomePage(WebDriver driver){
         this.driver=driver;
     }
    public void sendEmail(String email) {
        driver.findElement(EnterEmail).sendKeys(email);
    }
    public void clickNextButton (){
        driver.findElement(NextButton).click();
    }
    public void sendPassword (String password){
        driver.findElement(EnterPassword).sendKeys(password);
    }
    public PlatformAccess clickSingInButton (){
        driver.findElement(SingInButton).click();
        return new PlatformAccess (driver);
    }
}
