package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.CotizacionSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import com.sura.guidewire.policycenter.utils.navegacion.definitions.IngresoAPolicyCenterDefinitions;
import com.thoughtworks.selenium.SeleneseTestNgHelper;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


public class CotizacionDefinitions {

    // TODO: 09/06/2016 Pendiente definir composici'on de Gherkin 
    protected static final int CONSTANTE_5 = 5;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Managed
    WebDriver driver;


    @Steps
    IngresoAPolicyCenterDefinitions guidewire;

    @Steps
    CotizacionSteps cotizador;

    @Steps
    NuevaCotizacionSteps nuevaCotizacionSteps;

    /**
     * GIVENs
     */
    @Given("deseo crear nueva cotizacion buscando por numero de cuenta")
    public void crearNuevaCotizacion() {

        guidewire.dadoQueAccedoAPolicyCenterConRol("Asesor");
        nuevaCotizacionSteps.irANuevaCotizacion();
        MatcherAssert.assertThat(cotizador.getCotizacionPage().obtenerTextoTituloPaginaWEF("Nueva cotización"), Is.is(CoreMatchers.equalTo("Nueva cotización")));

        LOGGER.info("CotizacionDefinitions.crearNuevaCotizacion");
    }

    @Given("ya existe una $objeto en estado $cotizado del cliente con numero de cuenta $numCuenta para el producto $producto")
    @Alias("existe una $objeto en $estado para el cliente con numero de cuenta $cuenta")
    public void existeCotizacionCotizadaEnProductoMultiriesgoCorporativo() {
        LOGGER.info("CotizacionDefinitions.existeCotizacionCotizadaEnProductoMultiriesgoCorporativo");
    }

    /**
     * WHENs
     */
    @When("digite el numero de cuenta $numeroCuenta de una persona juridica y digite la tecla $teclaAccion para activar la busqueda")
    public void buscarCuentaPorNumeroDeCuenta(String numeroCuenta){
        cotizador.digitarNumeroDeCuenta(numeroCuenta);
        cotizador.digitarLaTecla();

        LOGGER.info("CotizacionDefinitions.cuandoBusqueCuentaExistenteNumero");
    }
    @When("digite el numero de cuenta $numeroCuenta de una persona natural y digite la tecla $teclaAccion para activar la busqueda")
    public void buscarCuentaPorNumeroDeCuentaPersonaNatural(String numeroCuenta){
        cotizador.digitarNumeroDeCuenta(numeroCuenta);
        cotizador.digitarLaTecla();

        LOGGER.info("CotizacionDefinitions.cuandoBusqueCuentaExistentePersonaNatural");
    }

    @When("se ingrese la primera letra del nombre del agente $nombre")
    public void ingresarCaracteresEnNombreAgente(String nombre){
        cotizador.getCotizacionPage().setNombreAgente(nombre);
        LOGGER.info("CotizacionDefinitions.ingresarCaracteresEnNombreAgente");
    }

    @When("se ingrese una palabra completa $nombre")
    public void ingresarPalabraCompleta(String nombre){
        cotizador.getCotizacionPage().setNombreAgente(nombre);
        LOGGER.info("CotizacionDefinitions.ingresarPalabraCompleta");
    }

    @When("he seleccionado en el nombre del agente $nombre")
    public void seleccionoNombreDeAgente(String nombre) {
        cotizador.getCotizacionPage().seleccionarAgente(nombre);
        LOGGER.info("CotizacionDefinitions.seleccionoNombreDeAgente");
    }

    @When("se muestre la fecha de efecto de la cotizacion")
    public void esVisibleFechaDefecto() {

        cotizador.getCotizacionPage().obtenerFechaCotizacionElemento().shouldBeCurrentlyVisible();

        LOGGER.info("CotizacionDefinitions.esVisibleFechaDefecto");
    }

    @Then("en cotizacion de poliza debe estar en estado <estadodos> las siguientes opciones $menusesperados")
    public void entoncesEnCotizacionDePolizaDebenEstarEnEstado(@Named("estadouno") String estadouno, @Named("estadodos") String estadodos, ExamplesTable menusesperados) {
        cotizador.validar_campos_cotizacion_poliza(estadouno, estadodos, menusesperados);
    }

    /**
     * THENs
     */
    @Then("espero ver el nombre de la persona jurídica $nombre de la cuenta existente junto con la etiqueta $tipoPersona")
    public void validarEtiquetaNombreYNombre(String nombre, String tipoPersona) throws InterruptedException {
        SeleneseTestNgHelper.assertEquals(nombre, cotizador.obtenerTextoLinkNombrePersonaWEF(nombre));
        SeleneseTestNgHelper.assertEquals(tipoPersona, cotizador.obtenerTextoLabelNombrePersonaWEF());

        LOGGER.info("CotizacionDefinitions.validarEtiquetaNombreYNombre");
    }
    @Then("espero ver el nombre de la persona natural $nombre de la cuenta existente junto con la etiqueta $tipoPersona")
    public void validarEtiquetaNombreYNombrePersonaNatural(String nombre, String tipoPersona) throws InterruptedException {
        SeleneseTestNgHelper.assertEquals(nombre, cotizador.obtenerTextoLinkNombrePersonaWEF(nombre));
        SeleneseTestNgHelper.assertEquals(tipoPersona, cotizador.obtenerTextoLabelNombrePersonaWEF());

        LOGGER.info("CotizacionDefinitions.validarEtiquetaNombreYNombrePersonaNatural");
    }

     @Then("se debera activar la lista de los nombres de los agentes que empiecen por dicha letra")
    public void validarSiSeActivaListaDeNombres(){

        MatcherAssert.assertThat(cotizador.tamanioListaAgentesPorFiltro(cotizador.getNombreAgente()), Matchers.greaterThan(0));
        LOGGER.info("CotizacionDefinitions.validarSiSeActivaListaDeNombres");
    }

    @Then("se debera activar la lista de los nombres de los agentes que empiecen por dicha palabra ingresada")
    public void validarSiSeActivaListaDeNombresPorPalabra(){

        MatcherAssert.assertThat(cotizador.tamanioListaAgentesPorFiltro(cotizador.getNombreAgente()), Matchers.greaterThan(0));
        LOGGER.info("CotizacionDefinitions.validarSiSeActivaListaDeNombresPorPalabra");
    }

    @Then("validar que se autocompleta el campo nombre y solo aparece el nombre del agente en este campo y el codigo respectivo en el campo codigo de agente")
    public void validarAutocompletarDelCampoNombreDeAgente() {
        cotizador.validarAutocompletarNombreAgente();
        LOGGER.info("CotizacionDefinitions.validarAutocompletarDelCampoNombreDeAgente");
    }

    // TODO: 15/06/2016 Entra o no?
    @Then("validar que al autocompletar se muestren las opciones nombre y código respectivamente")
    @Pending
    public void validarAutocompletarSeMuestreNombreYCodigoRespectivamente() {
        cotizador.validarAutocompletarSeMuestreNombreYCodigoRespectivamente();
        LOGGER.info("CotizacionDefinitions.validarAutocompletarSeMuestreNombreYCodigoRespectivamente");
    }

    @Then("se mostraran en orden alfabetico los: $productos")
    public void validarOrdenDeLosProductos() {
        cotizador.validarLosProductosOrdenadosAlfabeticamente();
        LOGGER.info("CotizacionDefinitions.validarExistenciaYOrdenDeLosProductos");
    }

    @Then("seleccionar nombre de producto $producto")
    public void seleccionarNombreDeProducto(String productos) {
        cotizador.seleccionarElBotonElegir(productos);
        LOGGER.info("CotizacionDefinitions.seleccionarNombreDeProducto");
    }

    @Then("debera observar un mensaje emergente de informacion: $mensaje")
    public void deberaObservarUnMensajeEmergenteDeInformacion(String mensaje) {
        MatcherAssert.assertThat(mensaje.replace("\r", "").replace("\n", " "), Is.is(CoreMatchers.equalTo(cotizador.obtenerMensajeEmergenteDeInformacion())));
        LOGGER.info("CotizacionDefinitions.deberaObservarUnMensajeEmergenteDeInformacion");
    }

    @Then("debera observar un mensaje de error: $mensaje")
    @Alias("debera observar un mensaje de información: $mensaje")
    public void deberaObservarUnMensaje(String mensaje) {
        MatcherAssert.assertThat(cotizador.validarOcurrenciaDeMensajeDeAplicacion(mensaje.replace("\n", "").replace("\r", " ")), Is.is(true));
        LOGGER.info("CotizacionDefinitions.deberaObservarUnMensajeDeError");
    }

    @Then("debera observar los botones: $btns")
    public void deberaObservarLosBotones(String btns) {
        String[] arrayBtns = btns.split(",");
        MatcherAssert.assertThat(cotizador.validarExistenciaDeLosBotonesVisibles(arrayBtns), Is.is(true));
        LOGGER.info("CotizacionDefinitions.deberaObservarLosBotones");
    }

    // TODO: 15/06/2016 Entra en otras HUs
    @Then("al seleccionar el botón $boton deberá ver la página $pagina")
    public void seleccionarBtnYValidarPaginaMostrada(String boton, String pagina) {
        cotizador.seleccionarBtn(boton);
        MatcherAssert.assertThat(cotizador.obtenerTextoTituloPaginaWEF(pagina), Is.is(CoreMatchers.equalTo(pagina)));
        LOGGER.info("CotizacionDefinitions.seleccionarBtnYValidarPaginaMostrada");
    }

    @Then("se mostrara por defecto la fecha de hoy en la que se esta cotizando y no podra ser editable")
    public void validarFechaSeaFechaHOYYSeaNoEditable() {

        MatcherAssert.assertThat(cotizador.esFechaCotizacionHOY(), Is.is(true));
        MatcherAssert.assertThat(cotizador.esFechaEditable(), Is.is(false));

        LOGGER.info("CotizacionDefinitions.validarFechaSeaFechaHOYYSeaNoEditable");
    }
}
