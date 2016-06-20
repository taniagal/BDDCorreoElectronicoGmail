package com.sura.guidewire.utilidades;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObject;

import java.util.List;

public class UtilidadesDeTabla extends PageObject{


  public WidgetObject obtenerTabla(String xpathDelDivQueContieneTabla) {
    WebElementFacade tabla = findBy(xpathDelDivQueContieneTabla);
    List<WebElementFacade> operacionesTabla = obtenerOperacionesDeTabla(tabla, ".//div[contains(@id,'gtoolbar')]");
    List<WebElementFacade> encabezadosDeTabla = tabla.then(".//div[contains(@id,'gridcolumn') and contains(@class,'x-column-header') and contains(@class,'x-box-item')]");
    List<WebElementFacade> filasDeTabla = tabla.then(".//div[contains(@id,'gridcolumn') and contains(@class,'x-column-header') and contains(@class,'x-box-item')]");


  }



}
