package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ModificacionRenovacionVehiculoPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade itemVehiculos;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']")
    private WebElementFacade botonEditarTransaccionPoliza;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade campoCiudadCirculacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']")
    private WebElementFacade campoTipoServicio;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-inputEl']")
    private WebElementFacade campoMotor;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-inputEl']")
    private WebElementFacade campoChasis;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:2:RateModifier-inputEl']")
    private WebElementFacade campoBonificacionTecnica;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:3:RateModifier-inputEl']")
    private WebElementFacade campoBonificacionComercial;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:4:RateModifier-inputEl']")
    private WebElementFacade campoDescuento;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:5:RateModifier-inputEl']")
    private WebElementFacade campoRecargo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:6:RateModifier-inputEl']")
    private WebElementFacade campoSuavizacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    private WebElementFacade campoValorAsegurado;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    private WebElementFacade campoValorAccesorios;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosEspValue_DV-inputEl']")
    private WebElementFacade campoValorAccesoriosEspeciales;

    public ModificacionRenovacionVehiculoPage(WebDriver driver){
        super(driver);
    }

    public void irAVehiculos(){
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(itemVehiculos).click();
        waitUntil(WAIT_TIME_1500);
        itemVehiculos.click();
    }

    public void irAModificarVehiculo() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(botonEditarTransaccionPoliza).click();
        waitForTextToAppear("Si se edita esta transacción de la póliza, se invalida la cotización actual");
        actions.sendKeys(Keys.ENTER).build().perform();
        waitUntil(WAIT_TIME_1500);
    }

    private void validarQueNoSeaVisibleBtnCrearVehiculo(){
        String xpathBtnCrearVehiculo = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add']";
        shouldNotBeVisible(By.xpath(xpathBtnCrearVehiculo));
    }

    private void validarQueNoSeaVisibleBtnEliminarVehiculo(){
        String xpathBtnEliminarVehiculo = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Remove']";
        shouldNotBeVisible(By.xpath(xpathBtnEliminarVehiculo));
    }

    public void validarEdicionCampos(){
        verificarSiCampoEsEditable(campoCiudadCirculacion, "Ciudad de Circulacion");
        verificarSiCampoEsEditable(campoTipoServicio, "tipo servicio");
        verificarSiCampoEsEditable(campoMotor, "Motor");
        verificarSiCampoEsEditable(campoChasis, "chasis");
        verificarSiCampoEsEditable(campoBonificacionTecnica, "bonificacion tecnica");
        verificarSiCampoEsEditable(campoBonificacionComercial, "bonificacion comercial");
        verificarSiCampoEsEditable(campoDescuento, "Descuento");
        verificarSiCampoEsEditable(campoRecargo, "recargo");
        verificarSiCampoEsEditable(campoSuavizacion, "suavizacion");
        verificarSiCampoEsEditable(campoValorAsegurado, "valor asegurado");
        verificarSiCampoEsEditable(campoValorAccesorios, "valor accesorios");
        verificarSiCampoEsEditable(campoValorAccesoriosEspeciales, "valor accesorios especiales");
    }

    public void verificarSiCampoEsEditable(WebElementFacade elemento, String nombreCampo){
        MatcherAssert.assertThat("Error: el campo "+ nombreCampo+" debe ser editable",
                elemento.getAttribute("class").contains("x-form-text"));
    }

    public void validarCamposNoEditablesVehiculo() {
        String editable = "input";
        MatcherAssert.assertThat(campoCiudadCirculacion.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoTipoServicio.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoMotor.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoChasis.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoBonificacionTecnica.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoBonificacionComercial.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoDescuento.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoRecargo.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoSuavizacion.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoValorAsegurado.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoValorAccesorios.getTagName(), Matchers.is(Matchers.equalTo(editable)));
        MatcherAssert.assertThat(campoValorAccesoriosEspeciales.getTagName(), Matchers.is(Matchers.equalTo(editable)));
    }

    public void validarBotonesNoVisibles() {
        validarQueNoSeaVisibleBtnCrearVehiculo();
        validarQueNoSeaVisibleBtnEliminarVehiculo();
    }
}
