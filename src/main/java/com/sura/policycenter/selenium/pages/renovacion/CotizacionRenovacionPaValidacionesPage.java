package com.sura.policycenter.selenium.pages.renovacion;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CotizacionRenovacionPaValidacionesPage extends Commons{

    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade grupoMensajesRC;

    public CotizacionRenovacionPaValidacionesPage (WebDriver driver){
        super(driver);
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
        Boolean validacion = validarMensajeRC(mensajeRC);
        MatcherAssert.assertThat(validacion, Matchers.is(Matchers.equalTo(true)));
    }

    public Boolean validarMensajeRC(ExamplesTable ListaMensajesRC) {
        Map<String, String> mensajesRC;
        Boolean validacionMensajes = false;
        for (int i = 0; i < ListaMensajesRC.getRowCount(); i++) {
            mensajesRC = ListaMensajesRC.getRows().get(i);
            if(grupoMensajesRC.getText().contains((mensajesRC.get("mensaje")))){
                validacionMensajes = true;
            }else {
                validacionMensajes = false;
            }
        }
        return validacionMensajes;
    }
}