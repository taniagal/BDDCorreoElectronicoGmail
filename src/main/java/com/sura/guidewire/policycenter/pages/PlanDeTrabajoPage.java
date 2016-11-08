package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.AssertUtil;
import com.sura.guidewire.policycenter.util.PageUtil;
import jxl.common.Assert;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.assertj.core.api.Assertions;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.filter.matcher.Matcher;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * Created by juanzaag on 04/11/2016.
 */
public class PlanDeTrabajoPage extends PageUtil{

    @Page
    AnalisisDeRiesgosPage analisisDeRiesgosPage;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    private String xPathSolicitudRiesgos = ".//a[contains(.,'Solicitud Riesgos Consultables')]";
    String xPathOpcionPlanDeTrabajo = ".//*[@id='SubmissionWizard:Workplan']";

    public PlanDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarALaOpcionPlanDeTrabajo() {
        findBy(xPathOpcionPlanDeTrabajo).click();
        waitForTextToAppear("Plan de trabajo");
    }

    public void validarActividadesGeneradasEnRiesgo(){
        int NumeroDeRiesgosEnAnalisisDeRiesgos = 2;

        int bttonSolicitudRiesgosConsultables=1;
        try {
            List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(xPathSolicitudRiesgos));
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                String boton = "//a[contains(@id,'SubmissionWizard:JobWizardToolsMenuWizardStepSet:WorkplanScreen:JobWizardWorkplanPanelSet:JobWizardWorkplanLV:"+bttonSolicitudRiesgosConsultables+":Subject)]";
                WebElementFacade bot = findBy(boton);
                bttonSolicitudRiesgosConsultables++;
            }
            if(NumeroDeRiesgosEnAnalisisDeRiesgos == bttonSolicitudRiesgosConsultables-1)
            {
                MatcherAssert.assertThat("Se genero una actividad por cada riesgo consultable",true);
            }
        } catch (Exception e) {
            LOGGER.error("ERROR EN PlAN DE TRABAJO TRAZA:" + e);
        }


    }
}
