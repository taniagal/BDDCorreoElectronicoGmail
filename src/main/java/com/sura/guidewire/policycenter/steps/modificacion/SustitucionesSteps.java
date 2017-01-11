package com.sura.guidewire.policycenter.steps.modificacion;

import com.sura.guidewire.policycenter.pages.modificaciones.SustitucionesPage;
import com.sura.guidewire.policycenter.pages.tarifacion.TarifaAutosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class SustitucionesSteps extends ScenarioSteps {

    @Page
    SustitucionesPage sustitucionesPage;

    public SustitucionesSteps(Pages pages){super(pages);}

    @Step
    public void sustitucionVehiculo(){
        sustitucionesPage.sustitucionVehiculo();
    }

    @Step
    public void verificarInfoVehiculo(ExamplesTable infoVehiculo){
        sustitucionesPage.verificarInfoVehiculo(infoVehiculo);
    }

    @Step
    public void agregarVehiculoSustituto(ExamplesTable datosAgregarVehiculo){
        sustitucionesPage.agregarVehiculoSustituto(datosAgregarVehiculo);
    }

    @Step
    public void verificarCoberturasVehiculoSustituto(ExamplesTable datosCoberturaVehiculo){
        TarifaAutosPage tarifaAutosPage = new TarifaAutosPage(getDriver());
        tarifaAutosPage.verificarCoberturasVehiculoSustituto(datosCoberturaVehiculo);
    }
}
