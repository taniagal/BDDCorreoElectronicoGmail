package com.sura.gw.navegacion.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.serenitybdd.core.pages.WidgetObject;
import net.thucydides.core.webdriver.DefaultWidgetObjectInitialiser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class NavegacionBarraSuperiorWOImpl extends WebElementFacadeImpl implements WidgetObject {

    private final PageObject page;

    public NavegacionBarraSuperiorWOImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page.getDriver(), locator, webElement, timeoutInMilliseconds);
        this.page = page;
        new DefaultWidgetObjectInitialiser(page.getDriver(), (int) timeoutInMilliseconds).apply(this);
    }

    public NavegacionBarraSuperiorWOImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
        this(page, locator, null, timeoutInMilliseconds);
    }

    public PageObject getPage() {
        return page;
    }


}
