package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.util.Commons;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ModificacionRenovacionVehiculoPage extends Commons{

    private final Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:ttlBar']")
    private WebElementFacade labelVehiculos;
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
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade campoPlaca;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm-bodyEl']")
    private WebElementFacade campoVehiculoCeroKm;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:foreignEnrollment-bodyEl']")
    private WebElementFacade campoMatriculaExtranjera;

    public ModificacionRenovacionVehiculoPage(WebDriver driver){
        super(driver);
    }

    public void irAVehiculos(){
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(itemVehiculos).click();
        waitUntil(1500);
        itemVehiculos.click();
    }

    public void irAModificarVehiculo() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(botonEditarTransaccionPoliza).click();
        waitForTextToAppear("Si se edita esta transacción de la póliza, se invalida la cotización actual");
        act.sendKeys(Keys.ENTER).build().perform();
        waitUntil(1500);
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
