package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import java.util.concurrent.TimeUnit;

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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguinete;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestCardTab-btnInnerEl']")
    WebElementFacade btnInteresAdicional;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton-btnWrap']")
    WebElementFacade btnAgregar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddFromSearch-itemEl']")
    WebElementFacade btnItemDirec;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ttlBar']")
    WebElementFacade lblBuscarDirec;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    WebElementFacade txtTipoDoc;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    WebElementFacade txtNumDoc;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    WebElementFacade txtValorAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    WebElementFacade txtValorAccesorios;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosEspValue_DV-inputEl']")
    WebElementFacade txtAcceEspeciales;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    WebElementFacade lblPrimerNombre;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    WebElementFacade btnSeleccion;
    @FindBy(xpath = ".//div[3]/div/table/tbody/tr/td[5]/div")
    WebElementFacade lstTipoBeneficia;
    @FindBy(xpath = ".//li[contains(.,'Asegurado')]")
    WebElementFacade itmAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:VehicleDetailCardTab-btnInnerEl']")
    WebElementFacade btnDetalleVehiculo;
    @FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs")
    WebElementFacade cajaMensaje;


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

    public void ingresaBeneficiario() {
        btnInteresAdicional.click();
        btnAgregar.click();
        btnItemDirec.click();
        opcionPolizaMrc.waitInfoPoliza(lblBuscarDirec);
        txtTipoDoc.clear();
        waitUntil(800);
        txtTipoDoc.sendKeys("CEDULA DE CIUDADANIA");
        txtTipoDoc.sendKeys(Keys.ENTER);
        opcionPolizaMrc.waitInfoPoliza(lblPrimerNombre);
        txtNumDoc.sendKeys("1234567892");
        btnBuscar.click();
        opcionPolizaMrc.waitInfoPoliza(btnSeleccion);
        btnSeleccion.click();
        opcionPolizaMrc.waitInfoPoliza(btnDetalleVehiculo);
        lstTipoBeneficia.click();
        itmAsegurado.click();
        btnDetalleVehiculo.click();
        opcionPolizaMrc.waitInfoPoliza(btnSiguinete);
    }

    public void calculaValorAccesorioAsegurado() {
        String valorAsegurado = txtValorAsegurado.getText();
        txtValorAccesorios.sendKeys("2800000");
        txtValorAccesorios.sendKeys(Keys.ENTER);
        opcionPolizaMrc.waitInfoPoliza(txtAcceEspeciales);
        txtValorAccesorios.sendKeys("4000000");
    }

    public void validarPaginaSiguiente() {
        btnSiguinete.click();
        opcionPolizaMrc.waitInfoPoliza(cajaMensaje);
        assertThat("debe tener minimo un conductor", cajaMensaje.containsText("No hay conductores asignados a vehículo(s)"));
        btnSiguinete.click();
    }

    public void validaMensajePantalla() {
        btnSiguinete.click();
        opcionPolizaMrc.waitInfoPoliza(cajaMensaje);
        assertThat("el campo motor o chasis no debe aceptar ccaracteres especiales", cajaMensaje.containsText("Este campo no puede tener caracteres especiales, sólo números y letras"));
        assertThat("el campo descuento, recargo y suavizacion deben ser decimales", cajaMensaje.containsText("debe tener máximo dos enteros y máximo dos decimales"));
    }

    public void validaCamposInformacionVehiculo() {
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if ("12345678".equals(txtPlaca.getText()))
            notPresent.append("el campo no puede tener mas de 8 caracteres|");
            /*
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
             */
        String res = notPresent.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = notPresent.toString().substring(0, notPresent.toString().length() - 1);
        }
        assertThat(res, "No estan presentes los elementos ".equals(res));
    }


}

