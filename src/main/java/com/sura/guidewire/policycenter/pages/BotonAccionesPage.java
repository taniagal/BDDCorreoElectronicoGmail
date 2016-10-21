package com.sura.guidewire.policycenter.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

/**
 * Created by juanzaag on 20/10/2016.
 */
public class BotonAccionesPage extends PageObject{

    public void seleccionarOpcionCancelarPoliza() {
        waitFor(1).seconds();
        String xpathLinkCancelarPoliza = "//a[contains(.,'Cancelar póliza')]";
        findBy(xpathLinkCancelarPoliza).click();
    }
    public void seleccionarOpcionNuevaCotizacion() {
        waitFor(1).seconds();
        String xpathLinkNuevaCotizacion = "//a[contains(.,'Nueva cotización')]";
        findBy(xpathLinkNuevaCotizacion).click();
    }
}
