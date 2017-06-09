package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class DetallesDeUbicacionPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:addLocationsTB-btnInnerEl']")
    private WebElementFacade botonAgregarUbicacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:addLocationsTB:AddNewLocation-itemEl']")
    private WebElementFacade botonAgregarNuevaUbicacion;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:LocationName-inputEl']")
    private WebElementFacade campoTxtDescripcionDeUbicacion;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoTxtDireccion;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:EconomicActivity-inputEl']")
    private WebElementFacade comboBoxActividadEconomica;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:PredominantUse-labelEl']")
    private WebElementFacade labelUsoPredominante;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:BasementNumber-labelEl']")
    private WebElementFacade labelNumeroDeSotanos;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:FloorNumber-labelEl']")
    private WebElementFacade labelNumeroDePisos;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:BuildYear-labelEl']")
    private WebElementFacade labelAnioDeConstruccion;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:_msgs']/div")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV_tb:addLocationsTB:addExistingLocations-textEl']")
    private WebElementFacade botonAgregarUbicacionExistente;


    private static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    String direccion = "";

    public DetallesDeUbicacionPage(WebDriver driver) {
        super(driver);
    }

    public void irAUbicacion() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonSiguiente);
        esperarObjetoClikeableServidorWe(botonSiguiente);
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonAgregarUbicacion);
        esperarObjetoClikeableServidorWe(botonAgregarUbicacion);
        clickearElemento(botonAgregarNuevaUbicacion);
    }

    public void setDireccion(String direccion, String departamento, String ciudad) {
        campoTxtDireccion.sendKeys(direccion);
        this.direccion = direccion;
        seleccionarItem(comboBoxDepartamento, departamento);
        esperarPorValor(comboBoxDepartamento, departamento);
        seleccionarItem(comboBoxCiudad, ciudad);
        esperarPorValor(comboBoxCiudad, ciudad);
    }

    public void setUbicacion(String descripcion, String actividad) {
        waitFor(campoTxtDescripcionDeUbicacion).sendKeys(descripcion);
        seleccionarItem(comboBoxActividadEconomica, actividad);
        esperarPorValor(comboBoxActividadEconomica, actividad);
        clickearElemento(botonAceptar);
    }

    public void validarCamposNuevos() {
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!labelUsoPredominante.isPresent()) {
            notPresent.append(" uso_predominante,");
        }
        if (!labelNumeroDeSotanos.isPresent()) {
            notPresent.append(" numero_de_sotanos,");
        }
        if (!labelNumeroDePisos.isPresent()) {
            notPresent.append(" numero_de_pisos,");
        }
        if (!labelAnioDeConstruccion.isPresent()) {
            notPresent.append(" anio_de_construccion,");
        }
        String res = notPresent.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = notPresent.toString().substring(0, notPresent.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }

    public void validarIngresoDeUbicacion() {
        MatcherAssert.assertThat("Error al agregar la ubicacion", getLista(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV-body']/div/table/tbody/tr").get(0).getText().contains(direccion));
    }

    public void verificarMensaje(String mensaje) {
        divMensaje.waitUntilPresent();
        waitForTextToAppear(mensaje);
    }
}
