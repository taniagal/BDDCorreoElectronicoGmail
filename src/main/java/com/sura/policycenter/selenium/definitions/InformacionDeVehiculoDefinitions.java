package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.InformacionDePolizaMrcSteps;
import com.sura.policycenter.selenium.steps.InformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class InformacionDeVehiculoDefinitions {

    @Steps
    InformacionDeVehiculoSteps informacionDeVehiculoSteps;

    @Steps
    InformacionDePolizaMrcSteps informacionDePolizaMrcSteps;

    @When("ingrese una nueva cotizacion para vehiculo <nomProducto>")
    public void whenQuieraRegistrarLaInformacionDelVehiculo(@Named("nomProducto")String nomProducto) {
        informacionDePolizaMrcSteps.selecciona_cotizacion_para_producto(nomProducto);
    }

    @When("vaya a registrar los datos del vehiculo")
    public void whenvayaARegistrarLosDatosDelVehiculo(){
        informacionDeVehiculoSteps.ingresar_a_cotizacion_de_vehiculo();
    }

    @When("ingrese el beneficiario o conductor en los intereses adicionales")
    public void whenvayaARegistrarLosDatosDelBeneficiario(){
        informacionDeVehiculoSteps.ingresar_intereses_adicionales_o_conductor();
    }

    @Then("el sistema debe permitir pasar a la siguinete pagina")
    public void thenElSistemaDebeMostrarLosDatosCorrespondienteAlVehiculo() {
        informacionDeVehiculoSteps.pasar_a_pagina_siguiente();
    }

    @Then("Then el sistema NO debe permitir pasar a la siguinete pagina")
    public void thenElSistemaNoDebepasar() {
        informacionDeVehiculoSteps.validar_campos_informacion_vehiculo();
    }

    @When("ingrese los valores de accesorios y <valorAccesorio> <valorAccesorioEsp> valor de bonificacion tecnica <boniTecnica> y comercial <boniComercial>")
    public void valoresEspecialesAccesorios(@Named("valorAccesorio")String valorAccesorio,
                                            @Named("valorAccesorioEsp")String valorAccesorioEsp,
                                            @Named("boniTecnica")String valorBoniTecnica,
                                            @Named("boniComercial")String valorBoniComercial) {
        informacionDeVehiculoSteps.ingresar_valores_accesorios(valorAccesorio, valorAccesorioEsp);
        informacionDeVehiculoSteps.ingresar_valores_de_bonificacion(valorBoniTecnica , valorBoniComercial);

    }

    @Then("el sistema debe totalizar el valor asegurado y mostrar un mensaje de error <mensaje>")
    public void thenElSistemaDebeTotalizarElValorAsegurado(@Named("mensaje")String mensaje){
        informacionDeVehiculoSteps.validar_poliza_total();
        informacionDeVehiculoSteps.validar_campos_informacion_vehiculo(mensaje);
    }

    @Then("se deben visualizar todos los campos de informacion")

    public void thenSeDebenVisualizarTodosLosCamposDeInformacion() {
        // PENDING
    }

    @SuppressWarnings("EmptyMethod")
    @Given("se inicioQ una nueva suscripcion <numeroCuenta>")
    @Manual
    public void givenSeInicioQUnaNuevaSuscripcionnumeroCuenta() {
        // PENDING
    }

    @SuppressWarnings("EmptyMethod")
    @When("ingrese Quna nueva cotizacion para vehiculo <nomProducto>")
    @Manual
    public void whenIngreseQunaNuevaCotizacionParaVehiculonomProducto() {
        // PENDING
    }

    @SuppressWarnings("EmptyMethod")
    @When("vaya a registrar Qlos datos del vehiculo")
    @Manual
    public void whenVayaARegistrarQlosDatosDelVehiculo() {
        // PENDING
    }


}
