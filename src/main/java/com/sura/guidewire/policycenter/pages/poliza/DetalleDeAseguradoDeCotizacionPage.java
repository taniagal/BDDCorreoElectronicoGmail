package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
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


public class DetalleDeAseguradoDeCotizacionPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']/div")
    WebElementFacade botonAsegurados;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver']")
    WebElementFacade botonAgregar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact']")
    WebElementFacade opcionContactoDeCuenta;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddFromSearch']")
    WebElementFacade opcionContactoDelDirectorio;
    @FindBy(xpath = ".//span[contains(.,'GLORIA GALLEGO')]")
    WebElementFacade contactoDeCuenta;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    WebElementFacade selectContactoDelDirectorio;
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:Remove-btnInnerEl']")
    WebElementFacade botonQuitar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:_msgs']/div")
    WebElementFacade mensajeValidacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next']")
    WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']")
    WebElementFacade campoNumeroCuenta;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:RetrieveMVRButton-btnInnerEl']")
    WebElementFacade botonRecuperarMVR;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab']")
    WebElementFacade menuPoliza;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab:PolicyTab_NewSubmission-textEl']")
    WebElementFacade menuPolizaNuevoEnvio;

    protected static final int CONSTANTE_5 = 5;

    public DetalleDeAseguradoDeCotizacionPage(WebDriver driver) {
        super(driver);
    }


    public void irAIngresarAsegurado() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonAsegurados).waitUntilClickable();
        botonAsegurados.click();
    }

    public void agregarAsegurado() {
        waitFor(botonAgregar).waitUntilPresent();
        botonAgregar.click();
    }

    public Integer validarOpcionesDeAgregar(ExamplesTable listaAgregar) {
        List<WebElementFacade> elementosAgregar;
        Map<String, String> elementosRequeridos;
        Integer opcionesAgregar = 0;
        elementosAgregar = findAll(".//*[@class='x-box-inner x-vertical-box-overflow-body']/div/div/a/span");
        for (int i = 0; i < listaAgregar.getRowCount(); i++) {
            for (WebElementFacade opciones : elementosAgregar) {
                elementosRequeridos = listaAgregar.getRows().get(i);
                if ((elementosRequeridos.get("agregar")).equals(opciones.getText())) {
                    opcionesAgregar++;
                }
            }
        }
        return opcionesAgregar;
    }


    public void agregarAseguradoContactoDeLaCuenta() {
        waitFor(opcionContactoDeCuenta).waitUntilPresent();
        actions.moveToElement(opcionContactoDeCuenta).release(opcionContactoDeCuenta).build().perform();
        waitFor(contactoDeCuenta).waitUntilPresent();
        actions.moveToElement(contactoDeCuenta).release().click().build().perform();

    }

    public void agregarAseguradoContactoDelDirectorio() {
        waitFor(opcionContactoDelDirectorio).waitUntilPresent();
        opcionContactoDelDirectorio.click();
    }

    public void seleccionarContactoDelDirectorio() {
        waitFor(selectContactoDelDirectorio).waitUntilPresent();
        selectContactoDelDirectorio.click();
    }

    public void seleccionarNuevaPersonaNatural() {
        waitFor(opcionNuevo).waitUntilPresent();
        actions.moveToElement(opcionNuevo).release(opcionNuevo).build().perform();
        waitFor(opcionNuevoPersonaNatural).waitUntilPresent();
        opcionNuevoPersonaNatural.withTimeoutOf(CONSTANTE_5, TimeUnit.SECONDS).waitUntilVisible().click();
    }

    public void seleccionarNuevaPersonaJuridica() {
        waitFor(opcionNuevo).waitUntilPresent();
        actions.moveToElement(opcionNuevo).release(opcionNuevo).build().perform();
        waitFor(opcionNuevoPersonaJuridica).waitUntilPresent();
        opcionNuevoPersonaJuridica.click();
    }

    public String validarMensaje() {
        return waitFor(mensajeBuscarDirectorio).waitUntilVisible().getText();
    }

    public void validarAseguradosAgregados(ExamplesTable asegurados) {
        Map<String, String> aseguradosAgregados;
        esperarHasta(TIEMPO_2000);
        waitFor(tablaAsegurados).waitUntilPresent();
        List<WebElement> allRows = tablaAsegurados.findElements(By.tagName("tr"));
        for (int i = 0; i < allRows.size(); i++) {
            aseguradosAgregados = asegurados.getRows().get(i);
            MatcherAssert.assertThat(allRows.get(i).getText(), Matchers.containsString(aseguradosAgregados.get("nombre")));
            MatcherAssert.assertThat(allRows.get(i).getText(), Matchers.containsString(aseguradosAgregados.get("tipoDocumento")));
            MatcherAssert.assertThat(allRows.get(i).getText(), Matchers.containsString(aseguradosAgregados.get("numeroDocumento")));
        }
    }

    public void volverAAsegurados() {
        waitFor(opcionVolverAAsegurados).waitUntilPresent();
        opcionVolverAAsegurados.click();
    }

    public void seleccionarContactoAgregado() {
        waitFor(seleccionarElemento).waitUntilPresent();
        seleccionarElemento.click();
    }

    public void quitarAseguradoDeLaLista() {
        waitFor(botonQuitar).waitUntilPresent();
        botonQuitar.click();
    }

    public void validarAseguradoEliminado(String numeroId) {
        waitForTextToDisappear(numeroId);
        waitFor(tablaAsegurados).waitUntilPresent();
        MatcherAssert.assertThat(tablaAsegurados.getText(), Is.is(Matchers.equalTo("")));
    }

    public void irASiguiente() {
        esperarHasta(TIEMPO_3000);
        waitFor(botonSiguiente).waitUntilPresent();
        botonSiguiente.click();
    }

    public void validarMensajeDeIntegraciones(String mensaje) {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(mensajeValidacion).shouldContainText(mensaje);
        MatcherAssert.assertThat(mensajeValidacion.getText(), Is.is(Matchers.equalTo(mensaje)));
    }

    public void irACrearNuevaCotizacion() {
        waitFor(menuPoliza).waitUntilPresent();
        clickearElemento(menuPoliza);
        esperarHasta(TIEMPO_3000);
        clickearElemento(menuPoliza);
        menuPoliza.sendKeys(Keys.ARROW_DOWN);
        menuPolizaNuevoEnvio.waitUntilVisible().click();
    }

    public void ingresarCuenta(String cuenta) {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(campoNumeroCuenta).waitUntilPresent();
        campoNumeroCuenta.sendKeys(cuenta);
        campoNumeroCuenta.sendKeys(Keys.TAB);
        waitForTextToAppear("Nombre");
    }

    public void validarBotonNoVisible() {
        botonRecuperarMVR.shouldNotBeVisible();
    }

    public void validarContinuacionDeCotizacion() {
        esperarHasta(TIEMPO_3000);
        waitFor(botonSiguiente).waitUntilPresent().click();
        waitForTextToAppear("Vehículos");
        WebElementFacade labelTituloVehiculos = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:ttlBar']");
        withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(labelTituloVehiculos).isCurrentlyVisible();
        MatcherAssert.assertThat(labelTituloVehiculos.getText(), Is.is(Matchers.equalTo("Vehículos")));
        esperarHasta(TIEMPO_1000);
    }
}
