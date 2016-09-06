package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.TarifaTasaUnicaPage;
import com.sura.policycenter.selenium.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class TarifaTasaUnicaSteps extends ScenarioSteps{
    ValidacionesInformacionDeVehiculoPage vehiculoPage =  new ValidacionesInformacionDeVehiculoPage(getDriver());
    TarifaTasaUnicaPage tasaUnicaPage = new TarifaTasaUnicaPage(getDriver());

    public TarifaTasaUnicaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ir_a_vehiculos(){
        vehiculoPage.irAVehiculos();
    }

    @Step
    public void verificar_elementos_exportacion() {
        tasaUnicaPage.verificarElementosExportacion();
    }

    @Step
    public void verificar_elementos_importacion() {
        tasaUnicaPage.verificarElementosImportacion();
    }
}
