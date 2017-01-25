package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.RequisitosPorDniMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class RequisitosPorDniMrcSteps extends ScenarioSteps {
    @Page
    RequisitosPorDniMrcPage requisitosPorDniMrcPage;

    @Step
    public void agregarAseguradoMrc(String tipoDocumento, String numeroDocumento, String tipoBeneficiario) {
        requisitosPorDniMrcPage.agregarAseguradoMrc(tipoDocumento,numeroDocumento,tipoBeneficiario);
    }
}
