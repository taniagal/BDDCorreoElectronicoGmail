package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.List;


public class AnalisisDeRiesgosPage extends PageUtil {
    private int numeroDeRiesgos;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    private static String xPathSolicitarAprobacion = ".//*[contains(@id,'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet') and contains(@id,'UWIssueRowSet:RequestApproval')]";

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
        findBy(xpathAnalisisRiesgos).click();
        waitFor(WAIT_TIME_2).second();
        if (findBy(xpathMensajeAlertaEdificiosYUbicaciones).isVisible()) {
            findBy(xpathAnalisisRiesgos).click();
            waitForTextToAppear("Análisis de riesgo");
        }
        if (findBy(xpathBorrarWorkskpace).isVisible()) {
            findBy(xpathBorrarWorkskpace).click();
        }
    }

    public void seleccionarSolicitarAprobacion() {
        int bttonSolicitarAprobacion = 1;
        waitFor(WAIT_TIME_4);
        try {
            List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(xPathSolicitarAprobacion));
            while (bttonSolicitarAprobacion <= listaNombresAgentesElement.size()) {
                String boton = ".//a[contains(@id,'SubmissionWizard:Job_RiskAnalysisScreen:RiskAnalysisCV:RiskEvaluationPanelSet:" + bttonSolicitarAprobacion + ":UWIssueRowSet:RequestApproval')]";
                WebElementFacade bot = findBy(boton);
                bot.click();
                aceptarInicioSolicitudAprobacion();
                waitFor(WAIT_TIME_2);
                bttonSolicitarAprobacion++;
            }
        } catch (Exception e) {
            LOGGER.error("ERROR EN ANALISISDERIESGO TRAZA:" + e);
        }
        setNumeroDeRiesgos(bttonSolicitarAprobacion);
    }

    public void aceptarInicioSolicitudAprobacion() {
        String xpathAceptarInicioSolicitud = ".//a[contains(.,'Aceptar')]";
        findBy(xpathAceptarInicioSolicitud).click();

    }
}
