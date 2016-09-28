package com.sura.policycenter.selenium.pages.renovacion;


import com.sura.commons.selenium.Commons;
import com.sura.serenitybdd.util.GwNavegacionUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReglaPreRenovacionDirPaPage extends Commons {

    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_Create:PolicyFileMenuActions_PreRenewalDirection-textEl']")
    WebElementFacade lstOpcionPreviasALaRenovacion;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:0']")
    WebElementFacade lblInstruccionesPreviasRenovacion;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Edit-btnInnerEl']")
    WebElementFacade btnEditar;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-labelEl']")
    WebElementFacade lblInstrucciones;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-inputEl']")
    WebElementFacade txtLista;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Cancel']")
    WebElementFacade btnCancelar;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:0']")
    WebElementFacade lblResumen;

    public ReglaPreRenovacionDirPaPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarARenovacion() {
        lstOpcionPreviasALaRenovacion.click();
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(lblInstruccionesPreviasRenovacion).shouldBeVisible();
    }

    public void ingresaEditarInstrucciones() {
        btnEditar.click();
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(lblInstrucciones).waitUntilPresent();
    }

    public void validaLista(ExamplesTable opcionesDir) throws Exception {
        waitUntil(800);
        txtLista.click();
        this.validarDatosDeLaLista(opcionesDir);
        btnCancelar.click();
        waitFor(lblResumen).waitUntilPresent();
    }

    private void validarDatosDeLaLista(ExamplesTable tipoCanal) throws Exception {
        List<WebElementFacade> elementoInstruccion;
        List<String> elementosRequeridos = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(tipoCanal);
        for (String tipo : elementosRequeridos) {
            elementoInstruccion = withTimeoutOf(1, TimeUnit.SECONDS).findAll("//li[contains(.,'" + tipo + "')]");
            for (WebElementFacade lista : elementoInstruccion) {
                MatcherAssert.assertThat(tipo, Matchers.containsString(lista.getText()));
            }
        }
    }

}
