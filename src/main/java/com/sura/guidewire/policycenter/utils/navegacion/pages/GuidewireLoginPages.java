package com.sura.guidewire.policycenter.utils.navegacion.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
//@DefaultUrl("http://dllocoreseguros.suramericana.com:7003/pc/PolicyCenter.do")
public class GuidewireLoginPages extends PageUtil {

    @FindBy(xpath = ".//*[@id='country']")
    private WebElementFacade campoPais;
    @FindBy(id = "username")
    private WebElementFacade campoUsuario;
    @FindBy(xpath = ".//*[@id='password']")
    private WebElementFacade campoContrasenia;
    @FindBy(xpath = ".//*[@id='lower']/input")
    private WebElementFacade botonEnviar;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    private WebElementFacade menuContacto;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    private WebElementFacade campoUsuario1;

    public static final String TITULO_PAGINA_PPL_DE_ACCESO = ".//span[@id='DesktopActivities:DesktopActivitiesScreen:0']";
    public static final String TXT_USUARIO_SEUS = "//input[@placeholder='Usuario']";
    public static final String TXT_USUARIO = "//input[@id='Login:LoginScreen:LoginDV:username-inputEl']";
    public static final String TXT_CONTRASENIA_SEUS = "//input[@placeholder='Contraseña']";
    public static final String TXT_CONTRASENIA = "//input[@id='Login:LoginScreen:LoginDV:password-inputEl']";
    public static final String CBO_PAIS = ".//*[@id='country']";
    public static final String BTN_LOGIN_SEUS = "//input[@type='submit']";
    public static final String BTN_LOGIN = "//span[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']";
    public static final String MNU_CONTACTO = "//span[@id='TabBar:ContactTab-btnInnerEl']";

    public GuidewireLoginPages(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade elemento(String xpath) {
        getDriver().manage().window().maximize();
        WebElementFacade elemento = null;
        try {
            setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
            waitFor($(xpath)).shouldBeVisible();
            elemento = element(find(By.xpath(xpath)));
            resetImplicitTimeout();

        } catch (NoSuchElementException e) {
            LOGGER.info("Elemento de NuevaCotizacionPage no encontrado Elemento: " + xpath + "TRACE: " + e);
        } catch (StaleElementReferenceException sere) {
            LOGGER.info("Elemento de NuevaCotizacionPage no existe en el DOM Elemento: " + xpath + "TRACE: " + sere);
        } catch (Exception e) {
            LOGGER.info("Error desconocido en: NuevaCotizacionPage.elemento Elemento: " + xpath + "TRACE: " + e);
        }
        return elemento;
    }

    public String obtenerTituloPaginaPplAcceso() {
        return $(TITULO_PAGINA_PPL_DE_ACCESO).getText();
    }


    public void ingresarPorRol(String rol) {
        LOGGER.info("INICIO GuidewireLoginPages.ingresarPorRol( " + rol + ")");
        if ("Asesor".equals(rol)) {
            setImplicitTimeout(0, TimeUnit.SECONDS);
            if (!menuContacto.isPresent() && campoUsuario1.isPresent() && !findAll(TXT_USUARIO).isEmpty()) {
                enter("su").into(elemento(GuidewireLoginPages.TXT_USUARIO));
                enter("gw").into(elemento(GuidewireLoginPages.TXT_CONTRASENIA));
                elemento(GuidewireLoginPages.BTN_LOGIN).click();
            } else {
                this.campoUsuario.waitUntilPresent();
                this.campoUsuario.clear();
                this.campoContrasenia.clear();
                this.campoPais.click();
                this.campoPais.selectByVisibleText("Colombia");
                this.campoUsuario.type("pedrvevi");
                this.campoContrasenia.type("pedrvevi");
                botonEnviar.click();
            }
        }
        resetImplicitTimeout();
        waitForPresenceOf(MNU_CONTACTO);
        LOGGER.info("FIN GuidewireLoginPages.ingresarPorRol( " + rol + ")");
    }
}
