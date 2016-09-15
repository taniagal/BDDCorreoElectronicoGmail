package com.sura.gw.navegacion.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

public class BarraNavegacionSuperiorWidgetImpl extends WidgetObjectImpl implements IBarraNavegacionSuperiorWidget {

    public BarraNavegacionSuperiorWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    @Override
    public void deplegarMenu(String nombreMenu) {
        getPage().setImplicitTimeout(1, TimeUnit.SECONDS);
        String xpathMenu = ".//*[@id=':tabs']//a[contains(.,'" + nombreMenu + "')]";
        Boolean esVisibleElMenuEnLaPagina = getPage().isElementVisible(By.xpath(xpathMenu));

        if (esVisibleElMenuEnLaPagina) {
            WebElementFacade menu = getPage().moveTo(xpathMenu);
            menu.setWindowFocus();
            menu.sendKeys(Keys.ARROW_DOWN);
        }
        getPage().resetImplicitTimeout();

        assertThat();
    }


    @Override
    public void seleccionarMenu(String nombreMenu) {
        String xpathMenuPoliza = ".//a[contains(@id,'TabBar:AdminTab')]";
        deplegarMenu(xpathMenuPoliza);
    }
}
