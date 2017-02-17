package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class ImpresionReimpresionPaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Jobs']/div/span")
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
    @FindBy(xpath = "//div[contains(.,' ')]")
    private WebElementFacade checkBoxDocumento;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div/table/tbody/tr[1]/td[1]/div/img")
    private WebElementFacade checkBoxCaratula;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div/table/tbody/tr[2]/td[1]/div/img")
    private WebElementFacade checkBoxCartaRelacion;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div/table/tbody/tr[3]/td[1]/div/img")
    private WebElementFacade checkBoxEndoso;

    public ImpresionReimpresionPaPage(WebDriver driver) {
        super(driver);
    }

    public void irATransaccionesDePoliza() {
        menuItemTransaccionesDePoliza.click();
    }

    public void validarBotonReimpresion() {
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

    public void validarNoPresenciaDeReimpresion() {
        String resultado = null;
        if (botonReimpresion.isCurrentlyVisible()) {
            resultado = "el boton se encuentra presente";
        }
    }

    public void seleccionarOpcionDocumento() {
        checkBoxDocumento.click();
    }

    public void validarOpcionesReimpresion() {
        checkBoxEndoso.isEnabled();
        checkBoxCaratula.isEnabled();
        checkBoxCartaRelacion.isEnabled();
    }
}
