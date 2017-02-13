package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.LeyendaAdicionalMrcPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class LeyendaAdicionalMrcSteps extends ScenarioSteps {
    @Page
    LeyendaAdicionalMrcPage leyendaAdicionalMrcPagePage;

    @Step
    public void agregarLeyendaAdicional(String leyendaAdicional) {
        leyendaAdicionalMrcPagePage.agregarLeyendaAdicional(leyendaAdicional);

    }

    public void ingresarNuevaLeyenda(String leyendaAdicional) {
        leyendaAdicionalMrcPagePage.agregarLeyendaModificacion(leyendaAdicional);
    }
}
