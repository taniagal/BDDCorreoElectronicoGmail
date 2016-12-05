package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.DetallesDeUbicacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;


public class DetallesDeUbicacionDefinitions {
    @Steps
    private DetallesDeUbicacionSteps detallesDeUbicacionSteps;

    @When("agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>")
    public void agregarUbicacion(@Named("direccion")String direccion, @Named("departamento")String departamento, @Named("ciudad")String ciudad){
        detallesDeUbicacionSteps.validar_campos_nuevos();
        detallesDeUbicacionSteps.agregar_direccion(direccion, departamento, ciudad);
    }

    @When("descripcion <descripcion>, actividad economica <actividad>")
    public void agregarUbicacion(@Named("actividad")String actividad, @Named("descripcion")String descripcion){
        detallesDeUbicacionSteps.agregar_ubicacion(descripcion, actividad);
    }

    @Then("espero ver en la lista de ubicaciones de la pantalla de edificios y ubicaciones la nueva ubicaciOn ingresada")
    public void verificarUbicacion(){
        detallesDeUbicacionSteps.validar_ingreso_ubicacion();
    }

    /**
     * ESCENARIO 2
     */
    @Then("que se muestre el mensaje <mensaje>")
    public void verificarMensaje(@Named("mensaje")String mensaje){
         detallesDeUbicacionSteps.verificar_mensaje(mensaje);
    }
}
