package com.sura.guidewire.policycenter.util.navegacion.util.widget;

import java.util.ArrayList;
import java.util.List;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.LoggerFactory;


public class EspacioDeTrabajoWidget extends PageObject{

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private static final String MENSAJESESPACIODETRABAJO = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div";
    private static final String DESPLEGADORESPACIODETRABAJO = "//img[contains(@class,'x-tool-img x-tool-expand-top')]";

    public void desplegarEspacioDeTrabajo() {
        try {
            waitForTextToAppear("Workspace");
            $(DESPLEGADORESPACIODETRABAJO).click();
        } catch (Exception e) {
            LOGGER.info("PROBLEMA DESCONOCIDO TRACE" + e );
        }
    }

    public List<String> obtenerMensajesDeTrabajo(){
        List<String> mensajesEspacioDeTrabajo = new ArrayList<>();
        for (WebElementFacade mensaje : findAll(MENSAJESESPACIODETRABAJO)){
            mensajesEspacioDeTrabajo.add(mensaje.getText());
        }
        return mensajesEspacioDeTrabajo;
    }

}
