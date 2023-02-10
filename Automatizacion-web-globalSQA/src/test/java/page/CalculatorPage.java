package page;

import org.openqa.selenium.By;

public class CalculatorPage {
    public static By txtNumero1 = By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/input");
    public static By txtNumero2 = By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/input");
    public static By btnMultiplicacion = By.xpath("/html/body/div/table/tbody/tr[3]/td[2]/select/option[3]");
    public static By txtResultado = By.xpath("/html/body/div/b");

}
