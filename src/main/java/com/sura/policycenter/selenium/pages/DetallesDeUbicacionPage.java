package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import java.util.List;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DetallesDeUbicacionPage extends Guidewire{

    @FindBy(xpath=".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']")
    private WebElementFacade numeroDeCuenta;
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
    @FindBy(xpath = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission-textEl']")
    private WebElementFacade subMenuNuevaCotizacion;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    private WebElementFacade menuItemEscritorio;
    @FindBy(css=".message")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']")
    WebElementFacade tablaProductos;


    private static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    String direccion = "";
    private static String BTN_ELEGIR_PRODUCTO_ = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV:";


    public DetallesDeUbicacionPage(WebDriver driver) {
        super(driver);
    }

    public void  seleccionarProducto(String nomProducto) {
        String xpathBotonElegirProducto = BTN_ELEGIR_PRODUCTO_ + this.encontrarProducto(nomProducto).toString() + ":addSubmission']";
        WebElementFacade botonElegirProducto = esperarElemento(xpathBotonElegirProducto);
        botonElegirProducto.waitUntilEnabled();
        waitUntil(1000);
        botonElegirProducto.click();
    }

    public Integer encontrarProducto(String producto) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(tablaProductos).waitUntilVisible();
        Integer filaBoton = 0;
        List<WebElement> filas = tablaProductos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (producto.equals(columna.get(1).getText())) {
                return filaBoton;
            }
            filaBoton++;
        }
        return filaBoton;
    }

    public void irANuevaCotizacion(){
        setImplicitTimeout(1,TimeUnit.SECONDS);
        if(!botonAcciones.isPresent())
            menuItemEscritorio.click();
        resetImplicitTimeout();
        waitFor(botonAcciones).click();
        subMenuNuevaCotizacion.waitUntilPresent().click();
    }

    public void setDatos(String cuenta) {
        waitFor(numeroDeCuenta).shouldBePresent();
        numeroDeCuenta.sendKeys(cuenta);
        comboBoxNombreAgente.click();
        waitFor(linkNombre).shouldBeVisible();
        Actions actions =  new Actions(getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void elegirProducto(String producto){
        seleccionarProducto(producto);
    }

    public void irAUbicacion(){
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(botonSiguiente).waitUntilPresent().click();
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(botonAgregarUbicacion).waitUntilPresent().click();
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
        waitFor(campoTxtDescripcionDeUbicacion).sendKeys(descripcion);
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
