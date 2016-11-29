package com.sura.guidewire.policycenter.definitions.colectivas;

import com.sura.guidewire.policycenter.steps.colectivas.PolizaPrincipalPaSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.openqa.selenium.WebDriver;

public class PolizaPrincipalPaDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    private PolizaPrincipalPaSteps polizaPrincipalPaSteps;

    @Then("no debe estar visible la sección de contrato de poliza: asegurados, vehiculos, coberturas")
    public void validarElementosNoVisiblesDelMenu(){

    }

    @Then("la  ventana de revision de poliza solo debe mostrar la informacion general sin las tablas del detalle de riesgo")
    public void validarElementosNoVisiblesDeRevisionDePoliza(){

    }
}
