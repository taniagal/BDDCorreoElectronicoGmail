package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class CrearYEditarCumulosPages extends PageUtil{

    @FindBy(xpath = ".//td[@id='SubmissionWizard:Reinsurance']/div/span")
    WebElementFacade btnReaseguro;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV_tb:ReinsuranceWorksheet-btnInnerEl']")
    WebElementFacade btnCrearAcuerdoFacultativo;

   // private static final String BTNREASEGURO = ".//span[contains(.,'Reaseguro')]";
   // private static final String BTNCREAACURDOFACULTATIVO = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV_tb:ReinsuranceWorksheet-btnInnerEl']";


    public CrearYEditarCumulosPages(WebDriver driver){
        super(driver);
    }

    public void ingresarReaseguroOpciones() {
        btnReaseguro.waitUntilPresent();
        btnReaseguro.click();
    }

    public void ingresarAcuerdosFacultativos() {
        btnCrearAcuerdoFacultativo.waitUntilPresent();
        btnCrearAcuerdoFacultativo.click();
    }
}
