package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.modificaciones.LeyendaAdicionalMrcPage;
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

    @Step
    public void ingresarNuevaLeyenda(String leyendaAdicional) {
        leyendaAdicionalMrcPagePage.agregarLeyendaModificacion(leyendaAdicional);
    }

    @Step
    public void clickearBotonAceptar() {
        leyendaAdicionalMrcPagePage.clickearBotonAceptar();
    }
}
