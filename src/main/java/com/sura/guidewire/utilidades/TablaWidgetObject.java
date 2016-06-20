package com.sura.guidewire.utilidades;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObject;
import net.serenitybdd.core.pages.WidgetObjectImpl;

import java.util.List;

@ImplementedBy(WidgetObjectImpl.class)
public abstract class TablaWidgetObject implements WidgetObject{


    /*

        List<WebElementFacade> operacionesTabla = obtenerOperacionesDeTabla(tabla, ".//div[contains(@id,'gtoolbar')]");
        List<WebElementFacade> encabezadosDeTabla = tabla.then(".//div[contains(@id,'gridcolumn') and contains(@class,'x-column-header') and contains(@class,'x-box-item')]");
        List<WebElementFacade> filasDeTabla = tabla.then(".//div[contains(@id,'gridcolumn') and contains(@class,'x-column-header') and contains(@class,'x-box-item')]");
    */
    private String xpathDelDivQueContieneTabla;

    private List<WebElementFacade> operacionesTabla;
    private List<WebElementFacade> encabezadosDeTabla;
    private List<WebElementFacade> filasDeTabla;


    public TablaWidgetObject(String xpathDelDivQueContieneTabla){
        this.xpathDelDivQueContieneTabla = xpathDelDivQueContieneTabla;
    }

    public List<WebElementFacade> tabla(){

    }

    public List<WebElementFacade> obtenerOperacionesDeTabla(WebElementFacade webElementFacadeTabla, String xpathDelToolbarDeTabla) {
        return webElementFacadeTabla.thenFindAll(".//div[contains(@id,'gtoolbar')]");
    }

    public List<WebElementFacade> obtenerOperacionesDeTabla(String xpathDelDivQueContieneTabla, String xpathDelToolbarDeTabla) {
        return findBy(xpathDelDivQueContieneTabla).thenFindAll(".//div[contains(@id,'gtoolbar')]");
    }

    public String getXpathDelDivQueContieneTabla() {
        return xpathDelDivQueContieneTabla;
    }

}
