package com.sura.gw.policy.poliza.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.LoggerFactory;

public class InformacionPolizaPage extends PageObject {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    public enum Opcion {
        LINK_EDIFICIOS_Y_UBICACIONES(".//*[@id='SubmissionWizard:LOBWizardStepGroup:CPBuildings']/div"),
        ENVIO(".//*[@id='SubmissionWizard:0_header_hd-textEl']");
        private String opcion;

        Opcion(String opcion) {
            this.opcion = opcion;
        }

        public String xpath() {
            return opcion;
        }
    }

    public enum Boton {
        EDITAR_TRANSACCION_DE_POLIZA("//a[contains(@id,'SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:EditPolicy')]");
        private String boton;

        Boton(String boton) {
            this.boton = boton;
        }

        public String xpath() {
            return boton;
        }
    }

    public void editarTransaccion() {
        LOGGER.info("InformacionPolizaPage.editarTransaccion");
        WebElementFacade btnEditarTransaccion = null;
        String BTN_ACEPTAR_CONFIRMACION = ".//span[contains(@id,'button') and contains(@id,'btnInnerEl')]";

        try {
            btnEditarTransaccion = findBy(Boton.EDITAR_TRANSACCION_DE_POLIZA.xpath()).waitUntilVisible();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION DE POLIZA NO VISUALIZADO : " + e.getMessage());
        }

        if (btnEditarTransaccion != null) {
            btnEditarTransaccion.waitUntilClickable().click();
            findBy(BTN_ACEPTAR_CONFIRMACION).waitUntilClickable().click();
            waitForTextToAppear("Revisión de póliza");
        }

    }

    public void seleccionarOpcionEdificiosyUbicaciones() {
        LOGGER.info("InformacionPolizaPage.seleccionarOpcionEdificiosyUbicaciones");
        try {
            WebElementFacade opcionEdificiosyUbicaciones = findBy(Opcion.LINK_EDIFICIOS_Y_UBICACIONES.xpath()).waitUntilVisible();
            shouldBeVisible(opcionEdificiosyUbicaciones);
            opcionEdificiosyUbicaciones.waitUntilClickable().click();

            String tituloDePaginaContactos = "Edificios y ubicaciones";
            waitForTextToAppear(tituloDePaginaContactos);
            shouldContainText(tituloDePaginaContactos);
        } catch (Exception e){
            LOGGER.info("PROBLEMA DESCONOCIDO " + e.getMessage());
        }

    }

    public String obtenerEnvio() {
        LOGGER.info("InformacionPolizaPage.obtenerEnvio");
        WebElementFacade envio = findBy(Opcion.ENVIO.xpath()).waitUntilVisible();
        shouldBeVisible(envio);
        return envio.getText();
    }

}
