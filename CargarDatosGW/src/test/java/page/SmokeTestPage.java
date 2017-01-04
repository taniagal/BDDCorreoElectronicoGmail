package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SmokeTestPage {
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    private WebElement campoTxtUsuario;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    private WebElement campoTxtContrasenia;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    private WebElement botonIniciar;
    @FindBy(xpath = ".//*[@id='country']")
    private WebElement campoTxtPaisSeus;
    @FindBy(xpath = ".//*[@id='username']")
    private WebElement campoTxtUsuarioSeus;
    @FindBy(xpath = ".//*[@id='password']")
    private WebElement campoTxtContraseniaSeus;
    @FindBy(xpath = ".//*[@id='lower']/input")
    private WebElement botonIniciarSeus;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnWrap']")
    private WebElement menuPoliza;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElement campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:PolicyNumber-inputEl']")
    private WebElement campoNumeroDePoliza;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl']")
    private WebElement campoNumeroDeCuenta;


    public void login(String usuario, String contrasenia, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (driver.findElements(By.xpath(".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")).size() > 0) {
            campoTxtUsuario.sendKeys("su");
            campoTxtContrasenia.sendKeys("gw");
            botonIniciar.click();
        } else {
            campoTxtPaisSeus.sendKeys("Colombia");
            campoTxtUsuarioSeus.clear();
            campoTxtUsuarioSeus.sendKeys(usuario);
            campoTxtContraseniaSeus.clear();
            campoTxtContraseniaSeus.sendKeys(contrasenia);
            botonIniciarSeus.click();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(menuPoliza)).isDisplayed();
    }


    public void buscarPoliza(String numPoliza){
        campoTxtBuscar.sendKeys("Policy " + numPoliza);
        campoTxtBuscar.sendKeys(Keys.ENTER);
    }

    public void buscarCuenta(String numCuenta){
        campoTxtBuscar.sendKeys("Account " + numCuenta);
        campoTxtBuscar.sendKeys(Keys.ENTER);
    }

    public Boolean verificarResumenDePoliza(String numPoliza){
        return campoNumeroDePoliza.getText().contains(numPoliza);
    }

    public Boolean verificarResumenDeCuenta(String numPoliza){
        return campoNumeroDeCuenta.getText().contains(numPoliza);
    }
}
