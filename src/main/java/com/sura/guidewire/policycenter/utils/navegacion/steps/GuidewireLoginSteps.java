package com.sura.guidewire.policycenter.utils.navegacion.steps;

import com.sura.guidewire.policycenter.utils.navegacion.pages.GuidewireLoginPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;


public class GuidewireLoginSteps extends ScenarioSteps {
    private GuidewireLoginPages loginPage;

    public GuidewireLoginPages getLoginPage() {
        return loginPage;
    }


    @Step
    public String validarQueElTituloDeLaPaginaPrincipalSeaMisActividads() {
        return loginPage.obtenerTituloPaginaPplAcceso();
    }

    @Step
    public void abrirNavegador(WebDriver driver) {
        this.loginPage = new GuidewireLoginPages(driver);
        this.loginPage.open();
    }

    @Step
    public void loguearseAPolicycenterConRol(String rolUsuario){
        abrirNavegador(SerenityWebdriverManager.inThisTestThread().getCurrentDriver());
        loginPage.ingresarPorRol(rolUsuario);
    }

    @Step
    public void loguearseAPolicycenterComoSu(String usuario, String contrasenia, String pais) {
        if (loginPage.elemento(GuidewireLoginPages.TXT_USUARIO_SEUS) == null && loginPage.elemento(GuidewireLoginPages.TXT_CONTRASENIA_SEUS) == null) {
            loginPage.enter("su").into(loginPage.elemento(GuidewireLoginPages.TXT_USUARIO));
            loginPage.enter("gw").into(loginPage.elemento(GuidewireLoginPages.TXT_CONTRASENIA));
            loginPage.elemento(GuidewireLoginPages.BTN_LOGIN).click();
        } else {
            loginPage.enter(usuario).into(loginPage.elemento(GuidewireLoginPages.TXT_USUARIO_SEUS));
            loginPage.enter(contrasenia).into(loginPage.elemento(GuidewireLoginPages.TXT_CONTRASENIA_SEUS));
        }
        if (loginPage.elemento(GuidewireLoginPages.CBO_PAIS) != null){
            loginPage.elemento(GuidewireLoginPages.CBO_PAIS).selectByVisibleText(pais);
            loginPage.elemento(GuidewireLoginPages.BTN_LOGIN_SEUS).click();
        }

    }


}
