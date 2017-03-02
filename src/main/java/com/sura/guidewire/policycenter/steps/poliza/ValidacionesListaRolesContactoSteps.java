package com.sura.guidewire.policycenter.steps.poliza;

import com.sura.guidewire.policycenter.pages.poliza.ValidacionesListaRolesContactoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;

public class ValidacionesListaRolesContactoSteps extends ScenarioSteps {

   @Page
    ValidacionesListaRolesContactoPage validacionesListaRolesContactoPage;

    public ValidacionesListaRolesContactoSteps (Pages pages){
        super(pages);
    }


    @Step
    public void validarListaContactosRoles(ExamplesTable ListaContactosRoles){
        validacionesListaRolesContactoPage.validarOpcionesAgregarRol(ListaContactosRoles);
    }

}
