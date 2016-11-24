package com.sura.guidewire.policycenter.steps.colectivas;

import com.sura.guidewire.policycenter.pages.ConfiguracionModeloDeDatosColectivosPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ConfiguracionModeloDeDatosColectivosSteps  extends ScenarioSteps{
    ConfiguracionModeloDeDatosColectivosPages datosColectivosPages = new ConfiguracionModeloDeDatosColectivosPages(getDriver());

    public ConfiguracionModeloDeDatosColectivosSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresarAPolicyInfo() {
        datosColectivosPages.ingresarAPolicyInfo();
    }

    @Step
    public void verificarEstadoDeCamposNuevos(){
        datosColectivosPages.verificarEstadosDeCamposNuevos();
    }
}
