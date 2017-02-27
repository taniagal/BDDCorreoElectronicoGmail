package com.sura.guidewire.policycenter.pages;

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
    @FindBy(xpath = "//div[contains(.,'Emitir ahora')]")
    private WebElementFacade botonEmitirAhora;
    @FindBy(xpath = "//a[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarRenovacion;
    @FindBy(xpath = "//div[contains(@id,'JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl')]")
    private WebElementFacade linkArchivoDePoliza;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div")
    private WebElementFacade tablaOpcionesReimprimir;
    @FindBy(xpath = "//div[@id='DocumentsToReprint_ExtPopup:DocumentsScreen:DocumentsToReprintLV-body']/div")
    private WebElementFacade tablaOpcionesReimprimirMrc;
    @FindBy(xpath = "//div[2]/div/div/div/div/span/div")
    private WebElementFacade checkBoxDocumentos;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div/table/tbody/tr[2]/td[1]/div/img")
    private WebElementFacade checkBoxRelacionConCliente;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div/table/tbody/tr[1]/td[1]/div/img")
    private WebElementFacade checkBoxCaratula;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div/table/tbody/tr[4]/td[1]/div/img")
    private WebElementFacade checkBoxEndoso;
    @FindBy(xpath = "//td/div/div[3]/div/table/tbody/tr[3]/td/div/img")
    private WebElementFacade checkBoxEndosomrc;
    @FindBy(xpath = "html/body/div[1]/div[4]/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/div[3]/div/table/tbody/tr[3]/td[1]/div/img")
    private WebElementFacade checkBoxCotizacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguienteRenovacion;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']")
    private WebElementFacade botonEditarRenovacion;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions']")
    private WebElementFacade menuAccionesPoliza;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_RenewPolicy']")
    private WebElementFacade menuItemRenovarPoliza;
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

    public void irADocumentos() {
        checkBoxDocumentos.click();
    }

    public void validarOpcionesReimpresionHabilitadas() {
        checkBoxCaratula.isSelected();
        checkBoxCotizacion.isSelected();
        if(checkBoxRelacionConCliente.isCurrentlyVisible()){
            checkBoxRelacionConCliente.isSelected();
        }
        if(checkBoxEndoso.isCurrentlyVisible()){
            checkBoxEndoso.isSelected();
        }
        if(checkBoxEndosomrc.isCurrentlyVisible()){
            checkBoxEndosomrc.isSelected();
        }
    }

    public void editarRenovacionPoliza() {
        menuAccionesPoliza.waitUntilPresent().click();
        menuItemRenovarPoliza.waitUntilPresent().click();
        botonAceptar.waitUntilPresent().click();
        botonSiguienteRenovacion.click();
        botonSiguienteRenovacion.click();
        esperarYClickearBoton(botonEditarRenovacion);
    }
}
