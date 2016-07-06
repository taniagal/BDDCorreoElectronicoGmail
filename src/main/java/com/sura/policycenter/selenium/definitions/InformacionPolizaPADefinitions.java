package com.sura.policycenter.selenium.definitions;

import com.sura.policycenter.selenium.steps.CuentasOrdenesDeTrabajoSteps;
import com.sura.policycenter.selenium.steps.DisponibilidadDetalleProductoSteps;
import com.sura.policycenter.selenium.steps.InformacionPolizaPASteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.HashMap;
import java.util.Map;

public class InformacionPolizaPADefinitions {

    @Steps
    private CuentasOrdenesDeTrabajoSteps cuentasOrdenesTrabajoSteps;

    @Steps
    private DisponibilidadDetalleProductoSteps disponibilidadDetalleProductoSteps;

    @Steps
    private InformacionPolizaPASteps informacionPolizaPASteps;

    private Map<String, String> infoPoliza = new HashMap<>();

    public InformacionPolizaPADefinitions(){
        infoPoliza.put("labelAseguradoPrimario", "Tomador");
        infoPoliza.put("tipoDocumento", "Tipo documento");
        infoPoliza.put("numeroDocumento", "Número documento");
        infoPoliza.put("nombre", "Nombre");
        infoPoliza.put("telefono", "Teléfono");
        infoPoliza.put("direccionPoliza", "Dirección de la póliza");
        infoPoliza.put("tipoDireccion", "Tipo de dirección");
        infoPoliza.put("descripcionDireccion", "Descripción de dirección");
        infoPoliza.put("labelDetallesPoliza", "Detalles de la póliza");
        infoPoliza.put("organizacion", "Organización");
        infoPoliza.put("canal", "Canal");
        infoPoliza.put("tipoPoliza", "Tipo de póliza");
        infoPoliza.put("tipoPlazo", "Tipo de plazo");
        infoPoliza.put("fechaVigencia", "Fecha de vigencia");
        infoPoliza.put("fechaExpiracion", "Fecha de expiración");
        infoPoliza.put("fechaEscrita", "Fecha escrita");
        infoPoliza.put("polizaFinanciada", "¿Póliza financiada?");
        infoPoliza.put("numeroCuotas", "Número de cuotas");
        infoPoliza.put("labelAgenteRegistro", "Agente de registro");
        infoPoliza.put("organizacionAgente", "Oficina de radicación");
        infoPoliza.put("codigoAgente", "Código de agente");
        infoPoliza.put("modificadorPoliza", "Modificador póliza");
        infoPoliza.put("descuentoPoliza", "Descuento Póliza"); //Descuento póliza
    }

    @Given("ya se inicio una nueva suscripcion <numeroCuenta>")
    public void iniciarSuscripcion(@Named("numeroCuenta") String numeroCuenta){
        cuentasOrdenesTrabajoSteps.seleccionarCuenta(numeroCuenta);
    }

    @Given("se visualiza la informacion de la poliza")
    public void verInformacionPoliza(){
        informacionPolizaPASteps.accionarNuevaCotizacion();
        informacionPolizaPASteps.seleccionarAgenteCotizacion();
        informacionPolizaPASteps.accionarInformacionPoliza();
    }

    @When("estoy expidiendo una poliza de autos")
    public void accionarExpedirPolizaAuto(){
        informacionPolizaPASteps.accionarNuevaCotizacion();
        informacionPolizaPASteps.seleccionarAgenteCotizacion();
        informacionPolizaPASteps.accionarInformacionPoliza();
    }

    @When("modifique la fecha de inicio de vigencia <tipoPlazo> <fechaInicioVigencia>")
    public void modificarFechaVigencia(@Named("tipoPlazo") String tipoPlazo,
                                       @Named("fechaInicioVigencia") String fechaInicioVigencia){
        informacionPolizaPASteps.modificarFechaVigencia(tipoPlazo, fechaInicioVigencia);
    }

    @When("adicione un segundo tomador <tipoDocumento>, <primerNombre>, <primerApellido>")
    public void adicionarSegundoTomador(@Named("tipoDocumento") String tipoDocumento,
                                        @Named("primerNombre") String primerNombre,
                                        @Named("primerApellido") String primerApellido){
        informacionPolizaPASteps.adicionarSegundoTomador(tipoDocumento, primerNombre, primerApellido);
    }

    @When("seleccione, digite o busque la oficina de radicacion <oficinaRadicacion>")
    @Manual
    public void seleccionarOficinaRadicacion(){
        // Se realiza manualmente.
    }

    @When("ingrese un porcentaje <porcentaje> de poliza superior al 50.00")
    public void ingresarPorcentajeDescuentoPoliza(@Named("porcentaje") String porcentaje){
        informacionPolizaPASteps.ingresarPorcentajeDescuentoPoliza(porcentaje);
    }

    @When("ingrese un porcentaje <porcentaje> de poliza con mas de dos enteros y dos decimales")
    public void ingresarDecimalesPorcentaje(@Named("porcentaje") String porcentaje){
        informacionPolizaPASteps.ingresarPorcentajeDescuentoPoliza(porcentaje);
    }

    @When("defina una poliza como financiada")
    public void definirPolizaFinanciada(){
        informacionPolizaPASteps.definirPolizaFinanciada();
    }

    @Then("se debe visalizar los datos del tomador, como son: tipo y numero de identificacion, nombre completo,\n" +
            "telefono, direccion, vigencia de la poliza (valor por defecto), nombre del agente, fecha de suscripcion y\n" +
            "nombre de la compania aseguradora")
    public void visualizarInformacionPoliza(){
        informacionPolizaPASteps.visualizarInformacionPoliza(infoPoliza);
    }

    @Then("esta <fechaInicioVigencia> debe calcular de forma automatica la fecha de fin de vigencia, la cual depende del tipo de plazo")
    public void calcularFechaFinVigencia(@Named("fechaInicioVigencia") String fechaInicioVigencia){
        informacionPolizaPASteps.calcularFechaFinVigencia(fechaInicioVigencia);
    }

    @Then("debe quedar registrado en la informacion de la poliza")
    public void validarRegistroSegundoTomador(){
        Map <String, String> datosSegundoTomador = new HashMap<>();
        datosSegundoTomador.put("tipoDocumento", "Tipo documento");
        datosSegundoTomador.put("numeroDocumento", "Número documento");
        datosSegundoTomador.put("telefono", "Teléfono");
        datosSegundoTomador.put("direccion", "Dirección");
        datosSegundoTomador.put("tipoDireccion", "Tipo de dirección");
        datosSegundoTomador.put("descripcionDireccion", "Descripción de dirección");
        informacionPolizaPASteps.validarRegistroSegundoTomador(datosSegundoTomador);
    }

    @Then("debe quedar registrada la oficina seleccionada <oficinaRadicacion> en la informacion de la poliza")
    @Manual
    public void validarSeleccionOficinaRadicacion(){
        // Se realiza manualmente.
    }

    @Then("debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder el 50")
    public void validarMensajePorcentajePoliza(@Named("mensaje") String mensaje){
        informacionPolizaPASteps.validarMensajePorcentajePoliza(mensaje);
    }

    @Then("debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder la longitud de dos digitos a\n" +
            "izquierda o derecha")
    public void validarDecimalesPorcentaje(@Named("mensaje") String mensaje){
        informacionPolizaPASteps.validarDecimalesPorcentaje(mensaje);
    }

    @Then("se debe poder ingresar el numero de cuotas")
    public void ingresarNumeroCuotas(){
        informacionPolizaPASteps.ingresarNumeroCuotas();
    }

    @Then("se debe cumplir con la retroactividad permitida <fechaInicioVigencia> <mensaje>")
    @Manual
    public void validarRetroactividadPoliza(){
        //Se ejecuta manualmente
    }
}
