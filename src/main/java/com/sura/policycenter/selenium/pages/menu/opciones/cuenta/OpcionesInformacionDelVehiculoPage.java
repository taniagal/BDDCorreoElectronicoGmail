package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class OpcionesInformacionDelVehiculoPage extends Guidewire {


    @FindBy(xpath = "//td[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    WebElementFacade itemVehiculo;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    WebElementFacade btnCrearVehiculo;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:0']")
    WebElementFacade lblDetallesVehiculo;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:0']")
    WebElementFacade lblCoberturaPersona;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    WebElementFacade txtPlaca;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    WebElementFacade lstModelo;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguinete;

    /*@FindBy (xpath = "")
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

    OpcionesInformacionPolizaMrcPage opcionPolizaMrc = new OpcionesInformacionPolizaMrcPage(getDriver());


    public void ingresarOpcionVehiculo() {
        opcionPolizaMrc.waitInfoPoliza(itemVehiculo);
        itemVehiculo.click();
        btnCrearVehiculo.click();
        opcionPolizaMrc.waitInfoPoliza(lblDetallesVehiculo);
    }

    public void validarPaginaSiguiente() {
        btnSiguinete.click();
        assertThat("el al mostrar nombre completo", !lblCoberturaPersona.isPresent());
    }

    public void validaCamposInformacionVehiculo() {
       /* StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!lblModelo.isPresent())
            notPresent.append("Label errado: Modelo|");
        if (!lblLinea.isPresent())
            notPresent.append("Label errado: Linea|");
        if (!lblPlaca.isPresent())
            notPresent.append("label errado: Placa|");
        if (!lblClaseVehículo.isPresent())
            notPresent.append("label errado: Clase Vehículo|");
        if (!lblValorAsegurado.isPresent())
            notPresent.append("label errado: Dirección de la poliza|");
        if (!lblT.isPresent())
            notPresent.append("label errado: Dirección de la poliza|");
        if (!.isPresent())
        notPresent.append("label errado: Dirección de la poliza|");
        if (!.isPresent())
        notPresent.append("label errado: Dirección de la poliza|");
        if (!.isPresent())
        notPresent.append("label errado: Dirección de la poliza|");
        if (!.isPresent())
        notPresent.append("label errado: Dirección de la poliza|");
        if (!.isPresent())
        notPresent.append("label errado: Dirección de la poliza|");
        if (!.isPresent())
        notPresent.append("label errado: Dirección de la poliza|");
        if (!.isPresent())
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
    */
    }



}

