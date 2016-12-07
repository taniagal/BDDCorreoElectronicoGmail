package com.sura.guidewire.policycenter.pages.commons;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class NuevaCotizacionPage extends PageUtil{

    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions-btnInnerEl']")
    private WebElementFacade botonAcciones;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarPopup;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    private WebElementFacade comboBoxNombreAgente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade comboBoxOrganizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-inputEl']")
    private WebElementFacade comboBoxCanal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-triggerWrap']/tbody/tr/td/input")
    private WebElementFacade comboBoxOrganizacionW;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']")
    private WebElementFacade comboTipoPoliza;
    @FindBy(css = ".message")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:0_header_hd']")
    private WebElementFacade headerEnvio;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']")
    private WebElementFacade linkNombre;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:WizardMenuActions-btnInnerEl']")
    private WebElementFacade menuAcciones;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:WizardMenuActions:WizardMenuActions_Create:WizardMenuActions_CopySubmission']")
    private WebElementFacade menuItemCopiarEnvio;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    private WebElementFacade menuItemEscritorio;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']")
    private WebElementFacade numeroDeCuenta;
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission-textEl']")
    private WebElementFacade menuItemNuevaCotizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:PolicyInfo']")
    private WebElementFacade menuItemInformacionPoliza;


    public NuevaCotizacionPage(WebDriver driver){
        super(driver);
    }


    public  void copiarEnvio(){
        menuAcciones.waitUntilPresent().click();
        menuItemCopiarEnvio.waitUntilPresent().click();
        waitFor(ExpectedConditions.textToBePresentInElement(headerEnvio,"00"));
    }

    public void seleccionDeProducto(String nomProducto) {
        try {
            waitForTextToAppear(nomProducto);
        } catch (TimeoutException e) {
            LOGGER.info("TimeoutException " + e);
            selectItem(comboBoxNombreAgente, "A");
            waitForTextToAppear(nomProducto);
        }
        List<WebElementFacade> descripcionProductos = getLista(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']/div/table/tbody/tr/td[2]");
        List<WebElementFacade> botones = getLista(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']/div/table/tbody/tr/td[1]");
        waitUntil(WAIT_TIME_1000);
        int i = 0;
        if (!descripcionProductos.isEmpty()) {
            for (WebElementFacade descripcion : descripcionProductos) {
                waitUntil(WAIT_TIME_1000);
                if (nomProducto.equals(descripcion.getText())) {
                    botones.get(i).click();
                    if ("Multiriesgo corporativo".equals(nomProducto)) {
                        setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
                        if (botonAceptarPopup.isPresent()) {
                            waitUntil(WAIT_TIME_1000);
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
        setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
        if (!botonAcciones.isPresent()) {
            menuItemEscritorio.click();
        }
        resetImplicitTimeout();
        botonAcciones.click();
        menuItemNuevaCotizacion.waitUntilPresent().click();
    }

    public void seleccionarProducto(ExamplesTable datosCotizacion) {
        Map<String, String> dato = datosCotizacion.getRow(0);
        numeroDeCuenta.waitUntilPresent().sendKeys(dato.get("cuenta"));
        comboBoxNombreAgente.click();
        linkNombre.waitUntilVisible();
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        seleccionDeProducto(dato.get("producto"));
        if ("Autos".equals(dato.get("producto"))) {
            withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(menuItemInformacionPoliza).waitUntilPresent().click();
            waitForTextToAppear("Información de póliza");
            comboBoxOrganizacion.waitUntilPresent();
            if (!comboBoxOrganizacion.getValue().equals(dato.get("producto"))) {
                selectItem(comboBoxOrganizacion, dato.get("organizacion"));
                waitForComboValue(comboBoxOrganizacionW, dato.get("organizacion"));
                waitUntil(WAIT_TIME_1000);
                selectItem(comboBoxCanal, dato.get("canal"));
                waitForComboValue(comboBoxCanal, dato.get("canal"));
                try {
                    selectItem(comboTipoPoliza, dato.get("tipoPoliza"));
                } catch (ElementNotVisibleException e) {
                    LOGGER.info("ElementNotVisibleException " + e);
                    waitUntil(WAIT_TIME_2000);
                    selectItem(comboTipoPoliza, dato.get("tipoPoliza"));
                }
                waitForComboValue(comboTipoPoliza, dato.get("tipoPoliza"));
            }
        }
    }


    public void cotizarEnvioCopiada(){
        menuItemInformacionPoliza.waitUntilPresent();
        clickElement(menuItemInformacionPoliza);
    }
}
