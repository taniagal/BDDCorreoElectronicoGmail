package com.sura.gw.navegacion.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BotonAccionesSteps extends ScenarioSteps {

    @Step
    public void seleccionar_opcion_cambio_de_poliza() {
        waitFor(1).seconds();
        String xpathLinkOpcionesCambiarPoliza = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-itemEl']";
        getPages().getDriver().findElement(By.xpath(xpathLinkOpcionesCambiarPoliza)).click();
    }

    @Step
    public void seleccionar_instrucciones_previas_a_la_renovacion() {
        waitFor(1).seconds();
        String xpathLinkInstruccionesPreviasARenovacion = "//a[contains(.,'Instrucciones previas a la renovación')]";
        getPages().getDriver().findElement(By.xpath(xpathLinkInstruccionesPreviasARenovacion)).click();
    }

    @Step
    public void seleccionar_cancelar_poliza() {
        waitFor(1).seconds();
        String xpathLinkCancelarPoliza = "//a[contains(.,'Cancelar póliza')]";
        getPages().getDriver().findElement(By.xpath(xpathLinkCancelarPoliza)).click();
    }

}
