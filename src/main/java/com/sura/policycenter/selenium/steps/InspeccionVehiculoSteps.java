package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.InspeccionVehiculoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class InspeccionVehiculoSteps extends ScenarioSteps {

    InspeccionVehiculoPage inspeccionVehiculoPage = new InspeccionVehiculoPage(getDriver());

    public InspeccionVehiculoSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void validar_Vigencia_De_La_Placa(String placa) {
        inspeccionVehiculoPage.validarVigenciaPlaca(placa);
    }

    @Step
    public void validarFechaCancelacionOExclusion() {
        inspeccionVehiculoPage.validarFechaCancelacionOExclusion();
    }

    @Step
    public void validar_Informacion_Del_Vehiculo(ExamplesTable datosVehiculo) {
        inspeccionVehiculoPage.validarDatosVehiculo(datosVehiculo);
    }

    @Step
    public void validar_Valor_Asegurado_Del_Vehiculo(String valorAsegurado) {
        inspeccionVehiculoPage.validarValorAsegurado(valorAsegurado);
    }
}
