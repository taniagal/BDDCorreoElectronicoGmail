package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.poliza.EdificiosUbicacionesSteps;
import com.sura.guidewire.policycenter.steps.LeyendaAdicionalMrcSteps;
import com.sura.guidewire.policycenter.steps.tarifacion.TarifaTasaUnicaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LeyendaAdicionalMrcDefinitions {

    @Steps
    LeyendaAdicionalMrcSteps leyendaAdicionalMrcSteps;
    @Steps
    EdificiosUbicacionesSteps edificiosUbicacionesSteps;
    @Steps
    TarifaTasaUnicaSteps tasaUnicaSteps;

    @When("ingrese una leyenda adicional <leyendaAdicional>")
    public void agregarUbicacion(@Named("leyendaAdicional") String leyendaAdicional) {
        leyendaAdicionalMrcSteps.agregarLeyendaAdicional(leyendaAdicional);
    }

    @Then("cotice y expida la poliza")
    public void cuandoIntenteCotizarYExpedirLaPoliza() {
        edificiosUbicacionesSteps.seleccionarBotonCotizar();
        tasaUnicaSteps.expedirPoliza();
    }

    @When("intente ingresar una nueva ubicacion con <leyendaAdicional>")
    public void cuandoIntenteIngresarUnaNuevaUbicacion(@Named("leyendaAdicional") String leyendaAdicional) {
        edificiosUbicacionesSteps.removerRiesgos();
        leyendaAdicionalMrcSteps.ingresarNuevaLeyenda(leyendaAdicional);
    }

    @When("de click en el boton aceptar")
    public void clickearBotonAceptar() {
        leyendaAdicionalMrcSteps.clickearBotonAceptar();
    }
}
