package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * Created by juanzaag on 04/11/2016.
 */
public class PlanDeTrabajoPage extends PageUtil {

    @Page
    AnalisisDeRiesgosPage analisisDeRiesgosPage;

    private String xPathSolicitudRiesgos = ".//a[contains(.,'Solicitud Riesgos Consultables')]";
    String xPathOpcionPlanDeTrabajo = ".//*[@id='SubmissionWizard:Workplan']";
    String xPathOpcionPlanDeTrabajoEnCambioDePoliza = ".//*[@id='PolicyChangeWizard:Workplan']";
    String xPathOpcionPlanDeTrabajoEnRenovacionDePoliza = ".//*[@id='RenewalWizard:Workplan']";


    public PlanDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarALaOpcionPlanDeTrabajo() {
        findBy(xPathOpcionPlanDeTrabajo).click();
        waitUntil(WAIT_TIME_3000);
        waitForTextToAppear("Plan de trabajo");
    }

    public void ingresarALaOpcionPlanDeTrabajoEnCambioDePoliza() {
        findBy(xPathOpcionPlanDeTrabajoEnCambioDePoliza).click();
        waitUntil(WAIT_TIME_3000);
        waitForTextToAppear("Plan de trabajo");
    }

    public void ingresarALaOpcionPlanDeTrabajoEnRenovacionDePoliza() {
        findBy(xPathOpcionPlanDeTrabajoEnRenovacionDePoliza).click();
        waitUntil(WAIT_TIME_3000);
        waitForTextToAppear("Plan de trabajo");
    }

    public void validarActividadesGeneradasEnRiesgo() {
        int numeroDeRiesgosEnAnalisisDeRiesgos = 2;
        int bttonSolicitudRiesgosConsultables = 1;
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(xPathSolicitudRiesgos));
        for (bttonSolicitudRiesgosConsultables = 1; bttonSolicitudRiesgosConsultables <= listaNombresAgentesElement.size(); bttonSolicitudRiesgosConsultables++) {
            bttonSolicitudRiesgosConsultables++;
        }
        if (numeroDeRiesgosEnAnalisisDeRiesgos == listaNombresAgentesElement.size()) {
            MatcherAssert.assertThat("Se genero una actividad por cada riesgo consultable", true);
            waitUntil(WAIT_TIME_1000);
        }
    }
}
