package com.sura.gw.policy.poliza.pages;

import com.google.common.base.Function;
import com.sura.gw.navegacion.util.widget.TableWidgetPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class EdificiosyUbicacionesWidget extends PageObject {

    private static String XPATH_DIV_CONTENEDOR_TABLA = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV']";
    private static String LINK_AGREGAR_UBICACION = "//a[contains(.,'Agregar ubicación')]";
    private static String LINK_OPCION_UBICACION_NUEVA = "//a[contains(.,'Ubicación nueva')]";

    TableWidgetPage tabla;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;

    private void obtenerTabla() {
        this.tabla = new TableWidgetPage(SerenityWebdriverManager.inThisTestThread().getCurrentDriver());
        this.tabla.buscarTabla(XPATH_DIV_CONTENEDOR_TABLA);

    }

    public void agregarArticuloAPrimerUbicacion() {

        waitForTextToAppear("Edificios y ubicaciones");
        if (tabla == null) {
            obtenerTabla();
        }
        waitFor(botonAgregarArticulos).waitUntilPresent();
        List<WebElementFacade> elementosList = findAll(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']");
        elementosList.get(0).click();
        String tituloDePaginaAgregarArticulos = "Volver a Edificios y ubicaciones";
        waitForTextToAppear(tituloDePaginaAgregarArticulos);
        shouldContainText(tituloDePaginaAgregarArticulos);
    }

    public void agregarNuevaUbicacion(String pais, String depto, String ciudad, String direccion, String actividadEconomica){
        waitForTextToAppear("Edificios y ubicaciones");
        findBy(LINK_AGREGAR_UBICACION).waitUntilVisible().waitUntilClickable();
        findBy(LINK_AGREGAR_UBICACION).shouldBeVisible();
        findBy(LINK_AGREGAR_UBICACION).click();

        findBy(LINK_OPCION_UBICACION_NUEVA).waitUntilVisible().waitUntilClickable();
        findBy(LINK_OPCION_UBICACION_NUEVA).shouldBeVisible();
        findBy(LINK_OPCION_UBICACION_NUEVA).click();

        waitForTextToAppear("Información de ubicación");
        String XPATHPAIS = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']";
        String XPATHDEPTO = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']";
        String XPATHCIUDAD = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']";
        String XPATHDIRECCION = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']";
        String XPATHACTIVIDADECONOMICA = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:EconomicActivity-inputEl']";


        $(XPATHPAIS).type(pais);
        $(XPATHPAIS).click();

        waitFor(3).seconds();
        enter(depto).into($(XPATHDEPTO));
        waitFor(3).seconds();
        $(XPATHDEPTO).click();

        waitFor(6).seconds();
        enter(ciudad).into($(XPATHCIUDAD));
        waitFor(6).seconds();
        $(XPATHCIUDAD).click();

        waitFor(3).seconds();
        enter(direccion).into($(XPATHDIRECCION));
        waitFor(3).seconds();
        $(XPATHDIRECCION).click();

        waitFor(3).seconds();
        enter(actividadEconomica).into($(XPATHACTIVIDADECONOMICA));
        waitFor(10).seconds();
        $(XPATHACTIVIDADECONOMICA).sendKeys(Keys.ENTER);
        waitFor(3).seconds();

        findBy(".//*[@id='CPLocationPopup:Update']").waitUntilVisible().waitUntilClickable().click();
        waitFor(10).seconds();
    }

    public void seleccionarEnlaceCancelarIngresoNuevaUbicacion() {
        findBy(".//*[@id='CPLocationPopup:Cancel']").waitUntilVisible().waitUntilClickable().click();
    }


    public void ingresarNuevaUbicacionConRiesgoConsultable() {
        agregarNuevaUbicacion("Colombia", "ANTIOQUIA", "MEDELLIN", "CR 65 45 45", "Acabado de productos textiles");
    }


    public void seleccionarTab(String tab) {
        waitForAnyTextToAppear(tab);
        shouldContainText(tab);
        String xpathTab = ".//a[ (descendant::*[contains(., '" + tab + "')])]";
        withAction().moveToElement($(xpathTab)).perform();
        $(xpathTab).click();
    }


/*    public void seleccionarCoberturaDeArticulo(String cobertura) {
        waitForAnyTextToAppear(cobertura);
        shouldContainText(cobertura);
        String xpathTDCobertura = ".//tr[ (descendant::label[contains(., '" + cobertura + "')]) and contains(@class,'x-form-item-input-row')]";
        withAction().moveToElement($(xpathTDCobertura)).perform();
        String xpathCHKCobertura = ".//input[contains(@class, 'x-form-field x-form-checkbox x-form-cb')";
        WebElementFacade chk = $(xpathTDCobertura).findBy(xpathCHKCobertura);
        withAction().moveToElement($(chk)).perform();
        chk.click();
    }*/

    public void seleccionarCoberturaDelRiesgo(String cobertura) {
        waitForAnyTextToAppear(cobertura);
        shouldContainText(cobertura);
        String xpathLegendCoberturaDeRiesgo = ".//legend[ (descendant::div[contains(., '" + cobertura + "')])]";
        WebElementFacade inputCoberturaDeRiesgo = findBy(xpathLegendCoberturaDeRiesgo).find(By.tagName("input"));
        withAction().moveToElement(inputCoberturaDeRiesgo).perform();
        inputCoberturaDeRiesgo.click();
    }

    public void ingresarValorAEntradaDeArticuloDeCoberturaDeRiesgo(String entrada, String valorEntrada) {
        waitForAnyTextToAppear(entrada);
        shouldContainText(entrada);
        String xpathTREntrada = ".//tr[ (descendant::label[contains(., '" + entrada + "') ]) and @class='x-form-item-input-row' ]";
        WebElementFacade inputValorEntrada = findBy(xpathTREntrada).find(By.tagName("input"));
        withAction().moveToElement(inputValorEntrada).perform();

        enter(valorEntrada).into(inputValorEntrada);
        esperarAQueElementoTengaValor(inputValorEntrada, valorEntrada);
    }

    private void esperarAQueElementoTengaValor(WebElementFacade elemento, String valorEntrada) {
        waitForCondition()
                .withTimeout(waitForTimeoutInMilliseconds(), TimeUnit.SECONDS)
                .pollingEvery(250,TimeUnit.MILLISECONDS)
                .until(inputEsActualizadoA(elemento, valorEntrada));
    }

    private Function<? super WebDriver, Boolean> inputEsActualizadoA(final WebElementFacade elemento, final String valorEntrada) {
        return new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver webDriver) {
                return elemento.getValue().equalsIgnoreCase(valorEntrada);
            }
        };
    }
}
