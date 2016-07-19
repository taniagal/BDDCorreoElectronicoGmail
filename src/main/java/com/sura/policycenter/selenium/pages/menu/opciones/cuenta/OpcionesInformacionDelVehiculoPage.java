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

    @FindBy(xpath = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs")
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

    public void validarPaginaSiguiente() {
        btnSiguinete.click();
        opcionPolizaMrc.waitInfoPoliza(cajaMensaje);
        assertThat("el al mostrar nombre completo", !cajaMensaje.containsText("No hay conductores"));
       JOptionPane.showMessageDialog(null, "sos puto");
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

