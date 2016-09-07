package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CuentasOrdenesDeTrabajoSteps;
import com.sura.policycenter.selenium.steps.InformacionPolizaPASteps;
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


public class InformacionPolizaPADefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private CuentasOrdenesDeTrabajoSteps cuentasOrdenesTrabajoSteps;

    @Steps
    private InformacionPolizaPASteps informacionPolizaPASteps;

    private final Map<String, String> infoPoliza = new HashMap<>();

    public InformacionPolizaPADefinitions() {
        infoPoliza.put("labelAseguradoPrimario", "Tomador");
        infoPoliza.put("tipoDocumento", "Tipo documento");
        infoPoliza.put("numeroDocumento", "Número documento");
        infoPoliza.put("nombre", "Nombre");
        infoPoliza.put("telefono", "Teléfono");
        infoPoliza.put("direccionPoliza", "Dirección de la póliza");
        infoPoliza.put("tipoDireccion", "Tipo de dirección");
        infoPoliza.put("descripcionDireccion", "Descripción de la dirección");
        infoPoliza.put("labelDetallesPoliza", "Detalles de la póliza");
        infoPoliza.put("organizacion", "Organización");
        infoPoliza.put("canal", "Canal");
        infoPoliza.put("tipoPoliza", "Tipo de póliza");
        infoPoliza.put("tipoPlazo", "Tipo de plazo");
        infoPoliza.put("fechaVigencia", "Fecha inicio de vigencia");
        infoPoliza.put("fechaExpiracion", "Fecha fin de vigencia");
        infoPoliza.put("fechaEscrita", "Fecha de expedición");
        infoPoliza.put("polizaFinanciada", "¿Desea financiar la póliza?");
        infoPoliza.put("numeroCuotas", "Número de cuotas");
        infoPoliza.put("labelAgenteRegistro", "Agente de registro");
        infoPoliza.put("organizacionAgente", "Oficina de radicación");
        infoPoliza.put("codigoAgente", "Código de agente");
        infoPoliza.put("modificadorPoliza", "Modificador póliza");
        infoPoliza.put("descuentoPoliza", "Descuento póliza");
    }

    @Given("ya se inicio una nueva suscripcion <numeroCuenta>")
    public void iniciarSuscripcion(@Named("numeroCuenta") String numeroCuenta) {
        cuentasOrdenesTrabajoSteps.seleccionarCuenta(numeroCuenta);
    }

    @Given("se visualiza la informacion de la poliza")
    public void verInformacionPoliza() {
        informacionPolizaPASteps.accionarNuevaCotizacion();
        informacionPolizaPASteps.seleccionarAgenteCotizacion();
    }

    @When("seleccione el producto para expedir la poliza")
    public void elegirElProductoParaLaPoliza() {
        informacionPolizaPASteps.seleccionarProducto();
        informacionPolizaPASteps.accionarInformacionPoliza();
    }

    @Given("ya se inicio una nueva suscripcion")
    @Manual
    public void iniciarSuscripcion() {
        //Se ejecuta manualmente
    }

    @Given("se puede visualizar la informacion de la poliza")
    @Manual
    public void visualizarSuscripcion() {
        //Se ejecuta manualmente
    }

    @When("estoy expidiendo una poliza de autos")
    public void accionarExpedirPolizaAuto() {
        informacionPolizaPASteps.accionarNuevaCotizacion();
        informacionPolizaPASteps.seleccionarAgenteCotizacion();
    }

    @When("modifique la fecha de inicio de vigencia <tipoPlazo> <fechaInicioVigencia>")
    public void modificarFechaVigencia(@Named("tipoPlazo") String tipoPlazo,
                                       @Named("fechaInicioVigencia") String fechaInicioVigencia) {
        informacionPolizaPASteps.modificarFechaVigencia(tipoPlazo, fechaInicioVigencia);
    }

    @When("adicione un segundo tomador <tipoDocumento>, <primerNombre>, <primerApellido>")
    public void adicionarSegundoTomador(@Named("tipoDocumento") String tipoDocumento,
                                        @Named("primerNombre") String primerNombre,
                                        @Named("primerApellido") String primerApellido) {
        informacionPolizaPASteps.adicionarSegundoTomador(tipoDocumento, primerNombre, primerApellido);
    }

    @When("seleccione, digite o busque la oficina de radicacion <oficinaRadicacion>")
    @Manual
    public void seleccionarOficinaRadicacion() {
        // Se realiza manualmente.
    }

    @When("ingrese un porcentaje <porcentaje> de poliza superior al 50.00")
    public void ingresarPorcentajeDescuentoPoliza(@Named("porcentaje") String porcentaje) {
        informacionPolizaPASteps.ingresarPorcentajeDescuentoPoliza(porcentaje);
    }

    @When("ingrese un porcentaje <porcentaje> de poliza con mas de dos enteros y dos decimales")
    public void ingresarDecimalesPorcentaje(@Named("porcentaje") String porcentaje) {
        informacionPolizaPASteps.ingresarPorcentajeDescuentoPoliza(porcentaje);
    }

    @When("indique que deseo financiar la poliza")
    public void definirPolizaFinanciada() {
        informacionPolizaPASteps.definirPolizaFinanciada();
    }

    @When("modifique la fecha de inicio de vigencia <organizacionDetalle> <canalDetalle> <tipoPoliza> <tipoPlazo> <fechaInicioVigencia>")
    public void modificarfechaInicioVigencia(@Named("organizacionDetalle") String organizacionDetalle,
                                             @Named("canalDetalle") String canalDetalle,
                                             @Named("tipoPoliza") String tipoPoliza,
                                             @Named("tipoPlazo") String tipoPlazo,
                                             @Named("fechaInicioVigencia") String fechaInicioVigencia) {
        informacionPolizaPASteps.modificarFechaInicioVigencia(organizacionDetalle, canalDetalle, tipoPoliza, tipoPlazo, fechaInicioVigencia);
    }

    @When("pase a la siguiente opcion")
    public void pasarASiguienteOpcion() {
        informacionPolizaPASteps.pasar_A_Siguiente_Opcion();
    }

    @When("se identifique el tipo <tipoDocumento> y numero de documento <numeroDocumento> del tomador como PEPS")
    public void identificarTipoYNumeroIdentificacion(@Named("tipoDocumento") String tipoDocumento,
                                                     @Named("numeroDocumento") String numeroDocumento) {
        informacionPolizaPASteps.identificar_Tipo_Y_Numero_De_Identificacion(tipoDocumento, numeroDocumento);
    }

    @When("se identifique el tipo <tipoDocumento> y numero de documento <numeroDocumento> del tomador como Riesgo Consultable")
    public void identificarRCC(@Named("tipoDocumento") String tipoDocumento,
                               @Named("numeroDocumento") String numeroDocumento) {
        informacionPolizaPASteps.identificar_Tipo_Y_Numero_De_Identificacion(tipoDocumento, numeroDocumento);
    }

    @When("no indique que deseo financiar la poliza")
    public void noIndicarPolizaFinanciada() {
        informacionPolizaPASteps.no_Indicar_Poliza_Financiada();
    }

    @When("indique el numero de cuotas")
    public void indicarNumeroCuotas(){
        informacionPolizaPASteps.ingresarNumeroCuotas();
    }

    @Then("se debe visalizar los datos del tomador, como son: tipo y numero de identificacion, nombre completo,\n" +
            "telefono, direccion, vigencia de la poliza (valor por defecto), nombre del agente, fecha de suscripcion y\n" +
            "nombre de la compania aseguradora")
    public void visualizarInformacionPoliza() {
        informacionPolizaPASteps.visualizarInformacionPoliza(infoPoliza);
    }

    @When("seleccione la opcion siguiente")
    public void seleccionarOpcionSiguiente(){
        informacionPolizaPASteps.seleccionar_Opcion_Siguiente();
    }

    @Then("esta <fechaInicioVigencia> debe calcular de forma automatica la fecha de fin de vigencia, la cual depende del tipo de plazo")
    public void calcularFechaFinVigencia(@Named("fechaInicioVigencia") String fechaInicioVigencia) {
        informacionPolizaPASteps.calcularFechaFinVigencia(fechaInicioVigencia);
    }

    @Then("debe quedar registrado en la informacion de la poliza")
    public void validarRegistroSegundoTomador() {
        Map<String, String> datosSegundoTomador = new HashMap<>();
        datosSegundoTomador.put("tipoDocumento", "Tipo documento");
        datosSegundoTomador.put("numeroDocumento", "Número documento");
        datosSegundoTomador.put("telefono", "Teléfono");
        datosSegundoTomador.put("direccion", "Dirección");
        datosSegundoTomador.put("tipoDireccion", "Tipo de dirección");
        datosSegundoTomador.put("descripcionDireccion", "Descripción de la dirección");
        informacionPolizaPASteps.validarRegistroSegundoTomador(datosSegundoTomador);
    }

    @Then("debe quedar registrada la oficina seleccionada <oficinaRadicacion> en la informacion de la poliza")
    @Manual
    public void validarSeleccionOficinaRadicacion() {
        // Se realiza manualmente.
    }

    @Then("debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder el 50")
    public void validarMensajePorcentajePoliza(@Named("mensaje") String mensaje) {
        informacionPolizaPASteps.validarMensajePorcentajePoliza(mensaje);
    }

    @Then("debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder la longitud de dos digitos a\n" +
            "izquierda o derecha")
    public void validarDecimalesPorcentaje(@Named("mensaje") String mensaje) {
        informacionPolizaPASteps.validarDecimalesPorcentaje(mensaje);
    }

    @Then("se debe habilitar la opcion de numero de cuotas")
    public void ingresarNumeroCuotas() {
        informacionPolizaPASteps.ingresarNumeroCuotas();
    }

    @Then("se debe cumplir con la retroactividad permitida <mensaje>")
    public void validarRetroactividadPoliza(@Named("mensaje") String mensaje) {
        informacionPolizaPASteps.validarRetroactividadPoliza(mensaje);
    }

    @Then("se debe mostrar el mensaje <mensaje> que se obtenga de Riesgos PEPS como warning")
    public void validarMensajeBloqueoPEP(@Named("mensaje") String mensaje) {
        informacionPolizaPASteps.validar_Mensaje_Bloqueo_PEP(mensaje);
    }

    @Then("se debe mostrar el mensaje <mensaje> que se obtenga de Riesgos Consultables como warning")
    public void validarMensajeBloqueoRCC(@Named("mensaje") String mensaje) {
        informacionPolizaPASteps.validar_Mensaje_Bloqueo_PEP(mensaje);
    }

    @Then("se debe permitir continuar la cotizacion")
    public void permitirContinuarCotizacion() {
        informacionPolizaPASteps.permitir_Continuar_Cotizacion();
    }

    @Then("no se debe habilitar la opcion de numero de cuotas")
    public void noHabilitarNumeroCuotas(){
        informacionPolizaPASteps.no_Habilitar_Numero_De_Cuotas();
    }

    @Then("se debe mostrar un mensaje <mensaje> de advertencia")
    public void mostrarMensajeFinanciacion(@Named("mensaje") String mensaje){
        informacionPolizaPASteps.mostrar_Mensaje_Advertencia_Financiacion(mensaje);
    }
}
