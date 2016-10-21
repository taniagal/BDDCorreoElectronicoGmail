package com.sura.guidewire.policycenter.util.navegacion;

import java.io.Serializable;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.LoggerFactory;



public class PanelIzquierdoElement extends PageObject implements Serializable{

    private static final long serialVersionUID = 1L;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    public static final String LINK_ACCIONES = "//a[contains(@id,'Desktop:DesktopMenuActions')]";
    public static final String LINK_NUEVA_COTIZACION = ".//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewSubmission-textEl']";

    public void opcion(String opcionXPath){
        try {
            WebElementFacade opcion = findBy(opcionXPath).waitUntilVisible();
            opcion.waitUntilClickable().click();

        } catch (Exception e){
            LOGGER.info(e.getMessage());
        }
    }
}
