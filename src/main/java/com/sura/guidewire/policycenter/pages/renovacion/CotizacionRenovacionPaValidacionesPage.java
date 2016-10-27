package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CotizacionRenovacionPaValidacionesPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade grupoMensajesRC;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    private WebElementFacade borraMensajeEspacioTrabajo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:_msgs']")
    private WebElementFacade lblMensaje;


    public CotizacionRenovacionPaValidacionesPage (WebDriver driver){
        super(driver);
    }


    public void irAPantallairARevisionDePolizaSinValidacionFecha() {
        String xpathItemRevisionPoliza = ".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyReview']/div";
        WebElementFacade itemRevisionPoliza = withTimeoutOf(1, TimeUnit.SECONDS).find(By.xpath(xpathItemRevisionPoliza));
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(itemRevisionPoliza).click();
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(lblMensaje).waitUntilVisible();
        itemRevisionPoliza.click();
    }

    public void irARevisionDePoliza() {
        String xpathItemRevisionPoliza = ".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyReview']/div";
        WebElementFacade itemRevisionPoliza = withTimeoutOf(1, TimeUnit.SECONDS).find(By.xpath(xpathItemRevisionPoliza));
        itemRevisionPoliza.click();
    }

    public void cotizarRenovacion() {
        String xpathBotonCotizar = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_DifferencesScreen:JobWizardToolbarButtonSet:RenewalQuote-btnInnerEl']";
        WebElementFacade botonCotizarRenovacion = withTimeoutOf(1, TimeUnit.SECONDS).find(By.xpath(xpathBotonCotizar));
        botonCotizarRenovacion.click();
    }

    public void validarBloqueoYMensajeRC(ExamplesTable mensajeRC) {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(grupoMensajesRC).shouldBeVisible();
        boolean validacion = false;
        validacion = validarMensajeRC(mensajeRC);
        MatcherAssert.assertThat(validacion, Matchers.is(Matchers.equalTo(true)));
    }

    public boolean validarMensajeRC(ExamplesTable listaMensajesRC) {
        Map<String, String> mensajesRC;
        boolean validacionMensajes = false;
        for (int i = 0; i < listaMensajesRC.getRowCount(); i++) {
            mensajesRC = listaMensajesRC.getRows().get(i);
            if(grupoMensajesRC.getText().contains(mensajesRC.get("mensaje"))){
                validacionMensajes = true;
            }else {
                validacionMensajes = false;
            }
        }
        return validacionMensajes;
    }

    public void limpiarMensajes (){
        withTimeoutOf(30,TimeUnit.SECONDS).waitFor(borraMensajeEspacioTrabajo).click();
    }

}