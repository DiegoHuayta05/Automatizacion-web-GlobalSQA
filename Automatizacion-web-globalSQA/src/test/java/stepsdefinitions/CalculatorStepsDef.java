package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.CalculatorSteps;
import steps.PrincipalSteps;

public class CalculatorStepsDef {
    private WebDriver driver;
    private Scenario scenario;

    private CalculatorSteps calculatorsteps(WebDriver driver){
        return new CalculatorSteps(driver);
    }
    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Given("me encuentro en la página principal de globalSQA")
    public void me_encuentro_en_la_página_principal_de_global_sqa() {
        driver.get("https://www.globalsqa.com/");
        screenShot();
    }
    @And("me dirigo al apartado Calculadora")
    public void me_dirigo_al_apartado_calculadora() {
        PrincipalSteps principalsteps = new PrincipalSteps(driver);
        principalsteps.calculatorSimple();
        screenShot();
    }
    @When("ingreso el primer número {string} y el segundo número {string}")
    public void ingreso_el_primer_número_y_el_segundo_número(String num1, String num2) {
        CalculatorSteps calculatorsteps = new CalculatorSteps(driver);
        calculatorsteps.inputNumero1(num1);
        calculatorsteps.inputNumero2(num2);
    }
    @Then("el resultado es {string}")
    public void el_resultado_es(String resultExpect) {
        String resultado = calculatorsteps(driver).getResultado();
        Assertions.assertEquals(resultExpect,resultado);
        screenShot();
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
}
