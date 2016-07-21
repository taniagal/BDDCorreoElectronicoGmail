package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.Map;

public class TarifaAutosPage extends Commons{
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade comboBoxOrganizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-inputEl']")
    private WebElementFacade comboBoxCanal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PAPolicyType-inputEl']")
    private WebElementFacade comboBoxTipoPoliza;


    public TarifaAutosPage(WebDriver driver){
        super(driver);
    }

    public void setInformacionDePoliza(ExamplesTable datosPoliza) {
        Map<String, String> dato = datosPoliza.getRow(0);
        selectItem(comboBoxOrganizacion, dato.get("organizacion"));
        waitUntil(2500);
        selectItem(comboBoxCanal, dato.get("canal"));
        waitUntil(2500);
        selectItem(comboBoxTipoPoliza,dato.get("tipo_poliza"));
        waitUntil(2500);
    }


    public void setAsegurados(ExamplesTable datosPoliza) {
    }

    public void setCoberturas(ExamplesTable datosPoliza) {
    }
}
