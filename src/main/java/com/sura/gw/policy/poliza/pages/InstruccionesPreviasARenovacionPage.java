package com.sura.gw.policy.poliza.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;


public class InstruccionesPreviasARenovacionPage extends PageObject {

    private List<String> listaInstrucciones;

    public void seleccionarBotonEditar() {
        waitForTextToAppear("Instrucciones previas a la renovación por el Plazo de la póliza");
        shouldContainText("Instrucciones previas a la renovación por el Plazo de la póliza");
        
        String xpathLinkBotonEditar = "//a[contains(.,'Editar')]";
        findBy(xpathLinkBotonEditar).waitUntilVisible().click();
        waitForTextToAppear("Instrucción");
        shouldContainText("Instrucción");
    }

    public void seleccionarListaDesplegableDeInstruccion() {

        String xpathDropdownInstruccion = "//input[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-inputEl']";
        findBy(xpathDropdownInstruccion).waitUntilVisible().click();

        String xpathMenuDesplegable = "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']";

        waitFor(findBy(xpathMenuDesplegable)).waitUntilVisible();
        shouldBeVisible(getDriver().findElement(By.xpath(xpathMenuDesplegable)));
        List<WebElementFacade> listaIntruccionesWE = findBy(xpathMenuDesplegable).thenFindAll("//li");
        listaInstrucciones = extract(listaIntruccionesWE, on(WebElementFacade.class).getText());
    }

    public List<String> obtenerInstruccionesDisponibles(){
        return  this.listaInstrucciones;
    }



}
