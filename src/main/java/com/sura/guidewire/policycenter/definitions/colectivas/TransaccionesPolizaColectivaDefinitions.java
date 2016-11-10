package com.sura.guidewire.policycenter.definitions.colectivas;


import com.sura.guidewire.policycenter.steps.colectivas.InformacionDePolizaColectivaSteps;
import com.sura.guidewire.policycenter.steps.colectivas.TransaccionesPolizaColectivaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class TransaccionesPolizaColectivaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    TransaccionesPolizaColectivaSteps transaccionesPolizaColectivaSteps;

    @Steps
    InformacionDePolizaColectivaSteps informacionDePolizaColectivaSteps;

    @When("seleccione la opcion del menu transacciones de tipo de poliza individual")
    public void seleccionarLaOpcionTransaccionesPolizaIndividual(){
        transaccionesPolizaColectivaSteps.seleccionarLaOpcionTransaccionesPolizaIndividual();
    }

    @When("de clic en el numero de poliza de transacciones poliza colectiva")
    public void darClicEnElNumeroDePoliza(){
        transaccionesPolizaColectivaSteps.darClicEnElNumeroDePoliza();
    }

    @When("de clic en el nombre del tomador o el segundo tomador <tomador> de la poliza colectiva")
    public void clicEnUnTomadorDeLaPoliza(@Named("tomador") String tomador){
        informacionDePolizaColectivaSteps.clicEnUnTomadorDeLaPoliza(tomador);
    }

    @When("vaya a consultar las transacciones de la poliza colectiva")
    public void clicEnTransaccionesDePolizaColectiva(){
        transaccionesPolizaColectivaSteps.clicEnTransaccionesDePolizaColectiva();
    }

    @Then("debo ver las opciones para transacciones de poliza colectiva e individual")
    public void validarOpcionesDelMenuParaPolizaColectivaEIndividual(){
        transaccionesPolizaColectivaSteps.validarOpcionesDelMenuParaPolizaColectivaEIndividual();
    }

    @Then("debo ver las transacciones de poliza colectiva: $transacciones")
    public void validarTransaccionesDePolizaColectiva(ExamplesTable transacciones){
        transaccionesPolizaColectivaSteps.validarTransaccionesDePolizaColectiva(transacciones);
    }

    @Then("debo ver las transacciones de poliza individual")
    public void validarTransaccionesDePolizaIndividual(){
        transaccionesPolizaColectivaSteps.validarTransaccionesDePolizaIndividual();
    }

    @Then("debe deshabilitar la edicion de la informacion de la poliza colectiva")
    public void validarLosElementosDeshabilitados(){
        informacionDePolizaColectivaSteps.validarLosElementosDeshabilitados();
    }

    @Then("me debe llevar a la pantalla de consulta de tomador <tomador> de la poliza colectiva y no tener la opcion de editar")
    public void validarConsultaDeTomador(String tomador){
        transaccionesPolizaColectivaSteps.validarConsultaDeTomador(tomador);
    }
}
