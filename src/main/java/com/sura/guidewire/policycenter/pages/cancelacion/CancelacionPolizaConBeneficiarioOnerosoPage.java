package com.sura.guidewire.policycenter.pages.cancelacion;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class CancelacionPolizaConBeneficiarioOnerosoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:WarningOnerousMessageCancellation']")
    WebElementFacade mensajeCancelar;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    WebElementFacade mensajeCancelarCompromiso;


    public CancelacionPolizaConBeneficiarioOnerosoPage(WebDriver driver){
        super(driver);
    }

    public void validarMensajeAdvertenciaCancelacionPoliza(ExamplesTable mensaje){
        verificarMensajes(mensajeCancelar, mensaje);
    }

    public void validarMensajeAdvertenciaCompromisoCancelacion(ExamplesTable mensajeCancelar){
        verificarMensajes(mensajeCancelarCompromiso, mensajeCancelar);
    }
}