package com.sura.gw.navegacion.pages;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@ImplementedBy(NavegacionBarraSuperiorWOImpl.class)
public interface NavegacionBarraSuperiorWO extends WebElementFacade {
    /**
     * Get the page containing this widget.
     * @return the page containing this widget
     */
    public PageObject getPage();

}
