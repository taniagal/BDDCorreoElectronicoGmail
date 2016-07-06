package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;

public class OpcionesInformacionDelVehiculoPage extends Guidewire {


    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-labelEl']")
    WebElementFacade lblPlaca;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-labelEl']")
    WebElementFacade lblModelo;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:facecoldaCode_DV-labelEl']")
    WebElementFacade lblCodFasecolda;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-labelEl']")
    WebElementFacade lblClaseVehículo;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Model_DV-labelEl']")
    WebElementFacade lblLinea;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:city-labelEl']")
    WebElementFacade lblCiudadDeCirculacion;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-labelEl']")
    WebElementFacade lblvalorAsegurado;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Engine_DV-labelEl']")
    WebElementFacade lblMotor;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:chasisl_DV-labelEl']")
    WebElementFacade lblChasis;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-labelEl']")
    WebElementFacade lblValorAccesorios;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosEspValue_DV-labelEl'")
    WebElementFacade lblValorAccesoriosEsp;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:totalInsured_DV-labelEl']")
    WebElementFacade lblValorTotalAsegurado;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:vehicleKm-labelEl']")
    WebElementFacade lblVehiculo0Km;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:use_DV-labelEl']")
    WebElementFacade lblConsecionario;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:transportFuel-labelEl']")
    WebElementFacade lblTransportaCombustible;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:trailer-labelEl']")
    WebElementFacade lblRemolque;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:trailer-labelEl']")
    WebElementFacade lblRemolque;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Imported-labelEl']")
    WebElementFacade lblImportado;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:foreignEnrollment-labelEl']")
    WebElementFacade lblMatriculaExtranjera;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:2:vehmod-labelEl']")
    WebElementFacade lblVehiculoBlindado;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:3:vehmod-labelEl']")
    WebElementFacade lblDescuentoDispositivo;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:6:vehmod-labelEl']")
    WebElementFacade lblDescuento;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:7:vehmod-labelEl']")
    WebElementFacade lblRecargo;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:8:vehmod-labelEl']")
    WebElementFacade lblSuavizacion;

   /* @FindBy (xpath = "")
    WebElementFacade;

    @FindBy (xpath = "")
    WebElementFacade;

    @FindBy (xpath = "")
    WebElementFacade;

    @FindBy (xpath = "")
    WebElementFacade;

    @FindBy (xpath = "")
    WebElementFacade;

    @FindBy (xpath = "")
    WebElementFacade;

    @FindBy (xpath = "")
    WebElementFacade;*/


    /*
     * Tipo de beneficiario (interes adicional)
     * Tipo de servicio  .//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:service_DV-labelEl']
     * Comercial
     * Técnica
     */




    public OpcionesInformacionDelVehiculoPage(WebDriver driver) {
        super(driver);
    }

    private static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";

    Actions actions = new Actions(getDriver());


    public void validaCamposInformacionVehiculo() {
        /**
         *Clase Vehículo
         * Modelo
         * Línea
         * Placa
         * Clase Vehículo
         * Modelo
         * Línea
         * Placa
         * Valor Asegurado
         * Tipo de beneficiario
         * Motor
         * Chasis
         * Tipo de servicio
         * Ciudad de Circulación
         * Valor Accesorios
         * Valor Accesorios Especiales
         * Valor Total asegurado
         * Vehiculo 0km
         * Concesionario
         * Transporta combustible
         * Remolque
         * Importado
         * Matricula extranjera
         * Vehículo blindado?
         * Descuento dispositivo
         * Comercial
         * Técnica
         * Descuento
         * Recargo
         * Suavización
         */
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!lblTipoDocumento.isPresent())
            notPresent.append("Label errado: Tipo documento|");
        if (!lblNumeroDocumento.isPresent())
            notPresent.append("Label errado: Numero documento|");
        if (!lblNumeroTelefono.isPresent())
            notPresent.append("label errado: Teléfono|");
        if (!lblDireccion.isPresent())
            notPresent.append("label errado: Dirección de la poliza|");
        if ("".equals(inputTipoDocumento.getText()))
            notPresent.append("salida errada: Tipo cedula|");
        if ("".equals(inputNumeroDocumento.getText()))
            notPresent.append("salida errada: Numero cedula|");
        if ("".equals(inputNumeroTelefono.getText()))
            notPresent.append("salida errada: Telefono|");
        if ("".equals(inputDireccion.getText()))
            notPresent.append("salida errada: Direccion|");
        if ("".equals(inputReaseguroAceptado.getText()))
            notPresent.append("radio boton nulo: Reaseguro aceptado|");
        if ("".equals(inputReaseguroEspecial.getText()))
            notPresent.append("radio boton nulo: Reaseguro especial|");
        if (!"Fecha inicio de vigencia".equals(lblFechaVigencia.getText()))
            notPresent.append("salida errada: Fecha inicio de vigencia|");
        if (!"Fecha fin de vigencia".equals(lblFechaExpiracion.getText()))
            notPresent.append("salida errada: Fecha fin de vigencia|");
        if (!"Fecha de expedición".equals(lblFechaescrita.getText()))
            notPresent.append("salida errada: Fecha de expedición|");
        if (!"Descripción de la dirección".equals(lblDescripcionDir.getText()))
            notPresent.append("salida errada: Descripcion direccion|");
        String res = notPresent.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = notPresent.toString().substring(0, notPresent.toString().length() - 1);
        }
        assertThat(res, "No estan presentes los elementos ".equals(res));
    }
}
