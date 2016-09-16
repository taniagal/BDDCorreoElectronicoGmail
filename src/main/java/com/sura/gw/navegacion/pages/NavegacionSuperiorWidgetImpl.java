package com.sura.gw.navegacion.pages;

import com.sura.gw.policy.cuenta.pages.BusquedaDeCuentasPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class NavegacionSuperiorWidgetImpl extends WidgetObjectImpl implements INavegacionSuperiorWidget {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    private static final String XPATH_CONTENEDOR_SUBMENU_DESPLEGABLE = "//div[contains(@class, 'x-panel x-layer x-panel-default x-menu x-border-box')]";

    private String nombreMenu;

    public NavegacionSuperiorWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    @Override
    public WebElementFacadeImpl deplegarMenu(MenuNavegacionSuperiorEnum menu) {
        getPage().setImplicitTimeout(1, TimeUnit.SECONDS);
        nombreMenu = "";
        if (esMenuVisible(menu)) {
            WebElementFacade menuWE = getPage().moveTo(menu.xpath());
            menuWE.setWindowFocus();
            menuWE.sendKeys(Keys.ARROW_DOWN);
            if (!esSubMenuDeMenuVisible()) {
                getPage().shouldBeVisible(By.xpath(menu.xpath()));
            }
        }
        getPage().resetImplicitTimeout();
        nombreMenu = menu.name();
        return enSubMenu();
    }

    private WebElementFacadeImpl enSubMenu() {

        WebElementFacadeImpl webElementFacade = null;


        if (MenuNavegacionSuperiorEnum.ADMINISTRACION.name().equals(nombreMenu)){
           webElementFacade = new MenuAdministracionWE(getPage().getDriver(), null , getPage().getImplicitWaitTimeout().in(TimeUnit.MILLISECONDS));
        }
        if (MenuNavegacionSuperiorEnum.BUSCAR.name().equals(nombreMenu)){
           // webElementFacade = new MenuBuscarWE(getPage().getDriver(), getPage().find() , getPage().getImplicitWaitTimeout().in(TimeUnit.MILLISECONDS));
        }
        if (MenuNavegacionSuperiorEnum.CONTACTO.name().equals(nombreMenu)){
            webElementFacade = new MenuContactoWE(getPage().getDriver(), null , getPage().getImplicitWaitTimeout().in(TimeUnit.MILLISECONDS));
        }
        if (MenuNavegacionSuperiorEnum.CUENTA.name().equals(nombreMenu)){
            webElementFacade = new MenuCuentaWE(getPage().getDriver(), null , getPage().getImplicitWaitTimeout().in(TimeUnit.MILLISECONDS));
        }
        if (MenuNavegacionSuperiorEnum.POLIZA.name().equals(nombreMenu)){
            webElementFacade = new MenuPolizaWE(getPage().getDriver(), null , getPage().getImplicitWaitTimeout().in(TimeUnit.MILLISECONDS));
        }
        if (MenuNavegacionSuperiorEnum.EQUIPO.name().equals(nombreMenu)){
            webElementFacade = new MenuEquipoWE(getPage().getDriver(), null , getPage().getImplicitWaitTimeout().in(TimeUnit.MILLISECONDS));
        }
        if (MenuNavegacionSuperiorEnum.ESCRITORIO.name().equals(nombreMenu)){
            webElementFacade = new MenuEscritorioWE(getPage().getDriver(), null , getPage().getImplicitWaitTimeout().in(TimeUnit.MILLISECONDS));
        }

        return webElementFacade;
    }

    private boolean esMenuVisible(MenuNavegacionSuperiorEnum menu) {
        return getPage().isElementVisible(By.xpath(menu.xpath()));
    }

    private boolean esSubMenuDeMenuVisible() {
        return getPage().isElementVisible(By.xpath(XPATH_CONTENEDOR_SUBMENU_DESPLEGABLE));
    }


    @Override
    public PageObject seleccionarMenu(MenuNavegacionSuperiorEnum menu) {
        return getPage().switchToPage(BusquedaDeCuentasPage.class);
    }
}
