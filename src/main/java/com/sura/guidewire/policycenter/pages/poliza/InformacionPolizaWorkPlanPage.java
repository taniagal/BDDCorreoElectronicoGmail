package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


public class InformacionPolizaWorkPlanPage extends PageUtil {
    @FindBy(xpath = ".//*[contains(@id, ':Workplan')]/div/span")
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
    @FindBy(xpath = ".//*[contains(@id, 'WizardMenuActions-btnInnerEl')]")
    private WebElementFacade botonAcciones;
    @FindBy(xpath = ".//*[@id='NewActivityWorksheet:NewActivityScreen:NewActivityScreen_CancelButton-btnInnerEl']")
    private WebElementFacade botonCancelarNuevaActividad;

    public InformacionPolizaWorkPlanPage(WebDriver driver) {
        super(driver);
    }

    public void clickPlanTrabajo() {
        esperarYClickearBoton(menuItemPlanDeTrabajo);
        if(!menuItemPlanDeTrabajo.isSelected()){
            esperarYClickearBoton(menuItemPlanDeTrabajo);
        }
    }

    public void validarDatosPlanDeTrabajo() {
        waitFor(campotomador);
        waitFor(campoNumeroPoliza);
        waitFor(campoTipoDocumento);
        waitFor(campoNumeroDocumento);
    }

    public void buscarActividades() {
        esperarYClickearBoton(botonAcciones);
        botonActividadNueva.waitUntilPresent();
        actions.moveToElement(botonActividadNueva).release(botonActividadNueva).build().perform();
        botonRevision.waitUntilPresent();
        actions.moveToElement(botonRevision).release(botonRevision).build().perform();
        botonRevisarYAprobar.waitUntilPresent();
        esperarYClickearBoton(botonRevisarYAprobar);
    }

    public void validarMenuActividades() {
        esperarYClickearBoton(clickMenuActividades);
        waitFor(menuActividades);
        clickearElemento(botonCancelarNuevaActividad);
        botonCancelarNuevaActividad.waitUntilNotVisible();
    }
}
