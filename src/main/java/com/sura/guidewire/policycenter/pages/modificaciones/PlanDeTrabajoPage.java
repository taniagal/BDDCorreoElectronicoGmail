package com.sura.guidewire.policycenter.pages.modificaciones;

import com.sura.guidewire.policycenter.pages.poliza.AnalisisDeRiesgosPage;
import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


/**
 * Created by juanzaag on 04/11/2016.
 */
public class PlanDeTrabajoPage extends PageUtil {

    @Page
    AnalisisDeRiesgosPage analisisDeRiesgosPage;
    String xPathOpcionPlanDeTrabajo = ".//*[@id='SubmissionWizard:Workplan']";
    String xPathOpcionPlanDeTrabajoEnCambioDePoliza = ".//*[@id='PolicyChangeWizard:Workplan']";
    String xPathOpcionAnalisisDeRiesgoEnCancelacion=".//*[@id='CancellationWizard:RiskEvaluation']";
    @FindBy(xpath = ".//*[@id='RenewalWizard:Workplan']")
    WebElementFacade xPathOpcionPlanDeTrabajoEnRenovacionDePoliza;
    private String xPathSolicitudRiesgos = ".//a[contains(.,'Solicitud Riesgos Consultables')]";
    @FindBy(xpath = "//table//div/span[contains(.,'Plan de trabajo')]/../../../../../../../following-sibling::tr[1]//div/div[4]//table//tr[1]//td[15]")
    private WebElementFacade xPathColumnaDeDetalleReglaUW;
    @FindBy(xpath = "//table//div/span[contains(.,'Plan de trabajo')]/../../../../../../../following-sibling::tr[1]//div/div[4]//table//tr[2]//td[15]")
    private WebElementFacade xPathColumnaDeDetalleReglaUWCancelacion;
    @FindBy(xpath = ".//td/div/span[contains(.,'Plan de trabajo')]")
    private WebElementFacade xPathOpcionPlanDeTrabajoEnCancelacion;

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
    public void ingresarALaOpcionPlanDeTrabajoCancelacion(){
        esperarHasta(TIEMPO_5000);
        clickearElemento(xPathOpcionPlanDeTrabajoEnCancelacion);
        waitForTextToAppear("Plan de trabajo");
        while(!xPathColumnaDeDetalleReglaUW.isVisible()){
            getDriver().navigate().refresh();
        }
    }

    public void ingresarALaOpcionPlanDeTrabajoSoloCancelacion(){
        esperarHasta(TIEMPO_5000);
        clickearElemento(xPathOpcionPlanDeTrabajoEnCancelacion);
        waitForTextToAppear("Plan de trabajo");
        while(!xPathColumnaDeDetalleReglaUWCancelacion.isVisible()){
            getDriver().navigate().refresh();
        }
    }


    public void ingresarALaOpcionAnalisisDeRiesgoCancelacion(){
        esperarHasta(TIEMPO_2000);
        findBy(xPathOpcionAnalisisDeRiesgoEnCancelacion).click();
        waitForTextToAppear("Análisis de riesgo");
    }
}