package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.BuscarPlacaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

/**
 * Created by tanigral on 05/09/2017.
 */
public class BuscarPlacaSteps extends ScenarioSteps {
    @Page
    BuscarPlacaPage buscarPlacaPage;
    @Step
    public void buscarPlaca() {
        buscarPlacaPage.buscarPlaca();
    }

}
