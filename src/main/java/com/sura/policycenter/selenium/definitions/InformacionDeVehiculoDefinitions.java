package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.InformacionDePolizaMrcSteps;
import com.sura.policycenter.selenium.steps.InformacionDeVehiculoSteps;
import net.thucydides.core.annotations.Steps;
import org.bytedeco.javacpp.annotation.Name;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import javax.swing.*;

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

    @When("ingrese los valores de accesorios <valorAccesorio> <valorAccesorioEsp>")
    public void valoresEspecialesAccesorios(@Named("valorAccesorio")String valorAccesorio,
                                  @Named("valorAccesorioEsp")String valorAccesorioEsp) {
        informacionDeVehiculoSteps.ingresar_valores_accesorios(valorAccesorio, valorAccesorioEsp);
    }

    @When("valor de bonificacion tecnica <valorBoniTecnica> y comercial <valorBoniComercial>")
    public void valorBonificacionTecnicaComercial(@Named("valorBoniTecnica")String valorBoniTecnica,
                                                  @Named("valorBoniComercial")String valorBoniComercial){



    }


    @Then("el sistema debe totalizar el valor asegurado")
    public void thenElSistemaDebeTotalizarElValorAsegurado() {
        // PENDING
    }



}
