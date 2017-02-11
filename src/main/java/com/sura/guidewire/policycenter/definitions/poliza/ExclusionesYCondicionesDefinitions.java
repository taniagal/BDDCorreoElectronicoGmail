package com.sura.guidewire.policycenter.definitions.poliza;


import com.google.inject.name.Named;
import com.sura.guidewire.policycenter.steps.poliza.ExclusionesYCondicionesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class ExclusionesYCondicionesDefinitions {

    @Steps
    ExclusionesYCondicionesSteps exclusionesYCondicionesSteps;


    @When("ingrese a exclusiones y condiciones")
    public void cuandoIngreseAExclusionesYCondiciones() {
        exclusionesYCondicionesSteps.ingresarAExclusionesYCondiciones();
    }

    @When("ingrese a agregar exclusion o condicion")
    public void cuandoIngreseAAgregarExclusionOCondicion() {
        exclusionesYCondicionesSteps.ingresarExclusionOCondicion();
    }

    @When("busque la exclusion o condicion <palabraabuscar>")
    public void cuandoBusqueLaCondicion(@Named("palabraabuscar") String palabraabuscar) {
        exclusionesYCondicionesSteps.ingresarExclusionOCondicionABuscar(palabraabuscar);
        exclusionesYCondicionesSteps.opcionBuscar();
    }

    @Then("se deben mostrar las siguientes opciones en exclusiones en <estadouno> $listaopciones")
    public void entoncesSeDebenMostrarLasSiguientesOpciones(ExamplesTable listaopciones, @Named("estadouno") String estadouno) {
        String estadodos = "";
        exclusionesYCondicionesSteps.validarOpciones(listaopciones, estadouno, estadodos);
    }

    @Then("se deben mostrar en el menu lateral las siguientes opciones en <estado> $listamenulateral")
    public void entoncesSeDebenMostrarEnMenuLateralLasSiguientesOpciones(ExamplesTable listamenulateral, @Named("estado") String estado) {
        exclusionesYCondicionesSteps.validarOpcionesMenuLateral(listamenulateral, estado);
    }

    @Then("se debe mostrar en la busqueda $listabusqueda")
    public void entoncesSeDebeMostrarEnLaBusqueda(ExamplesTable listabusqueda){
        exclusionesYCondicionesSteps.validarBusqueda(listabusqueda);
    }


}

