package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.SeusLoginSteps;
import com.sura.guidewire.policycenter.steps.CotizacionesDeLaCuentaSteps;
import com.sura.guidewire.policycenter.steps.HistorialCuentaSteps;
import java.util.HashMap;
import java.util.Map;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;


public class CotizacionesDeLaCuentaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    SeusLoginSteps seusLogin;

    @Steps
    HistorialCuentaSteps historialCuentaSteps;

    @Steps
    CotizacionesDeLaCuentaSteps cotizacionesDeLaCuentaSteps;


    @Given("estoy en una cuenta <numCuenta>")
    public void givenEstoyEnUnaCuentanumCuenta(@Named("numCuenta") String numCuenta) {
        historialCuentaSteps.seleccionarCuenta(numCuenta);
    }

    @When("ingrese a cotizaciones de la cuenta")
    public void whenIgreseACotizacionesDeLaCuenta() {
        cotizacionesDeLaCuentaSteps.seleccionarCotizacionesDeLaCuenta();
    }

    @When("seleccione las acciones de una cotizacion en particular")
    public void whenSeleccioneAccionesCotizacion() {
        cotizacionesDeLaCuentaSteps.seleccionarAccionesCotizacion();
    }

    @Then("me debe permitir cambiar el estado de acuerdo a la lista definida. Lista definida: Declinar <declinar>, No Tomar <noTomar>")
    public void whenSeleccioneAccionesCotizacion(@Named("declinar") String declinar, @Named("noTomar") String noTomar) {
        cotizacionesDeLaCuentaSteps.validarEstadosCotizacion(declinar, noTomar);
    }

    @When("seleccione la opcion de crear nueva cotizacion")
    public void whenSeleccioneCrearCotizacion() {
        cotizacionesDeLaCuentaSteps.crearNuevaCotizacion();
    }

    @Then("se debe iniciar el proceso de nueva cotizacion")
    public void thenValidarProcesoNuevaCot() {
        cotizacionesDeLaCuentaSteps.validarCreacionCotizacion();
    }

    @When("muestre el listado de las acciones que se le pueden hacer a una cotizacion <declinar> <noTomar>")
    public void whenValidarEstadosCot(@Named("declinar") String declinar, @Named("noTomar") String noTomar){
        cotizacionesDeLaCuentaSteps.seleccionarAccionesCotizacion();
        cotizacionesDeLaCuentaSteps.validarEstadosCotizacion(declinar,noTomar);
    }

    @Then("no debe aparece la opcion de retirar <retirar>.")
    public void thenValidarOpcionRetirar(@Named("retirar") String retirar){
        cotizacionesDeLaCuentaSteps.validarOpcionRetirar(retirar);
    }

    @When("seleccione una o varias opciones de algun filtro <cotizaciones> <productos>")
    public void whenSeleccionarFiltrosBusqueda(@Named("cotizaciones") String cotizacion,
                                               @Named("productos") String producto){
        cotizacionesDeLaCuentaSteps.seleccionarFiltros(cotizacion, producto);
    }

    @Then("se debe mostrar la información de acuerdo a los filtros <productos>: Acciones, Producto, Cotizacion, Tipo de cotizacion,\n" +
            "Fecha inicio de vigencia, Fecha fin de vigencia, Estado, Costo total")
    public void thenMostrarInformacionCotizacion(@Named("productos") String producto){
        cotizacionesDeLaCuentaSteps.mostrarInfoCotizacion(producto);
    }

    @Then("los labels se deben mostrar tal cual como se indica en los UIFields")
    public void thenValidarLabelsCotizaciones(){
        Map<String, String> labelsCotizaciones = new HashMap<>();
        labelsCotizaciones.put("lblCotizaciones", "Cotizaciones de la cuenta");
        labelsCotizaciones.put("btnNuevaCotizacion", "Nueva cotización");
        labelsCotizaciones.put("acciones","Acciones");
        labelsCotizaciones.put("producto","Producto");
        labelsCotizaciones.put("numCotizacion","N° de cotización");
        labelsCotizaciones.put("tipoCotizacion","Tipo de cotización");
        labelsCotizaciones.put("fechaIniVigencia","Fecha inicio de vigencia");
        labelsCotizaciones.put("fechaFinVigencia","Fecha fin de vigencia");
        labelsCotizaciones.put("numPoliza","Número de póliza");
        labelsCotizaciones.put("estado","Estado");
        labelsCotizaciones.put("costoTotal","Costo total");
        labelsCotizaciones.put("cartas","Cartas");

        cotizacionesDeLaCuentaSteps.validarLabelsCotizaciones(labelsCotizaciones);
    }

    @When("se esten mostrando todos los productos <producto>")
    public void whenMostrarTodosLosProductos(@Named("producto") String producto){
        cotizacionesDeLaCuentaSteps.mostrarTodosLosProductos(producto);
    }

    @When("una cotizacion se encuentre en un estado diferente a 'Expedida' <estado>")
    public void whenEstadoDiferenteExpedida(@Named("estado") String estado){
        cotizacionesDeLaCuentaSteps.validarEstadoDiferenteExpedida(estado);
    }

    @Then("el numero de poliza debe aparecer vacio.")
    public void thenNoMostrarNumeroPoliza(){
        cotizacionesDeLaCuentaSteps.validarNumeroPoliza();
    }

    @When("una cotizacion se encuentre en un estado 'Expedida' <estado>")
    public void whenEstadoIgualExpedida(@Named("estado") String estado){
        cotizacionesDeLaCuentaSteps.validarEstadoDiferenteExpedida(estado);
    }

    @Then("se debe mostrar el numero de la poliza.")
    public void thenMostrarNumeroPoliza(){
        cotizacionesDeLaCuentaSteps.validarNumeroPoliza();
    }

    @When("una cotizacion este en estado 'Declinado' <declinado> y no se haya generado una carta de declinacion para esta cotizacion y sea cotizacion de MRC <propiedadComercial>")
    public void whenvalidarEstadoCotizacionDeclinado(@Named("propiedadComercial") String propiedadComercial, @Named("declinado") String declinado){
        cotizacionesDeLaCuentaSteps.validarEstadoCotizacionDeclinado(propiedadComercial, declinado);
    }

    @Then("me debe permitir crear una carta de declinacion por medio de un boton. El label del boton debe ser 'Crear carta de declinacion' <crearCarta>.")
    public void thenMostrarCartaDeclinacion(@Named("crearCarta") String crearCarta){
        cotizacionesDeLaCuentaSteps.mostrarBotonCrearCartaDeclinacion(crearCarta);
    }

    @When("una cotizacion sea producto Auto Personal <producto>")
    public void whenValidarEstadoAutoPersonal(@Named("producto") String producto){
        cotizacionesDeLaCuentaSteps.validarEstadoAutoPersonal(producto);
    }

    @Then("no debe aparecer la opcion de crear carta de declinacion <crearCarta>.")
    public void thenNoMostrarCartaDeclinacion(@Named("crearCarta") String crearCarta){
        cotizacionesDeLaCuentaSteps.noMostrarBotonCrearCarta(crearCarta);
    }

    @When("a una cotizacion se le haya creado carta de confirmacion o de declinacion")
    @Manual
    public void whenCrearCarta(){
        // Se realiza manualmente.
    }

    @Then("me debe permitir descargar esta carta. Esta funcionalidad queda tal cual como viene de caja.")
    @Manual
    public void thenPermitirDescargarCarta(){
        // Se realiza manualmente.
    }
}
