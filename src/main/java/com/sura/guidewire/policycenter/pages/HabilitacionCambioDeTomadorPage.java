package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class HabilitacionCambioDeTomadorPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:ChangePrimaryNamedInsuredButton:ChangePrimaryNamedInsuredButtonMenuIcon']/img")
    private WebElementFacade btnCambiarTomador;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:ChangePrimaryNamedInsuredButton:ChangePrimaryNamedInsuredButtonMenuIcon-fieldMenu']")
    private WebElementFacade tablaOpcionesCambiarTomador;
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:ChangePrimaryNamedInsuredButton:PrimaryNamedInsuredABContactAdder']")
    private WebElementFacade btnDelDirectorio;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    private WebElementFacade conboBoxTipoDocumento;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    private WebElementFacade txtTipoDocumento;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath = "//a[contains(.,'Seleccionar')]")
    private WebElementFacade btnSeleccionar;
    @FindBy(xpath = "//div[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div[4]")
    private WebElementFacade labelPeps;
    @FindBy(xpath = "//div[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div")
    private WebElementFacade labelRiesgoConsultable;
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade tablaRequisitosPendientes;


    public HabilitacionCambioDeTomadorPage(WebDriver driver) {
        super(driver);
    }

    public String validarItemsCambiarTomador() {
        btnCambiarTomador.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
        String listaObtenida = null;
        if (tablaOpcionesCambiarTomador.isCurrentlyVisible()) {
            listaObtenida = tablaOpcionesCambiarTomador.getText();
        }
        return listaObtenida;
    }

    public void cambiarTomadorPrincipal(String numeroDocumento, String tipoDocumento) {
        btnCambiarTomador.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
        btnDelDirectorio.click();
        seleccionarItem(conboBoxTipoDocumento, tipoDocumento);
        ingresarDato(txtTipoDocumento, numeroDocumento);
        btnBuscar.click();
        esperarYClickearBoton(btnSeleccionar);
    }

    public void validarMensajes(ExamplesTable mensaje) {
        validarBusqueda(tablaRequisitosPendientes,mensaje);
    }
}
