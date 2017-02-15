package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.TipoDeOnerosoPaPage;
import com.sura.guidewire.policycenter.pages.ValidacionesInformacionDeVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;

public class TipoDeOnerosoPaSteps extends ScenarioSteps {

    ValidacionesInformacionDeVehiculoPage vehiculoPage;

    @Page
    TipoDeOnerosoPaPage tipoDeOnerosoPaPage;

    @Page
    ValidacionesInformacionDeVehiculoPage informacionDeVehiculoPage;

    public TipoDeOnerosoPaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void agregarInteresAdicional() {
        informacionDeVehiculoPage.crearVehiculo();
        vehiculoPage.validarQueNoPermiteAgregarMasDeUnAuto();
        tipoDeOnerosoPaPage.agregarInteresAdicional();
    }

    @Step
    public void verificarMarca(){
        tipoDeOnerosoPaPage.verificarMarca();
    }

    @Step
    public void editarInteresAdicional(String nombre) {
        tipoDeOnerosoPaPage.editarInteresAdicional(nombre);
    }
}