package com.sura.guidewire.policycenter.definitions.poliza;


import com.sura.guidewire.policycenter.steps.poliza.DetallesDeUbicacionSteps;
import com.sura.guidewire.policycenter.steps.commons.NuevaCotizacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;


public class DetallesDeUbicacionDefinitions {
    @Steps
    private DetallesDeUbicacionSteps detallesDeUbicacionSteps;

    @Steps
    private NuevaCotizacionSteps nuevaCotizacionSteps;

    @When("agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>, medioVenta <medioVenta>")
    public void agregarUbicacion(@Named("direccion")String direccion, @Named("departamento")String departamento, @Named("ciudad")String ciudad, @Named("medioVenta") String medioVenta){
        detallesDeUbicacionSteps.validarCamposNuevos();
        detallesDeUbicacionSteps.agregarDireccion(direccion, departamento, ciudad);
        detallesDeUbicacionSteps.agregarMedioDeVenta(medioVenta);
    }

    @When("descripcion <descripcion>, actividad economica <actividad>")
    public void agregarUbicacion(@Named("actividad")String actividad, @Named("descripcion")String descripcion){
        detallesDeUbicacionSteps.agregarUbicacion(descripcion, actividad);
    }

    @When("agregue una nueva ubicacion: $datos")
    public void agregaNuevaUbicacion(ExamplesTable datos){
        Map<String, String> dato = datos.getRow(0);
        detallesDeUbicacionSteps.validarCamposNuevos();
        detallesDeUbicacionSteps.agregarMedioDeVenta(dato.get("medioVenta"));
        detallesDeUbicacionSteps.agregarDireccion(dato.get("direccion"), dato.get("departamento"), dato.get("ciudad"));
        detallesDeUbicacionSteps.agregarUbicacion(dato.get("descripcion"), dato.get("actividad"));

    }

    @Then("espero ver en la lista de ubicaciones de la pantalla de edificios y ubicaciones la nueva ubicaciOn ingresada")
    public void verificarUbicacion(){
        detallesDeUbicacionSteps.validarIngresoUbicacion();
    }

    @Then("que se muestre el mensaje <mensaje>")
    public void verificarMensaje(@Named("mensaje")String mensaje){
         detallesDeUbicacionSteps.verificarMensaje(mensaje);
    }

    @When("seleccione el producto <producto> para expedir la poliza")
    public void elegirProducto(@Named("producto") String producto){
        nuevaCotizacionSteps.seleccionDeProducto(producto);
    }
}
