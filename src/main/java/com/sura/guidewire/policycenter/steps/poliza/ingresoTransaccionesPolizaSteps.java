package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.IngresoTransaccionesPolizaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class ingresoTransaccionesPolizaSteps extends ScenarioSteps {

    @Page
    IngresoTransaccionesPolizaPage ingresoTransaccionesPolizaPage;


    public ingresoTransaccionesPolizaSteps (Pages pages){

        super(pages);
    }

    @Step
    public void ingresarMenuTransaciones(){
        ingresoTransaccionesPolizaPage.ingresarMenuAccionesTransacciones();

    }

    @Step
    public void busquedaTransaccionPoliza(){
        ingresoTransaccionesPolizaPage.busquedaTransaccion();
    }
}
