package com.sura.policycenter.selenium.definitions;


import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.CoberturaGlobalSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.bytedeco.javacpp.annotation.Name;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CoberturaGlobalDefinitions {
    @Steps
    CoberturaGlobalSteps coberturaGlobalSteps;
    @Steps
    SeusLoginSteps seusLoginSteps;

    @When("agregue coberturas globales con descripcion <descripcion> , tipo de cobertura <tipoCobertura>, valor <valor> y nombreCobertura <nombreCobertura>")
    public void agregarCobertura(@Named("descripcion") String descripcion, @Named("tipoCobertura") String tipoCobertura,
                                 @Named("valor")String valor, @Named("nombreCobertura") String nombreCobertura){
        coberturaGlobalSteps.ir_a_coberturas_globales();
        coberturaGlobalSteps.agregar_coberturas_globales(descripcion, tipoCobertura, valor, nombreCobertura);
    }

    @Then("debe mostrarme las coberturas incluidas y las ubicaciones cubiertas")
    public void verificarCoberturasyUbicaciones(){
        coberturaGlobalSteps.verificar_coberturas_y_ubicaciones();
        seusLoginSteps.close();
    }

    @When("agregue coberturas globales con descripcion <descripcion> , tipo de cobertura <tipoCobertura> y nombreCobertura <nombreCobertura>")
    public void agregarCobertura(@Named("descripcion") String descripcion, @Named("tipoCobertura") String tipoCobertura,
                                 @Named("nombreCobertura") String nombreCobertura){
        coberturaGlobalSteps.ir_a_coberturas_globales();
        coberturaGlobalSteps.seleccionar_cobertura_unica(descripcion, tipoCobertura,nombreCobertura);
    }

    @Then("debe mostrarme un mensaje<mensaje> de error")
    public void verificarMensajeError(@Named("mensaje")String mensaje){
        coberturaGlobalSteps.verificar_mensaje_error(mensaje);
        seusLoginSteps.close();
    }

}
