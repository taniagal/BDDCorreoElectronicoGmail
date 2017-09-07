package com.sura.guidewire.policycenter.pages.renovacion;

import ch.lambdaj.Lambda;

import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InstruccionesPreviasARenovacionPage extends PageObject {

    private static final String XPATH_MENU_DESPLEGABLE = "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']";

    private List<String> listaInstrucciones;
    private List<WebElementFacade> listaIntruccionesWE;

    private List<String> listaRazonesDeRenovacio;

    public void seleccionarBotonEditar() {
        waitForTextToAppear("Instrucciones previas a la renovación por el Plazo de la póliza");
        shouldContainText("Instrucciones previas a la renovación por el Plazo de la póliza");
        String xpathLinkBotonEditar = "//a[contains(.,'Editar')]";
        findBy(xpathLinkBotonEditar).waitUntilVisible().click();
        waitForTextToAppear("Instrucción");
        shouldContainText("Instrucción");
    }

    public void seleccionarListaDesplegable(String xpath) {

        String xpathDropdownInstruccion = xpath;
        findBy(xpathDropdownInstruccion).waitUntilVisible().click();
        waitFor((WebElementFacade) $(XPATH_MENU_DESPLEGABLE)).waitUntilVisible();
        shouldBeVisible(getDriver().findElement(By.xpath(XPATH_MENU_DESPLEGABLE)));
        listaIntruccionesWE = findBy(XPATH_MENU_DESPLEGABLE).thenFindAll("//li");
        listaInstrucciones = Lambda.extract(listaIntruccionesWE, Lambda.on(WebElementFacade.class).getText());
    }

    public List<String> obtenerInstruccionesDisponibles() {
        return this.listaInstrucciones;
    }

    public List<String> obtenerListaRazonesDeRenovacion() {
        return this.listaRazonesDeRenovacio;
    }

    public void seleccionarOpcion(String instruccionASeleccionar) {
        for (WebElementFacade instruccion : listaIntruccionesWE) {
            if (instruccion.getText().equals(instruccionASeleccionar)) {
                instruccion.click();
                waitFor(1).seconds();
                break;
            }
        }
    }

    public void seleccionarListaDesplegableDeEtiqueta(String etiqueta) {

        String xpathTrEtiquetaDrowbox = ".//tr[child::*/label[contains(.,'" + etiqueta + "')] ]";
        findBy(xpathTrEtiquetaDrowbox).findBy(By.tagName("input")).click();
        waitFor((WebElementFacade) $(XPATH_MENU_DESPLEGABLE)).waitUntilVisible();
        shouldBeVisible(getDriver().findElement(By.xpath(XPATH_MENU_DESPLEGABLE)));
        List<WebElementFacade> listaRazonesDeRenovacionWe = findBy(XPATH_MENU_DESPLEGABLE).thenFindAll("//li");
        listaRazonesDeRenovacio = Lambda.extract(listaRazonesDeRenovacionWe, Lambda.on(WebElementFacade.class).getText());
    }
}
