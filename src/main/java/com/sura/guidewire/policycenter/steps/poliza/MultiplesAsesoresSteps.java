package com.sura.guidewire.policycenter.steps.poliza;


import com.sura.guidewire.policycenter.pages.poliza.MultiplesAsesoresPage;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MultiplesAsesoresSteps extends ScenarioSteps {
    private MultiplesAsesoresPage multiplesAsesoresPage;

    @Step
    public void adicionarAsesoresDeComision() {
        multiplesAsesoresPage.adicionarAsesoresDeComision();
    }
    @Step
    public void ingresarInformacionDelAsesor(Parametros parametros) {
       multiplesAsesoresPage.ingresarInformacionDelAsesor(parametros);
    }
    @Step
    public void validarDatosDelAsesor(Parametros opciones) {
        multiplesAsesoresPage.validarDatosDelAsesor(opciones);
    }
    @Step
    public void validarMensajes(Parametros parametros) {
        multiplesAsesoresPage.validacionMensaje(parametros);
    }
}
