package com.sura.guidewire.policycenter.pages;


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
        verificarMensaje(panelInferiorTablaDeMensajes, mensaje);
    }

    public void borrarEspacioDeTrabajo(){
        panelInferiorBotonBorrar.click();
        waitForTextToDisappear("Workspace");
        btnCancelar.click();
    }
}
