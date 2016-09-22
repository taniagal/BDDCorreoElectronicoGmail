package com.sura.gw.navegacion.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuBuscarSteps extends ScenarioSteps {

    @Step
    public void polizas() {
        String xpathLinkPolizas = ".//a[contains(., 'Pólizas')]";
        getDriver().findElement(By.xpath(xpathLinkPolizas)).click();
    }

    @Step
    public void cuentas() {
        String xpathLinkCuentas = ".//a[contains(., 'Cuentas')]";
        getDriver().findElement(By.xpath(xpathLinkCuentas)).click();
    }

    @Step
    public void codig_de_agente() {
        String xpathLinkCodigoAgente = ".//a[contains(., 'Código de agente')]";
        getDriver().findElement(By.xpath(xpathLinkCodigoAgente)).click();
    }

    @Step
    public void actividades() {
        String xpathLinkActividades = ".//a[contains(., 'Actividades')]";
        getDriver().findElement(By.xpath(xpathLinkActividades)).click();
    }

    @Step
    public void contactos() {
        String xpathLinkContactos = ".//a[contains(., 'Contactos')]";
        getDriver().findElement(By.xpath(xpathLinkContactos)).click();
    }

}
