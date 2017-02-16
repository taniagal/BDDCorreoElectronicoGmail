package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class NotasDePolizaPage extends PageUtil{

    @FindBy(xpath = "html/body/div[1]/div[2]/div/span/div/div[4]/div[3]/div/table/tbody/tr[1]/td/div/span")
    private WebElementFacade menuNotas;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:Policy_NotesScreen:NoteSearchDV:DateFrom-inputEl']")
    private WebElementFacade campoFechaDesde;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:Policy_NotesScreen:NoteSearchDV:DateTo-inputEl']")
    private WebElementFacade campoFechaHasta;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:Policy_NotesScreen:NoteSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:Policy_NotesScreen:_msgs']/div")
    private WebElementFacade mensajeBusqueda;

    public NotasDePolizaPage(WebDriver driver){
        super(driver);
    }

    public void irANotasDePoliza() {
        esperarHasta(TIEMPO_3000);
        clickearElemento(menuNotas);
    }

    public void seleccionarRangoDeFechas(ExamplesTable rangoFechas) {
        Map<String, String> fechas = rangoFechas.getRow(0);
        ingresarDato(campoFechaDesde, fechas.get("fechaDesde"));
        ingresarDato(campoFechaHasta, fechas.get("fechaHasta"));
        clickearElemento(botonBuscar);
    }

    public String validarNotasPorRangoDeFecha() {
        return mensajeBusqueda.getText();
    }
}
