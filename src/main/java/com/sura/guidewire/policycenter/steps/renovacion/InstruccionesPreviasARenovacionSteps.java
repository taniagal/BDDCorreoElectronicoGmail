package com.sura.guidewire.policycenter.steps.renovacion;

import com.sura.guidewire.policycenter.pages.renovacion.InstruccionesPreviasARenovacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class InstruccionesPreviasARenovacionSteps extends ScenarioSteps {

    private InstruccionesPreviasARenovacionPage instruccionesPreviasARenovacionPage;

    @Step
    public InstruccionesPreviasARenovacionSteps seleccionarBotonEditar() {
        instruccionesPreviasARenovacionPage.seleccionarBotonEditar();
        return this;
    }

    @Step
    public InstruccionesPreviasARenovacionSteps desplegarListaInstruccion() {
        String xpathListaInstruccion = "//input[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-inputEl']";
        instruccionesPreviasARenovacionPage.seleccionarListaDesplegable(xpathListaInstruccion);
        return this;
    }
    @Step
    public InstruccionesPreviasARenovacionSteps seleccionar_instruccion(String instruccion) {
        instruccionesPreviasARenovacionPage.seleccionarOpcion(instruccion);
        return this;
    }
    @Step
    public InstruccionesPreviasARenovacionSteps desplegar_lista_opcion(String opcion) {
        instruccionesPreviasARenovacionPage.seleccionarListaDesplegableDeEtiqueta(opcion);
        return this;
    }
    public InstruccionesPreviasARenovacionPage obtenerPaginInstruccionesPreviasARenovacion(){
        return this.instruccionesPreviasARenovacionPage;
    }

}
