package com.sura.guidewire.policycenter.pages.commons;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class NuevaCotizacionPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions-btnInnerEl']")
    private WebElementFacade botonAcciones;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarPopup;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    private WebElementFacade botonBotonCotizar;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    private WebElementFacade comboBoxNombreAgente;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-triggerWrap']")
    private WebElementFacade comboBoxNombreAgenteCuenta;
    @FindBy(xpath = ".//*[contains(@id, 'SalesOrganizationType-inputEl')]")
    private WebElementFacade comboBoxOrganizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-inputEl']")
    private WebElementFacade comboBoxCanal;
    @FindBy(xpath = ".//*[contains(@id, 'SalesOrganizationType-triggerWrap')]/tbody/tr/td/input")
    private WebElementFacade comboBoxOrganizacionW;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']")
    private WebElementFacade comboBoxTipoPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:0_header_hd-textEl']")
    private WebElementFacade headerEnvio;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']")
    private WebElementFacade linkNombre;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:WizardMenuActions-btnInnerEl']")
    private WebElementFacade menuAcciones;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions']")
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

    private static final String ORGANIZACION = "organizacion";
    private static final String TIPO_POLIZA = "tipoPoliza";
    private static final String INDIVIDUAL = "Individual";
    private static final String STALE_ELEMENT_REFERENCE_EXCEPTION = "StaleElementReferenceException ";


    public NuevaCotizacionPage(WebDriver driver) {
        super(driver);
    }


    public void copiarEnvio() {
        menuAcciones.waitUntilPresent();
        clickearElemento(menuAcciones);
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

    public void seleccionDeProducto(String nomProducto) {
        try {
            waitForTextToAppear(nomProducto);
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
            seleccionarItem(comboBoxNombreAgente, "A");
            waitForTextToAppear(nomProducto);
        }
        List<WebElementFacade> descripcionProductos = getLista(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']/div/table/tbody/tr/td[2]");
        List<WebElementFacade> botones = getLista(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']/div/table/tbody/tr/td[1]");
        esperarHasta(TIEMPO_1000);
        int i = 0;
        if (!descripcionProductos.isEmpty()) {
            for (WebElementFacade descripcion : descripcionProductos) {
                esperarHasta(TIEMPO_1000);
                if (nomProducto.equals(descripcion.getText())) {
                    botones.get(i).click();
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
                i++;
            }
        }
    }


    public void irANuevaCotizacion() {
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (!botonAcciones.isPresent()) {
            menuItemEscritorio.click();
        }
        resetImplicitTimeout();
        botonAcciones.click();
        menuItemNuevaCotizacion.waitUntilPresent().click();
    }

    public void nuevaCotizacionEnCuenta() {
        menuAccionesCuenta.waitUntilPresent();
        clickearElemento(menuAccionesCuenta);
        menuItemNuevaCotizacionCuenta.waitUntilPresent().click();
    }

    public void seleccionarProducto(ExamplesTable datosCotizacion) {
        Map<String, String> dato = datosCotizacion.getRow(0);
        numeroDeCuenta.waitUntilPresent().sendKeys(dato.get("cuenta"));
        comboBoxNombreAgente.click();
        linkNombre.waitUntilVisible();
        seleccionarProductoDesdeCuenta(datosCotizacion);
    }

    public void seleccionarAgente() {
        comboBoxNombreAgenteCuenta.waitUntilPresent();
        clickearElemento(comboBoxNombreAgenteCuenta);
    }

    public void seleccionarProductoDesdeCuenta(ExamplesTable datosCotizacion) {
        Map<String, String> dato = datosCotizacion.getRow(0);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        seleccionDeProducto(dato.get("producto"));
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(menuItemInformacionDePoliza).waitUntilPresent().click();
        waitForTextToAppear("Información de póliza");
        comboBoxOrganizacion.waitUntilPresent();
        if (!comboBoxOrganizacion.getValue().equals(dato.get(ORGANIZACION))) {
            seleccionarItem(comboBoxOrganizacion, dato.get(ORGANIZACION));
            esperarPorValor(comboBoxOrganizacionW, dato.get(ORGANIZACION));
            esperarHasta(TIEMPO_3000);
        }
        if ("Autos".equals(dato.get("producto"))) {
            seleccionarItem(comboBoxCanal, dato.get("canal"));
            esperarPorValor(comboBoxCanal, dato.get("canal"));
            try {
                seleccionarItem(comboBoxTipoPoliza, dato.get(TIPO_POLIZA));
            } catch (ElementNotVisibleException e) {
                LOGGER.info("ElementNotVisibleException " + e);
                esperarHasta(TIEMPO_3000);
                seleccionarItem(comboBoxTipoPoliza, dato.get(TIPO_POLIZA));
            }
            esperarPorValor(comboBoxTipoPoliza, dato.get(TIPO_POLIZA));
        }
    }


    public void cotizarEnvioCopiada() {
        menuItemInformacionDePoliza.waitUntilPresent();
        clickearElemento(menuItemInformacionDePoliza);
        botonBotonCotizar.waitUntilPresent().click();
    }


    public void llenarInfoPoliza() {
        menuItemInformacionDePoliza.waitUntilPresent();
        clickearElemento(menuItemInformacionDePoliza);
        try {
            withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(comboBoxOrganizacion);
        } catch (StaleElementReferenceException f) {
            LOGGER.info(STALE_ELEMENT_REFERENCE_EXCEPTION + f);
            esperarHasta(TIEMPO_2000);
            withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(comboBoxOrganizacion);
        }
        if (!"Sura".equals(comboBoxOrganizacion.getText())) {
            seleccionarItem(comboBoxOrganizacion, "Sura");
            esperarPorValor(comboBoxOrganizacion, "Sura");
            seleccionarItem(comboBoxCanal, "Canal Tradicional");
            esperarPorValor(comboBoxCanal, "Canal Tradicional");
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
    }

    public void seleccionarReaseguroEspecialNo() {
        findBy(".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:RIPolicyFieldsInputSet:reaseguroEspecial_false-inputEl']").waitUntilPresent().click();
    }
}
