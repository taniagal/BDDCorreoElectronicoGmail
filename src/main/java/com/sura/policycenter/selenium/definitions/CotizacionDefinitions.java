package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CotizacionSteps;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

public class CotizacionDefinitions {

    // TODO: 09/06/2016 Pendiente definir composici'on de Gherkin 
    
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @Managed
    WebDriver driver;

    @Steps
    CotizacionSteps cotizador;

    /**
     * GIVENs
     */
    @Given("deseo crear nueva cotizacion buscando por numero de cuenta")
    public void crearNuevaCotizacion(){
        cotizador.waitFor(2).second();
        cotizador.ir_al_menu_escritorio_del_panel_superior();
        cotizador.waitFor(1).second();
        cotizador.clic_en_la_opcion_acciones_del_panel_izquierdo();
        Serenity.takeScreenshot();
        cotizador.clic_en_la_opcion_nueva_cotizacion();
        assertThat(cotizador.getCotizacionPage().obtenerTextoTituloPaginaWEF("Nueva cotización"), is(equalTo("Nueva cotización")));

        LOGGER.info("CotizacionDefinitions.crearNuevaCotizacion");
    }

    @Given("ya existe una $objeto en estado $cotizado del cliente con numero de cuenta $numCuenta para el producto $producto")
    @Alias("existe una $objeto en $estado para el cliente con numero de cuenta $cuenta")
    public void existeCotizacionCotizadaEnProductoMultiriesgoCorporativo(){
        LOGGER.info("CotizacionDefinitions.existeCotizacionCotizadaEnProductoMultiriesgoCorporativo");
    }

    /**
     * WHENs
     */
    @When("digite el numero de cuenta $numeroCuenta de una persona juridica y digite la tecla $teclaAccion para activar la busqueda")
    @Alias("digite el numero de cuenta $numeroCuenta de una persona natural y digite la tecla $teclaAccion para activar la busqueda")
    public void buscarCuentaPorNumeroDeCuenta(String numeroCuenta){
        cotizador.digitar_numero_de_cuenta(numeroCuenta);
        cotizador.digitar_la_tecla();

        LOGGER.info("CotizacionDefinitions.buscarCuentaPorNumeroDeCuenta");
    }
    @When("se ingrese la primera letra del nombre del agente $nombre")
    @Alias("se ingrese una palabra completa $nombre")
    public void ingresarCaracteresEnNombreAgente(String nombre){
        cotizador.getCotizacionPage().setNombreAgente(nombre);
        LOGGER.info("CotizacionDefinitions.ingresarCaracteresEnNombreAgente");
    }

    @When("he seleccionado en el nombre del agente $nombre")
    public void seleccionoNombreDeAgente(String nombre){
        cotizador.getCotizacionPage().seleccionarAgente(nombre);
        LOGGER.info("CotizacionDefinitions.seleccionoNombreDeAgente");
    }

    @When("se muestre la fecha de efecto de la cotizacion")
    public void esVisibleFechaDefecto(){
        cotizador.getCotizacionPage().obtenerFechaCotizacionElemento().shouldBeCurrentlyVisible();

        LOGGER.info("CotizacionDefinitions.esVisibleFechaDefecto");
    }

    /**
     * THENs
     */
    @Then("espero ver el nombre de la persona jurídica $nombre de la cuenta existente junto con la etiqueta $tipoPersona")
    @Alias("espero ver el nombre de la persona natural $nombre de la cuenta existente junto con la etiqueta $tipoPersona")
    public void validarEtiquetaNombreYNombre(String nombre, String tipoPersona) throws InterruptedException {
        assertEquals(nombre, cotizador.obtenerTextoLinkNombrePersonaWEF(nombre));
        assertEquals(tipoPersona, cotizador.obtenerTextoLabelNombrePersonaWEF());

        LOGGER.info("CotizacionDefinitions.validarEtiquetaNombreYNombre");
    }

    @Then("se debera activar la lista de los nombres de los agentes que empiecen por dicha letra")
    @Alias("se debera activar la lista de los nombres de los agentes que empiecen por dicha palabra ingresada")
    public void validarSiSeActivaListaDeNombres(){

        assertThat(cotizador.tamanioListaAgentesPorFiltro(cotizador.getNombreAgente()), greaterThan(0));
        LOGGER.info("CotizacionDefinitions.validarSiSeActivaListaDeNombres");
    }

    @Then("validar que se autocompleta el campo nombre y solo aparece el nombre del agente en este campo y el codigo respectivo en el campo codigo de agente")
    public void validarAutocompletarDelCampoNombreDeAgente(){
        cotizador.validarAutocompletarNombreAgente();
        LOGGER.info("CotizacionDefinitions.validarAutocompletarDelCampoNombreDeAgente");
    }

    // TODO: 15/06/2016 Entra o no?
    @Then("validar que al autocompletar se muestren las opciones nombre y código respectivamente")
    @Pending
    public void validarAutocompletarSeMuestreNombreYCodigoRespectivamente(){
        cotizador.validarAutocompletarSeMuestreNombreYCodigoRespectivamente();
        LOGGER.info("CotizacionDefinitions.validarAutocompletarSeMuestreNombreYCodigoRespectivamente");
    }

    @Then("se mostraran en orden alfabetico los: $productos")
    public void validarOrdenDeLosProductos(){
        cotizador.validarLosProductosOrdenadosAlfabeticamente();
        LOGGER.info("CotizacionDefinitions.validarExistenciaYOrdenDeLosProductos");
    }

    @Then("seleccionar nombre de producto $producto")
    public void seleccionarNombreDeProducto(String productos){
        cotizador.seleccionar_el_boton_elegir(productos);
        LOGGER.info("CotizacionDefinitions.seleccionarNombreDeProducto");
    }

    @Then("debera observar un mensaje emergente de informacion: $mensaje")
    public void deberaObservarUnMensajeEmergenteDeInformacion(String mensaje){
        assertThat(mensaje.replace("\r","").replace("\n"," "), is(equalTo(cotizador.obtenerMensajeEmergenteDeInformacion())));
        LOGGER.info("CotizacionDefinitions.deberaObservarUnMensajeEmergenteDeInformacion");
    }
    @Then("debera observar un mensaje de error: $mensaje")
    @Alias("debera observar un mensaje de información: $mensaje")
    public void deberaObservarUnMensaje(String mensaje){
        assertThat(cotizador.validarOcurrenciaDeMensajeDeAplicacion(mensaje.replace("\n","").replace("\r", " ")), is(true));
        LOGGER.info("CotizacionDefinitions.deberaObservarUnMensajeDeError");
    }
    @Then("debera observar los botones: $btns")
    public void deberaObservarLosBotones(String btns){
        String[] arrayBtns = btns.split(",");
        assertThat(cotizador.validarExistenciaDeLosBotonesVisibles(arrayBtns), is(true));
        LOGGER.info("CotizacionDefinitions.deberaObservarLosBotones");
    }

    // TODO: 15/06/2016 Entra en otras HUs
    @Then("al seleccionar el botón $boton deberá ver la página $pagina")
    public void seleccionarBtnYValidarPaginaMostrada(String boton, String pagina){
        cotizador.seleccionarBtn(boton);
        assertThat(cotizador.obtenerTextoTituloPaginaWEF(pagina), is(equalTo(pagina)));
        LOGGER.info("CotizacionDefinitions.seleccionarBtnYValidarPaginaMostrada");
    }

    @Then("se mostrara por defecto la fecha de hoy en la que se esta cotizando y no podra ser editable")
    public void validarFechaSeaFechaHOYYSeaNoEditable(){

        assertThat(cotizador.esFechaCotizacionHOY(), is(true));
        assertThat(cotizador.esFechaEditable(), is(false));

        LOGGER.info("CotizacionDefinitions.validarFechaSeaFechaHOYYSeaNoEditable");
    }

    /**
     * POST HU
     */
    @AfterStory
    public void finalizarHistoria(){
        Serenity.done();
        LOGGER.info("CotizacionDefinitions.finalizarHistoria");
    }



}