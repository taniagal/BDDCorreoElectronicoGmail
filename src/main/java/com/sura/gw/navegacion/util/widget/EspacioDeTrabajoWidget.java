package com.sura.gw.navegacion.util.widget;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class EspacioDeTrabajoWidget extends PageObject{

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private String MENSAJES_ESPACIO_DE_TRABAJO = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div";
    private String DESPLEGADOR_ESPACIO_DE_TRABAJO = "//img[contains(@class,'x-tool-img x-tool-expand-top')]";

    public void desplegarEspacioDeTrabajo() {
        try {
            waitForTextToAppear("Workspace");
            $(DESPLEGADOR_ESPACIO_DE_TRABAJO).click();
        } catch (Exception e) {
            LOGGER.info("PROBLEMA DESCONOCIDO " + e.getMessage() );
        }
    }

    public List<String> obtenerMensajesDeTrabajo(){
        List<String> mensajesEspacioDeTrabajo = new ArrayList<>();
        for (WebElementFacade mensaje : findAll(MENSAJES_ESPACIO_DE_TRABAJO)){
            mensajesEspacioDeTrabajo.add(mensaje.getText());
        }
        return mensajesEspacioDeTrabajo;
    }

}
