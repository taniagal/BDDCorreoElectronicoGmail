package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.ValidacionesInformacionFacturacionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class ValidacionesInformacionFacturacionSteps extends ScenarioSteps {

    @Page
    ValidacionesInformacionFacturacionPage validacionesInformacionFacturacionPage;

    public ValidacionesInformacionFacturacionSteps (Pages pages){
        super (pages);
    }

    @Step
    public void verificarInformacionVisual(){
        validacionesInformacionFacturacionPage.verificarFacturacion();
    }
}