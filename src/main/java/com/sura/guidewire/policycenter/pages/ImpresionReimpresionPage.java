package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImpresionReimpresionPage extends PageUtil {
    @FindBy(xpath = "html/body/div[1]/div[2]/div/span/div/div[3]/div[3]/div/table/tbody/tr[6]/td/div/span")
    private WebElementFacade menuItemTransaccionesDePoliza;
    @FindBy(xpath = "//a[contains(.,'Reimprimir')]")
    private WebElementFacade botonReimpresion;
    @FindBy(xpath = "//span[contains(.,'Opciones de compromiso')]")
    private WebElementFacade botonOpcionesDeCompromiso;
    @FindBy(xpath = "//div[contains(.,'Emitir ahora')]")
    private WebElementFacade botonEmitirAhora;
    @FindBy(xpath = "//a[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarRenovacion;
    @FindBy(xpath = "//div[contains(@id,'JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl')]")
    private WebElementFacade linkArchivoDePoliza;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div")
    private WebElementFacade tablaOpcionesReimprimir;

    public ImpresionReimpresionPage(WebDriver driver) {
        super(driver);
    }

    public void irATransaccionesDePoliza() {
        esperarYClickearBoton(menuItemTransaccionesDePoliza);
    }

    public void validarBotonReimpresion() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(botonReimpresion);
        esperarYClickearBoton(botonReimpresion);
    }

    public void expedirRenovacionPoliza() {
        esperarYClickearBoton(botonOpcionesDeCompromiso);
        esperarYClickearBoton(botonEmitirAhora);
        esperarYClickearBoton(botonAceptarRenovacion);
        linkArchivoDePoliza.click();
    }

    public String validarItemsReimpresion() {
        String listaObtenida = null;
        if (tablaOpcionesReimprimir.isCurrentlyVisible()) {
            listaObtenida = tablaOpcionesReimprimir.getText();
        }
        return listaObtenida;

    }
}
