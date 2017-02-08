package com.sura.guidewire.policycenter.pages.reaseguro;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CesionDePrimaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionWizard:JobWizardToolsMenuWizardStepSet:PolicyReinsuranceScreen:PolicyReinsuranceCV:CededPremiumsButton']")
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
    @FindBy(xpath = ".//*[@id='RICededPremiums_AllPopup:__crumb__']")
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

    String numeroDeEnvio = null;

    public CesionDePrimaPage(WebDriver driver) {
        super(driver);
    }

    public void clicEnBotonPrimasCedidas() {
        esperarYClickearBoton(btnVerPrimasCedidas);
    }

    public void irAResumenDePoliza() {
        esperarYClickearBoton(btnPoliza);
    }

    public void ejecutarTareaPrimasCedidas() {
        String nombreTarea = "PremiumCeding";
        btnVerPrimasCedidas.sendKeys(Keys.ALT, Keys.SHIFT, "t");
        buscaEnTablaTareaDeLote(nombreTarea);
        esperarYClickearBoton(btnAcciones);
        esperarYClickearBoton(linkVolverAPolicy);
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

    public void ingresaATodasTransacciones() {
        WebElementFacade tabla = $(".//*[@id='RICededPremiums_AllPopup:RICededPremiums_AllLV-body']/div/table/tbody/tr[1]/td[1]");
        esperarYClickearBoton(linkIngresaATodasTransacciones);
        int ejecuciones = 0;
        int maxIntentos = 4;
        boolean ejecuto = false;
        while (ejecuciones < maxIntentos && !ejecuto) {
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
        MatcherAssert.assertThat("Error: Se esperaba la tabla de contratos", tabla.isVisible());
    }

    public void validarInformacionGeneralDeCobertura(String informacionGeneralCobertura) {
        MatcherAssert.assertThat("No aparece la informacion general de la coberturta", linkInformacionDeDireccionYCobertura.getText().equals(informacionGeneralCobertura));
    }

    public void validarCondicionesDeContratoExcedente() {
        lblVolverAPrimasCedidas.waitUntilPresent();
        setImplicitTimeout(0, TimeUnit.SECONDS);
        MatcherAssert.assertThat("Error: en los contratos excedentes no debe haber % de cesion", !lblPorcentajeDeCesion.isVisible());
        MatcherAssert.assertThat("Error: en los contratos excedentes no debe haber % de cesion", !lblPorcentajeDeRetencion.isVisible());
        resetImplicitTimeout();
        esperarYClickearBoton(lblVolverAPrimasCedidas);
    }
}
