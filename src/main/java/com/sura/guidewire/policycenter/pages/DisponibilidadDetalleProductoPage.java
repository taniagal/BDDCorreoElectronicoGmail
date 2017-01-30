package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class DisponibilidadDetalleProductoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-inputEl']")
    private WebElementFacade listaTipoCanalDeVenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions']")
    private WebElementFacade btnAccionesCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission']")
    private WebElementFacade opcionNuevoEnvio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']")
    private WebElementFacade opcionVerInformacionPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade listaOrganizacionDeVentas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']")
    private WebElementFacade listaPATipoPoliza;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']")
    private WebElementFacade tablaProductos;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    private WebElementFacade campoNombreAgente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:Producer-inputEl']")
    private WebElementFacade campoTxtOficinaDeRadicacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoProducerOfRecordInputSet:ProducerCode-inputEl']")
    private WebElementFacade comboBoxCodigoDeAgente;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:MainOffice-inputEl']")
    private WebElementFacade comboBoxOficinaDeRadicacion;

    public DisponibilidadDetalleProductoPage(WebDriver driver) {
        super(driver);
    }

    public void accionarNuevoEnvio() {
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(btnAccionesCuenta).waitUntilPresent().click();
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(opcionNuevoEnvio).waitUntilPresent().click();
    }

    public void verInformacionDePoliza() {
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(opcionVerInformacionPoliza).waitUntilPresent().click();
    }

//TODO CAMBIO DE CAMBIO NUEVO POR BILLING
    public void seleccionarAgente(String agente) {
        seleccionarItem(comboBoxOficinaDeRadicacion, "3554");
        seleccionarItem(campoNombreAgente, agente);
    }

    public void validarLaOrganizacion(String organizacion) {
        waitFor(listaOrganizacionDeVentas);
        MatcherAssert.assertThat(listaOrganizacionDeVentas.getText(), Is.is(Matchers.equalTo(organizacion)));
    }

    public void validarElCanal(String canal) {
        waitFor(listaTipoCanalDeVenta);
        MatcherAssert.assertThat(listaTipoCanalDeVenta.getText(), Is.is(Matchers.equalTo(canal)));
    }

    public void validarElProducto(String tipoPoliza) {
        waitFor(listaPATipoPoliza);
        MatcherAssert.assertThat(listaPATipoPoliza.getText(), Is.is(Matchers.equalTo(tipoPoliza)));
    }
}
