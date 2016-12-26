package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class AnalisisDeRiesgosPage extends PageUtil {
    @FindBy(xpath = ".//*[contains(@id,'Job_RiskAnalysisScreen') and contains(@id,'RiskAnalysisCV_tb:LockForReview-btnInnerEl')]")
    private WebElementFacade botonBloqueo;
    @FindBy(xpath = ".//a[contains(.,'Borrar')]")
    private WebElementFacade botonBorrar;
    private int numeroDeRiesgos;
    private static String xPathSolicitarAprobacion = ".//*[contains(@id,'Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet') and contains(@id,'UWIssueRowSet:RequestApproval')]";
    private final static String LABRL_ANALISIS_DE_RIESGO = "Análisis de riesgo"; 
    public AnalisisDeRiesgosPage(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade obtenerCompromisoBloqueado() {

        String xpathCompromisoBloqueado = "//a[@class='g-actionable']";
        waitFor(WAIT_TIME_2).second();
        return findBy(xpathCompromisoBloqueado);
    }

    public void ingresarAOpcionAnalisisdeRiesgo() {

        waitFor(WAIT_TIME_2).second();
        String xpathAnalisisRiesgos = ".//*[@id='CancellationWizard:RiskAnalysis']/div";
        findBy(xpathAnalisisRiesgos).waitUntilClickable().click();
        waitFor(WAIT_TIME_2).second();

    }

    public void setNumeroDeRiesgos(int numeroDeRiesgos) {
        this.numeroDeRiesgos = numeroDeRiesgos;
    }

    public int getNumeroDeRiesgos() {
        return numeroDeRiesgos;
    }

    public void ingresarAOpcionAnalisisdeRiesgoCotizacion() {
        String xpathAnalisisRiesgos = ".//*[@id='SubmissionWizard:RiskAnalysis']/div";
        String xpathMensajeAlertaEdificiosYUbicaciones = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:_msgs']";
        String xpathBorrarWorkskpace = ".//a[contains(.,'Borrar')]";
        String xpathWorkskpace = ".//a[contains(.,'Resultados de validación')]";
        findBy(xpathWorkskpace).waitUntilVisible();

        if (findBy(xpathMensajeAlertaEdificiosYUbicaciones).isVisible()) {
            findBy(xpathAnalisisRiesgos).click();
            waitForTextToAppear(LABRL_ANALISIS_DE_RIESGO);
        } else {
            findBy(xpathAnalisisRiesgos).click();
            waitForTextToAppear(LABRL_ANALISIS_DE_RIESGO);
        }

        setImplicitTimeout(WAIT_TIME_1, TimeUnit.SECONDS);
        if (findBy(xpathBorrarWorkskpace).isVisible()) {
            resetImplicitTimeout();
            waitUntil(WAIT_TIME_1000);
            botonBorrar.click();
        }
        resetImplicitTimeout();
    }

    public void ingresarAOpcionAnalisisdeRiesgoEnCambioDePoliza() {
        String xpathAnalisisRiesgos = ".//*[@id='PolicyChangeWizard:RiskAnalysis']/div";
        String xpathMensajeAlertaEdificiosYUbicaciones = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:_msgs']";
        String xpathBorrarWorkskpace = ".//a[contains(.,'Borrar')]";
        findBy(xpathAnalisisRiesgos).click();
        waitForTextToAppear(LABRL_ANALISIS_DE_RIESGO);
        waitFor(WAIT_TIME_2).second();
        if (findBy(xpathMensajeAlertaEdificiosYUbicaciones).isVisible()) {
            findBy(xpathAnalisisRiesgos).click();
            waitForTextToAppear(LABRL_ANALISIS_DE_RIESGO);
        }
        if (findBy(xpathBorrarWorkskpace).isVisible()) {
            waitUntil(WAIT_TIME_5000);
            botonBorrar.click();
        }
    }

    public void ingresarAOpcionAnalisisdeRiesgoEnRenovacionDePoliza() {
        String xpathAnalisisRiesgos = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RiskAnalysis']/div";
        String xpathMensajeAlertaEdificiosYUbicaciones = ".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:_msgs']";
        String xpathBorrarWorkskpace = ".//a[contains(.,'Borrar')]";
        waitUntil(WAIT_TIME_2000);
        findBy(xpathAnalisisRiesgos).click();
        waitFor(WAIT_TIME_2).second();
        if (findBy(xpathMensajeAlertaEdificiosYUbicaciones).isVisible()) {
            findBy(xpathAnalisisRiesgos).click();
            waitForTextToAppear(LABRL_ANALISIS_DE_RIESGO);
        }
        if (findBy(xpathBorrarWorkskpace).isVisible()) {
            waitUntil(WAIT_TIME_3000);
            botonBorrar.click();
            waitUntil(WAIT_TIME_3000);
        }
    }


    public void seleccionarSolicitarAprobacion() {
        int bttonSolicitarAprobacion = 1;
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(xPathSolicitarAprobacion));
        for (bttonSolicitarAprobacion = 1; bttonSolicitarAprobacion <= listaNombresAgentesElement.size(); bttonSolicitarAprobacion++) {
            WebElementFacade botonSolicitarAprobacion = findBy(".//a[contains(@id,'RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:" + bttonSolicitarAprobacion + ":UWIssueRowSet:RequestApproval')]");
            try {
                botonBloqueo.waitUntilPresent();
            } catch (StaleElementReferenceException e) {
                LOGGER.info("StaleElementReferenceException " + e);
            }
            waitUntil(WAIT_TIME_2000);
            botonSolicitarAprobacion.click();
            waitUntil(WAIT_TIME_2000);
            aceptarInicioSolicitudAprobacion();
            waitUntil(WAIT_TIME_3000);
        }
        setNumeroDeRiesgos(bttonSolicitarAprobacion);
    }


    public void aceptarInicioSolicitudAprobacion() {
        String xpathAceptarInicioSolicitud = ".//a[contains(.,'Aceptar')]";
        findBy(xpathAceptarInicioSolicitud).click();
    }
}
