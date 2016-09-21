package com.sura.gw.navegacion.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

public class MenuEscritorioSteps extends ScenarioSteps {

    @Step
    public void misActividades() {
        String xpathLinkMisActividades = ".//a[contains(.,'Mis Actividades')]";
        getDriver().findElement(By.xpath(xpathLinkMisActividades)).click();
    }

    @Step
    public void mis_cuentas() {
        String xpathLinkMisCuentas = ".//a[contains(.,'Mis cuentas')]";
        getDriver().findElement(By.xpath(xpathLinkMisCuentas)).click();

    }

    @Step
    public void mis_envios(){
        String xpathLinkMisEnvios = ".//a[contains(.,'Mis envíos')]";
        getDriver().findElement(By.xpath(xpathLinkMisEnvios)).click();
    }

    @Step
    public void mis_renovaciones(){
        String xpathLinkMisRenovaciones = ".//a[contains(.,'Mis renovaciones')]";
        getDriver().findElement(By.xpath(xpathLinkMisRenovaciones)).click();
    }

    @Step
    public void mis_otras_transacciones_de_poliza(){
        String xpathLinkMisOtrasTransacciones = ".//a[contains(.,'Mis otras transacciones de póliza')]";
        getDriver().findElement(By.xpath(xpathLinkMisOtrasTransacciones)).click();
    }

    @Step
    public void mis_colas(){
        String xpathLinkMisColas = ".//a[contains(.,'Mis colas')]";
        getDriver().findElement(By.xpath(xpathLinkMisColas)).click();
    }
}
