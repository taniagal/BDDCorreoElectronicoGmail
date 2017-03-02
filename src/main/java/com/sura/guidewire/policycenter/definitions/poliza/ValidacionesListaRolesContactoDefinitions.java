package com.sura.guidewire.policycenter.definitions.poliza;

import com.sura.guidewire.policycenter.steps.poliza.ValidacionesListaRolesContactoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;

public class ValidacionesListaRolesContactoDefinitions {

    @Steps
    ValidacionesListaRolesContactoSteps validacionesListaRolesContactoSteps;


    @Then("el sistema debe validar las opciones al agregar nuevo rol: $ListaContactosRoles")
    public void validarOpcionesRolesContactos(ExamplesTable ListaContactosRoles){
        validacionesListaRolesContactoSteps.validarListaContactosRoles(ListaContactosRoles);
    }
}