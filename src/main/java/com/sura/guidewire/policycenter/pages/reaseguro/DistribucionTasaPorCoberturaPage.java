package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DistribucionTasaPorCoberturaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV:0:reName']")
    private WebElementFacade linkNombreReaseguradorUno;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV:1:reName']")
    private WebElementFacade linkNombreReaseguradorDos;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV:2:reName']")
    private WebElementFacade linkNombreReaseguradorTres;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:EditCountry-inputEl']")
    private WebElementFacade listPaisSeleccionar;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:Reinsurer-inputEl']")
    private WebElementFacade listNombreReaseugurador;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:Update']")
    private WebElementFacade btnAceptarReasegurador;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV_tb:Add-btnInnerEl']")
    private WebElementFacade btnAgregaInformacionReaseguro;
    @FindBy(xpath = ".//*[@id='SuraAgreementParticipantPopup:program-inputEl']")
    private WebElementFacade checkContratosAutomaticos;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:DesiredComersialRate_Ext-inputEl']")
    private WebElementFacade txtTasaComercialDeseada;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV:2:Number']")
    private WebElementFacade lblTablaAsegurada;
    @FindBy(xpath = ".//*[@id='EditAgreementPopup:AgreementScreen:CededRateAutomatic-inputEl']")
    private WebElementFacade lblTasaBrutaContratosAutomaticos;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:reaseguroEspecial_true-inputEl']")
    private WebElementFacade radioBotReaseguroEspecial;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:Facultative-inputEl']")
    private WebElementFacade checkiReaseguroFacultativo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:ttlBar']")
    private WebElementFacade lblInformaPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']")
    private WebElementFacade lblMensajeFacultativo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade btnSiguiente;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:Update-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade botonCotizar;
    @FindBy(xpath = ".//a[contains(.,'Descartar cambios no guardados')]")
    private WebElementFacade linkDescartarCambios;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade lblMensaje;


    public static final String XPATH_TABLA_REASEGURADORES_INICIO = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:worksheetItemsLV:WorksheetItemsLV-body']/div/table/tbody/tr";
    public static final String XPATH_TABLA_REASEGURADORES_CIERRE = "/td";
    private static final String PAIS_ALEMANIA = "Alemania";
    private static final String PAIS_ESTADOS_UNIDOS = "Estados Unidos";
    private static final String ASEGURADORA_MUNCHENER = "MÜNCHENER RÜCKVERSICHERUNGS-GESELLSCHAFT";
    private static final String ASEGURADORA_GENERAL_CORPORATION = "GENERAL REINSURANCE CORPORATION";
    private static final String CONTRATO_AUTOMATICO = "Program";
    private static final int COLUMNA_NOMBRE_TABLA_PORCENTAJE_PARTICIPACION = 3;
    private static final int COLUMNA_NOMBRE_TABLA_FORMA_DE_COTIZACION = 5;
    private static final int COLUMNA_NOMBRE_TABLA_VALOR = 6;
    private static final int COLUMNA_NOMBRE_COMISION_REASEGURO_CEDIDO = 7;
    private static final int COLUMNA_NOMBRE_COMISION_INTERMEDIARIO = 8;
    private static final int COLUMNA_NOMBRE_COMISION_PROMOTORA = 9;

    @Page
    CrearYEditarCumulosPage crearYEditarCumulosPage;

    public DistribucionTasaPorCoberturaPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionaRiesgoAceptado() {
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        lblInformaPoliza.waitUntilVisible();
        clickearElemento(radioBotReaseguroEspecial);
        esperarHasta(TIEMPO_2000);
        if (checkiReaseguroFacultativo.isVisible()) {
            checkiReaseguroFacultativo.waitUntilClickable();
            esperarHasta(TIEMPO_2000);
            clickearElemento(checkiReaseguroFacultativo);
        } else {
            clickearElemento(radioBotReaseguroEspecial);
            checkiReaseguroFacultativo.waitUntilClickable();
            esperarHasta(TIEMPO_2000);
            clickearElemento(checkiReaseguroFacultativo);
        }
        esperarYClickearBoton(btnSiguiente);
        esperarHasta(TIEMPO_2000);
        lblMensajeFacultativo.waitUntilVisible();
        resetImplicitTimeout();
    }

    public void cotizarPoliza() {
        try {
            botonActualizar.waitUntilPresent();
            clickearElemento(botonActualizar);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            clickearElemento(botonActualizar);
        }
        botonCotizar.waitUntilPresent();
        clickearElemento(botonCotizar);
        descartarCambios(linkDescartarCambios, botonCotizar);
        setImplicitTimeout(TIEMPO_3, TimeUnit.SECONDS);
        if (lblMensaje.isPresent()) {
            clickearElemento(botonCotizar);
        }
        esperarHasta(TIEMPO_1000);
        if (botonCotizar.isPresent()) {
            clickearElemento(botonCotizar);
        }
        resetImplicitTimeout();
        waitForAnyTextToAppear("Cotizado", "Cotización");
    }

    public void ingresoInformacionDePrimerAsegurado() {
        linkNombreReaseguradorUno.click();
        listPaisSeleccionar.waitUntilClickable();
        seleccionarItem(listPaisSeleccionar, PAIS_ALEMANIA);
        seleccionarItem(listNombreReaseugurador, ASEGURADORA_MUNCHENER);
        clickearElemento(btnAceptarReasegurador);
    }

    public void ingresoInformacionDeSegundoAsegurado() {
        linkNombreReaseguradorDos.click();
        listPaisSeleccionar.waitUntilClickable();
        seleccionarItem(listPaisSeleccionar, PAIS_ESTADOS_UNIDOS);
        seleccionarItem(listNombreReaseugurador, ASEGURADORA_GENERAL_CORPORATION);
        clickearElemento(btnAceptarReasegurador);
    }

    public void ingresaContratoAutomatico() {
        linkNombreReaseguradorTres.click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(checkContratosAutomaticos).waitUntilClickable();
        checkContratosAutomaticos.click();
        clickearElemento(btnAceptarReasegurador);
    }

    public void ingresarTasaComercialDeseada() {
        txtTasaComercialDeseada.sendKeys(Integer.toString(CONSTANTE_1));
        actions.sendKeys(Keys.TAB).build().perform();
    }

    public void agregarReaseguradoresATabla(ExamplesTable infoReasegurador) {
        int i = 1;
        for (Map<String, String> dato : infoReasegurador.getRows()) {
            if (dato.get("reasegurador").equals(ASEGURADORA_MUNCHENER)) {
                esperarYClickearBoton(btnAgregaInformacionReaseguro);
                ingresoInformacionDePrimerAsegurado();
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_PORCENTAJE_PARTICIPACION + "]"), dato.get("porcentajeParticipacion"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_VALOR + "]"), dato.get("valorReaseguro"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_REASEGURO_CEDIDO + "]"), dato.get("comisionReasegurador"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_INTERMEDIARIO + "]"), dato.get("comisionIntermediario"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_FORMA_DE_COTIZACION + "]"), dato.get("modalidad"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_PROMOTORA + "]"), dato.get("comisionPromotora"));
                i++;
            } else if (dato.get("reasegurador").equals(ASEGURADORA_GENERAL_CORPORATION)) {
                esperarYClickearBoton(btnAgregaInformacionReaseguro);
                ingresoInformacionDeSegundoAsegurado();
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_PORCENTAJE_PARTICIPACION + "]"), dato.get("porcentajeParticipacion"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_VALOR + "]"), dato.get("valorReaseguro"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_REASEGURO_CEDIDO + "]"), dato.get("comisionReasegurador"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_INTERMEDIARIO + "]"), dato.get("comisionIntermediario"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_TABLA_FORMA_DE_COTIZACION + "]"), dato.get("modalidad"));
                crearYEditarCumulosPage.ingresaValorEntabla($(XPATH_TABLA_REASEGURADORES_INICIO + "[" + i + "]" + XPATH_TABLA_REASEGURADORES_CIERRE + "[" + COLUMNA_NOMBRE_COMISION_PROMOTORA + "]"), dato.get("comisionPromotora"));
                i++;
            } else if (dato.get("reasegurador").equals(CONTRATO_AUTOMATICO)) {
                esperarYClickearBoton(btnAgregaInformacionReaseguro);
                ingresaContratoAutomatico();
                i++;
            }
        }
    }

    public void ingresoAUnRiesgoPorEvaluar(ExamplesTable tablaRiesgosReasegurables) {
        int i = 0;
        for (Map<String, String> dato : tablaRiesgosReasegurables.getRows()) {
            for (WebElementFacade cotizacion : getListaGrupoDeCoberturas()) {
                if (dato.get("grupoDecoberturas").equals(cotizacion.getText())) {
                    getListaGrupoDeCoberturas().get(i).click();
                    break;
                }
                i++;
            }
            break;
        }
    }

    private List<WebElementFacade> getListaGrupoDeCoberturas() {
        List<WebElementFacade> nombreGrupoCobertura;
        nombreGrupoCobertura = withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).findAll(".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:2-body']/div/table/tbody/tr/td[2]");
        return nombreGrupoCobertura;
    }

    public void validaTasasDeReaseguradores(ExamplesTable verificarDatoMediosVenta) {
        ExpectedConditions.visibilityOf(lblTablaAsegurada);
        clickearElemento(lblTablaAsegurada);
        String xpatTablaReaseguradores = ".//*[@id='EditAgreementPopup:AgreementScreen:ParticipantsLV-body']/*/table/tbody/tr";
        for (Map<String, String> verificarDato : verificarDatoMediosVenta.getRows()) {
            MatcherAssert.assertThat("El reasegurador no se encuentra en la tabla" + " Reasegurador esperado: " + verificarDato.get("reaseguradores"), validarResultadoTabla(xpatTablaReaseguradores, verificarDato.get("reaseguradores"), CONSTANTE_2));
            MatcherAssert.assertThat("Porcentaje no concuerda con el reasegurador enviado desde la tabla" + " se esperaba el reasegurador: " + verificarDato.get("reaseguradores") + " con tasa: " + verificarDato.get("tasaBrutaDeCesion"), validarResultadoTabla(xpatTablaReaseguradores, verificarDato.get("tasaBrutaDeCesion"), CONSTANTE_7));
            MatcherAssert.assertThat("La tasa bruta esperada no cumple con el calculo" + " Reasegurador esperado: " + verificarDato.get("tasaBrutaDeCesionAutomatica"), lblTasaBrutaContratosAutomaticos.getText().equals(verificarDato.get("tasaBrutaDeCesionAutomatica")));
        }
    }
}

