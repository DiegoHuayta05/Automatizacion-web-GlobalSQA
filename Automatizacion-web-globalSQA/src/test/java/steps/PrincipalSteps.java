package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import page.PrincipalPage;

public class PrincipalSteps {
    private WebDriver driver;

    //constructor
    public PrincipalSteps(WebDriver driver){
        this.driver = driver;
    }

    public void calculatorSimple(){
        WebElement testerHub = driver.findElement(PrincipalPage.btnTesterHub);
        WebElement angularJS = driver.findElement(PrincipalPage.btnAngularJS);
        WebElement calculatorSimple = driver.findElement(PrincipalPage.btnSimpleCal);

        Actions action = new Actions(driver);
        action.moveToElement(testerHub).perform(); //mouse hover
        action.moveToElement(angularJS).perform();
        action.moveToElement(calculatorSimple).perform();

        action.click().build().perform();

    }
}
