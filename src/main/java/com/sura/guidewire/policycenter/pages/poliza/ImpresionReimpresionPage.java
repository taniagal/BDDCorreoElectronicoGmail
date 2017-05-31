package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImpresionReimpresionPage extends PageUtil {
    @FindBy(xpath = "//td[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Jobs']/div/span")
    private WebElementFacade menuItemTransaccionesDePoliza;
    @FindBy(xpath = "//a[contains(.,'Reimprimir')]")
    private WebElementFacade botonReimpresion;
    @FindBy(xpath = "//span[contains(.,'Opciones de compromiso')]")
    private WebElementFacade botonOpcionesDeCompromiso;
    @FindBy(xpath = "//div[contains(@id,'JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl')]")
    private WebElementFacade linkArchivoDePoliza;
    @FindBy(xpath = ".//*[@id='DocumentsToReprint_ExtPopup:DocumentsScreen:DocumentsToReprintLV-body']")
    private WebElementFacade tablaOpcionesReimprimir;
    @FindBy(xpath = "//div[@id='DocumentsToReprint_ExtPopup:DocumentsScreen:DocumentsToReprintLV-body']/div")
    private WebElementFacade tablaOpcionesReimprimirMrc;
    @FindBy(xpath = "//div[2]/div/div/div/div/span/div")
    private WebElementFacade checkBoxDocumentos;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div/table/tbody/tr[2]/td[1]/div/img")
    private WebElementFacade checkBoxRelacionConCliente;
    @FindBy(xpath = ".//*[@id='DocumentsToReprint_ExtPopup:DocumentsScreen:DocumentsToReprintLV-body']/div/table/tbody/tr[1]/td[1]/div/img")
    private WebElementFacade checkBoxCaratula;
    @FindBy(xpath = ".//*[@id='DocumentsToReprint_ExtPopup:DocumentsScreen:DocumentsToReprintLV-body']/div/table/tbody/tr[2]/td[1]/div/img")
    private WebElementFacade checkBoxCotizacion;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions']")
    private WebElementFacade menuAccionesPoliza;
    @FindBy(xpath = ".//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptar;

    public ImpresionReimpresionPage(WebDriver driver) {
        super(driver);
    }

    public void irATransaccionesDePoliza() {
        menuItemTransaccionesDePoliza.click();
    }

    public void validarBotonReimpresion() {
        withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(botonReimpresion);
        esperarYClickearBoton(botonReimpresion);
    }

    public String validarItemsReimpresion() {
        String listaObtenida = null;
        if (tablaOpcionesReimprimir.isVisible()) {
            listaObtenida = tablaOpcionesReimprimir.getText();
        }
        return listaObtenida;
    }

    public void validarNoPresenciaDeReimpresion() {
       botonReimpresion.shouldNotBeCurrentlyVisible();
    }

    public void irADocumentos() {
        checkBoxDocumentos.click();
    }

    public void validarOpcionesReimpresionHabilitadas() {
        checkBoxCaratula.isSelected();
        checkBoxCotizacion.isSelected();
        if (checkBoxRelacionConCliente.isCurrentlyVisible()) {
            checkBoxRelacionConCliente.isSelected();
        }
    }
}
