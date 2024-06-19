package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlatformAccess {
    private WebDriver driver;
    private By alertText = By.partialLinkText("Select a property to complete login and access the Knowland platform.");
    public PlatformAccess(WebDriver driver) {
        this.driver = driver;
    }
    public void fineAlert(String alert){
        driver.findElement(alertText).getText();
    }

}
