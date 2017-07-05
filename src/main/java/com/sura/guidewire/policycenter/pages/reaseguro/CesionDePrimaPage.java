package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CesionDePrimaPage extends PageUtil {

    @FindBy(xpath = ".//*[contains(@id,'PolicyReinsuranceCV:CededPremiumsButton')]")
    WebElementFacade btnVerPrimasCedidas;
    @FindBy(xpath = ".//*[@id='TabBar:PolicyTab-btnInnerEl']")
    private WebElementFacade btnPoliza;
    @FindBy(xpath = ".//*[@id='RICededPremiumsPopup:0:AllTransactions']")
    private WebElementFacade linkIngresaATodasTransacciones;
    @FindBy(xpath = ".//*[@id='BatchProcessInfo:BatchProcessScreen:ttlBar']")
    private WebElementFacade lblInformacionPorLotes;
    @FindBy(xpath = ".//*[@id='ServerTools:InternalToolsMenuActions-btnInnerEl']")
    private WebElementFacade btnAcciones;
    @FindBy(xpath = ".//*[@id='ServerTools:InternalToolsMenuActions:ReturnToApp-textEl']")
    private WebElementFacade linkVolverAPolicy;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl']")
    private WebElementFacade lblNumeroCotizacion;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    private WebElementFacade linkVerExpedicion;
    @FindBy(xpath = ".//*[contains(@id,'Popup:__crumb__')]")
    private WebElementFacade linkVolverAPrimasCedidas;
    @FindBy(xpath = ".//*[@id='RICededPremiumsPopup:0:0']")
    private WebElementFacade linkInformacionDeDireccionYCobertura;
    @FindBy(xpath = ".//*[@id='RICededPremiums_AllPopup:RICededPremiums_AllLV:0:DetailReinsurer']")
    private WebElementFacade linkVerDetallePorReaseguradoraContratoExcedente;
    @FindBy(xpath = ".//*[@id='RICededPremiums_AllPopup:RICededPremiums_AllLV:1:DetailReinsurer']")
    private WebElementFacade linkVerDetallePorReaseguradoraContratoCuotaparte;
    @FindBy(xpath = ".//*[@id='RICededPremiumReinsurersPopup:CededShare-inputEl']")
    private WebElementFacade lblPorcentajeDeCesion;
    @FindBy(xpath = ".//*[@id='RICededPremiumReinsurersPopup:ReteinedShare-inputEl']")
    private WebElementFacade lblPorcentajeDeRetencion;
    @FindBy(xpath = ".//*[@id='RICededPremiumReinsurersPopup:__crumb__']")
    private WebElementFacade lblVolverAPrimasCedidas;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewJob-inputEl']")
    private WebElementFacade linkCotizacionExpedida;
    @FindBy(xpath = ".//*[@id='RICededPremiums_ConsolidatedCededPremiumPopup:0']")
    private WebElementFacade labelNombreRiesgo;

    String numeroDeEnvio = null;
    int control = CONSTANTE_1;
    private static final String ESTADO_SHIFT = "SHIFT";
    private static final int DIEZ = 10;
    private static final int CANTIDAD_TIPO_CONTRATO = 3;
    private static final String BANDERA_MODIFICACION = "MODIFICACION POLIZA";
    private static final String BANDERA_CANCELACION = "CANCELACION POLIZA";
    private static final String BANDERA_REHABILITACION = "REHABILITACION POLIZA";
    public static final String XPATH_TABLA_PRIMAS_CEDIDAS_TR = ".//*[@id='RICededPremiums_ConsolidatedCededPremiumPopup:RICededPremiums_ConsolidatedCededPremiumLV-body']/div/table/tbody/tr";

    public CesionDePrimaPage(WebDriver driver) {
        super(driver);
    }

    public void clicEnBotonPrimasCedidas() {
        esperarObjetoClikeableServidorWe(btnVerPrimasCedidas);
    }

    public void irAResumenDePoliza() {
        esperarYClickearBoton(btnPoliza);
    }

    public void ejecutarTareaPrimasCedidas(String nombreTarea, String estado) {
        if (estado.equals(ESTADO_SHIFT)) {
            btnVerPrimasCedidas.sendKeys(Keys.SHIFT, Keys.ALT, "t");
        }else{
            btnVerPrimasCedidas.sendKeys(Keys.CONTROL, Keys.ALT, "t");
        }
        buscaEnTablaTareaDeLote(nombreTarea);
        esperarHasta(TIEMPO_5000);
        esperarYClickearBoton(btnAcciones);
        esperarHasta(TIEMPO_1000);
        esperarYClickearBoton(linkVolverAPolicy);
        esperarHasta(TIEMPO_500);
    }

    public String tomaNumeroDeEnvio() {
        esperarYClickearBoton(linkVerExpedicion);
        numeroDeEnvio = lblNumeroCotizacion.getText();
        return numeroDeEnvio;
    }

    public void ingresaADetalleDeContratoExcedente() {
        esperarYClickearBoton(linkVerDetallePorReaseguradoraContratoExcedente);
    }

    public void validaReaseguroYDistribucionEnTabla() {
        esperarYClickearBoton(linkVerDetallePorReaseguradoraContratoCuotaparte);
        MatcherAssert.assertThat("Error: El valor total no es igual que la cesion del contrato", sumaPorcentajeParticipacionEnTablaDePrimas().equals(Double.parseDouble(lblPorcentajeDeCesion.getText())));
    }

    public Double sumaPorcentajeParticipacionEnTablaDePrimas() {
        Double valorTotal = 0d;
        if (!getListaInformacionPorReasegurador().isEmpty()) {
            for (WebElementFacade nombreDeTarea : getListaInformacionPorReasegurador()) {
                try {
                    valorTotal += Double.parseDouble(nombreDeTarea.getText().replaceAll(",", "\\."));
                } catch (NumberFormatException ex) {
                    LOGGER.info("NumberFormatException, se esperaba un numero" + ex);
                }
            }
        }
        return (double) Math.round(valorTotal);
    }

    private List<WebElementFacade> getListaInformacionPorReasegurador() {
        List<WebElementFacade> porcentajeParticipacion;
        porcentajeParticipacion = withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).findAll(".//*[@id='RICededPremiumReinsurersPopup:ParticipantsCededPremiumLV-body']/div/table/tbody/tr/td[4]");
        return porcentajeParticipacion;
    }

    public void buscaEnTablaTareaDeLote(String nombreTarea) {
        int i = 0;
        String xpathTareaInicio = ".//*[@id='BatchProcessInfo:BatchProcessScreen:BatchProcessesLV:";
        String xpathTareaFinal = ":RunBatchWithoutNotify']";
        if (!getListaNombreProcesoPorLotes().isEmpty()) {
            for (WebElementFacade nombreDeTarea : getListaNombreProcesoPorLotes()) {
                if (nombreTarea.equals(nombreDeTarea.getText())) {
                    WebElementFacade ejecutarAccionTarea = $(xpathTareaInicio + i + xpathTareaFinal);
                    ejecutarAccionTarea.click();
                    break;
                }
                i++;
            }
        }
    }

    private List<WebElementFacade> getListaNombreProcesoPorLotes() {
        List<WebElementFacade> numerosCotizacion;
        numerosCotizacion = withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).findAll(".//*[@id='BatchProcessInfo:BatchProcessScreen:BatchProcessesLV-body']/div/table/tbody/tr/td[1]");
        return numerosCotizacion;
    }

    public void ingresaATodasTransacciones(String procesoPoliza) {
        WebElementFacade tabla;
        if (BANDERA_MODIFICACION.equals(procesoPoliza)) {
            tabla = $(".//*[@id='RICededPremiums_AllPopup:RICededPremiums_AllLV-body']/div/table/tbody/tr[12]/td[1]");
        } else if (BANDERA_CANCELACION.equals(procesoPoliza)){
            tabla = $(".//*[@id='RICededPremiums_AllPopup:RICededPremiums_AllLV-body']/div/table/tbody/tr[24]/td[1]");
        } else if (BANDERA_REHABILITACION.equals(procesoPoliza)){
            tabla = $(".//*[@id='RICededPremiums_AllPopup:RICededPremiums_AllLV-body']/div/table/tbody/tr[36]/td[1]");
        } else {
            tabla = $(".//*[@id='RICededPremiums_AllPopup:RICededPremiums_AllLV-body']/div/table/tbody/tr[1]/td[1]");
        }
        esperarYClickearBoton(linkIngresaATodasTransacciones);
        int ejecuciones = 0;
        int maxIntentos = DIEZ;
        boolean ejecuto = false;
        while (ejecuciones < maxIntentos && !ejecuto) {
            setImplicitTimeout(TIEMPO_7, TimeUnit.SECONDS);
            if (tabla.isVisible()) {
                ejecuto = true;
            } else {
                try {
                    esperarYClickearBoton(linkVolverAPrimasCedidas);
                    esperarYClickearBoton(linkIngresaATodasTransacciones);
                } catch (Exception ex) {
                    LOGGER.info("Exception " + ex);
                }
                ejecuciones = ejecuciones + 1;
            }
        }
        resetImplicitTimeout();
        MatcherAssert.assertThat("Error: Se esperaba la tabla de contratos", tabla.isVisible());
    }

    public void verConsolidadoPrimasCedidas() {
        esperarYClickearBoton(linkVolverAPrimasCedidas);
    }

    public void verificarPrimasCedidas(ExamplesTable datos, String bandera) {
        for (int z = 0; z < datos.getRowCount()/CANTIDAD_TIPO_CONTRATO;z++) {
            WebElementFacade linkVerConsolidadoDePrimasCedidas = $(".//*[@id='RICededPremiumsPopup:" + z + ":ConsolidatedCededPremium']");
            linkVerConsolidadoDePrimasCedidas.waitUntilPresent().click();
            esperarHasta(TIEMPO_2000);
            verificarPrimaBrutaCedida(datos, bandera);
            linkVolverAPrimasCedidas.click();
        }
    }

    public void verificarPrimaBrutaCedida(ExamplesTable datos, String bandera) {
        List<WebElementFacade> tablaPrimaCedida = findAll(XPATH_TABLA_PRIMAS_CEDIDAS_TR);
        if (BANDERA_MODIFICACION.equals(bandera)) {
            control = CONSTANTE_4;
        } else if (BANDERA_CANCELACION.equals(bandera)) {
            control = CONSTANTE_7;
        } else if (BANDERA_REHABILITACION.equals(bandera)) {
            control = CONSTANTE_10;
        }
        for (Map<String, String> dato : datos.getRows()) {
            if (labelNombreRiesgo.containsText(dato.get("riesgo"))) {
                for (int j = control; j <= tablaPrimaCedida.size(); j++) {
                    WebElementFacade tipoContrato = $(XPATH_TABLA_PRIMAS_CEDIDAS_TR + "[" + j + "]/td[4]");
                    if (tipoContrato.containsText(dato.get("tipoContrato"))) {
                        WebElementFacade primaCedida = $(XPATH_TABLA_PRIMAS_CEDIDAS_TR + "[" + j + "]/td[5]");
                        MatcherAssert.assertThat("Error en el valor de la prima bruta cedida para el contrato: " + tipoContrato.getText() +
                                " . Expected: " + dato.get("primaBrutaCedida") +
                                " but was: " + primaCedida.getText(), primaCedida.getText().equals(dato.get("primaBrutaCedida")));
                        break;
                    }
                }
            }
        }
    }

    public void validarInformacionGeneralDeCobertura(String informacionGeneralCobertura) {
        MatcherAssert.assertThat("No aparece la informacion general de la coberturta", linkInformacionDeDireccionYCobertura.getText().contains(informacionGeneralCobertura));
    }

    public void validarCondicionesDeContratoExcedente() {
        lblVolverAPrimasCedidas.waitUntilPresent();
        setImplicitTimeout(0, TimeUnit.SECONDS);
        MatcherAssert.assertThat("Error: en los contratos excedentes no debe haber % de cesion", !lblPorcentajeDeCesion.isVisible());
        MatcherAssert.assertThat("Error: en los contratos excedentes no debe haber % de cesion", !lblPorcentajeDeRetencion.isVisible());
        resetImplicitTimeout();
        esperarYClickearBoton(lblVolverAPrimasCedidas);
    }

    public void ingresaAPolizaExpedida() {
        esperarYClickearBoton(linkCotizacionExpedida);
    }
}
