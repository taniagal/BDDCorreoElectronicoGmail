package com.sura.guidewire.policycenter.pages.modificaciones;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LeyendaAdicionalMrcPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:LocationName']")
    private WebElementFacade botonLeyendaAdicionalSubmission;
    @FindBy(xpath = "//a[contains(@id,'PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:LocationName')]")
    private WebElementFacade botonLeyendaAdicionalModificacion;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:AdditionalLegend-inputEl']")
    private WebElementFacade txtLeyendaAdicional;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:LocationDetailDV:LocationDetailInputSet:AdditionalLegend-inputEl']")
    private WebElementFacade txtLeyendaAdicionalModificacion;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='CPLocationPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptarModificacion;
    @FindBy(xpath = "//span[contains(.,'Aceptar')]")
    private WebElementFacade botonAceptarIngresoLeyendaAdicional;

    public LeyendaAdicionalMrcPage(WebDriver driver) {
        super(driver);
    }

    public void agregarLeyendaAdicional(String leyendaAdicional) {
        if (botonLeyendaAdicionalSubmission.isPresent()) {
            botonLeyendaAdicionalSubmission.click();
            withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(txtLeyendaAdicional).shouldBePresent();
            ingresarDato(txtLeyendaAdicional, leyendaAdicional);
            esperarYClickearBoton(botonAceptar);
        } else {
            if (botonLeyendaAdicionalModificacion.isPresent()) {
                txtLeyendaAdicionalModificacion.clear();
                ingresarDato(txtLeyendaAdicionalModificacion, leyendaAdicional);
                esperarYClickearBoton(botonAceptarModificacion);
            }
        }
    }

    public void agregarLeyendaModificacion(String leyendaAdicional) {
        esperarYClickearBoton(botonLeyendaAdicionalModificacion);
        txtLeyendaAdicionalModificacion.clear();
        ingresarDato(txtLeyendaAdicionalModificacion, leyendaAdicional);
        esperarYClickearBoton(botonAceptarModificacion);
    }

    public void clickearBotonAceptar() {
        esperarYClickearBoton(botonAceptarIngresoLeyendaAdicional);
    }
}
