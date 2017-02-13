package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class InformacionPolizaWorkPlanPage extends PageUtil {
    @FindBy(xpath = "html/body/div[1]/div[2]/div/span/div/div[4]/div[3]/div/table/tbody/tr[3]/td/div/span")
    private WebElementFacade menuItemPlanDeTrabajo;
    @FindBy(xpath = "//span[contains(.,'Tomador')]")
    private WebElementFacade campotomador;
    @FindBy(xpath = "//span[contains(.,'Número de póliza')]")
    private WebElementFacade campoNumeroPoliza;
    @FindBy(xpath = "//div[contains(.,'Tipo de Documento')]")
    private WebElementFacade campoTipoDocumento;
    @FindBy(xpath = "//span[contains(.,'Número de Documento')]")
    private WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = "//span[contains(.,'Actividad nueva')]")
    private WebElementFacade botonActividadNueva;
    @FindBy(xpath = "//span[contains(.,'Underwriter Review')]")
    private WebElementFacade botonRevision;
    @FindBy(xpath = "//span[contains(.,'Revisar y aprobar')]")
    private WebElementFacade botonRevisarYAprobar;
    @FindBy(xpath = "//div[contains(.,' ')]")
    private WebElementFacade clickMenuActividades;
    @FindBy(xpath = ".//*[@id='wsTabBar:wsTab_0:panelId']")
    private WebElementFacade menuActividades;


    public InformacionPolizaWorkPlanPage(WebDriver driver) {
        super(driver);
    }

    public void clickPlanTrabajo() {
        esperarYClickearBoton(menuItemPlanDeTrabajo);

    }

    public void validarDatosPlanDeTrabajo() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(campotomador);
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(campoNumeroPoliza);
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(campoTipoDocumento);
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(campoNumeroDocumento);
    }

    public void buscarActividades() {
        esperarYClickearBoton(botonActividadNueva);
        esperarYClickearBoton(botonRevision);
        esperarYClickearBoton(botonRevisarYAprobar);
    }

    public void validarMenuActividades() {
        esperarYClickearBoton(clickMenuActividades);
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(menuActividades);
    }
}
