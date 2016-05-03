package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.sikuli.api.robot.Key;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by brayruru on 2016/05/03.
 */
public class CuentasOrdenesDeTrabajoPage extends SeusLoginPage {

    @FindBy(xpath=".//td[@id='AccountFile:MenuLinks:AccountFile_AccountFile_WorkOrders']/div/span")
    WebElementFacade mnuTransaccionesPoliza;

    @FindBy(xpath=".//td/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    WebElementFacade filtroEstado;

    @FindBy(xpath=".//*[@id='AccountFile_WorkOrders:AccountFile_WorkOrdersScreen:message:InfoMessage_ExtDV:message']")
    WebElementFacade msjTransaccionNoEncontrada;

    @FindBy(xpath=".//table[2]/tbody/tr/td[2]/table/tbody/tr/td/input")
    WebElementFacade filtroTipoTransaccion;

    @FindBy(xpath=".//table[3]/tbody/tr/td[2]/table/tbody/tr/td/input")
    WebElementFacade filtroProducto;

    public CuentasOrdenesDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarTransacciones(){
        this.mnuTransaccionesPoliza.click();
    }

    public void filtrarTransaccionesPorEstado(String estado){
        filtroEstado.click();
        filtroEstado.sendKeys(estado);
        filtroEstado.sendKeys(Key.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void validarMensaje(String mensaje) {
        assertThat(msjTransaccionNoEncontrada.getText().toString(), containsString(mensaje));
    }

    public void filtrarTransaccionesPorTransaccion(String filtroTransaccion) {
        filtroTipoTransaccion.click();
        filtroTipoTransaccion.clear();
        filtroTipoTransaccion.sendKeys(filtroTransaccion);
        filtroTipoTransaccion.sendKeys(Key.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void filtrarTransaccionesPorProducto(String filtroProducto) {
        this.filtroProducto.click();
        this.filtroProducto.sendKeys(filtroProducto);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.filtroProducto.sendKeys(Key.ENTER);
    }

}
