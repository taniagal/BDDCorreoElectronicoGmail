package com.sura.guidewire.policycenter.util.navegacion.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuContactoSteps extends ScenarioSteps {

    @Step
    public void nuevo_contacto() {
        String xpathLinkNuevoContacto = ".//a[contains(., 'Nuevo contactos')]";
        getDriver().findElement(By.xpath(xpathLinkNuevoContacto)).click();
    }

    @Step
    public void buscar() {
        String xpathLinkBuscar = ".//a[contains(., 'Buscar')]";
        getDriver().findElement(By.xpath(xpathLinkBuscar)).click();
    }

}
