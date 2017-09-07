package com.sura.guidewire.policycenter.utils.menu.acciones.escritorio;


import com.sura.guidewire.policycenter.resources.PageUtil;

import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class EscritorioPage extends PageUtil {
    protected static final int CONSTANTE_8 = 8;
    private static final String PATH_ACTIVIDAD = ".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']";
    private static final String TABLA_ACTIVDAD = ".//*[@id='DesktopActivities:DesktopActivitiesScreen:DesktopActivitiesLV-body']/*/table/tbody/tr";
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnWrap']")
    private WebElementFacade menuEscritorio;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopActivities']")
    private WebElementFacade menuEscritorioActividad;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab:Desktop_DesktopActivities-itemEl']")
    private WebElementFacade itemMisActividades;

    public EscritorioPage(WebDriver driver) {
        super(driver);
    }

    public void irAMenuActividad() {
        clickearElemento(menuEscritorio);
        esperarObjetoClikeableServidor(PATH_ACTIVIDAD);
    }

    public void verificarAuditoriaFinal(String numeroPoliza) {
        MatcherAssert.assertThat("No se encontro en numero de la  poliza", validarResultadoTabla(TABLA_ACTIVDAD, numeroPoliza, CONSTANTE_8));
    }
}
