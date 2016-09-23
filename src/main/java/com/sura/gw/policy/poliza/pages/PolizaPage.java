package com.sura.gw.policy.poliza.pages;

import com.sura.gw.inicio.guidewire.GuidewirePage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class PolizaPage extends GuidewirePage {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);



    public enum Opcion {
        LINK_EDIFICIOS_Y_UBICACIONES(".//*[@id='SubmissionWizard:LOBWizardStepGroup:CPBuildings']/div"),
        LINK_INFORMACION_DE_LA_POLIZA(".//*[@id='PolicyFile:PolicyFileAcceleratedMenuActions:PolicyMenuItemSet:PolicyMenuItemSet_PolicyInfo']/div"),
        ENVIO(".//*[contains(@id,'SubmissionWizard') and contains(@id,'_header_hd-textEl')]");
        private String elemento;

        Opcion(String opcion) {
            this.elemento = opcion;
        }

        public String xpath() {
            return elemento;
        }
    }

    public enum Boton {
        EDITAR_TRANSACCION_DE_POLIZA("//a[contains(@id,'SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:EditPolicy')]");
        private String botonXP;

        Boton(String boton) {
            this.botonXP = boton;
        }

        public String xpath() {
            return botonXP;
        }
    }

    public enum InformacionDeLaPolizaWidget {
        DIV_FECHA_INICIO_VIGENCIA(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']"),
        DIV_FECHA_DE_EXPEDICION(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-inputEl']"),
        DIV_TIPO_LICITACION(".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:PolicyChangeWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:TypeTender-inputEl']"),
        LINK_AGREGAR_COASEGURO(".//a[contains(.,'Agregar coaseguro')]"),
        LINK_AGREGAR_TOMADOR(".//a[contains(.,'Agregar') and contains(@id,'AddContactsButton')]"),
        TD_DIV_REASEGURO_ACEPTADO(".//td[contains(@id,'reaseguroAceptado-bodyEl') and (descendant::*[contains(., 'No')])]"),
        DIV_REASEGURO_ESPECIAL(".//div[contains(@id,'reaseguroEspecial-containerEl')]/table/tbody/tr/td"),
        TD_FECHA_FIN_VIGENCIA(".//td[contains(@id,'ExpirationDate-bodyEl')]");

        private String elemento;

        InformacionDeLaPolizaWidget(String elemento) {
            this.elemento = elemento;
        }

        public String xpath() {
            return elemento;
        }
    }

    public void seleccionarBotonSiguienteEnInicioDeCambioDePoliza() {
        waitFor(20).seconds();
        waitForTextToAppear("Iniciar cambios en póliza");
        String btnSiguienteCambioPoliza = ".//*[@id='StartPolicyChange:StartPolicyChangeScreen:NewPolicyChange-btnInnerEl']";
        findBy(btnSiguienteCambioPoliza).waitUntilVisible().waitUntilClickable().click();
    }




    public void editarTransaccion() {
        LOGGER.info("PolizaPage.editarTransaccion");
        WebElementFacade btnEditarTransaccion = null;
        String xpatBtnAceptarConfirmacion = ".//span[contains(@id,'button') and contains(@id,'btnInnerEl')]";

        setImplicitTimeout(1, TimeUnit.SECONDS);
        try {
            btnEditarTransaccion = findBy(Boton.EDITAR_TRANSACCION_DE_POLIZA.xpath()).waitUntilVisible();
        } catch (Exception e) {
            LOGGER.info("BOTON EDITAR TRANSACCION DE POLIZA NO VISUALIZADO : " + e);
        }
        resetImplicitTimeout();

        if (btnEditarTransaccion != null) {
            btnEditarTransaccion.waitUntilClickable().click();
            findBy(xpatBtnAceptarConfirmacion).waitUntilClickable().click();
            waitForTextToAppear("Revisión de póliza");
            shouldContainText("Revisión de póliza");
        }

    }

    public void seleccionarOpcionEdificiosyUbicaciones() {
        seleccionarOpcion(Opcion.LINK_EDIFICIOS_Y_UBICACIONES.xpath(), "Edificios y ubicaciones");
        LOGGER.info("PolizaPage.seleccionarOpcionEdificiosyUbicaciones");
    }

    public void seleccionarOpcionInformacionDeLaPoliza() {
        seleccionarOpcion(Opcion.LINK_INFORMACION_DE_LA_POLIZA.xpath(), "Información de póliza");
        LOGGER.info("PolizaPage.seleccionarOpcionInformacionDeLaPoliza");
    }

    public void seleccionarOpcion(String xpath, String tituloPaginaEsperada) {

        try {
            WebElementFacade opcion = findBy(xpath).waitUntilVisible();
            shouldBeVisible(opcion);
            opcion.waitUntilClickable().click();

            waitForTextToAppear(tituloPaginaEsperada);
            shouldContainText(tituloPaginaEsperada);
        } catch (Exception e) {
            LOGGER.info("SE SELECCIONÓ UN ELEMENTO NO CLICLEABLE (EJ. DIV) " + e);
        }

        LOGGER.info("PolizaPage.seleccionarOpcion");

    }

    public String obtenerEnvio() {
        LOGGER.info("InformacionPolizaPage.obtenerEnvio");
        WebElementFacade envio = findBy(Opcion.ENVIO.xpath()).waitUntilVisible();
        shouldBeVisible(envio);
        return envio.getText();
    }

    public Boolean esEditableElemento(String nombreElemento) {
        WebElementFacade elemento = null;
        Boolean esEditableElemento = false;

        try {
            switch (nombreElemento) {
                case "Reaseguro aceptado":
                    elemento = find(By.xpath(InformacionDeLaPolizaWidget.TD_DIV_REASEGURO_ACEPTADO.xpath()));
                    break;
                case "Boton agregar tomadores adicionales":
                    esEditableElemento = findBy(InformacionDeLaPolizaWidget.LINK_AGREGAR_TOMADOR.xpath()).isCurrentlyVisible();
                    break;
                case "Fecha de inicio de vigencia":
                    elemento = findBy(InformacionDeLaPolizaWidget.DIV_FECHA_INICIO_VIGENCIA.xpath());
                    esEditableElemento = elemento.findElement(By.tagName("input")).isEnabled();
                    break;
                case "Fecha de expedicion":
                    elemento = findBy(InformacionDeLaPolizaWidget.DIV_FECHA_DE_EXPEDICION.xpath());
                    esEditableElemento = elemento.findElement(By.tagName("input")).isEnabled();
                    break;
                case "Tipo de licitacion":
                    elemento = findBy(InformacionDeLaPolizaWidget.DIV_TIPO_LICITACION.xpath());
                    esEditableElemento = elemento.findElement(By.tagName("input")).isEnabled();
                    break;
                case "Agregar coaseguro":
                    esEditableElemento = findBy(InformacionDeLaPolizaWidget.LINK_AGREGAR_COASEGURO.xpath()).isEnabled();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {

            if (elemento != null) {
                esEditableElemento = false;
            }

            LOGGER.info("NO SE ENCONTRO ELEMENTO > " + e);
        }


        LOGGER.info("PolizaPage.esEditableElemento");
        return esEditableElemento;
    }




}
