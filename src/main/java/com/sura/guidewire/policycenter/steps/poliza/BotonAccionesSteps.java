package com.sura.guidewire.policycenter.steps.poliza;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BotonAccionesSteps extends ScenarioSteps {

    protected static final int TIEMPO_1 = 1;
    protected static final int TIEMPO_2 = 2;
    
    @Step
    public void seleccionarInstruccionesPreviasALaRenovacion() {
        waitFor(TIEMPO_1).seconds();
        String xpathLinkInstruccionesPreviasARenovacion = "//a[contains(.,'Instrucciones previas a la renovación')]";
        waitFor(TIEMPO_2).seconds();
        getPages().getDriver().findElement(By.xpath(xpathLinkInstruccionesPreviasARenovacion)).click();
    }

    @Step
    public void seleccionarCancelarPoliza() {
        waitFor(TIEMPO_1).seconds();
        String xpathLinkCancelarPoliza = "//a[contains(.,'Cancelar póliza')]";
        getPages().getDriver().findElement(By.xpath(xpathLinkCancelarPoliza)).click();
        waitFor(TIEMPO_2).seconds();
    }
    @Step
    public BotonAccionesSteps seleccionarBotonRescindirCancelacion() {
        waitFor(TIEMPO_2).seconds();
        String xpathLinkRescindirPoliza = "//a[contains(.,'Rescindir la cancelación')]";
        getPages().getDriver().findElement(By.xpath(xpathLinkRescindirPoliza)).click();
        waitFor(TIEMPO_1).seconds();
        return this;
    }

    @Step
    public BotonAccionesSteps seleccionarPolizaARescindir(){
        waitFor(TIEMPO_2).seconds();
        String xpathLinkRescindirPrimeraPoliza = "//span[contains(@id,'PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_RescindCancellation:0:item-textEl')]";
        waitFor(TIEMPO_1).seconds();
        getPages().getDriver().findElement(By.xpath(xpathLinkRescindirPrimeraPoliza)).click();
        return this;
    }

}
