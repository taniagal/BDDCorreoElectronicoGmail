package com.sura.policycenter.selenium.definitions;


import com.sura.guidewire.selenium.SeusLoginSteps;
import com.sura.policycenter.selenium.steps.DetallesDeUbicacionSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DetallesDeUbiacionDefinitions {
    @Steps
    private SeusLoginSteps loginSteps;
    @Steps
    private DetallesDeUbicacionSteps detallesDeUbicacionSteps;

    /**
     * ESCENARIO 1
     */
    @Given("estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>")
    public void agregarPoliza(@Named("cuenta")String cuenta,@Named("producto")String producto) {
        loginSteps.login();
        detallesDeUbicacionSteps.ir_a_nueva_poliza(cuenta,producto);
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

    @Then("espero ver en la lista de ubicaciones de la pantalla de edificios y ubicaciones la nueva ubicaciOn ingresada")
    public void verificarUbicacion(){
        detallesDeUbicacionSteps.validar_ingreso_ubicacion();
        loginSteps.close();
    }


    /**
     * ESCENARIO 2
     */
    @Then("que se muestre el mensaje <mensaje>")
    public void verificarMensaje(@Named("mensaje")String mensaje){
        //detallesDeUbicacionSteps.verificar_mensaje(mensaje);
        //Eliminaron el doomie de riesgos consultables.
        loginSteps.close();
    }


    /**
     * ESCENARIO 3
     */
    @Then("que se muestre el mensaje de direccion <mensaje>")
    public void verificarMensajeDireccion(@Named("mensaje")String mensaje){
        //detallesDeUbicacionSteps.verificar_mensaje_direccion(mensaje);
        //Desactivaron las validaciones de direcciones en locations
        loginSteps.close();
    }
}
