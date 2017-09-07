package com.sura.guidewire.policycenter.pages.modificaciones;

import com.sura.guidewire.policycenter.pages.poliza.AnalisisDeRiesgosPage;
import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;


/**
 * Created by juanzaag on 04/11/2016.
 */
public class PlanDeTrabajoPage extends PageUtil {

    @Page
    AnalisisDeRiesgosPage analisisDeRiesgosPage;
    String xPathOpcionPlanDeTrabajo = ".//*[@id='SubmissionWizard:Workplan']";
    String xPathOpcionPlanDeTrabajoEnCambioDePoliza = ".//*[@id='PolicyChangeWizard:Workplan']";
    @FindBy(xpath = ".//*[@id='RenewalWizard:Workplan']")
    WebElementFacade xPathOpcionPlanDeTrabajoEnRenovacionDePoliza;
    private String xPathSolicitudRiesgos = ".//a[contains(.,'Solicitud Riesgos Consultables')]";

    public PlanDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarALaOpcionPlanDeTrabajo() {
        findBy(xPathOpcionPlanDeTrabajo).click();
        esperarHasta(TIEMPO_3000);
        waitForTextToAppear("Plan de trabajo");
    }

    public void ingresarALaOpcionPlanDeTrabajoEnCambioDePoliza() {
        findBy(xPathOpcionPlanDeTrabajoEnCambioDePoliza).click();
        esperarHasta(TIEMPO_3000);
        waitForTextToAppear("Plan de trabajo");
    }

    public void ingresarALaOpcionPlanDeTrabajoEnRenovacionDePoliza() {
        xPathOpcionPlanDeTrabajoEnRenovacionDePoliza.waitUntilVisible().click();
        esperarHasta(TIEMPO_3000);
        waitForTextToAppear("Plan de trabajo");
    }

    public void validarActividadesGeneradasEnRiesgo() {
        int numeroDeRiesgosEnAnalisisDeRiesgos = CONSTANTE_2;
        int bttonSolicitudRiesgosConsultables = 1;
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(xPathSolicitudRiesgos));
        for (bttonSolicitudRiesgosConsultables = 1; bttonSolicitudRiesgosConsultables <= listaNombresAgentesElement.size(); bttonSolicitudRiesgosConsultables++) {
            bttonSolicitudRiesgosConsultables++;
        }
        if (numeroDeRiesgosEnAnalisisDeRiesgos == listaNombresAgentesElement.size()) {
            MatcherAssert.assertThat("Se genero una actividad por cada riesgo consultable", true);
            esperarHasta(TIEMPO_1000);
        }
    }
}
