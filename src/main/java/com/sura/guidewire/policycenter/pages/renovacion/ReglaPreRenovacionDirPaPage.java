package com.sura.guidewire.policycenter.pages.renovacion;


import com.sura.guidewire.policycenter.util.PageUtil;
import com.sura.guidewire.policycenter.util.GwNavegacionUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReglaPreRenovacionDirPaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_Create:PolicyFileMenuActions_PreRenewalDirection-textEl']")
    WebElementFacade listaOpcionPreviasALaRenovacion;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:0']")
    WebElementFacade labelInstruccionesPreviasRenovacion;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Edit-btnInnerEl']")
    WebElementFacade botonEditar;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-inputEl']")
    WebElementFacade comboBoxLista;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Cancel']")
    WebElementFacade botonCancelar;
    @FindBy(xpath = ".//*[@id='PolicyFile_Summary:Policy_SummaryScreen:0']")
    WebElementFacade labelResumen;

    public ReglaPreRenovacionDirPaPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarARenovacion() {
        listaOpcionPreviasALaRenovacion.click();
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(labelInstruccionesPreviasRenovacion).shouldBeVisible();
    }

    public void ingresaEditarInstrucciones() {
        botonEditar.click();
    }

    public void validaLista(ExamplesTable opcionesDir){
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(comboBoxLista).waitUntilPresent().click();
        this.validarDatosDeLaLista(opcionesDir);
        botonCancelar.click();
        waitFor(labelResumen).waitUntilPresent();
    }

    private void validarDatosDeLaLista(ExamplesTable tipoCanal){
        List<WebElementFacade> elementoInstruccion;
        List<String> elementosRequeridos = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(tipoCanal);
        for (String tipo : elementosRequeridos) {
            elementoInstruccion = withTimeoutOf(WAIT_TIME_1, TimeUnit.SECONDS).findAll("//li[contains(.,'" + tipo + "')]");
            for (WebElementFacade lista : elementoInstruccion) {
                MatcherAssert.assertThat(tipo, Matchers.containsString(lista.getText()));
            }
        }
    }

}
