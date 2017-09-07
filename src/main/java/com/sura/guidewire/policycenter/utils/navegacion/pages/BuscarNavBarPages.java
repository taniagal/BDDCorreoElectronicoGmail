package com.sura.guidewire.policycenter.utils.navegacion.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;


public class BuscarNavBarPages extends PageObject {
    protected static final int TIEMPO_1000 = 1000;
    protected static final int TIEMPO_5000 = 5000;
    protected static final int TIEMPO_20 = 20;
    protected static final int TIEMPO_2 = 2;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    private WebElementFacade lblCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscaCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']")
    private WebElementFacade linkCuenta;
    @net.serenitybdd.core.annotations.findby.FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtIrA;

    public void navegacionBuscarCuenta(String numCuenta) {
        findBy(Opciones.CUENTAS.nombre()).waitUntilVisible().click();
        lblCuenta.clear();
        lblCuenta.sendKeys(numCuenta);
        btnBuscaCuenta.click();
        PageUtil.esperarHasta(TIEMPO_1000);
        linkCuenta.click();
        PageUtil.esperarHasta(TIEMPO_5000);
    }

    public void seleccionarOpcion() {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(campoTxtIrA).shouldBePresent();
        campoTxtIrA.sendKeys("Search");
        campoTxtIrA.sendKeys(Keys.ENTER);
        waitForTextToAppear("Buscar pólizas");
    }

    public void clicenOpcionCuentas() {
        findBy(Opciones.CUENTAS.nombre()).waitUntilVisible().click();
    }

    public enum Opciones {
        POLIZA("Pólizas"),
        CUENTAS("//*[@id='Search:MenuLinks:Search_AccountSearch']/div"),
        CODIGO_AGENTE("Código de agente"),
        ACTIVIDADES("Actividades"),
        CONTACTOS("Contactos");

        private String opcion;

        Opciones(String opcion) {
            this.opcion = opcion;
        }

        public String nombre() {
            return opcion;
        }
    }
}
