package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SobrescribirTasaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:Add-btnWrap']")
    WebElementFacade btnAgreagarRiesgos;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:_msgs']")
    WebElementFacade lblMensajeBloqueo;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:ToolbarButton-btnInnerEl']")
    WebElementFacade btnCreaAcuerdoFacultativo;
    @FindBy(xpath = ".//*[@id='RIWorksheetPopup:Update-btnInnerEl']")
    WebElementFacade btnAceptarAcuerdoFacultativo;
    @FindBy(xpath = ".//*[@id='button-1005-btnInnerEl']")
    WebElementFacade btnAceptarAcuerdoFacultativoVentanaEmergente;
    @FindBy(xpath = ".//*[@id='messagebox-1001']")
    WebElementFacade checBoxVentanaDeConfirmacion;

    public SobrescribirTasaPage(WebDriver driver) {
        super(driver);
    }


    public void ingresaCantidadDeCoberturas() {
        String riesgosConDireccion = ".//*[@id='RIWorksheetPopup:Worksheet:RIWorksheetsPanelSet:RIWorksheetCV:Add:0:riskbutton']";
        setImplicitTimeout(0, TimeUnit.SECONDS);
        while (btnAgreagarRiesgos.isVisible()) {
            esperarYClickearBoton(btnAgreagarRiesgos);
            esperarYClickearBoton($(riesgosConDireccion));
        }
        resetImplicitTimeout();
    }

    public void clicEnBotonCrearAcuerdosFacultativos() {
        esperarYClickearBoton(btnCreaAcuerdoFacultativo);
    }

    public void clicAceptarAcurdosFacultativos() {
        esperarYClickearBoton(btnAceptarAcuerdoFacultativoVentanaEmergente);
    }

    public void clicAceptarAcurdosFacultativoVolverAtras() {
        esperarYClickearBoton(btnAceptarAcuerdoFacultativo);
    }

    public Boolean validaVentanaDeConfirmacion() {
        boolean confirmacion = false;
        if (checBoxVentanaDeConfirmacion.isVisible()) {
            return true;
        }
        return confirmacion;
    }

    public String mensajeEnPantalla() {
        return lblMensajeBloqueo.getText();
    }

    public String buscaObjetoReasegurado(String tipoContrato) {
        int i = 0;
        List<WebElementFacade> columnaTipoDeReaseguros;
        columnaTipoDeReaseguros = findAll(".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:PerRisksLV:RIAgreementsLV-body']/div/table/tbody/tr/td[3]");
        for (WebElementFacade buscarAcuerdo : columnaTipoDeReaseguros) {
            if (tipoContrato.equals(buscarAcuerdo.getText())) {
                return columnaTipoDeReaseguros.get(i).getText();
            }
            i++;
        }
        return columnaTipoDeReaseguros.get(i-1).getText();
    }

}
