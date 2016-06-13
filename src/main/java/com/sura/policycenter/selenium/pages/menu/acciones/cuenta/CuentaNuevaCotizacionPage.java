package com.sura.policycenter.selenium.pages.menu.acciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;


public class CuentaNuevaCotizacionPage extends Guidewire {

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    WebElementFacade ListNomAgente;

    @FindBy (xpath = ".//*[@id='CPBuildingPopup:DetailsDV:CoverageForm-inputEl']")
    WebElementFacade lstFormCobertura;

    @FindBy(xpath = ".//*[@id='infoBar-innerCt']")
    WebElementFacade panel;

    @FindBy (xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:SelectProducts']")
    WebElementFacade panelOfrecidos;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:ttlBar']")
    WebElementFacade panelUbicaciones;

    @FindBy (xpath = ".//*[@id='CPBuildingPopup:ttlBar']")
    WebElementFacade panelEdificioNuevo;

    @FindBy (xpath = ".//*[@id='CPBuildingPopup:CPBldgSuggestedCovDV:bldgAndPropIterator:0:CoverageInputSet:CovPatternInputGroup-body']")
    WebElementFacade panelCoberturas;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguinete;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddBuilding']")
    WebElementFacade btnAgregaEdicio;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddBuilding:AddNewBuilding-textEl']")
    WebElementFacade btnEdfNuevo;

    @FindBy (xpath = ".//*[@id='CPBuildingPopup:BuildingCoveragesTab-btnIconEl']")
    WebElementFacade btnCobertura;

    @FindBy (xpath = ".//*[@id='CPBuildingPopup:Update-btnInnerEl']")
    WebElementFacade btnAceptaEdificioNuevo;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
    WebElementFacade btnFinalCotizacion;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:ActionsMenuIcon']")
    WebElementFacade lstEdificioAccion;

    @FindBy (xpath = ".//*[@id='CPBuildingPopup:DetailsDV:ClassCode-inputEl']")
    WebElementFacade lblCodClasePropi;

    private final Actions act = new Actions(getDriver());

    public CuentaNuevaCotizacionPage(WebDriver driver) {
        super(driver);
    }

    public void listaNombreAgente() {
        ListNomAgente.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
    }

    private List<WebElementFacade> getListaDescripcion() {
        List<WebElementFacade> DescripcionProductos;
        DescripcionProductos = withTimeoutOf(1, SECONDS).findAll(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr/td[2]");
        return DescripcionProductos;
    }

    private List<WebElementFacade> getListaBotones() {
        List<WebElementFacade> DescripcionProductos;
        DescripcionProductos = withTimeoutOf(1, SECONDS).findAll(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr/td[1]");
        return DescripcionProductos;
    }

    public void cuentaComercial(String nomProducto) {
        int i = 0;
        listaNombreAgente();
        waitFor(panelOfrecidos).waitUntilVisible();
        if (!getListaDescripcion().isEmpty()) {
            for (WebElementFacade descripcion : getListaDescripcion()) {
                if (nomProducto.equals(descripcion.getText())) {
                    getListaBotones().get(i).click();
                }
                i++;
            }
        }
    }

    public void creaCotizacion() {
        waitFor(panel).shouldBePresent();
        btnSiguinete.click();
        waitFor(panelUbicaciones).shouldBePresent();
        lstEdificioAccion.click();
        waitFor(btnAgregaEdicio).waitUntilVisible();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitFor(btnEdfNuevo).waitUntilVisible();
        act.sendKeys(Keys.ENTER).build().perform();
        waitFor(panelEdificioNuevo).shouldBeVisible();
    }

    public void CreaEdificioNuevoDetalle (){
        lblCodClasePropi.type("0001");
        lstFormCobertura.clear();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
        btnCobertura.click();
        waitFor(panelCoberturas).shouldBeVisible();
        btnAceptaEdificioNuevo.click();
        waitFor(panelUbicaciones).shouldBeVisible();
        btnFinalCotizacion.click();
    }

}
