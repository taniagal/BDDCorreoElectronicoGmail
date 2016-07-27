package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.SeusLoginPage;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CuentasOrdenesDeTrabajoPage extends SeusLoginPage {
    @FindBy(xpath=".//tr[5]/td/div/span")
    private WebElementFacade mnuTransaccionesPoliza;
    @FindBy(xpath=".//td/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade filtroEstado;
    @FindBy(xpath=".//*[@id='AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:message:InfoMessage_ExtDV:message']")
    private WebElementFacade msjTransaccionNoEncontrada;
    @FindBy(xpath=".//table[2]/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade filtroTipoTransaccion;
    @FindBy(xpath=".//table[3]/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade filtroProducto;

    public CuentasOrdenesDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarTransacciones(){
        this.mnuTransaccionesPoliza.waitUntilClickable();
        this.mnuTransaccionesPoliza.click();
    }

    public void filtrarTransaccionesPorEstado(String estado){
        filtroEstado.click();
        getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        filtroEstado.sendKeys(estado);
        getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        filtroEstado.sendKeys(Keys.ENTER);
        getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    }

    public void validarMensaje(String mensaje) {
        assertThat(msjTransaccionNoEncontrada.getText().toString(), containsString(mensaje));
    }

    public void filtrarTransaccionesPorTransaccion(String filtroTransaccion) {
        this.filtroTipoTransaccion.waitUntilClickable();
        this.filtroTipoTransaccion.click();
        this.filtroTipoTransaccion.clear();
        this.filtroTipoTransaccion.sendKeys(filtroTransaccion);
        this.filtroTipoTransaccion.sendKeys(Keys.ENTER);
    }

    public void filtrarTransaccionesPorProducto(String filtroProducto) {
        this.filtroProducto.click();
        this.filtroProducto.sendKeys(filtroProducto);
        waitABit(1000);
        this.filtroProducto.sendKeys(Keys.ENTER);
    }

}
