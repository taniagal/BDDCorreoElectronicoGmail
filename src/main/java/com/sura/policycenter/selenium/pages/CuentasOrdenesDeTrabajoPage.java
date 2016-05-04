package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import com.sura.guidewire.selenium.SeusLoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuCuenta;

    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem-inputEl']")
    WebElementFacade txtNumCuenta;

    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem_Button']")
    WebElementFacade btnBuscarCuenta;

    Guidewire gw = new Guidewire(getDriver());

    public CuentasOrdenesDeTrabajoPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarTransacciones(){
        this.mnuTransaccionesPoliza.waitUntilClickable();
        this.mnuTransaccionesPoliza.click();
    }

    public void buscarCuenta(String numCuenta) {


        //setImplicitTimeout(2,TimeUnit.SECONDS);
        gw.threadWait(2000);

        Actions act = new Actions(getDriver());
        mnuCuenta.waitUntilEnabled();
        gw.threadWait(2000);

        act.sendKeys(mnuCuenta, Keys.ARROW_DOWN).build().perform();
        act.moveToElement(txtNumCuenta).click().build().perform();
        gw.threadWait(2000);

        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(numCuenta);

        gw.threadWait(2000);
        btnBuscarCuenta.waitUntilEnabled();
        btnBuscarCuenta.click();

        gw.threadWait(2000);
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
