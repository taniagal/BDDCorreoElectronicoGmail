package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions-btnInnerEl']")
    private WebElementFacade botonAcciones;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']")
    private WebElementFacade linkNombre;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    private WebElementFacade comboBoxNombreAgente;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerCode-inputEl']")
    private WebElementFacade comboboxCodigoDeAgente;
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission-textEl']")
    private WebElementFacade subMenuNuevaCotizacion;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    private WebElementFacade menuItemEscritorio;
    @FindBy(css=".message")
    private WebElementFacade divMensaje;

    private static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    String direccion = "";


    public DetallesDeUbicacionPage(WebDriver driver) {
        super(driver);
    }

    public void  seleccionarProducto(String nomProducto) {
        List<WebElementFacade> descripcionProductos = getLista(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr/td[2]");
        List<WebElementFacade> botones = getLista(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr/td[1]");
        int i = 0;
        if (!descripcionProductos.isEmpty()) {
            for (WebElementFacade descripcion : descripcionProductos) {
                if (nomProducto.equals(descripcion.getText())) {
                    botones.get(i).click();
                }
                i++;
            }
        }
    }

    public void irANuevaCotizacion(){
        if(!botonAcciones.isPresent())
            menuItemEscritorio.click();
        waitFor(botonAcciones).click();
        subMenuNuevaCotizacion.waitUntilPresent().click();
    }

    public void setDatos(String cuenta, String producto) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(numeroDeCuenta).shouldBePresent();
        numeroDeCuenta.sendKeys(cuenta);
        comboBoxNombreAgente.click();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(linkNombre).shouldBeVisible();
        Actions actions =  new Actions(getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        seleccionarProducto(producto);
    }

    public void irAUbicacion(){
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonSiguiente).waitUntilPresent().click();
        botonAgregarUbicacion.waitUntilPresent().click();
        botonAgregarNuevaUbicacion.click();
    }

    public void setDireccion(String direccion, String departamento, String ciudad) {
        campoTxtDireccion.sendKeys(direccion);
        this.direccion = direccion;
        selectItem(comboBoxDepartamento,departamento);
        waitUntil(3000);
        selectItem(comboBoxCiudad,ciudad);
        waitUntil(1000);
    }

    public void setUbicacion(String descripcion, String actividad){
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(campoTxtDescripcionDeUbicacion).sendKeys(descripcion);
        selectItem(comboBoxActividadEconomica,actividad);
        botonAceptar.click();
    }

    public void validarCamposNuevos(){
            StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
            if(!labelUsoPredominante.isPresent())
                notPresent.append(" uso_predominante,");
            if(!labelNumeroDeSotanos.isPresent())
                notPresent.append(" numero_de_sotanos,");
            if(!labelNumeroDePisos.isPresent())
                notPresent.append(" numero_de_pisos,");
            if(!labelAnioDeConstruccion.isPresent())
                notPresent.append(" anio_de_construccion,");
            String res = notPresent.toString();
            if(MSJVALIDARELEMENTOS.equals(res))
                res = notPresent.toString().substring(0,notPresent.toString().length()-1);
        MatcherAssert.assertThat(res,"No estan presentes los elementos".equals(res));
        }

    public void validarIngresoDeUbicacion(){
        MatcherAssert.assertThat("Error al agregar la ubicacion", getLista(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV-body']/div/table/tbody/tr").get(1).getText().contains(direccion));
    }

    public void verificarMensaje(String mensaje) {
        verificarMensaje(divMensaje,mensaje);
    }
}
