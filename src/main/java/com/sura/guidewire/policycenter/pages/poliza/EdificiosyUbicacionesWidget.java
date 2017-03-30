package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import com.sura.guidewire.policycenter.utils.navegacion.util.widget.TableWidgetPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class EdificiosyUbicacionesWidget extends PageUtil {

    private static final String XPATH_DIV_CONTENEDOR_TABLA = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV']";
    private static final String LINK_AGREGAR_UBICACION = "//a[contains(.,'Agregar ubicación')]";
    private static final String XPATH_COTIZAR = "//*[contains(text(),'Cotizar')]";
    private static final String LINK_OPCION_UBICACION_NUEVA = "//a[contains(.,'Ubicación nueva')]";
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
    private static final String XPATH_EDITAR_TRANSACCION_POLIZA = ".//span[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']";
    private static final String XPATH_ACEPTAR = "//a[contains(.,'Aceptar')]";
    private static final String XPATH_DESCARTAR_CAMBIOS = "//a[contains(.,'Descartar cambios no guardados')]";
    private static final String LABEL_EDIFICIOS_Y_UBICACIONES = "Edificios y ubicaciones";
    private static final String XPATH_CHECK_CONTACTO = ".//*[contains(@class,'x-column-header-text')]/div";
    private static final String VOLVER_A_EDIFICIOS = "Volver a Edificios y ubicaciones";
    private static final String TIPO_DOCUMENTO = "CEDULA DE CIUDADANIA";
    private static final String MENSAJES_WORKSPACE = "MENSAJES_WORKSPACE";
    private static final String VALIDACION_MENSAJE_RIESGOS = "Solo se permite ingresar un riesgo en la póliza";

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;
    @FindBy(xpath = ".//a[contains(.,'Remover Riesgo')]")
    private WebElementFacade botonRemoverRiesgo;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV_tb:AddContactsButton']")
    private WebElementFacade botonAgregarAsegurado;
    @FindBy(xpath = ".//a[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulosCambioPoliza;
    @FindBy(xpath = ".//a[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulosRenovacionPoliza;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptarCambioDePoliza;
    @FindBy(xpath = ".//a[contains(.,'Borrar')]")
    private WebElementFacade botonBorrar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:Cancel']")
    private WebElementFacade botonCancelar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    private WebElementFacade botonSeleccionar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade comboBoxTipoDocumento;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade campoTxtNumeroDocumento;
    @FindBy(id = "WebMessageWorksheet")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:CPBuildings']")
    private WebElementFacade edificiosyUbicacionesRenovacion;
    @FindBy(xpath = ".//a[contains(.,'Descartar cambios no guardados')]")
    private WebElementFacade linkDescartarCambios;
    @FindBy(xpath = ".//*[contains(@id,'ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV_tb:AddContactsButton:AddFromSearch-textEl')]")
    private WebElementFacade menuItemDelDireciotio;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-inputEl']")
    private WebElementFacade comboBoxCiudad;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:TargetedAddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoTxtDireccion;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:EconomicActivity-inputEl']")
    private WebElementFacade comboBoxActividadEconomica;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:FloatType_Ext-inputEl']")
    private WebElementFacade listaTipoDeMercancia;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV_tb:AddContactsButton-btnInnerEl']")
    private WebElementFacade botonInteresAdicionalEdificios;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageMachine:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV_tb:AddContactsButton-btnInnerEl']")
    private WebElementFacade botonInteresAdicionalMaquinariaYEquipo;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV-body']/*/table/tbody/tr[2]/td[4]")
    private WebElementFacade listaTipoOnerosoEdificios;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageMachine:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV-body']/*/table/tbody/tr[2]/td[4]")
    private WebElementFacade listaTipoOnerosoMaquinariaYEquipo;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:HasEdificio-inputEl']")
    private WebElementFacade chekInteresAdicionaledificios;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV-body']/*/table/tbody/tr[2]/td[1]")
    private WebElementFacade chekTipoOnerosoEdificios;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV_tb:Remove-btnInnerEl']")
    private WebElementFacade botonQuitar;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:CPBuildingInteresAdicional:CPAdditionalInteresInputSet:AdditionalInterestLV-body']/*/table/tbody/tr[3]/td[4]")
    private WebElementFacade agregarTipoOnerosoEdificios;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:checkCommercialValue-inputEl']")
    private WebElementFacade chekAseguradoValorComercial;
    @FindBy(xpath = ".//div[contains(@style,'margin-left: auto; margin-right: auto;')]")
    private WebElementFacade checkBoxRiesgo;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:ComercialValue_Input-inputEl']")
    private WebElementFacade campoAseguradoValorComercial;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']")
    private WebElementFacade txtValorAsegurado;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV-body']/*/table/tbody/tr[1]/td[1]/div/img")
    private WebElementFacade chekEliminarPrimeraUbicacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV-body']/*/table/tbody/tr[1]/td[1]/div/img")
    private WebElementFacade chekEliminarPrimeraUbicacionRenovacion;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade lblMensajeValidaRiesgosRepetidos;
    @FindBy(xpath = "//span[@id='RenewalWizard:Prev-btnInnerEl']")
    private WebElementFacade botonVolverEnRenovacion;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:SaleMethod_DV-inputEl']")
    private WebElementFacade comboMedioVenta;


    TableWidgetPage tabla;
    NuevaPolizaPage nuevaPolizaPage;
    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage;

    public EdificiosyUbicacionesWidget(WebDriver driver) {
        super(driver);
    }


    private void obtenerTabla() {
        this.tabla = new TableWidgetPage(SerenityWebdriverManager.inThisTestThread().getCurrentDriver());
        this.tabla.buscarTabla(XPATH_DIV_CONTENEDOR_TABLA);

    }

    public void agregarArticuloAPrimerUbicacion() {
        esperarHasta(TIEMPO_2000);
        waitForTextToAppear(LABEL_EDIFICIOS_Y_UBICACIONES);
        if (tabla == null) {
            obtenerTabla();
        }
        waitFor(botonAgregarArticulos).waitUntilPresent();
        List<WebElementFacade> elementosList = findAll(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']");
        elementosList.get(0).click();
        String tituloDePaginaAgregarArticulos = VOLVER_A_EDIFICIOS;
        waitForTextToAppear(tituloDePaginaAgregarArticulos);
        shouldContainText(tituloDePaginaAgregarArticulos);
    }

    public void agregarArticuloAPrimerUbicacionEnCambioDePoliza() {
        waitForTextToAppear(LABEL_EDIFICIOS_Y_UBICACIONES);
        if (tabla == null) {
            obtenerTabla();
        }
        waitFor(botonAgregarArticulosCambioPoliza).waitUntilPresent();
        List<WebElementFacade> elementosList = findAll(".//a[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']");
        elementosList.get(0).click();
        String tituloDePaginaAgregarArticulos = VOLVER_A_EDIFICIOS;
        waitForTextToAppear(tituloDePaginaAgregarArticulos);
        shouldContainText(tituloDePaginaAgregarArticulos);
    }


    public void agregarArticulosEnUbicacionEnRenovacion(int numeroUbicacion) {
        waitForTextToAppear(LABEL_EDIFICIOS_Y_UBICACIONES);
        if (tabla == null) {
            obtenerTabla();
        }
        waitFor(botonAgregarArticulosRenovacionPoliza).waitUntilPresent();
        String xpathBotonInicio = "//a[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:";
        String xpathBotonFin = ":Actions:AddNewBuilding']";
        ArrayList<WebElementFacade> elementosList = new ArrayList<>();
        boolean bandera = true;
        for (int indice = 0; bandera; indice++) {
            WebElementFacade aux = findBy(xpathBotonInicio + indice + xpathBotonFin);
            if (aux.isVisible()) {
                elementosList.add(aux);
            } else {
                bandera = false;
            }
        }
        if (numeroUbicacion <= elementosList.size()) {
            elementosList.get(numeroUbicacion - 1).click();
        }
        String tituloDePaginaAgregarArticulos = VOLVER_A_EDIFICIOS;
        waitForTextToAppear(tituloDePaginaAgregarArticulos);
    }


    public void agregarArticuloAPrimerUbicacionEnRenovacionDePoliza() {
        agregarArticulosEnUbicacionEnRenovacion(1);
    }

    public void ingresarMedioDeVenta(String medioVenta) {
        waitFor(comboMedioVenta);
        seleccionarItem(comboMedioVenta, medioVenta);
    }

    public void agregarNuevaUbicacion(String departamento, String ciudad, String direccion, String actividad, String medioVenta) {
        waitForTextToAppear(LABEL_EDIFICIOS_Y_UBICACIONES);
        findBy(LINK_AGREGAR_UBICACION).shouldBeVisible();
        clickearElemento(findBy(LINK_AGREGAR_UBICACION));
        findBy(LINK_OPCION_UBICACION_NUEVA).shouldBeVisible();
        clickearElemento(findBy(LINK_OPCION_UBICACION_NUEVA));
        campoTxtDireccion.waitUntilPresent().sendKeys(direccion);
        seleccionarItem(comboBoxDepartamento, departamento);
        esperarPorValor(comboBoxDepartamento, departamento);
        seleccionarItem(comboBoxCiudad, ciudad);
        esperarPorValor(comboBoxCiudad, ciudad);
        seleccionarItem(comboBoxActividadEconomica, actividad);
        esperarPorValor(comboBoxActividadEconomica, actividad);
        ingresarMedioDeVenta(medioVenta);
        clickearElemento(botonAceptar);
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if (botonBorrar.isVisible()) {
            clickearElemento(botonAceptar);
            waitForTextToAppear(LABEL_EDIFICIOS_Y_UBICACIONES, TIEMPO_30000);
        }
        resetImplicitTimeout();
    }

    public void seleccionarEnlaceCancelarIngresoNuevaUbicacion() {
        clickearElemento(botonCancelar);
    }

    public void ingresarNuevaUbicacionConRiesgoConsultable() {
        agregarNuevaUbicacion("Antioquia", "Medellin", "CR 65 45 45", "Acabado de productos textiles", "Televentas");
    }

    // TODO: 11/01/2017 : Se debe borrar este metodo, dado que esta sobrecargado, dado que se requiere variabilidad en datos
    public void ingresarNuevaUbicacionSinRiesgoConsultable() {
        agregarNuevaUbicacion("Antioquia", "Medellin", "CR 45 30 30", "Acabado de productos textiles", "Televentas");
    }

    public void ingresarNuevaUbicacionSinRiesgoConsultable(ExamplesTable datosUbicacion) {
        Map<String, String> valoresUbicaion = datosUbicacion.getRow(0);
        agregarNuevaUbicacion(valoresUbicaion.get("departamento"), valoresUbicaion.get("ciudad"), valoresUbicaion.get("direccion"), valoresUbicaion.get("actividadEconomica"), valoresUbicaion.get("medioVenta"));
    }

    public void removerRiesgos() {
        setImplicitTimeout(TIEMPO_3, TimeUnit.SECONDS);
        if (checkBoxRiesgo.isVisible()) {
            checkBoxRiesgo.click();
            waitFor(TIEMPO_1).second();
            botonRemoverRiesgo.click();
        }
        resetImplicitTimeout();
    }

    public void editartransacciondepoliza() {
        waitFor(botonVolverEnRenovacion).click();
        esperarHasta(TIEMPO_2000);
        opcionesInformacionPolizaMrcPage.seleccionBotonSiguienteenRenovacionDePoliza();
        findBy(XPATH_EDITAR_TRANSACCION_POLIZA).waitUntilVisible().click();
        esperarHasta(TIEMPO_2000);
        findBy(XPATH_ACEPTAR).click();
        esperarHasta(TIEMPO_2000);
        if (findBy(XPATH_DESCARTAR_CAMBIOS).isVisible()) {
            esperarHasta(TIEMPO_2000);
            findBy(XPATH_DESCARTAR_CAMBIOS).click();
            clickearElemento(edificiosyUbicacionesRenovacion);
            waitForTextToAppear("Edificios y ubicaciones");
        }
    }

    public void seleccionarTab(String tab) {
        setImplicitTimeout(0, TimeUnit.SECONDS);
        waitForAnyTextToAppear(tab);
        shouldContainText(tab);
        String xpathTab = ".//a[ (descendant::*[contains(., '" + tab + CIERRE_XPATH1;
        withAction().moveToElement($(xpathTab)).perform();
        $(xpathTab).click();
        resetImplicitTimeout();
    }

    public boolean estaSeleccionadoTab(String tab) {
        Boolean esSeleccionado = false;
        setImplicitTimeout(0, TimeUnit.SECONDS);
        try {
            waitForAnyTextToAppear(tab, "Agregar Otro Articulo");
            shouldContainText(tab);
            String xpathTab = ".//a[ (descendant::*[contains(., '" + tab + CIERRE_XPATH1;
            String classProp = $(xpathTab).getAttribute("class");
            if (this.primeraCondicion(classProp) && this.segundaCondicion(classProp)) {
                esSeleccionado = true;
            }
        } catch (Exception e) {
            LOGGER.info("Pestaña no visualizada en Edificios y ubicaciones" + e);
            esSeleccionado = true;
        }
        resetImplicitTimeout();
        return esSeleccionado;
    }

    private boolean primeraCondicion(String objeto) {
        boolean condicionUno = false;
        if (objeto.contains("x-active") && objeto.contains("x-tab-active") && objeto.contains("x-tab-default-active")) {
            condicionUno = true;
        }
        return condicionUno;
    }

    private boolean segundaCondicion(String objeto) {
        boolean condicionDos = false;
        if (objeto.contains("x-top-active") && objeto.contains("x-tab-top-active") && objeto.contains("x-tab-default-top-active")) {
            condicionDos = true;
        }
        return condicionDos;
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
        String xpathTREntrada = XPATH2_PARTE1 + entrada + "') ]) and @class='x-form-item-input-row' ]";
        WebElementFacade inputValorEntrada = findBy(xpathTREntrada).find(By.tagName(INPUT));
        withAction().moveToElement(inputValorEntrada).perform();
        enter(valorEntrada).into(inputValorEntrada);
        inputValorEntrada.click();
    }

    public void ingresarValorAEntradaInformacionArticulo(String tipoArticulo, String entrada, String valorEntrada) {
        waitForAnyTextToAppear(entrada);
        WebElementFacade trWE = findBy(XPATH_TRWE_PARTE1 + tipoArticulo + XPATH_TRWE_PARTE2);
        String xpathTREntrada = XPATH2_PARTE1 + entrada + "') ]) and @class='x-form-item-input-row' ]";
        WebElementFacade inputValorEntrada = trWE.findBy(xpathTREntrada).find(By.tagName(INPUT));
        withAction().moveToElement(inputValorEntrada).perform();
        enter(valorEntrada).into(inputValorEntrada);
        inputValorEntrada.click();
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
            LOGGER.info("CHECK DE COBERTURA: " + cobertura + " NO ENCONTRADo EN EL DOM " + e);
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
            if (CSS_POSICION2.equals(inputCoberturaDeRiesgo.waitUntilPresent().getCssValue(BACKGROUND_POSICION)) || CSS_POSICION.equals(inputCoberturaDeRiesgo.waitUntilPresent().getCssValue(BACKGROUND_POSICION))) {
                estaSeleccionado = true;
            }
        } catch (Exception e) {
            LOGGER.info("CHECK DE COBERTURA: " + cobertura + " NO ENCONTRADo EN EL DOM " + e);
        }
        return estaSeleccionado;
    }

    public boolean estaPresenteEnLaPaginaEdificiosyUbicaciones() {
        return getRenderedView().containsText(VOLVER_A_EDIFICIOS);
    }

    public boolean estaSeleccionadaTipoDeArticuloEnInformacionDeArticulo(String tipoArticulo) {
        Boolean estaSeleccionado;
        waitForAnyTextToAppear(tipoArticulo);
        shouldContainText(tipoArticulo);
        String xpathTrCoberturaDeRiesgo = XPATH2_PARTE1 + tipoArticulo + XPATH2_PARTE2;
        WebElementFacade inputCoberturaDeRiesgo = findBy(xpathTrCoberturaDeRiesgo).find(By.tagName(INPUT));
        if (CSS_POSICION2.equals(inputCoberturaDeRiesgo.waitUntilPresent().getCssValue(BACKGROUND_POSICION)) || CSS_POSICION.equals(inputCoberturaDeRiesgo.waitUntilPresent().getCssValue(BACKGROUND_POSICION))) {
            estaSeleccionado = true;
        } else {
            estaSeleccionado = false;
        }
        return estaSeleccionado;
    }

    public void ingresarOtroArticulo(String tipoArticulo, String cobertura, String entrada, String valorEntrada, boolean esOtroArticulo, boolean esUltimaFilaDeExampleTable) {
        WebElementFacade xLinkAgregarOtrosArticulos = $("//a[contains(@id,'CPBuildingSuraPopup:OtherArticlePanelSet:AdditionaOtherArticleLV_tb:Add')]");
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (esOtroArticulo) {
            String xBtnAceptarAgregarOtroArticulo = ".//*[@id='AddOtherArticlesPopup:Update-btnInnerEl']";
            findBy(xBtnAceptarAgregarOtroArticulo).waitUntilVisible().click();
        }
        resetImplicitTimeout();
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if (xLinkAgregarOtrosArticulos.isVisible()) {
            cliclearBtnAgregarArticulo();
            ingresarInputTiposDeArticulos(tipoArticulo);
            ingresarTextAreaDescripcion(tipoArticulo);
        }
        if (cobertura.length() > 0) {
            seleccionarCobertura(obtenerDivCobertura(cobertura), cobertura);
            ingresarEntrada(entrada, valorEntrada);
        } else {
            ingresarEntrada(entrada, valorEntrada);
        }
        if (esUltimaFilaDeExampleTable) {
            String xBtnAceptarAgregarOtroArticulo = ".//*[@id='AddOtherArticlesPopup:Update-btnInnerEl']";
            findBy(xBtnAceptarAgregarOtroArticulo).waitUntilVisible().click();
        }
        resetImplicitTimeout();
    }

    public void ingresarEntrada(String entrada, String valorEntrada) {
        WebElementFacade divEntradasAgregarOtroArticulo;
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if (isElementVisible(By.xpath(XPATH_PARTE1 + entrada + XPATH_PARTE2))) {
            divEntradasAgregarOtroArticulo = findBy(XPATH_PARTE1 + entrada + XPATH_PARTE2);
            WebElementFacade entradaOtroArticulo = divEntradasAgregarOtroArticulo.findBy(XPATH2_PARTE1 + entrada + XPATH2_PARTE2);
            WebElementFacade inputValorEntrada = entradaOtroArticulo.find(By.tagName(INPUT)).waitUntilVisible();
            enter(valorEntrada).into(waitFor(inputValorEntrada));
        }
        resetImplicitTimeout();
    }

    public WebElementFacade obtenerDivCobertura(String cobertura) {
        WebElementFacade divEntradasAgregarOtroArticulo = null;
        setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
        if (isElementVisible(By.xpath(XPATH_PARTE1 + cobertura + XPATH_PARTE2))) {
            divEntradasAgregarOtroArticulo = findBy(XPATH_PARTE1 + cobertura + XPATH_PARTE2);
        }
        resetImplicitTimeout();
        return divEntradasAgregarOtroArticulo;
    }

    public void seleccionarCobertura(WebElementFacade divEntradasAgregarOtroArticulo, String cobertura) {
        WebElementFacade xpathTrCoberturaDeRiesgo = divEntradasAgregarOtroArticulo.findBy(".//tr[ (descendant::div[contains(., '" + cobertura + "')])] ");
        WebElementFacade inputCoberturaDeRiesgo = xpathTrCoberturaDeRiesgo.find(By.tagName(INPUT));
        try {
            inputCoberturaDeRiesgo.waitUntilPresent();
            withAction().moveToElement(inputCoberturaDeRiesgo).perform();
        } catch (StaleElementReferenceException e) {
            LOGGER.info("StaleElementReferenceException " + e);
            withAction().moveToElement(inputCoberturaDeRiesgo).perform();
        }
        inputCoberturaDeRiesgo.click();
    }

    public void cliclearBtnAgregarArticulo() {
        String xBtnAgregarArticulo = ".//a[@id='CPBuildingSuraPopup:OtherArticlePanelSet:AdditionaOtherArticleLV_tb:Add']";
        WebElementFacade btnAgregarArticulo = findBy(xBtnAgregarArticulo).waitUntilVisible().waitUntilClickable();
        btnAgregarArticulo.click();
    }

    public void cliclearBtnCotizar() {
        WebElementFacade btnCotizar = findBy(XPATH_COTIZAR);
        try {
            withTimeoutOf(TIEMPO_7, TimeUnit.SECONDS).waitFor(btnCotizar).waitUntilPresent();
            clickearElemento(btnCotizar);
        } catch (TimeoutException e) {
            LOGGER.info("ElementShouldBePresentException " + e);
            setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
            if (botonAceptarCambioDePoliza.isPresent()) {
                clickearElemento(botonAceptarCambioDePoliza);
                withTimeoutOf(TIEMPO_10, TimeUnit.SECONDS).waitFor(btnCotizar);
                clickearElemento(btnCotizar);
            }
            resetImplicitTimeout();
        }
        descartarCambios();
    }

    public boolean descarteCambios() {
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (linkDescartarCambios.isPresent()) {
            linkDescartarCambios.click();
            resetImplicitTimeout();
            return true;
        }
        resetImplicitTimeout();
        return false;
    }


    public void descartarCambios() {
        WebElementFacade btnCotizar = findBy(XPATH_COTIZAR);
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        if (descarteCambios()) {
            clickearElemento(btnCotizar);
        }
        resetImplicitTimeout();
    }

    public void ingresarInputTiposDeArticulos(String tipoArticulo) {
        waitForTextToAppear("Tipos de Artículos");
        String xInputTiposDeArticulos = ".//*[@id='AddOtherArticlesPopup:typeArticle-inputEl']";
        enter(tipoArticulo).into($(xInputTiposDeArticulos));
        esperarHasta(TIEMPO_2000);
        $(xInputTiposDeArticulos).sendKeys(Keys.ENTER);
    }

    public void ingresarTextAreaDescripcion(String tipoArticulo) {
        WebElementFacade textAreaDescripcion = $(".//*[@id='AddOtherArticlesPopup:Desciption_Input-inputEl']");
        textAreaDescripcion.waitUntilVisible();
        esperarHasta(TIEMPO_1000);
        textAreaDescripcion.click();
        enter(tipoArticulo).into(textAreaDescripcion);
        clickearElemento(textAreaDescripcion);
    }

    public void verificarMensajes(ExamplesTable mensajes) {
        for (Map<String, String> mensaje : mensajes.getRows()) {
            setImplicitTimeout(TIEMPO_2, TimeUnit.SECONDS);
            try {
                waitFor(divMensaje).shouldContainText(mensaje.get(MENSAJES_WORKSPACE));
                MatcherAssert.assertThat("Error: en la validacion del mensaje Expected: " + mensaje.get(MENSAJES_WORKSPACE) + " but was: " + divMensaje.getText(), divMensaje.containsText(mensaje.get(MENSAJES_WORKSPACE)));
            } catch (StaleElementReferenceException e) {
                intentarVerificarmensaje("StaleElementReferenceException " + e, mensaje.get(MENSAJES_WORKSPACE), "Error: en la validacion del mensaje Expected: " + mensaje.get(MENSAJES_WORKSPACE) + " but was: " + divMensaje.getText(), divMensaje.containsText(mensaje.get(MENSAJES_WORKSPACE)));
            } catch (ElementNotVisibleException f) {
                intentarVerificarmensaje("ElementNotVisibleException " + f, mensaje.get(MENSAJES_WORKSPACE), "Error: en la validacion del mensaje Expected: " + mensaje.get(MENSAJES_WORKSPACE) + " but was: " + divMensaje.getText(), divMensaje.containsText(mensaje.get(MENSAJES_WORKSPACE)));
            }
        }
        resetImplicitTimeout();
    }

    public void intentarVerificarmensaje(String s, String textValue, String reason, boolean assertion) {
        LOGGER.info(s);
        waitFor(divMensaje).shouldContainText(textValue);
        esperarHasta(TIEMPO_2000);
        MatcherAssert.assertThat(reason, assertion);
    }

    public void agregarInteresAdicional(String cedula, String tipodocumento) {
        agregarInteresAdicionalDelDirectorio(botonAgregarAsegurado, cedula, tipodocumento);
    }

    public void agregarInteresAdicionalDelDirectorio(WebElementFacade elemento, String cedula, String tipodocumento) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(elemento).waitUntilPresent().click();
        menuItemDelDireciotio.waitUntilPresent().click();
        comboBoxTipoDocumento.waitUntilPresent().clear();
        esperarHasta(TIEMPO_300);
        comboBoxTipoDocumento.sendKeys(tipodocumento);
        comboBoxTipoDocumento.sendKeys(Keys.ENTER);
        if (tipodocumento.contains(TIPO_DOCUMENTO)) {
            waitForTextToAppear("Primer nombre");
        } else {
            waitForTextToAppear("Razón social");
        }
        esperarHasta(TIEMPO_300);
        campoTxtNumeroDocumento.sendKeys(cedula);
        clickearElemento(botonBuscar);
        botonSeleccionar.waitUntilPresent().click();
        botonAgregarAsegurado.waitUntilPresent();
    }

    public void ingresarInteresesAdicionalesACadaArticulo(ExamplesTable interesados) {
        for (Map<String, String> interesadosadicionales : interesados.getRows()) {
            String tipodocumento = interesadosadicionales.get("TIPO_DE_DOCUMENTO");
            String documento = interesadosadicionales.get("DOCUMENTO");
            String tipobeneficiario = interesadosadicionales.get("TIPOBENEFICIARIO");
            agregarInteresAdicionalDelDirectorio(botonInteresAdicionalEdificios, documento, tipodocumento);
            ingresarBeneficiarioOneroso(tipobeneficiario, listaTipoOnerosoEdificios);
            agregarInteresAdicionalDelDirectorio(botonInteresAdicionalMaquinariaYEquipo, documento, tipodocumento);
            ingresarBeneficiarioOneroso(tipobeneficiario, listaTipoOnerosoMaquinariaYEquipo);
        }
    }

    public void ingresarInteresAdicionalAUnSoloArticulo(ExamplesTable interesado) {
        for (Map<String, String> interesadosadicionalesuno : interesado.getRows()) {
            String tipodocumentos = interesadosadicionalesuno.get("TIPO_DE_DOCUMENTO");
            String documentos = interesadosadicionalesuno.get("DOCUMENTO");
            String tipobeneficiarios = interesadosadicionalesuno.get("TIPOBENEFICIARIO");
            agregarInteresAdicionalDelDirectorio(botonInteresAdicionalEdificios, documentos, tipodocumentos);
            ingresarBeneficiarioOneroso(tipobeneficiarios, listaTipoOnerosoEdificios);

        }
    }

    public void agregarInteresAdicionalCambioPoliza(ExamplesTable agregaroneroso) {
        for (Map<String, String> agregarinteresadosadicionalesuno : agregaroneroso.getRows()) {
            String agretipodocumentos = agregarinteresadosadicionalesuno.get("TIPO_DE_DOCUMENTO");
            String agredocumentos = agregarinteresadosadicionalesuno.get("DOCUMENTO");
            String agretipobeneficiarios = agregarinteresadosadicionalesuno.get("TIPOBENEFICIARIO");
            agregarInteresAdicionalDelDirectorio(botonInteresAdicionalEdificios, agredocumentos, agretipodocumentos);
            ingresarBeneficiarioOneroso(agretipobeneficiarios, agregarTipoOnerosoEdificios);
        }
    }

    public void ingresarBeneficiarioOneroso(String tipoBeneficiario, WebElementFacade elemento) {
        Actions act = new Actions(getDriver());
        waitFor(TIEMPO_2).second();
        desplegarElementoDeLista(elemento);
        nuevaPolizaPage.seleccionarElementoDeLaLista(tipoBeneficiario);
        act.sendKeys(Keys.TAB).build().perform();

    }

    public void ingresarValorComercialAsegurado(String valorcomercial) {
        ingresarDato(campoAseguradoValorComercial, valorcomercial);
    }

    public void desseleccionarArticulo() {
        chekInteresAdicionaledificios.waitUntilPresent().click();
    }

    public void seleccionarCheckAseguradoValorComercial() {
        chekAseguradoValorComercial.waitUntilPresent().waitUntilVisible();
        clickearElemento(chekAseguradoValorComercial);
    }

    public void retirarBeneficiarioOnerosoAlArticulo() {
        chekTipoOnerosoEdificios.waitUntilPresent();
        clickearElemento(chekTipoOnerosoEdificios);
        botonQuitar.waitUntilPresent();
        clickearElemento(botonQuitar);
    }

    public void validarNoVisibilidad() {
        validarNoVisibilidadDeObjeto(XPATH_CHECK_CONTACTO);
    }

    public void validarNoVisibilidadDeObjeto(String xpath) {
        setImplicitTimeout(TIEMPO_1, TimeUnit.SECONDS);
        MatcherAssert.assertThat("Alguno de los campos es visible", !findBy(xpath).isVisible());
        resetImplicitTimeout();
    }

    public void seleccionarElTipoDeMercanciaFlotante(String tipoMercancia) {
        listaTipoDeMercancia.waitUntilPresent();
        seleccionarItem(listaTipoDeMercancia, tipoMercancia);
    }

    public void verificarMesnComercialA() {
        waitFor(TIEMPO_2).second();
        String valor = txtValorAsegurado.getValue().replaceAll("\\.", "");
        MatcherAssert.assertThat("El valor comercial no es igual al valor de daños materiales", campoAseguradoValorComercial.getValue().equals(valor));
    }

    public void validarMensajeSoloUnRiesgoEnRenovacion() {
        validaMensajeDeSoloUnRiesgo(chekEliminarPrimeraUbicacionRenovacion);
    }

    public void validarMensajeSoloUnRiesgoEnCambio() {
        validaMensajeDeSoloUnRiesgo(chekEliminarPrimeraUbicacion);
    }

    public void validaMensajeDeSoloUnRiesgo(WebElementFacade elemento) {
        MatcherAssert.assertThat("No aparecio mensaje de validacion en ingresar riesgo", lblMensajeValidaRiesgosRepetidos.getText().contains(VALIDACION_MENSAJE_RIESGOS));
        elemento.click();
        botonRemoverRiesgo.click();
    }
}
