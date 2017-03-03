package com.sura.guidewire.policycenter.pages.modificaciones;

import com.sura.guidewire.policycenter.pages.poliza.ValidacionesInformacionDeVehiculoPage;
import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class SustitucionesPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions-btnInnerEl']")
    private WebElementFacade linkAcciones;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-textEl']")
    private WebElementFacade linkCambiarPoliza;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:sustitutionPA_false-inputEl']")
    private WebElementFacade radioBotonSustitucionNO;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:StartPolicyChangeDV:sustitutionPA_true-inputEl']")
    private WebElementFacade radiBotonSustitucionSi;
    @FindBy(xpath = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange-btnInnerEl']")
    private WebElementFacade botonsiguiente;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    private WebElementFacade linkVehiculos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesLV-body']/*/table/tbody/tr/td[1]")
    private WebElementFacade chekVehiculos;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Remove-btnInnerEl']")
    private WebElementFacade botonEliminar;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    private WebElementFacade botonCrearVehiculo;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:plan_DV-inputEl']")
    private WebElementFacade comboBoxPlan;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-inputEl']")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:VehiculeZone-bodyEl']")
    private WebElementFacade labelTextoZona;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-inputEl']")
    private WebElementFacade comboBoxTipoServicio;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:2:RateModifier-inputEl']")
    private WebElementFacade campoTextoBonificacionComercial;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:5:RateModifier-inputEl']")
    private WebElementFacade campoTextoSuavizacion;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:6:RateModifier-inputEl']")
    private WebElementFacade campoTextoBonificacionTecnica;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV-body']")
    private WebElementFacade tablaAsegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade campoTxtPlaca;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-inputEl']")
    private WebElementFacade campoTxtCodigoFasecolda;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    private WebElementFacade campoTxtValorAsegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm_false-inputEl']")
    private WebElementFacade campoVehiculoCeroKm;
    @FindBy(xpath = ".//*[@id='ext-gen3557']/tbody/tr[2]/td")
    private WebElementFacade tablaVehiculocobertura;

    public SustitucionesPage(WebDriver driver) {
        super(driver);
    }

    public void sustitucionVehiculo() {
        linkAcciones.waitUntilPresent().click();
        linkCambiarPoliza.waitUntilPresent().click();
        radioBotonSustitucionNO.waitUntilPresent();
        MatcherAssert.assertThat("Error no se encuentra marcado el campo Sustitucion en No", "0px -15px".equals(radioBotonSustitucionNO.getCssValue("background-position")));
        radiBotonSustitucionSi.waitUntilPresent().click();
        botonsiguiente.waitUntilPresent().click();
        linkVehiculos.waitUntilPresent().click();
        chekVehiculos.waitUntilPresent().click();
        botonEliminar.waitUntilPresent().click();
        botonCrearVehiculo.waitUntilPresent().click();
    }

    public void verificarInfoVehiculo(ExamplesTable infoVehiculo) {
        tablaAsegurado.waitUntilPresent();
        Map<String, String> vehiculo = infoVehiculo.getRow(0);
        MatcherAssert.assertThat("Error, el valor del plan es Incorrecto", comboBoxPlan.getValue().equals(vehiculo.get("plan")));
        MatcherAssert.assertThat("Error, el valor de la ciudad es Incorrecto", comboBoxCiudad.getValue().equals(vehiculo.get("ciudad_circulacion")));
        MatcherAssert.assertThat("Error, el valor de la zona es Incorrecto", labelTextoZona.getText().equals(vehiculo.get("zona")));
        MatcherAssert.assertThat("Error, el valor del Tipo de servicio es Incorrecto", comboBoxTipoServicio.getValue().equals(vehiculo.get("vehiculo_servicio")));
        MatcherAssert.assertThat("Error, No se encuentra el Asegurado", tablaAsegurado.isPresent());
        MatcherAssert.assertThat("Error, el valor de la bonificacion comercial es Incorrecto", campoTextoBonificacionComercial.getText().equals(vehiculo.get("bonificacionC")));
        MatcherAssert.assertThat("Error, el valor de la bonificacion tecnica es Incorrecto", campoTextoBonificacionTecnica.getText().equals(vehiculo.get("bonificacionT")));
    }

    public void agregarVehiculoSustituto(ExamplesTable datosAgregarVehiculo) {
        ValidacionesInformacionDeVehiculoPage validacionesInformacionDeVehiculoPage = new ValidacionesInformacionDeVehiculoPage(getDriver());
        campoVehiculoCeroKm.click();
        Map<String, String> vehiculo = datosAgregarVehiculo.getRow(0);
        esperarHasta(TIEMPO_3000);
        validacionesInformacionDeVehiculoPage.ingresarPlaca(vehiculo);
        validacionesInformacionDeVehiculoPage.clickVehiculoServicio();
        validacionesInformacionDeVehiculoPage.seleccionarComboBoxModelo(vehiculo);
        validacionesInformacionDeVehiculoPage.ingresarDato(campoTxtCodigoFasecolda, vehiculo.get("codigo_fasecolda"));
        campoTxtPlaca.click();
        validacionesInformacionDeVehiculoPage.waitForCampoTxtValorAsegurado(vehiculo);
        esperarHasta(TIEMPO_2000);
        validacionesInformacionDeVehiculoPage.agregarDescuento(vehiculo);
        MatcherAssert.assertThat("Error en el servicio de fasecolda", campoTxtValorAsegurado.getValue().contains(vehiculo.get("valor_asegurado")));
        validacionesInformacionDeVehiculoPage.clickSiguiente();
    }
}