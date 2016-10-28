package com.sura.guidewire.policycenter.pages;

import com.google.common.base.Function;
import com.sura.guidewire.policycenter.util.PageUtil;
import com.sura.guidewire.policycenter.util.navegacion.util.widget.TableWidgetPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class EdificiosyUbicacionesWidget extends PageUtil {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static final String XPATH_DIV_CONTENEDOR_TABLA = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV']";
    private static final String LINK_AGREGAR_UBICACION = "//a[contains(.,'Agregar ubicación')]";
    private static final String LINK_OPCION_UBICACION_NUEVA = "//a[contains(.,'Ubicación nueva')]";
    private static final String XPATH_CANCELAR_INGRESO = ".//a[@id='CPLocationPopup:Cancel']";
    private static final String XPATH_LEGEND_COBERTURA_DE_RIESGO = ".//legend[ (descendant::div[contains(., '";
    private static final String INPUT = "input";
    private static final String XPATH_PARTE1 = ".//div[ (descendant::*[contains(., '";
    private static final String XPATH_TRWE_PARTE1 = ".//tbody/tr[preceding-sibling::tr[ (descendant::*[contains(., '";
    private static final String XPATH_TRWE_PARTE2 = "')]) and  (ancestor::div[contains(@class, 'x-container x-container-default x-table-layout-ct')])  and  (child::td/div[contains(@class, 'x-container g-dv-column x-container-default x-table-layout-ct g-no-divider')]) ] ]";
    private static final String CSS_POSICION = "0px -15px";
    private static final String CSS_POSICION2 = "-15px 0";
    private static final String BACKGROUND_POSICION = "background-position";
    private static final String XPATH2_PARTE1 = ".//tr[ (descendant::label[contains(., '";
    private static final String CIERRE_XPATH1 = "')])]";
    private static final String XPATH2_PARTE2 = "')]) and @class='x-form-item-input-row' ]";
    private static final String XPATH_PARTE2 = "')]) and contains(@class, 'x-container g-dv-column x-container-default x-table-layout-ct') ]";

    TableWidgetPage tabla;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;
    @FindBy(css = ".message")
    private WebElementFacade divMensaje;

    public EdificiosyUbicacionesWidget(WebDriver driver) {
        super(driver);
    }

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

    public void agregarNuevaUbicacion(String pais, String depto, String ciudad, String direccion, String actividadEconomica) {
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
        String xpathCiudad = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']";
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
            findBy(".//*[@id='CPLocationPopup:Cancel']").waitUntilVisible().waitUntilClickable().click();

        } catch (Exception e) {
            LOGGER.info("ELEMENTO NO CLICKEABLE" + e);
        }
    }


    public void ingresarNuevaUbicacionConRiesgoConsultable() {
        agregarNuevaUbicacion("Colombia", "ANTIOQUIA", "MEDELLIN", "CR 65 45 45", "Acabado de productos textiles");
    }


    public void seleccionarTab(String tab) {
        setImplicitTimeout(WAIT_TIME_2, TimeUnit.SECONDS);
        waitForAnyTextToAppear(tab);
        shouldContainText(tab);
        String xpathTab = ".//a[ (descendant::*[contains(., '" + tab + CIERRE_XPATH1;
        withAction().moveToElement($(xpathTab)).perform();
        $(xpathTab).click();
        resetImplicitTimeout();
    }

    public boolean estaSeleccionadoTab(String tab) {
        Boolean esSeleccionado = false;
        setImplicitTimeout(WAIT_TIME_2, TimeUnit.SECONDS);
        try {

            waitForAnyTextToAppear(tab);
            shouldContainText(tab);
            String xpathTab = ".//a[ (descendant::*[contains(., '" + tab + CIERRE_XPATH1;
            String classProp = $(xpathTab).getAttribute("class");
            if (classProp.contains("x-active") && classProp.contains("x-tab-active") && classProp.contains("x-tab-default-active") && classProp.contains("x-top-active") && classProp.contains("x-tab-top-active") && classProp.contains("x-tab-default-top-active")) {
                esSeleccionado = true;
            }
        } catch (Exception e) {
            LOGGER.info("Pestaña no visualizada en Edificios y ubicaciones");
            esSeleccionado = true;
        }
        resetImplicitTimeout();
        return esSeleccionado;
    }

    public void seleccionarCoberturaDelRiesgo(String cobertura) {
        waitForAnyTextToAppear(cobertura);
        shouldContainText(cobertura);

        String xpathLegendCoberturaDeRiesgo = XPATH_LEGEND_COBERTURA_DE_RIESGO + cobertura + CIERRE_XPATH1;
        WebElementFacade inputCoberturaDeRiesgo = findBy(xpathLegendCoberturaDeRiesgo).find(By.tagName(INPUT));
        withAction().moveToElement(inputCoberturaDeRiesgo).perform();
        inputCoberturaDeRiesgo.click();
    }

    public void seleccionarCoberturaDelRiesgo(String cobertura, String tipoArticulo) {
        waitForAnyTextToAppear(cobertura);
        shouldContainText(cobertura);
        WebElementFacade trWE = findBy(XPATH_TRWE_PARTE1 + tipoArticulo + XPATH_TRWE_PARTE2);


        String xpathLegendCoberturaDeRiesgo = XPATH_LEGEND_COBERTURA_DE_RIESGO + cobertura + CIERRE_XPATH1;
        WebElementFacade inputCoberturaDeRiesgo = trWE.findBy(xpathLegendCoberturaDeRiesgo).find(By.tagName(INPUT));
        withAction().moveToElement(inputCoberturaDeRiesgo).perform();
        inputCoberturaDeRiesgo.click();
    }

    public void seleccionarTipoDeArticuloDeInformacionDeArticulo(String tipoArticulo) {
        waitForAnyTextToAppear(tipoArticulo);
        shouldContainText(tipoArticulo);
        String xpathTrCoberturaDeRiesgo = XPATH2_PARTE1 + tipoArticulo + XPATH2_PARTE2;
        WebElementFacade inputCoberturaDeRiesgo = findBy(xpathTrCoberturaDeRiesgo).find(By.tagName(INPUT));
        withAction().moveToElement(inputCoberturaDeRiesgo).perform();
        inputCoberturaDeRiesgo.click();
    }

    public void ingresarValorAEntrada(String entrada, String valorEntrada) {
        waitForAnyTextToAppear(entrada);
        shouldContainText(entrada);
        String xpathTREntrada = XPATH2_PARTE1 + entrada + "') ]) and @class='x-form-item-input-row' ]";
        WebElementFacade inputValorEntrada = findBy(xpathTREntrada).find(By.tagName(INPUT));
        withAction().moveToElement(inputValorEntrada).perform();

        enter(valorEntrada).into(inputValorEntrada);
        inputValorEntrada.click();
        esperarAQueElementoTengaValor(findBy(xpathTREntrada).find(By.tagName(INPUT)), valorEntrada);
    }

    public void ingresarValorAEntradaInformacionArticulo(String tipoArticulo, String entrada, String valorEntrada) {
        waitForAnyTextToAppear(entrada);
        shouldContainText(entrada);

        WebElementFacade trWE = findBy(XPATH_TRWE_PARTE1 + tipoArticulo + XPATH_TRWE_PARTE2);

        String xpathTREntrada = XPATH2_PARTE1 + entrada + "') ]) and @class='x-form-item-input-row' ]";
        WebElementFacade inputValorEntrada = trWE.findBy(xpathTREntrada).find(By.tagName(INPUT));
        withAction().moveToElement(inputValorEntrada).perform();

        enter(valorEntrada).into(inputValorEntrada);
        inputValorEntrada.click();
        esperarAQueElementoTengaValor(trWE.findBy(xpathTREntrada).find(By.tagName(INPUT)), valorEntrada);
    }

    private void esperarAQueElementoTengaValor(WebElementFacade elemento, String valorEntrada) {
        waitForCondition()
                .withTimeout(WAIT_TIME_2, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MILLISECONDS)
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

    public boolean estaSeleccionadaCoberturaDeRiesgo(String cobertura, String tipoArticulo) {
        Boolean estaSeleccionado = false;
        try {
            waitForAnyTextToAppear(cobertura);
            shouldContainText(cobertura);

            WebElementFacade trWE = findBy(XPATH_TRWE_PARTE1 + tipoArticulo + XPATH_TRWE_PARTE2);

            String xpathLegendCoberturaDeRiesgo = XPATH_LEGEND_COBERTURA_DE_RIESGO + cobertura + CIERRE_XPATH1;
            WebElementFacade inputCoberturaDeRiesgo = trWE.findBy(xpathLegendCoberturaDeRiesgo).find(By.tagName(INPUT));

            if (CSS_POSICION2.equals(inputCoberturaDeRiesgo.getCssValue(BACKGROUND_POSICION)) || CSS_POSICION.equals(inputCoberturaDeRiesgo.getCssValue(BACKGROUND_POSICION))) {
                estaSeleccionado = true;
            }
        } catch (Exception e) {
            LOGGER.info("CHECK DE COBERTURA: " + cobertura + " NO ENCONTRADo EN EL DOM");
        }
        return estaSeleccionado;

    }

    public boolean estaSeleccionadaCoberturaDeRiesgo(String cobertura) {
        Boolean estaSeleccionado = false;
        try {
            waitForAnyTextToAppear(cobertura);
            shouldContainText(cobertura);


            String xpathLegendCoberturaDeRiesgo = XPATH_LEGEND_COBERTURA_DE_RIESGO + cobertura + CIERRE_XPATH1;
            WebElementFacade inputCoberturaDeRiesgo = findBy(xpathLegendCoberturaDeRiesgo).find(By.tagName(INPUT));

            if (CSS_POSICION2.equals(inputCoberturaDeRiesgo.getCssValue(BACKGROUND_POSICION)) || CSS_POSICION.equals(inputCoberturaDeRiesgo.getCssValue(BACKGROUND_POSICION))) {
                estaSeleccionado = true;
            }
        } catch (Exception e) {
            LOGGER.info("CHECK DE COBERTURA: " + cobertura + " NO ENCONTRADo EN EL DOM");
        }
        return estaSeleccionado;

    }

    public boolean estaPresenteEnLaPaginaEdificiosyUbicaciones() {
        return getRenderedView().containsText("Volver a Edificios y ubicaciones");
    }

    public boolean estaSeleccionadaTipoDeArticuloEnInformacionDeArticulo(String tipoArticulo) {
        Boolean estaSeleccionado;
        waitForAnyTextToAppear(tipoArticulo);
        shouldContainText(tipoArticulo);
        String xpathTrCoberturaDeRiesgo = XPATH2_PARTE1 + tipoArticulo + XPATH2_PARTE2;
        WebElementFacade inputCoberturaDeRiesgo = findBy(xpathTrCoberturaDeRiesgo).find(By.tagName(INPUT));

        if (CSS_POSICION2.equals(inputCoberturaDeRiesgo.getCssValue(BACKGROUND_POSICION)) || CSS_POSICION.equals(inputCoberturaDeRiesgo.getCssValue(BACKGROUND_POSICION))) {
            estaSeleccionado = true;
        } else {
            estaSeleccionado = false;
        }

        return estaSeleccionado;

    }

    // TODO: 01/09/2016 Code Smell
    public void ingresarOtroArticulo(String tipoArticulo, String cobertura, String entrada, String valorEntrada, boolean esOtroArticulo, boolean esUltimaFilaDeExampleTable) {

        String xLinkAgregarOtrosArticulos = "//a[contains(@id,'CPBuildingSuraPopup:OtherArticlePanelSet:AdditionaOtherArticleLV_tb:Add')]";

        setImplicitTimeout(WAIT_TIME_2, TimeUnit.SECONDS);


        if (esOtroArticulo) {
            String xBtnAceptarAgregarOtroArticulo = ".//*[@id='AddOtherArticlesPopup:Update-btnInnerEl']";
            findBy(xBtnAceptarAgregarOtroArticulo).waitUntilVisible().waitUntilClickable().click();
        }

        if (isElementVisible(By.xpath(xLinkAgregarOtrosArticulos))) {

            cliclearBtnAgregarArticulo();
            ingresarInputTiposDeArticulos(tipoArticulo);
            waitFor(3).seconds();
            ingresarTextAreaDescripcion(tipoArticulo);
        }


        if (cobertura.length() > 0) {
            seleccionarCobertura(obtenerDivCobertura(cobertura), cobertura);
            waitFor(2).seconds();
            ingresarEntrada(entrada, valorEntrada);
        } else {
            ingresarEntrada(entrada, valorEntrada);
        }

        if (esUltimaFilaDeExampleTable) {
            String xBtnAceptarAgregarOtroArticulo = ".//*[@id='AddOtherArticlesPopup:Update-btnInnerEl']";
            findBy(xBtnAceptarAgregarOtroArticulo).waitUntilVisible().waitUntilClickable().click();
        }

        resetImplicitTimeout();

    }

    public void ingresarEntrada(String entrada, String valorEntrada) {
        WebElementFacade divEntradasAgregarOtroArticulo;

        if (isElementVisible(By.xpath(XPATH_PARTE1 + entrada + XPATH_PARTE2))) {
            divEntradasAgregarOtroArticulo = findBy(XPATH_PARTE1 + entrada + XPATH_PARTE2);

            WebElementFacade entradaOtroArticulo = divEntradasAgregarOtroArticulo.findBy(XPATH2_PARTE1 + entrada + XPATH2_PARTE2);
            WebElementFacade inputValorEntrada = entradaOtroArticulo.find(By.tagName(INPUT));
            enter(valorEntrada).into(inputValorEntrada);

        }
    }

    public WebElementFacade obtenerDivCobertura(String cobertura) {
        WebElementFacade divEntradasAgregarOtroArticulo = null;

        // Pregunta si es visible el div que contiene el nombre de la cobertura que deseo seleecionar
        if (isElementVisible(By.xpath(XPATH_PARTE1 + cobertura + XPATH_PARTE2))) {

            // captura el elemento que contenga el div con el nombre de la cobertura que será el que se usará para capturar el checkbox de la cobertura a seleccionar
            divEntradasAgregarOtroArticulo = findBy(XPATH_PARTE1 + cobertura + XPATH_PARTE2);

        }

        return divEntradasAgregarOtroArticulo;
    }

    public void seleccionarCobertura(WebElementFacade divEntradasAgregarOtroArticulo, String cobertura) {

        WebElementFacade xpathTrCoberturaDeRiesgo = divEntradasAgregarOtroArticulo.findBy(".//tr[ (descendant::div[contains(., '" + cobertura + "')])] ");
        WebElementFacade inputCoberturaDeRiesgo = xpathTrCoberturaDeRiesgo.find(By.tagName(INPUT));

        // Le da clic al checkbox de la cobertura siempre y cuando haya encontrado el elemento a cliclear
        withAction().moveToElement(inputCoberturaDeRiesgo).perform();
        inputCoberturaDeRiesgo.click();
    }

    public void cliclearBtnAgregarArticulo() {
        String xBtnAgregarArticulo = ".//a[@id='CPBuildingSuraPopup:OtherArticlePanelSet:AdditionaOtherArticleLV_tb:Add']";

        WebElementFacade btnAgregarArticulo = findBy(xBtnAgregarArticulo).waitUntilVisible().waitUntilClickable();
        btnAgregarArticulo.click();
    }

    public void ingresarInputTiposDeArticulos(String tipoArticulo) {
        waitForTextToAppear("Tipos de Artículos");
        String xInputTiposDeArticulos = ".//*[@id='AddOtherArticlesPopup:typeArticle-inputEl']";
        enter(tipoArticulo).into($(xInputTiposDeArticulos));
        waitFor(4).second();
        $(xInputTiposDeArticulos).sendKeys(Keys.ENTER);
        esperarAQueElementoTengaValor(findBy(xInputTiposDeArticulos), tipoArticulo);
    }

    public void ingresarTextAreaDescripcion(String tipoArticulo) {
        String xTextAreaDescripcion = ".//*[@id='AddOtherArticlesPopup:Desciption_Input-inputEl']";

        enter(tipoArticulo).into($(xTextAreaDescripcion));
        waitFor(1).second();
        $(xTextAreaDescripcion).waitUntilClickable().click();
        esperarAQueElementoTengaValor(findBy(xTextAreaDescripcion), tipoArticulo);
    }

    public void verificarMensajes(ExamplesTable mensajes) {
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(divMensaje).shouldBePresent();
        for (Map<String, String> mensaje : mensajes.getRows()) {
            MatcherAssert.assertThat("Error: en la validacion del mensaje Expected: " + mensaje.get("MENSAJES_WORKSPACE")+" but was: "+divMensaje.getText(), divMensaje.containsText(mensaje.get("MENSAJES_WORKSPACE")));
        }
    }
}
