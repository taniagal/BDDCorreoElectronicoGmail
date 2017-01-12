package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {
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
    private static final int WAIT_10 = 10;
    private static final int WAIT_3 = 3;
    private static final int WAIT_30 = 30;


    public void login(String usuario, String contrasenia, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_10);
        driver.manage().timeouts().implicitlyWait(WAIT_3, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(WAIT_30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(menuPoliza)).isDisplayed();
    }
}
