package steps;

import org.openqa.selenium.WebDriver;
import page.CalculatorPage;

public class CalculatorSteps {
    private WebDriver driver;
    public CalculatorSteps(WebDriver driver){
        this.driver = driver;
    }

    public void inputNumero1(String numero1){
        this.driver.findElement(CalculatorPage.txtNumero1).sendKeys(numero1);
    }
    public void inputNumero2(String numero2){
        this.driver.findElement(CalculatorPage.txtNumero2).sendKeys(numero2);
        this.driver.findElement(CalculatorPage.btnMultiplicacion).click();
    }
    public String getResultado(){
        return this.driver.findElement(CalculatorPage.txtResultado).getText();
    }
}
