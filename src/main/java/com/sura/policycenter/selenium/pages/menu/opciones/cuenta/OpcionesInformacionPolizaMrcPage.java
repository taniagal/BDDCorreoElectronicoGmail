package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

public class OpcionesInformacionPolizaMrcPage extends Guidewire {

    @FindBy (xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    WebElementFacade txtNomAgente;

    @FindBy (xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:ttlBar']")
    WebElementFacade lblInformaPoliza;

    @FindBy (xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ttlBar']")
    WebElementFacade lblNuevaCotizacion;

    @FindBy (xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']")
    WebElementFacade lblTabla;







    public OpcionesInformacionPolizaMrcPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(getDriver());

    public void ingresaAgente (){
        waitInfoPoliza(lblNuevaCotizacion);
        txtNomAgente.clear();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        waitInfoPoliza(lblTabla);
    }
    public void  seleccionarProducto(String nomProducto) {
        int i = 0;
        if (!getListaDescripcion().isEmpty()) {
            for (WebElementFacade descripcion : getListaDescripcion()) {
                if (nomProducto.equals(descripcion.getText())) {
                    getListaBotones().get(i).click();
                }
                i++;
            }
        }
    }

    private List<WebElementFacade> getListaBotones() {
        List<WebElementFacade> botones = withTimeoutOf(10, TimeUnit.SECONDS).findAll(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr/td[1]");
        return botones;
    }

    private List<WebElementFacade> getListaDescripcion() {
        List<WebElementFacade> DescripcionProductos = withTimeoutOf(10,TimeUnit.SECONDS).findAll(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr/td[2]");
        return DescripcionProductos;
    }

    // TODO: 30/06/2016 Metodo wait para implementar generico
    public void waitInfoPoliza (WebElementFacade webElementFacade){
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(webElementFacade).shouldBePresent();
    }

}
