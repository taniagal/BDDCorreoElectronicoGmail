package com.sura.guidewire.policycenter.pages.commons;


import com.sura.guidewire.policycenter.pages.modificaciones.PolizaFinanciadaPage;
import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Utils;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NuevaCotizacionPage extends PageUtil {
    @Page
    PolizaFinanciadaPage polizaFinanciadaPage;

    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions-btnInnerEl']")
    private WebElementFacade botonAcciones;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarPopup;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonBotonCotizar;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-inputEl']")
    private WebElementFacade campoFechaEfectivaDeCotizacion;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    private WebElementFacade comboBoxNombreAgente;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl']")
    private WebElementFacade comboBoxCodigoDeAgente;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-triggerWrap']")
    private WebElementFacade comboBoxNombreAgenteCuenta;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade comboBoxOrganizacionPa;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade comboBoxOrganizacionMrc;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-inputEl']")
    private WebElementFacade comboBoxCanal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']")
    private WebElementFacade comboBoxTipoPoliza;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:MainOffice-inputEl']")
    private WebElementFacade comboBoxOficinaDeRadicacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:0_header_hd-textEl']")
    private WebElementFacade headerEnvio;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']")
    private WebElementFacade linkNombre;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:WizardMenuActions-btnInnerEl']")
    private WebElementFacade menuAcciones;
    @FindBy(id = "AccountFile:AccountFileMenuActions")
    private WebElementFacade menuAccionesCuenta;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_CopySubmission']")
    private WebElementFacade menuItemCopiarEnvio;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    private WebElementFacade menuItemEscritorio;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']")
    private WebElementFacade numeroDeCuenta;
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission-textEl']")
    private WebElementFacade menuItemNuevaCotizacion;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission']")
    private WebElementFacade menuItemNuevaCotizacionCuenta;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']")
    private WebElementFacade menuItemInformacionDePoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:_msgs']/div")
    private WebElementFacade mensajes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:FundedPolicyInputSet:QuestionFundedPolicy_true-inputEl']")
    private WebElementFacade optSiFinanciarPoliza;

    private static final String TIPO_POLIZA = "tipoPoliza";
    private static final String INDIVIDUAL = "Individual";
    private static final String TABLA_SELECCION_DE_PRODUCTO = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']/*/table/tbody";
    private static final String STALE_ELEMENT_REFERENCE_EXCEPTION = "StaleElementReferenceException ";
    private String oficina = "1073";
    private String agente = "ASESOR 4 - PRUEBA TRASPASO";


    public NuevaCotizacionPage(WebDriver driver) {
        super(driver);
    }


    public void copiarEnvio() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(menuAcciones);
        esperarObjetoClikeableServidorWe(menuAcciones);
        menuItemCopiarEnvio.waitUntilPresent().click();
        try {
            withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(ExpectedConditions.textToBePresentInElement(headerEnvio, "00"));
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
        } catch (StaleElementReferenceException f) {
            LOGGER.info(STALE_ELEMENT_REFERENCE_EXCEPTION + f);
        }
        esperarHasta(TIEMPO_2000);
    }


    public void copiarEnvioRiesgo() {
        this.copiarEnvio();
        setImplicitTimeout(TIEMPO_3, TimeUnit.SECONDS);
        if (mensajes.isVisible() && mensajes.getText().contains("Se produjo un error al crear un periodo de póliza a partir del periodo actual")) {
            this.copiarEnvio();
        }
        resetImplicitTimeout();
    }

    public void irANuevaCotizacion() {
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (!botonAcciones.isPresent()) {
            clickearElemento(menuItemEscritorio);
        }
        resetImplicitTimeout();
        botonAcciones.click();
        menuItemNuevaCotizacion.waitUntilPresent().click();
    }

    public void nuevaCotizacionEnCuenta() {
        menuAccionesCuenta.waitUntilVisible().waitUntilClickable();
        clickearElemento(menuAccionesCuenta);
        menuItemNuevaCotizacionCuenta.waitUntilVisible().waitUntilClickable().click();
    }

    public void seleccionarProducto(ExamplesTable datosCotizacion) {
        Map<String, String> dato = datosCotizacion.getRow(0);
        ingresarCuenta(dato.get("cuenta"));
        seleccionarProductoDesdeCuenta(datosCotizacion);
    }

    public void ingresarCuenta(String cuenta) {
        numeroDeCuenta.waitUntilPresent().sendKeys(cuenta);
        numeroDeCuenta.sendKeys(Keys.TAB);
        linkNombre.waitUntilVisible();
    }

    public void seleccionarAgente(String cuenta, String agente) {
        ingresarCuenta(cuenta);
        seleccionarOficinaDeRadicacionYAgente("1073", agente);
    }

    public void seleccionarProductoDesdeCuenta(ExamplesTable datosCotizacion) {
        Map<String, String> dato = datosCotizacion.getRow(0);
        if (dato.get("oficina") != null) {
            oficina = dato.get("oficina");
            agente = dato.get("agente_oficina");
        }
        seleccionarOficinaDeRadicacionYAgente(oficina, agente);
        seleccionDeProducto(dato.get("producto"));
        if ("Autos".equals(dato.get("producto"))) {
            withTimeoutOf(TIEMPO_60, TimeUnit.SECONDS).waitFor(menuItemInformacionDePoliza).waitUntilVisible().click();
            waitForTextToAppear("Información de póliza");
            comboBoxTipoPoliza.waitUntilPresent();
            try {
                seleccionarItem(comboBoxTipoPoliza, dato.get(TIPO_POLIZA));
                esperarHasta(TIEMPO_2000);
                if (dato.get("polizafinanciada") != null) {
                    optSiFinanciarPoliza.click();
                }
            } catch (ElementNotVisibleException e) {
                LOGGER.info("ElementNotVisibleException " + e);
                esperarHasta(TIEMPO_3000);
                seleccionarItem(comboBoxTipoPoliza, dato.get(TIPO_POLIZA));
            }
            esperarPorValor(comboBoxTipoPoliza, dato.get(TIPO_POLIZA));
        }
    }

    public void seleccionDeProducto(String nomProducto) {
        try {
            waitForTextToAppear(nomProducto, TIEMPO_1000);
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException ", e);
            esperarHasta(TIEMPO_1000);
            String codigoAgente = comboBoxCodigoDeAgente.waitUntilVisible().getValue();
            clickearElemento(comboBoxCodigoDeAgente);
            esperarHasta(TIEMPO_300);
            comboBoxCodigoDeAgente.clear();
            comboBoxCodigoDeAgente.sendKeys("193");
            comboBoxCodigoDeAgente.sendKeys(Keys.ENTER);
            seleccionarItem(comboBoxCodigoDeAgente, codigoAgente);
        }
        waitForTextToAppear(nomProducto);
        esperarHasta(TIEMPO_1000);
        List<WebElementFacade> descripcionProductos = getLista(TABLA_SELECCION_DE_PRODUCTO + "/tr/td[2]");
        for (int i = 1; i <= descripcionProductos.size(); i++) {
            WebElementFacade nombreProducto = $(TABLA_SELECCION_DE_PRODUCTO + "/tr[" + i + "]/td[2]");
            withTimeoutOf(TIEMPO_40, TimeUnit.SECONDS).waitFor(nombreProducto);
            if (nomProducto.equals(nombreProducto.getText())) {
                WebElementFacade botonProducto = $(TABLA_SELECCION_DE_PRODUCTO + "/tr[" + i + "]/td[1]");
                clickearElemento(botonProducto);
                if ("Multiriesgo corporativo".equals(nomProducto)) {
                    setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
                    if (botonAceptarPopup.isVisible()) {
                        esperarHasta(TIEMPO_1000);
                        botonAceptarPopup.click();
                        botonAceptarPopup.waitUntilNotVisible();
                    }
                    resetImplicitTimeout();
                }
                break;
            }
        }
    }

    public void seleccionarOficinaDeRadicacionYAgente(String oficina, String agente) {
        comboBoxOficinaDeRadicacion.waitUntilPresent();
        seleccionarItem(comboBoxOficinaDeRadicacion, "3560");
        seleccionarItem(comboBoxOficinaDeRadicacion, oficina);
        try {
            clickearElemento(comboBoxNombreAgente);
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException", e);
            clickearElemento(comboBoxNombreAgente);
        }
        esperarHasta(TIEMPO_300);
        comboBoxNombreAgente.clear();
        comboBoxNombreAgente.sendKeys(agente);
        comboBoxNombreAgente.sendKeys(Keys.ENTER);
    }

    public void llenarInfoPoliza() {
        menuItemInformacionDePoliza.waitUntilPresent();
        clickearElemento(menuItemInformacionDePoliza);
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(comboBoxTipoPoliza);
        try {
            seleccionarItem(comboBoxTipoPoliza, INDIVIDUAL);
        } catch (ElementNotVisibleException e) {
            LOGGER.info("ElementNotVisibleException " + e);
            esperarHasta(TIEMPO_2000);
            seleccionarItem(comboBoxTipoPoliza, INDIVIDUAL);
        } catch (StaleElementReferenceException f) {
            LOGGER.info(STALE_ELEMENT_REFERENCE_EXCEPTION + f);
            esperarHasta(TIEMPO_2000);
            seleccionarItem(comboBoxTipoPoliza, INDIVIDUAL);
        }
        esperarPorValor(comboBoxTipoPoliza, INDIVIDUAL);
    }

    public void seleccionarReaseguroEspecialNo() {
        WebElementFacade botonReaseguroEspecialNo = $(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:reaseguroEspecial_false-inputEl']");
        botonReaseguroEspecialNo.waitUntilVisible();
        clickearElemento(botonReaseguroEspecialNo);
    }

    public void verificarFechaEfectivaDeCotizacion() {
        campoFechaEfectivaDeCotizacion.waitUntilPresent();
        MatcherAssert.assertThat("Error, el campo fecha efectiva de cotizacion no contiene la fecha actual", campoFechaEfectivaDeCotizacion.containsText(Utils.sumarDiasALaFechaActual(0)));
        MatcherAssert.assertThat("Error, el campo fecha efectiva de cotizacion no debe ser editable", !esEditable(campoFechaEfectivaDeCotizacion));
    }
}
