package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImpresionReimpresionPage extends PageUtil {
    @FindBy(xpath = "html/body/div[1]/div[2]/div/span/div/div[3]/div[3]/div/table/tbody/tr[6]/td/div/span")
    private WebElementFacade menuItemTransaccionesDePoliza;
    @FindBy(xpath = "//a[contains(.,'Reimprimir')]")
    private WebElementFacade botonReimpresion;

    public ImpresionReimpresionPage(WebDriver driver) {
        super(driver);
    }

    public void irATransaccionesDePoliza() {
        esperarYClickearBoton(menuItemTransaccionesDePoliza);
    }

    public void validarBotonReimpresion() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(botonReimpresion);
    }
}
