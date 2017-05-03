package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.colectivas.BusquedaDeRiesgosPage;
import com.sura.guidewire.policycenter.pages.poliza.BusquedaDeTransaccionesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BusquedaDeTransaccionesSteps extends ScenarioSteps{

    BusquedaDeRiesgosPage busquedaDeRiesgosPage;
    BusquedaDeTransaccionesPage busquedaDeTransaccionesPage;

    @Step
    public void irABuscarTransacciones() {
        busquedaDeRiesgosPage.clicEnLaOpcionBuscar();
        busquedaDeTransaccionesPage.seleccionarLaOpcionTransacciones();

    }
}
