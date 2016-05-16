package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;
import com.sura.serinitybdd.util.GuidewireUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

public class DisponibilidadDetalleProductoPage extends Guidewire {

    @FindBy(xpath=".//input[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-inputEl']")
    private WebElementFacade listaTipoCanalesDeVenta;

    @FindBy(xpath=".//*[@id='AccountFile:AccountFileMenuActions']")
    private WebElementFacade btnAccionesCuenta;

    @FindBy(xpath=".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission']")
    WebElementFacade opcionNuevoEnvio;

    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission']")
    WebElementFacade btnElegirAutoPersonal;

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:PolicyInfo']/div")
    WebElementFacade opcionVerInformacionPoliza;

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']")
    WebElementFacade listaOrganizacionDeVentas;


    public DisponibilidadDetalleProductoPage(WebDriver driver) {
        super(driver);
    }

    public void accionarNuevoEnvio() {
        btnAccionesCuenta.click();
        opcionNuevoEnvio.click();
        waitABit(1000);
        btnElegirAutoPersonal.click();
    }

    public void verInformacionDePoliza() {
        waitABit(1000);
        opcionVerInformacionPoliza.click();
    }

    public void seleccionarOrganizacionDeVentas(String organizacion) {
        espera(listaOrganizacionDeVentas, 2);
        listaOrganizacionDeVentas.clear();
        listaOrganizacionDeVentas.sendKeys(organizacion);
        waitABit(2000);
        listaOrganizacionDeVentas.sendKeys(Keys.ENTER);
        waitABit(2000);
    }

    public void validarTipoCanalVentas(ExamplesTable tipoCanal) throws Exception {
        listaTipoCanalesDeVenta.click();
        List<WebElementFacade> elementosTipoCanalVentas;
        List<String> elementosRequeridos = GuidewireUtil.obtenerTablaDeEjemplosDeUnaColumna(tipoCanal);
        for (String tipo : elementosRequeridos) {
            elementosTipoCanalVentas = withTimeoutOf(1, TimeUnit.SECONDS).findAll("//li[contains(.,'"+tipo+"')]");
            for (WebElementFacade lista : elementosTipoCanalVentas){
                assertThat(tipo, containsText(lista.getText()));
            }
        }
    }


}
