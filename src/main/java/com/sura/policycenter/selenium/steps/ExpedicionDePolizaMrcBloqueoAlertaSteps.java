package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.menu.opciones.poliza.ExpedicionDePolizaMrcBloqueoAlertaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ExpedicionDePolizaMrcBloqueoAlertaSteps extends ScenarioSteps {

    ExpedicionDePolizaMrcBloqueoAlertaPage expedicionDePolizaMrcBloqueoAlertaPage = new ExpedicionDePolizaMrcBloqueoAlertaPage(getDriver());

    public ExpedicionDePolizaMrcBloqueoAlertaSteps (Pages pages){
        super (pages);
    }


    @Step
    public void ingresar_a_edificios_y_ubicaciones(){
        expedicionDePolizaMrcBloqueoAlertaPage.ingresoEdificioUbicaciones();
    }

    @Step
    public void ingresar_beneficiario_o_asegurado() {
        expedicionDePolizaMrcBloqueoAlertaPage.ingresarAseguradoOBeneficiario();
    }

    public void valida_mensaje_de_advertencia(String mensaje) {
        expedicionDePolizaMrcBloqueoAlertaPage.validarMensaje(mensaje);
        expedicionDePolizaMrcBloqueoAlertaPage.cancelar();
    }

    public void click_en_aceptar_poliza() {
        expedicionDePolizaMrcBloqueoAlertaPage.clickAceptarDespuesDeModificada();
    }
}
