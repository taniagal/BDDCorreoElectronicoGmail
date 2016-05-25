package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObjects;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;

public class DetallesDeUbicacionPage extends Guidewire{

    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']")
    private WebElementFacade numeroDeCuenta;
    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:Producer:SelectOrganization']")
    private WebElementFacade botonAgregarOrganizacion;
    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade campoTxtNombreDeOrganizacion;
    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscarOrganizacion;
    @FindBy(xpath = ".//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select']")
    private WebElementFacade botonSeleccionarOrganizacion;
    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl']")
    private WebElementFacade comboBoxCodigoAgente;
    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultBaseState-inputEl']")
    private WebElementFacade comboBoxEstadoBase;
    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:3:addSubmission']")
    private WebElementFacade botonElegir;
    @FindBy(xpath=".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:addLocationsTB-btnInnerEl']")
    private WebElementFacade botonAgregarUbicacion;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:addLocationsTB:AddNewLocation-itemEl']")
    private WebElementFacade botonAgregarNuevaUbicacion;
    @FindBy(xpath=".//*[@id='CPLocationPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath=".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:LocationName-inputEl']")
    private WebElementFacade campoTxtDescripcionDeUbicacion;
    @FindBy(xpath=".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento;
    @FindBy(xpath=".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath=".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoTxtDireccion;
    @FindBy(xpath=".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:EconomicActivity-inputEl']")
    private WebElementFacade comboBoxActividadEconomica;
    @FindBy(xpath=".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:PredominantUse-labelEl']")
    private WebElementFacade labelUsoPredominante;
    @FindBy(xpath=".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:BasementNumber-labelEl']")
    private WebElementFacade labelNumeroDeSotanos;
    @FindBy(xpath=".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:FloorNumber-labelEl']")
    private WebElementFacade labelNumeroDePisos;
    @FindBy(xpath=".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:BuildYear-labelEl']")
    private WebElementFacade labelAnioDeConstruccion;



    public DetallesDeUbicacionPage(WebDriver driver) {
        super(driver);
    }

    public void agregarDatos(String cuenta, String organizacion, String agente) {
        espera(numeroDeCuenta,5);
        numeroDeCuenta.sendKeys(cuenta);
        espera(botonAgregarOrganizacion,5);
        botonAgregarOrganizacion.click();
        waitABit(2000);
        campoTxtNombreDeOrganizacion.sendKeys(organizacion);
        botonBuscarOrganizacion.click();
        botonSeleccionarOrganizacion.click();
        waitABit(1000);
        selectItem(comboBoxCodigoAgente,agente);
        selectItem(comboBoxEstadoBase,"Antioquia");
        waitABit(1000);
        botonElegir.click();
    }

    public void irAUbicacion(){
        botonSiguiente.click();
        botonAgregarUbicacion.click();
        botonAgregarNuevaUbicacion.click();
    }

    public void agregarUbicacion(String direccion, String departamento, String ciudad, String descrpcion) {
        campoTxtDireccion.sendKeys(direccion);
        selectItem(comboBoxDepartamento,departamento);
        waitABit(1500);
        selectItem(comboBoxCiudad,ciudad);
        waitABit(1500);
        campoTxtDescripcionDeUbicacion.sendKeys(descrpcion);
        botonAceptar.click();
    }

    public void validarCamposNuevos(){
            StringBuilder notPresent = new StringBuilder("No estan presentes los elementos:");
            if(!labelUsoPredominante.isPresent())
                notPresent.append(" uso_predominante,");
            if(!labelNumeroDeSotanos.isPresent())
                notPresent.append(" numero_de_sotanos,");
            if(!labelNumeroDePisos.isPresent())
                notPresent.append(" numero_de_pisos,");
            if(!labelAnioDeConstruccion.isPresent())
                notPresent.append(" anio_de_construccion,");
            String res = notPresent.toString();
            if("No estan presentes los elementos:".equals(res)){
                res = notPresent.toString().substring(0,notPresent.toString().length()-1);
            }
            assertThat(res,"No estan presentes los elementos".equals(res));
        }

}
