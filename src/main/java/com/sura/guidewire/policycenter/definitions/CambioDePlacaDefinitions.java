package com.sura.guidewire.policycenter.definitions;

import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.CambioDePlacaSteps;
import net.thucydides.core.annotations.Steps;
import org.eclipse.jetty.util.annotation.Name;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class CambioDePlacaDefinitions {
    @Steps
    CambioDePlacaSteps cambioDePlacaSteps;

    @When("cuando cambie la placa <placa>")
    public void cambiarPlaca(@Named("placa") String placa){
        cambioDePlacaSteps.clickCambiarPlaca();
        cambioDePlacaSteps.cambioDePlaca(placa);

    }
    @When("coloque una placa existente <placaExistente>")
    public void cambiarPlacaPorExistente(@Named("placaExistente") String placaExistente){
        cambioDePlacaSteps.cambiarPorPlacaExistente(placaExistente);

    }
    @When("vuelva a cambiar la placa")
    public void cambiarPlacaNueva(){
        cambioDePlacaSteps.clickItemCambiarPlaca();

    }

    @When("debe salir un mensaje de advertencia <mensaje>")
    public void mensajePlacaExistente(@Named("mensaje") String mensaje){
        cambioDePlacaSteps.mensajePlacaExistente(mensaje);

    }


    @When("quiera volver a cambiar la placa")
    public void cambiarPlaca(){
        cambioDePlacaSteps.cambioPlacaSegundaVez();

    }
    @When("se deben recargar los datos de la placa anterior: $datosPlaca")
    public void datosPlacaAnterior(ExamplesTable datosPlaca){
        cambioDePlacaSteps.datosDePlacaAnterior(datosPlaca);

    }
    @When("se debe cargar la placa inicial <placaInicial>")
    public void placaAnterior(@Named("placaInicial") String placaInicial ){
        cambioDePlacaSteps.placaAnterior(placaInicial);

    }
    @When("cuando ingrese una placa venezolana de cucuta <placaVenezolana> <ciudad>")
    public void placaVenezolana(@Named("placaVenezolana") String placaVenezolana, @Named("ciudad") String ciudad ){
        cambioDePlacaSteps.placaVenezolana(placaVenezolana,ciudad);

    }
    @When("expida el cambio de la poliza")
    public void expedirCambioPoliza(){
        cambioDePlacaSteps.expedirCambioPoliza();

    }





}
