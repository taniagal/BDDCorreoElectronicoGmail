package com.sura.policycenter.selenium.pages;

import com.sura.serinitybdd.util.GwNavegacionUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class IngresoDeAseguradoACotizacionPage extends PageObject{

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']/div")
    WebElementFacade botonAsegurados;

    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver']")
    WebElementFacade botonAgregar;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact']")
    WebElementFacade opcionContactoDeCuenta;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddFromSearch']")
    WebElementFacade opcionContactoDelDirectorio;

    @FindBy(xpath = ".//span[contains(.,'DONIA GLORIA GALLEGO')]")
    WebElementFacade contactoDeCuenta;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    WebElementFacade seleccionarContactoDelDirectorio;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV-body']")
    WebElementFacade tablaAsegurados;

    @FindBy(xpath = ".//span[contains(.,'Persona Natural')]")
    WebElementFacade opcionNuevoPersonaNatural;

    @FindBy(xpath = ".//span[contains(.,'Persona Jurídica')]")
    WebElementFacade opcionNuevoPersonaJuridica;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddNewDriver']")
    WebElementFacade opcionNuevo;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:_msgs']/div")
    WebElementFacade mensajeBuscarDirectorio;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:__crumb__']")
    WebElementFacade opcionVolverAAsegurados;

    @FindBy(xpath = ".//img[@class='x-grid-checkcolumn']")
    WebElementFacade seleccionarElemento;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:Remove']")
    WebElementFacade botonQuitar;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:_msgs']/div")
    WebElementFacade mensajeValidacion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next']")
    WebElementFacade botonSiguiente;

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    WebElementFacade campoNombreAgente;

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']")
    WebElementFacade tablaProductos;

    public IngresoDeAseguradoACotizacionPage(WebDriver driver){
        super(driver);
    }

    public void irAIngresarAsegurado() {
        campoNombreAgente.waitUntilVisible().sendKeys(Keys.ARROW_DOWN);
        campoNombreAgente.sendKeys(Keys.ARROW_DOWN);
        campoNombreAgente.sendKeys(Keys.ENTER);
        WebElementFacade botonElegirProducto = findBy(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:"+this.encontrarProducto().toString()+":addSubmission']");
        botonElegirProducto.click();
        waitFor(botonAsegurados);
        botonAsegurados.click();
    }

    public void agregarAsegurado() {
        botonAgregar.click();
    }

    public String validarOpcionesDeAgregar(ExamplesTable listaAgregar) {
        List<WebElementFacade> elementosAgregar;
        List<String> elementosRequeridos = null;
        String opcionesOk = "Elementos de la opción Agregar no están presentes";
        try {
            elementosRequeridos = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(listaAgregar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        elementosAgregar = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//*[@class='x-box-inner x-vertical-box-overflow-body']/div/div/a/span");
        for (int i = 1; i < elementosRequeridos.size(); i++) {
            for (WebElementFacade opciones : elementosAgregar) {
                if(elementosRequeridos.get(i).equals(opciones.getText()) && elementosAgregar.size()==(elementosRequeridos.size()-1)){
                    opcionesOk = "Elementos de la opción Agregar correctos";
                }else { opcionesOk = "Elementos de la opción Agregar no están presentes";}
            }
        }
        return opcionesOk;
    }

    public void agregarAseguradoContactoDeLaCuenta() {
        waitFor(opcionContactoDeCuenta);
        opcionContactoDeCuenta.click();
        waitFor(contactoDeCuenta);
        contactoDeCuenta.click();
    }

    public void agregarAseguradoContactoDelDirectorio() {
        opcionContactoDelDirectorio.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void seleccionarContactoDelDirectorio() {
        seleccionarContactoDelDirectorio.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void seleccionarNuevaPersonaNatural() {
        opcionNuevo.waitUntilVisible();
        opcionNuevo.click();
        opcionNuevoPersonaNatural.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilVisible().click();
    }

    public void seleccionarNuevaPersonaJuridica() {
        opcionNuevo.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
        opcionNuevoPersonaJuridica.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public String validarMensaje() {
       return mensajeBuscarDirectorio.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilVisible().getText();
    }

    public void validarAseguradosAgregados(ExamplesTable asegurados) {
        Map<String, String> aseguradosAgregados;
        waitFor(tablaAsegurados).withTimeoutOf(5, TimeUnit.SECONDS).waitUntilVisible();
        List<WebElement> allRows = tablaAsegurados.findElements(By.tagName("tr"));
        for (int i=0; i<allRows.size(); i++){
            aseguradosAgregados = asegurados.getRows().get(i);
            MatcherAssert.assertThat(allRows.get(i).getText(), Matchers.containsString(aseguradosAgregados.get("nombre")));
            MatcherAssert.assertThat(allRows.get(i).getText(), Matchers.containsString(aseguradosAgregados.get("tipoDocumento")));
            MatcherAssert.assertThat(allRows.get(i).getText(), Matchers.containsString(aseguradosAgregados.get("numeroDocumento")));
        }
    }

    public Integer encontrarProducto(){
        tablaProductos.waitUntilVisible();
        Integer filaBoton = 0;
        List<WebElement> filas = tablaProductos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (columna.get(1).getText().equals("Auto personal")){
                return filaBoton;
            }
            filaBoton++;
        }
        return filaBoton;
    }

    public void volverAAsegurados() {
        opcionVolverAAsegurados.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void seleccionarContactoAgregado() {
        seleccionarElemento.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void quitarAseguradoDeLaLista() {
        botonQuitar.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void validarAseguradoEliminado() {
        tablaAsegurados.waitUntilPresent().waitUntilVisible();
        List<WebElement> allRows = tablaAsegurados.findElements(By.tagName("tr"));
        if(allRows.isEmpty()){
            MatcherAssert.assertThat("Lista de asegurados vacía", Is.is(Matchers.equalTo("Lista de asegurados vacía")));
        }else {
            MatcherAssert.assertThat("Lista de asegurados vacía", Is.is(Matchers.equalTo("Lista de asegurados no es vacía")));
        }
    }

    public void irASiguiente() {
        botonSiguiente.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void validarMensajeDeIntegraciones(String mensaje) {
        mensajeValidacion.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilVisible();
        MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

}