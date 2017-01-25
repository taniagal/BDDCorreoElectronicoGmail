package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.RequisitosPorDniMrcSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;

public class RequisitosPorDniMrcDefinitions {
    @Steps
    RequisitosPorDniMrcSteps requisitosPorDniMrcSteps;

    @When("agrege un beneficiario mrc <tipoDocumento> <numeroDocumento><tipoBeneficiario>")
    public void agregarAseguradoMrc(@Named("tipoDocumento") String tipoDocumento, @Named("numeroDocumento") String numeroDocumento, @Named("tipoBeneficiario") String tipoBeneficiario) {
        requisitosPorDniMrcSteps.agregarAseguradoMrc(tipoDocumento, numeroDocumento, tipoBeneficiario);
    }


}
