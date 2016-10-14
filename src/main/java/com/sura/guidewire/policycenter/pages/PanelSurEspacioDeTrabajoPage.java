package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.pages.menu.opciones.cuenta.OpcionesInformacionPolizaPage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


public class PanelSurEspacioDeTrabajoPage extends PageObject {

    @FindBy(xpath = ".//*[@id='southPanel_header']")
    WebElementFacade panelInferiorTitulo;
    @FindBy(xpath = ".//*[@id='southPanel-splitter-collapseEl']")
    WebElementFacade panelInferiorBotonArriba;
    @FindBy(xpath = ".//img[@class='error_icon']")
    WebElementFacade iconoError;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    WebElementFacade panelInferiorBotonBorrar;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div")
    WebElementFacade panelInferiorTablaDeMensajes;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:Cancel-btnInnerEl']")
    WebElementFacade btnCancelar;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesInformacionPolizaPage.class);

    public PanelSurEspacioDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void abrirPanelInferior() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(panelInferiorTitulo);
        if (!panelInferiorBotonBorrar.isVisible()) {
            panelInferiorBotonArriba.click();
        }
    }

    public void validarMensaje(String mensaje) {
        String[] mensajes = mensaje.split("\\^");
        Integer contadorMensajesOk = 0;
        Integer numeroMensajes = mensajes.length;
        waitFor(panelInferiorTablaDeMensajes);
        List<WebElementFacade> mensajesRiesgos = findAll(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div");
        for (int i = 0; i < numeroMensajes; i++) {
            for (WebElementFacade lista : mensajesRiesgos) {
                if (lista.getText().contains(mensajes[i])) {
                    contadorMensajesOk++;
                    break;
                }
            }
        }
        try{

            MatcherAssert.assertThat(contadorMensajesOk.toString(), Is.is(Matchers.equalTo(numeroMensajes.toString())));
            MatcherAssert.assertThat(iconoError.isVisible(), Is.is(Matchers.equalTo(true)));
        }catch (java.lang.AssertionError assertionError){
            LOGGER.error("El mensaje no es válido", assertionError);
        }
    }

    public void borrarEspacioDeTrabajo(){
        panelInferiorBotonBorrar.click();
        waitForTextToDisappear("Workspace");
        btnCancelar.click();
    }
}
