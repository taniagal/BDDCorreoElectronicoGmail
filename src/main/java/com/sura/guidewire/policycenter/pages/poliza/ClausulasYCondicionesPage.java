package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by juanzaag on 08/02/2017.
 */
public class ClausulasYCondicionesPage extends PageUtil {

    @Page
    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage;

    @FindBy(id = "SubmissionWizard:LOBWizardStepGroup:CPExclusionsAndConditions")
    WebElementFacade lblClausulasYExclusiones;

    private static final String pathInicialExclusionesYClausulas = ".//*[contains(@id,'SubmissionWizard') and contains(.,'";
    private static final String pathFinal = "')]";
    private static final String pathMenuLateral = ".//td[contains(@id,'SubmissionWizard') and contains(.,'";



    public ClausulasYCondicionesPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarALaOpcion(){
        lblClausulasYExclusiones.waitUntilPresent().click();
    }

    public void validarOpciones(ExamplesTable listaopciones,String estadouno,String estadodos) {
              opcionesInformacionPolizaMrcPage.validarCampos(estadouno,estadodos,listaopciones,pathInicialExclusionesYClausulas, pathFinal);
    }

    public void validarOpcionesMenuLateral(ExamplesTable listaopciones,String estado) {
        opcionesInformacionPolizaMrcPage.validarCampos(estado,listaopciones,pathMenuLateral, pathFinal);
    }
}
