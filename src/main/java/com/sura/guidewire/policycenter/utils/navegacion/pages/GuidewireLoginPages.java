package com.sura.guidewire.policycenter.utils.navegacion.pages;

import com.google.common.base.Function;
import com.sura.guidewire.policycenter.utils.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;



@DefaultUrl("http://local.sura.com:8180/pc/PolicyCenter.do")
//@DefaultUrl("http://dllocoreseguros.suramericana.com:7003/pc/PolicyCenter.do")
public class GuidewireLoginPages extends PageUtil implements Serializable{

    @FindBy(xpath = ".//*[@id='country']")
    private WebElementFacade pais;
    @FindBy(id = "username")
    private WebElementFacade usuario;
    @FindBy(xpath = ".//*[@id='password']")
    private WebElementFacade contrasenia;
    @FindBy(xpath = ".//*[@id='lower']/input")
    private WebElementFacade btnSubmit;
    @FindBy(xpath = ".//*[@id='TabBar:ContactTab-btnWrap']")
    private WebElementFacade mnuContact;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    private WebElementFacade usuario1;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    private WebElementFacade contrasenia1;
    @FindBy(xpath = ".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    private WebElementFacade btnSubmit1;

    private static final long serialVersionUID = 1L;
    public static final String TITULO_PAGINA_PPL_DE_ACCESO = ".//span[@id='DesktopActivities:DesktopActivitiesScreen:0']";
    public static final String TXT_USUARIO_SEUS = "//input[@placeholder='Usuario']";
    public static final String TXT_USUARIO = "//input[@id='Login:LoginScreen:LoginDV:username-inputEl']";
    public static final String TXT_CONTRASENIA_SEUS = "//input[@placeholder='Contraseña']";
    public static final String TXT_CONTRASENIA = "//input[@id='Login:LoginScreen:LoginDV:password-inputEl']";
    public static final String CBO_PAIS = ".//*[@id='country']";
    public static final String BTN_LOGIN_SEUS = "//input[@type='submit']";
    public static final String BTN_LOGIN = "//span[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']";
    public static final String MNU_CONTACTO = "//span[@id='TabBar:ContactTab-btnInnerEl']";

    private static final int CONSTANTE_5 = 5;
    private static final int CONSTANTE_250 = 250;

    public GuidewireLoginPages(WebDriver driver){
        super(driver);
    }

    public void clicBotonLogIn(){
        findBy(BTN_LOGIN).then().click();
    }

    public void digitar(String elemento, String valor){
        enter(valor).into($(elemento ));
        esperarAQueDigite(elemento, valor);
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
        } catch (StaleElementReferenceException sere){
            LOGGER.info("Elemento de NuevaCotizacionPage no existe en el DOM Elemento: " + xpath + "TRACE: " + sere);
        } catch (Exception e) {
            LOGGER.info("Error desconocido en: NuevaCotizacionPage.elemento Elemento: " + xpath + "TRACE: " + e);
        }

        return elemento;
    }

    public String obtenerTituloPaginaPplAcceso(){
        return $(TITULO_PAGINA_PPL_DE_ACCESO).getText();
    }

    private void esperarAQueDigite(String elemento, String valor) {
        waitForCondition()
                .withTimeout(CONSTANTE_5, TimeUnit.SECONDS)
                .pollingEvery(CONSTANTE_250,TimeUnit.MILLISECONDS)
                .until(valorDeEntradaActualizadoA(elemento, valor));
    }

    private Function<? super WebDriver, Boolean> valorDeEntradaActualizadoA(final String elemento, final String valor) {
        return new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return $(elemento).getValue().equalsIgnoreCase(valor);
            }
        };
    }


    public void ingresar_por_rol(String rol) {
        LOGGER.info("INICIO GuidewireLoginPages.ingresar_por_rol( " + rol + ")");
        if ("Asesor".equals(rol)) {
            setImplicitTimeout(WAIT_TIME_2, TimeUnit.SECONDS);
            if (!findAll(TXT_USUARIO).isEmpty()) {
                enter("su").into(elemento(GuidewireLoginPages.TXT_USUARIO));
                enter("gw").into(elemento(GuidewireLoginPages.TXT_CONTRASENIA));
                elemento(GuidewireLoginPages.BTN_LOGIN).click();
            }
            resetImplicitTimeout();
            setImplicitTimeout(0, TimeUnit.SECONDS);
            if (!mnuContact.isPresent()) {
                if (usuario1.isPresent()) {
                    if (!findAll(TXT_USUARIO).isEmpty()) {
                        enter("su").into(elemento(GuidewireLoginPages.TXT_USUARIO));
                        enter("gw").into(elemento(GuidewireLoginPages.TXT_CONTRASENIA));
                        elemento(GuidewireLoginPages.BTN_LOGIN).click();
                    }
                } else {
                    this.usuario.waitUntilPresent();
                    this.usuario.clear();
                    this.contrasenia.clear();
                    this.pais.click();
                    this.pais.selectByVisibleText("Colombia");
                    this.usuario.type("pedrvevi");
                    this.contrasenia.type("pedrvevi");
                    btnSubmit.click();
                }
            }
            resetImplicitTimeout();
        }
        waitForPresenceOf(MNU_CONTACTO);
        LOGGER.info("FIN GuidewireLoginPages.ingresar_por_rol( " + rol + ")");
    }
}


