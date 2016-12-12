package com.sura.guidewire.policycenter.definitions;


import com.sura.guidewire.policycenter.steps.DetallesDeUbicacionSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class DetallesDeUbicacionDefinitions {
    @Steps
    private DetallesDeUbicacionSteps detallesDeUbicacionSteps;

    @Steps
    private NuevaCotizacionSteps nuevaCotizacionSteps;

    @When("agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>")
    public void agregarUbicacion(@Named("direccion")String direccion, @Named("departamento")String departamento, @Named("ciudad")String ciudad){
        detallesDeUbicacionSteps.validarCamposNuevos();
        detallesDeUbicacionSteps.agregarDireccion(direccion, departamento, ciudad);
    }

    @When("descripcion <descripcion>, actividad economica <actividad>")
    public void agregarUbicacion(@Named("actividad")String actividad, @Named("descripcion")String descripcion){
        detallesDeUbicacionSteps.agregarUbicacion(descripcion, actividad);
    }

    @Then("espero ver en la lista de ubicaciones de la pantalla de edificios y ubicaciones la nueva ubicaciOn ingresada")
    public void verificarUbicacion(){
        detallesDeUbicacionSteps.validarIngresoUbicacion();
    }

    /**
     * ESCENARIO 2
     */
    @Then("que se muestre el mensaje <mensaje>")
    public void verificarMensaje(@Named("mensaje")String mensaje){
         detallesDeUbicacionSteps.verificarMensaje(mensaje);
    }

    @When("seleccione el producto <producto> para expedir la poliza")
    public void elegirProducto(@Named("producto") String producto){
        nuevaCotizacionSteps.seleccionDeProducto(producto);
    }
}
