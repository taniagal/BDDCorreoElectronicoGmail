package com.sura.guidewire.policycenter.pages.actividades;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class IngresoDeActividadAPolizaPage extends PageUtil {

    protected Actions actions = new Actions(getDriver());

    public IngresoDeActividadAPolizaPage(WebDriver driver) {
        super(driver);
    }


    public void irALaOpcionNuevaActividadDeLaPoliza() {
        WebElementFacade botonMenuLateralAcciones = findBy(".//*[@id='PolicyFile:PolicyFileMenuActions-btnInnerEl']");
        WebElementFacade opcionMenuLateralAccionesNuevaActividad = findBy(".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_Create:PolicyFileMenuActions_NewActivity-textEl']");
        WebElementFacade opcionMenuLateralAccionesRequest = findBy(".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_Create:PolicyFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category-textEl']");
        WebElementFacade opcionMenuLateralAccionesCrearAgente = findBy(".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_Create:PolicyFileMenuActions_NewActivity:NewActivityMenuItemSet:3:NewActivityMenuItemSet_Category:0:item-textEl']");
        waitFor(botonMenuLateralAcciones).waitUntilPresent().click();
        opcionMenuLateralAccionesNuevaActividad.waitUntilPresent();
        actions.moveToElement(opcionMenuLateralAccionesNuevaActividad).release(opcionMenuLateralAccionesNuevaActividad).build().perform();
        opcionMenuLateralAccionesRequest.waitUntilPresent();
        actions.moveToElement(opcionMenuLateralAccionesRequest).release(opcionMenuLateralAccionesRequest).build().perform();
        opcionMenuLateralAccionesCrearAgente.waitUntilPresent().click();
    }

    public void crearUnaActividadPorDefectoALaPoliza() {
        WebElementFacade botonAceptarActividadNueva = findBy(".//*[@id='NewActivityWorksheet:NewActivityScreen:NewActivityScreen_UpdateButton-btnInnerEl']").waitUntilVisible();
        botonAceptarActividadNueva.click();
        botonAceptarActividadNueva.waitUntilNotVisible();
    }
}
