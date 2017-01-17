package com.sura.guidewire.policycenter.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BotonAccionesSteps extends ScenarioSteps {

    protected static final int TIEMPO_1 = 1;
    protected static final int TIEMPO_2 = 2;
    
    //To do: migrar los acciones de los metodos a un page
    @Step
    public void seleccionar_opcion_cambio_de_poliza() {
        waitFor(TIEMPO_1).seconds();
        String xpathLinkOpcionesCambiarPoliza = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ChangePolicy-itemEl']";
        getPages().getDriver().findElement(By.xpath(xpathLinkOpcionesCambiarPoliza)).click();
    }

    @Step
    public void seleccionar_instrucciones_previas_a_la_renovacion() {
        waitFor(TIEMPO_1).seconds();
        String xpathLinkInstruccionesPreviasARenovacion = "//a[contains(.,'Instrucciones previas a la renovación')]";
        waitFor(TIEMPO_2).seconds();
        getPages().getDriver().findElement(By.xpath(xpathLinkInstruccionesPreviasARenovacion)).click();
    }

    @Step
    public void seleccionar_cancelar_poliza() {
        waitFor(TIEMPO_1).seconds();
        String xpathLinkCancelarPoliza = "//a[contains(.,'Cancelar póliza')]";
        getPages().getDriver().findElement(By.xpath(xpathLinkCancelarPoliza)).click();
        waitFor(TIEMPO_2).seconds();
    }
    @Step
    public BotonAccionesSteps seleccionar_boton_rescindir_cancelacion() {
        waitFor(TIEMPO_2).seconds();
        String xpathLinkRescindirPoliza = "//a[contains(.,'Rescindir la cancelación')]";
        getPages().getDriver().findElement(By.xpath(xpathLinkRescindirPoliza)).click();
        waitFor(TIEMPO_1).seconds();
        return this;
    }

    @Step
    public BotonAccionesSteps seleccionar_poliza_a_rescindir(){
        waitFor(TIEMPO_2).seconds();
        String xpathLinkRescindirPrimeraPoliza = "//span[contains(@id,'PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_RescindCancellation:0:item-textEl')]";
        waitFor(TIEMPO_1).seconds();
        getPages().getDriver().findElement(By.xpath(xpathLinkRescindirPrimeraPoliza)).click();
        return this;
    }

}
