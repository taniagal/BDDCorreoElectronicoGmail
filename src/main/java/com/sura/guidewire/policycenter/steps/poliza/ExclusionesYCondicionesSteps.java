package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.ExclusionesYCondicionessPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

/**
 * Created by juanzaag on 08/02/2017.
 */
public class ExclusionesYCondicionesSteps extends ScenarioSteps {

    @Page
    ExclusionesYCondicionessPage exclusionesYCondicionessPage;

    @Step
    public void ingresarAExclusionesYCondiciones() {
        exclusionesYCondicionessPage.ingresarALaOpcion();

    }

    @Step
    public void ingresarExclusionOCondicion(){
        exclusionesYCondicionessPage.ingresarExclusionOCondicion();
    }

    @Step
    public void ingresarExclusionOCondicionABuscar(String palabraABuscar){
        exclusionesYCondicionessPage.ingresarExclusionOCondicionABuscar(palabraABuscar);
    }

    public void validarOpciones(ExamplesTable listaopciones, String estadouno, String estadodos) {
        exclusionesYCondicionessPage.validarOpciones(listaopciones, estadouno, estadodos);
    }

    public void validarOpcionesMenuLateral(ExamplesTable listaopciones, String estado) {
        exclusionesYCondicionessPage.validarOpcionesMenuLateral(listaopciones, estado);
    }

    public void opcionBuscar() {
        exclusionesYCondicionessPage.opcionBuscar();
    }

    public void validarBusqueda(ExamplesTable listaBusqueda){
        exclusionesYCondicionessPage.validarBusquedaExclusionesYClausulas(listaBusqueda);
    }
}
