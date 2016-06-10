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

    @FindBy(xpath = ".//*[@id='infoBar-innerCt']")
    WebElementFacade panel;

    @FindBy (xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:SelectProducts']")
    WebElementFacade panelOfrecidos;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguinete;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddBuilding']")
    WebElementFacade btnAgregaEdicio;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddBuilding:AddNewBuilding-textEl']")
    WebElementFacade btnEdfNuevo;

    @FindBy (xpath = ".//*[@id='CPBuildingPopup:DetailsDV:ClassCode:SelectClassCode']")
    WebElementFacade btnBusca;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:ActionsMenuIcon']")
    WebElementFacade lstEdificioAccion;



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
        waitFor(panel).shouldBePresent();
        lstEdificioAccion.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
    }

    public void edificioNuevo (){

    }
}
