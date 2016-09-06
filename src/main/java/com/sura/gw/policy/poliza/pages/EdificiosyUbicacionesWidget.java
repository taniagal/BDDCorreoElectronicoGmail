package com.sura.gw.policy.poliza.pages;

import com.google.common.base.Function;
import com.sura.commons.selenium.Commons;
import com.sura.gw.navegacion.util.widget.TableWidgetPage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


public class EdificiosyUbicacionesWidget extends Commons {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static String XPATH_DIV_CONTENEDOR_TABLA = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV']";
    private static String LINK_AGREGAR_UBICACION = "//a[contains(.,'Agregar ubicación')]";
    private static String LINK_OPCION_UBICACION_NUEVA = "//a[contains(.,'Ubicación nueva')]";

    TableWidgetPage tabla;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;

    public EdificiosyUbicacionesWidget(WebDriver driver){
        super(driver);
    }

    private void obtenerTabla() {
        this.tabla = new TableWidgetPage(SerenityWebdriverManager.inThisTestThread().getCurrentDriver());
        this.tabla.buscarTabla(XPATH_DIV_CONTENEDOR_TABLA);

    }

    public void agregarArticuloAPrimerUbicacion() {
        waitForTextToAppear("Edificios y ubicaciones", 16000);
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
        String xpathPais = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']";
        String xpathDepto = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']";
        String xpathCiudad = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']";
        String xpathDireccion = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']";
        String xpathActividadEconomica = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:EconomicActivity-inputEl']";


        $(xpathPais).type(pais);
        $(xpathPais).click();

        waitFor(3).seconds();
        enter(depto).into($(xpathDepto));
        waitFor(3).seconds();
        $(xpathDepto).click();

        waitFor(6).seconds();
        enter(ciudad).into($(xpathCiudad));
        waitFor(6).seconds();
        $(xpathCiudad).click();

        waitFor(3).seconds();
        enter(direccion).into($(xpathDireccion));
        waitFor(3).seconds();
        $(xpathDireccion).click();

        waitFor(3).seconds();
        enter(actividadEconomica).into($(xpathActividadEconomica));
        waitFor(10).seconds();
        $(xpathActividadEconomica).sendKeys(Keys.ENTER);
        waitFor(3).seconds();

        findBy(".//*[@id='CPLocationPopup:Update']").waitUntilVisible().waitUntilClickable().click();
        waitFor(10).seconds();
    }

    public void seleccionarEnlaceCancelarIngresoNuevaUbicacion() {
        try {
            findBy(".//a[@id='CPLocationPopup:Cancel']").shouldBeVisible();
            findBy(".//a[@id='CPLocationPopup:Cancel']").shouldBeEnabled();
            findBy(".//a[@id='CPLocationPopup:Cancel']").click();
        }catch (Exception e) {
            LOGGER.info("ELEMENTO NO CLICKLEABLE" + e);
        }
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

    public boolean estaSeleccionadoTab(String tab) {
        Boolean esSeleccionado = false;
        waitForAnyTextToAppear(tab);
        shouldContainText(tab);
        String xpathTab = ".//a[ (descendant::*[contains(., '" + tab + "')])]";
        String classProp = $(xpathTab).getAttribute("class");
        if (classProp.contains("x-active") && classProp.contains("x-tab-active") && classProp.contains("x-tab-default-active") && classProp.contains("x-top-active") && classProp.contains("x-tab-top-active") && classProp.contains("x-tab-default-top-active") ){
            esSeleccionado = true;
        }
        return esSeleccionado;
    }

    public void seleccionarCoberturaDelRiesgo(String cobertura) {
        waitForAnyTextToAppear(cobertura);
        shouldContainText(cobertura);
        String xpathLegendCoberturaDeRiesgo = ".//legend[ (descendant::div[contains(., '" + cobertura + "')])]";
        WebElementFacade inputCoberturaDeRiesgo = findBy(xpathLegendCoberturaDeRiesgo).find(By.tagName("input"));
        withAction().moveToElement(inputCoberturaDeRiesgo).perform();
        inputCoberturaDeRiesgo.click();
    }

    public void seleccionarTipoDeArticuloDeInformacionDeArticulo(String tipoArticulo) {
        waitForAnyTextToAppear(tipoArticulo);
        shouldContainText(tipoArticulo);
        String xpathTrCoberturaDeRiesgo = ".//tr[ (descendant::label[contains(., '" + tipoArticulo + "')]) and @class='x-form-item-input-row' ]";
        WebElementFacade inputCoberturaDeRiesgo = findBy(xpathTrCoberturaDeRiesgo).find(By.tagName("input"));
        withAction().moveToElement(inputCoberturaDeRiesgo).perform();
        inputCoberturaDeRiesgo.click();
    }

    public void ingresarValorAEntrada(String entrada, String valorEntrada) {
        waitForAnyTextToAppear(entrada);
        shouldContainText(entrada);
        String xpathTREntrada = ".//tr[ (descendant::label[contains(., '" + entrada + "') ]) and @class='x-form-item-input-row' ]";
        WebElementFacade inputValorEntrada = findBy(xpathTREntrada).find(By.tagName("input"));
        withAction().moveToElement(inputValorEntrada).perform();

        enter(valorEntrada).into(inputValorEntrada);
        esperarAQueElementoTengaValor(findBy(xpathTREntrada).find(By.tagName("input")), valorEntrada);
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

    public boolean estaSeleccionadaCoberturaDeRiesgo(String cobertura) {
        Boolean estaSeleccionado;
        waitForAnyTextToAppear(cobertura);
        shouldContainText(cobertura);
        String xpathLegendCoberturaDeRiesgo = ".//legend[ (descendant::div[contains(., '" + cobertura + "')])]";
        WebElementFacade inputCoberturaDeRiesgo = findBy(xpathLegendCoberturaDeRiesgo).find(By.tagName("input"));

        if ("-15px 0".equals(inputCoberturaDeRiesgo.getCssValue("background-position")) || "0px -15px".equals(inputCoberturaDeRiesgo.getCssValue("background-position"))){
            estaSeleccionado = true;
        } else {
            estaSeleccionado = false;
        }

        return estaSeleccionado;

    }

    public boolean estaPresenteEnLaPaginaEdificiosyUbicaciones(){
        return getRenderedView().containsText("Volver a Edificios y ubicaciones");
    }

    public boolean estaSeleccionadaTipoDeArticuloEnInformacionDeArticulo(String tipoArticulo) {
        Boolean estaSeleccionado;
        waitForAnyTextToAppear(tipoArticulo);
        shouldContainText(tipoArticulo);
        String xpathTrCoberturaDeRiesgo = ".//tr[ (descendant::label[contains(., '" + tipoArticulo + "')]) and @class='x-form-item-input-row' ]";
        WebElementFacade inputCoberturaDeRiesgo = findBy(xpathTrCoberturaDeRiesgo).find(By.tagName("input"));

        if ("-15px 0".equals(inputCoberturaDeRiesgo.getCssValue("background-position")) || "0px -15px".equals(inputCoberturaDeRiesgo.getCssValue("background-position"))){
            estaSeleccionado = true;
        } else {
            estaSeleccionado = false;
        }

        return estaSeleccionado;

    }

    public void ingresarOtroArticulo(String tipoArticulo, String cobertura, String entrada, String valorEntrada) {
        WebElementFacade btnAgregarArticulo = findBy(".//a[@id='CPBuildingSuraPopup:OtherArticlePanelSet:AdditionaOtherArticleLV_tb:Add']").waitUntilVisible().waitUntilClickable();
        btnAgregarArticulo.click();

        enter(tipoArticulo).into($(".//*[@id='AddOtherArticlesPopup:typeArticle-inputEl']"));
        waitFor(1).second();
        $(".//*[@id='AddOtherArticlesPopup:typeArticle-inputEl']").sendKeys(Keys.ENTER);
        esperarAQueElementoTengaValor(findBy(".//*[@id='AddOtherArticlesPopup:typeArticle-inputEl']"), tipoArticulo);

        enter(tipoArticulo).into($(".//*[@id='AddOtherArticlesPopup:Desciption_Input-inputEl']"));
        WebElementFacade divEntradasAgregarOtroArticulo = null;

        if (cobertura.length() > 0){
            if (isElementVisible(By.xpath(".//div[ (descendant::*[contains(., '" + cobertura + "')]) and contains(@class, 'x-container g-dv-column x-container-default x-table-layout-ct') ]"))){
                divEntradasAgregarOtroArticulo = findBy(".//div[ (descendant::*[contains(., '" + cobertura + "')]) and contains(@class, 'x-container g-dv-column x-container-default x-table-layout-ct') ]");

                String xpathTrCoberturaDeRiesgo = divEntradasAgregarOtroArticulo.findBy(".//tr[ (descendant::label[contains(., '" + cobertura + "')]) and @class='x-form-item-input-row' ]");
                WebElementFacade inputCoberturaDeRiesgo = findBy(xpathTrCoberturaDeRiesgo).find(By.tagName("input"));
                withAction().moveToElement(inputCoberturaDeRiesgo).perform();
                inputCoberturaDeRiesgo.click();
            }
        } else {
            if (isElementVisible(By.xpath(".//div[ (descendant::*[contains(., '" + entrada + "')]) and contains(@class, 'x-container g-dv-column x-container-default x-table-layout-ct') ]"))){
                divEntradasAgregarOtroArticulo = findBy(".//div[ (descendant::*[contains(., '" + entrada + "')]) and contains(@class, 'x-container g-dv-column x-container-default x-table-layout-ct') ]");
                WebElementFacade entradaOtroArticulo = divEntradasAgregarOtroArticulo.findBy(".//tr[ (descendant::label[contains(., '" + entrada + "')]) and @class='x-form-item-input-row' ]");
                WebElementFacade inputValorEntrada = entradaOtroArticulo.find(By.tagName("input"));
                enter(valorEntrada).into(inputValorEntrada);

                // Para esta prueba no se toma en cuenta el indice variable desde el .story, ya que es irrelevante para esta prueba.
                // TODO: 24/08/2016 Sin embargo esta pendiente de refactor que en entrada y valores sean varios por columna y hacer un split e ingresar las entradas
                enter("1").into($(".//*[@id='AddOtherArticlesPopup:InputCoverageArticle:ArticleTypeDetailDV:VariableRate_Input-inputEl']"));
            }
        }



        findBy(".//*[@id='AddOtherArticlesPopup:Update-btnInnerEl']").click();

    }
}
