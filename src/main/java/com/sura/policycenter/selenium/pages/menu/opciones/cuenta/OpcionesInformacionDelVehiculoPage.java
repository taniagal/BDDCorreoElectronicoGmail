package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import javax.validation.constraints.AssertTrue;

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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:AdditionalCoveragesTab-btnInnerEl']")
    WebElementFacade btnPaginaSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    WebElementFacade txtLimite;
    @FindBy(xpath = "//div[contains(@id,'SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:totalInsured_DV-inputEl')]")
    WebElementFacade lblSumaValor;


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

    public String[] calculaTotalValorAsegurado (String valorAccesorio, String valorAccesorioEsp){
        String [] compara = new String[2];
        int valorAsegurado = Integer.parseInt(txtValorAsegurado.getValue().substring(0,8));
        int valorAccesorioEntero = Integer.parseInt(valorAccesorio);
        int valorAccesorioEspEntero = Integer.parseInt(valorAccesorioEsp);
        int valorTotalizado = valorAccesorioEntero + valorAccesorioEspEntero + valorAsegurado;
        String valorDeLabel = lblSumaValor.getText().substring(0,11);
        valorDeLabel = valorDeLabel.replaceAll("\\$","").replaceAll(",","");
        compara[0] = Integer.toString(valorTotalizado);
        compara[1] = valorDeLabel;
        return compara;

    }

    public void ingresaValoresAccesorios(String valorAccesorio, String valorAccesorioEsp) {
        txtValorAccesorios.clear();
        txtValorAccesorios.sendKeys(valorAccesorio);
        txtValorAsegurado.click();
        waitUntil(1000);
        txtAcceEspeciales.sendKeys(valorAccesorioEsp);
        txtValorAsegurado.click();
        waitUntil(1000);
        calculaTotalValorAsegurado(valorAccesorio , valorAccesorioEsp);
    }

    public void validarPaginaSiguiente() {
        btnSiguinete.click();
        opcionPolizaMrc.waitInfoPoliza(cajaMensaje);
        txtPlaca.click();
        btnSiguinete.click();
        assertThat("Error: debio pasar a siguinete pagina", cajaMensaje.isVisible());
    }

    public void validaMensajePantalla() {
        btnSiguinete.click();
        opcionPolizaMrc.waitInfoPoliza(cajaMensaje);
        assertThat("el campo motor o chasis no debe aceptar ccaracteres especiales", cajaMensaje.containsText("Este campo no puede tener caracteres especiales, sólo números y letras"));
        assertThat("el campo descuento, recargo y suavizacion deben ser decimales", cajaMensaje.containsText("debe tener máximo dos enteros y máximo dos decimales"));
    }

    public void comparaValorAseguradoTotal(){
        AssertTrue("El campo de " )
    }

}

