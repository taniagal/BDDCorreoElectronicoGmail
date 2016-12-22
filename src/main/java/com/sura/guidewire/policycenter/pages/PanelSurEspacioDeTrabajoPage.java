package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class PanelSurEspacioDeTrabajoPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='southPanel_header']")
    WebElementFacade panelInferiorTitulo;
    @FindBy(xpath = ".//*[@id='southPanel-splitter-collapseEl']")
    WebElementFacade panelInferiorBotonArriba;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    WebElementFacade panelInferiorBotonBorrar;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    WebElementFacade panelInferiorTablaDeMensajes;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:Cancel-btnInnerEl']")
    WebElementFacade btnCancelar;

    public PanelSurEspacioDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void abrirPanelInferior() {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(panelInferiorTitulo);
        if (!panelInferiorBotonBorrar.isVisible()) {
            panelInferiorBotonArriba.click();
        }
    }

    public void validarMensaje(String mensaje) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(panelInferiorTablaDeMensajes);
        verificarMensaje(panelInferiorTablaDeMensajes, mensaje);
    }

    public void borrarEspacioDeTrabajo(){
        panelInferiorBotonBorrar.click();
        waitForTextToDisappear("Workspace");
        btnCancelar.click();
    }
}
