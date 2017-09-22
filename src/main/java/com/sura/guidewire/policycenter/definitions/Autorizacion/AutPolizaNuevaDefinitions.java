package com.sura.guidewire.policycenter.definitions.Autorizacion;

import com.sura.guidewire.policycenter.steps.Autorizacion.AutPolizaNuevaSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.model.ExamplesTable;

public class AutPolizaNuevaDefinitions {
    @Steps
    AutPolizaNuevaSteps autPolizaNuevaSteps;

    @Given("se tienen los siguientes parametros para la busqueda $parametros")
    public void buscarParametros(ExamplesTable paramatros){
    autPolizaNuevaSteps.capturarParametros(paramatros);
    }

}
