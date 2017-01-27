package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class OpcionesDeCierrePage extends PageUtil {
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:CloseOptions-btnInnerEl']")
    private WebElementFacade botonOpcionesDeCierre;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:CloseOptions:Decline-textEl']")
    private WebElementFacade botonDeclinarPoliza;
    @FindBy(xpath = ".//*[@id='DeclineReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl']")
    private WebElementFacade campoCodigoRazonDeclinacion;
    @FindBy(xpath = ".//div[contains(.,'<ninguno>SiniestrosCarteraSin respaldo de reaseguradores o coaseguradoresRiesgo no objetivoNo acuerdo de pago')]")
    private WebElementFacade listaDeclinacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:CloseOptions:NotTakenJob-itemEl']")
    private WebElementFacade botonNoTomar;
    @FindBy(xpath = ".//*[@id='NotTakenReasonPopup:RejectScreen:RejectReasonDV:RejectReason-inputEl']")
    private WebElementFacade campoCodigoRazonNoTomar;
    @FindBy(xpath = ".//div[contains(.,'<ninguno>Precio y condiciones no satisfactoriasSe aseguró en otra compañiaNo acuerdo de pagoNo cumple condiciones de licitación')]")
    private WebElementFacade listaNoTomar;

    public OpcionesDeCierrePage(WebDriver driver) {
        super(driver);
    }

    public void irAOpcionesDeCierre() {
        esperarYClickearBoton(botonOpcionesDeCierre);
    }

    public void declinarTransaccion() {
        esperarYClickearBoton(botonDeclinarPoliza);
        esperarYClickearBoton(campoCodigoRazonDeclinacion);
    }

    public void noTomarPoliza() {
        esperarYClickearBoton(botonNoTomar);
        esperarYClickearBoton(campoCodigoRazonNoTomar);
    }

    /*public String validarItemsDeclinacion() {
        return (listaDeclinacion.getText());
    }*/

    public String validarItems() {
        String listaObtenida = null;
        if(listaDeclinacion.isCurrentlyVisible()){
            listaObtenida = listaDeclinacion.getText();
        }else if(listaNoTomar.isCurrentlyVisible()){
            listaObtenida = listaNoTomar.getText();
        }
        return listaObtenida;
    }
}
