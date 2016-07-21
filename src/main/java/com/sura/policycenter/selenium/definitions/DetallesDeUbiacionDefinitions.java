package com.sura.policycenter.selenium.definitions;


import com.sura.policycenter.selenium.steps.DetallesDeUbicacionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class DetallesDeUbiacionDefinitions {
    @Steps
    private DetallesDeUbicacionSteps detallesDeUbicacionSteps;

    /**
     * ESCENARIO 1
     */
    @Given("estoy cotizando una poliza de MRC en cuenta <cuenta>")
    public void agregarPoliza(@Named("cuenta")String cuenta) {
        detallesDeUbicacionSteps.ir_a_nueva_poliza(cuenta);
    }

    @When("agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>")
    public void agregarUbicacion(@Named("direccion")String direccion, @Named("departamento")String departamento, @Named("ciudad")String ciudad){
        detallesDeUbicacionSteps.validar_campos_nuevos();
        detallesDeUbicacionSteps.agregar_direccion(direccion, departamento, ciudad);
    }

    @When("descripcion <descripcion>, actividad economica <actividad>")
    public void agregarUbicacion(@Named("actividad")String actividad, @Named("descripcion")String descripcion){
        detallesDeUbicacionSteps.agregar_ubicacion(descripcion, actividad);
    }

    @When("seleccione el producto <producto> para expedir la poliza")
    public void elegirProducto(@Named("producto") String producto){
        detallesDeUbicacionSteps.elegirProducto(producto);
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
        /**
         * Pendiente de una direccion que sea un riesgo consultable
         * detallesDeUbicacionSteps.verificar_mensaje(mensaje);*/
    }
}
