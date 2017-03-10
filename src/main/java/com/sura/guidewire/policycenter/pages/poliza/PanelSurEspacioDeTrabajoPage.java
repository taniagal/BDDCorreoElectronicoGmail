package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;


public class PanelSurEspacioDeTrabajoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='southPanel_header']")
    WebElementFacade panelInferiorTitulo;
    @FindBy(xpath = ".//*[@id='southPanel-splitter-collapseEl']")
    WebElementFacade panelInferiorBotonArriba;
    @FindBy(xpath = ".//img[@class='error_icon']")
    WebElementFacade iconoError;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    WebElementFacade panelInferiorBotonBorrar;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    WebElementFacade panelInferiorTablaDeMensajes;

    public PanelSurEspacioDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void abrirPanelInferior() {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(panelInferiorTitulo);
        if (!panelInferiorBotonBorrar.isVisible()) {
            panelInferiorBotonArriba.click();
        }
    }

    public void validarMensajeDireccion(String mensaje) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(panelInferiorTablaDeMensajes);
        verificarMensaje(panelInferiorTablaDeMensajes, mensaje);
    }

    public Integer validarMensajesDePanel(String mensaje){
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
        return contadorMensajesOk;
    }

    public void validarMensajes(String mensaje) {
        String[] mensajes = mensaje.split("\\^");
        Integer numeroMensajes = mensajes.length;
        MatcherAssert.assertThat("Se esperaba que se mostrara mensaje " + mensaje.replace("\\^", " "), validarMensajesDePanel(mensaje).toString(), Is.is(Matchers.equalTo(numeroMensajes.toString())));
    }

    public void validarMensaje(String mensaje) {
        this.validarMensajes(mensaje);
        this.validarIconoMensajeError();
    }

    public void validarIconoMensajeError(){
        MatcherAssert.assertThat(iconoError.isVisible(), Is.is(Matchers.equalTo(true)));
    }

    public void borrarEspacioDeTrabajo() {
        setImplicitTimeout(TIEMPO_5, TimeUnit.SECONDS);
        if (panelInferiorBotonBorrar.isPresent()) {
            clickearElemento(panelInferiorBotonBorrar);
            waitForTextToDisappear("Workspace");
        }
        resetImplicitTimeout();
    }

    public void validarMensajesNoVisibles(String mensajes) {
        Integer numeroDeMensajesEncontrados = 0;
        if(panelInferiorTablaDeMensajes.isVisible()) {
            numeroDeMensajesEncontrados = this.validarMensajesDePanel(mensajes);
        }
        MatcherAssert.assertThat("Se esperaba que NO se mostrara alguno de los mensajes " + mensajes.replace("\\^", " "), numeroDeMensajesEncontrados.toString(), Is.is(Matchers.equalTo("0")));
    }
}