package com.sura.guidewire.policycenter.steps.contacto;

import com.sura.guidewire.policycenter.pages.contacto.EdicionDeContactoPage;
import com.sura.guidewire.policycenter.pages.contacto.NuevoContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class EdicionDeContactoSteps extends ScenarioSteps{

    EdicionDeContactoPage edicionDeContactoPage;
    NuevoContactoPage nuevoContactoPage;

    @Step
    public void editarDatosDelContactoYGuardar(ExamplesTable datosContacto) {
        Map<String, String> datosEdicion = datosContacto.getRows().get(0);
        edicionDeContactoPage.clicEnElBotonEditarContacto();
        nuevoContactoPage.ingresarPrimerNombre(datosEdicion.get("primerNombre"));
    }
}
