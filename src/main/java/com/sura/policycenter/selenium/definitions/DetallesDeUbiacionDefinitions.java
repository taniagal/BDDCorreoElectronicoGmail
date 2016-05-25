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


    @Given("estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>")
    public void agregarPoliza(@Named("cuenta")String cuenta,@Named("organizacion")String organizacion,@Named("agente")String agente) {
        loginSteps.login();
        detallesDeUbicacionSteps.irANuevaPoliza(cuenta,organizacion,agente);
    }

    @When("agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>, descripcion <descripcion>")
    public void agregarUbicacion(@Named("direccion")String direccion, @Named("departamento")String departamento, @Named("ciudad")String ciudad,
                                 @Named("descripcion")String descripcion){
        detallesDeUbicacionSteps.agregarUbicacion(direccion, departamento, ciudad, descripcion);
    }

    @Then("espero ver en la lista de ubicaciones de la pantalla de Edificios y ubicaciones la nueva ubicaciOn ingresada")
    public void verificarUbicacion(){
    }
}
