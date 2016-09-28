package com.sura.gw.policy.poliza.steps;

import com.sura.gw.policy.poliza.pages.InstruccionesPreviasARenovacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class InstruccionesPreviasARenovacionSteps extends ScenarioSteps {

    public InstruccionesPreviasARenovacionPage instruccionesPreviasARenovacionPage;

    @Step
    public InstruccionesPreviasARenovacionSteps seleccionar_boton_editar() {
        instruccionesPreviasARenovacionPage.seleccionarBotonEditar();
        return this;
    }

    @Step
    public InstruccionesPreviasARenovacionSteps desplegar_lista_instruccion() {
        instruccionesPreviasARenovacionPage.seleccionarListaDesplegableDeInstruccion();
        return this;
    }

}
