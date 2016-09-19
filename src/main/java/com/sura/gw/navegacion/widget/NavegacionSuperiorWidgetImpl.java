package com.sura.gw.navegacion.widget;

import com.sura.gw.navegacion.webelement.MenuNavegacionSuperiorEnum;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.concurrent.TimeUnit;

public class NavegacionSuperiorWidgetImpl extends WidgetObjectImpl implements INavegacionSuperiorWidget {

    private static final String XPATH_CONTENEDOR_SUBMENU_DESPLEGABLE = "//div[contains(@class, 'x-panel x-layer x-panel-default x-menu x-border-box')]";

    public NavegacionSuperiorWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    @Override
    public void deplegarMenu(MenuNavegacionSuperiorEnum menu) {
        getPage().setImplicitTimeout(1, TimeUnit.SECONDS);
        if (esMenuVisible(menu)) {
            WebElementFacade menuWE = getPage().moveTo(menu.xpath());
            menuWE.setWindowFocus();
            menuWE.sendKeys(Keys.ARROW_DOWN);
            if (!esSubMenuDeMenuVisible()) {
                getPage().shouldBeVisible(By.xpath(menu.xpath()));
            }
        }
        getPage().resetImplicitTimeout();
    }


    private boolean esMenuVisible(MenuNavegacionSuperiorEnum menu) {
        return getPage().isElementVisible(By.xpath(menu.xpath()));
    }

    private boolean esSubMenuDeMenuVisible() {
        return getPage().isElementVisible(By.xpath(XPATH_CONTENEDOR_SUBMENU_DESPLEGABLE));
    }


    @Override
    public void seleccionarMenu(MenuNavegacionSuperiorEnum menu) {
        //return getPage().switchToPage(BusquedaDeCuentasPage.class);
    }
}
