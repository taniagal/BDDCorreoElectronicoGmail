package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.annotations.Named;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class HistorialCuentaPage extends Guidewire {
    public HistorialCuentaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    WebElementFacade mnuCuenta;

    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem-inputEl']")
    WebElementFacade txtNumCuenta;

    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem_Button']")
    WebElementFacade btnBuscarCuenta;

    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_History']/div")
    WebElementFacade mnuHistorial;

    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:relatedto-inputEl']")
    WebElementFacade btnMostrarRelacionadoCon;

    @FindBy(xpath="//li[5]")
    WebElementFacade itmRelacionadoCon;

    @FindBy(xpath="//td[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    WebElementFacade btnMostrarProducto;

    @FindBy(xpath="//li[2]")
    WebElementFacade itmProducto;

    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:user-inputEl']")
    WebElementFacade txtUsuario;

    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscarItem;

    @FindBy(xpath="//td/div/div[2]/div/table/tbody/tr/td/div")
    WebElementFacade itemTipoResultado;

    @FindBy(xpath="//td/div/div/div/div/div/div/span")
    WebElementFacade colTipo;

    @FindBy(xpath="//div/div/div[2]/div/span")
    WebElementFacade colUsuario;

    @FindBy(xpath="//div[3]/div/span")
    WebElementFacade colFechaTransaccion;

    @FindBy(xpath="//div/div/div[4]/div/span")
    WebElementFacade colDescripcion;

    @FindBy(xpath="//div[5]/div/span")
    WebElementFacade colProducto;

    @FindBy(xpath="//div[6]/div/span")
    WebElementFacade colPoliza;

    @FindBy(xpath="//div[7]/div/span")
    WebElementFacade colTransaccionPoliza;

    @FindBy(xpath="//div[8]/div/span")
    WebElementFacade colValorOriginal;

    @FindBy(xpath="//div[9]/div/span")
    WebElementFacade colValorNuevo;


    public void buscarCuenta(String numCuenta) {
        Actions act = new Actions(getDriver());
        mnuCuenta.click();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(numCuenta);
        btnBuscarCuenta.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void seleccionarHistorial() {
        mnuHistorial.waitUntilEnabled();
        mnuHistorial.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaRelacionadoCon(){

        btnMostrarRelacionadoCon.waitUntilEnabled();
        btnMostrarRelacionadoCon.click();
        itmRelacionadoCon.click();
        btnBuscarItem.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaProducto(){

        btnMostrarProducto.waitUntilEnabled();
        btnMostrarProducto.click();
        itmProducto.click();
        btnBuscarItem.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }




    public void buscarCuentaFecha(String fecha){
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(fecha);
        btnBuscarItem.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaFechaRango(String desde, String hasta){
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(desde);
        txtNumCuenta.type(hasta);
        btnBuscarItem.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaUsuario(String usuario) {
        txtUsuario.waitUntilEnabled();
        txtUsuario.type(usuario);
        btnBuscarItem.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void validarResultadoBusqueda(){
        try {

            assertThat(itemTipoResultado.getText().toString(), is(not(equalTo(""))));
            assertThat(itemTipoResultado.getText().toString(), is(not(equalTo(null))));

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void validarColumnasHistorialCuenta(String tipo,
                                               String usuario,
                                               String fechaTransaccion,
                                               String descripcion,
                                               String producto,
                                               String poliza,
                                               String transaccionPoliza,
                                               String valorOriginal,
                                               String valorNuevo){
        try {

            assertThat(colTipo.getText().toString(), is(equalTo(tipo)));
            assertThat(colUsuario.getText().toString(), is(equalTo(usuario)));
            assertThat(colFechaTransaccion.getText().toString(), is(equalTo(fechaTransaccion)));
            assertThat(colDescripcion.getText().toString(), is(equalTo(descripcion)));
            assertThat(colProducto.getText().toString(), is(equalTo(producto)));
            assertThat(colPoliza.getText().toString(), is(equalTo(poliza)));
            assertThat(colTransaccionPoliza.getText().toString(), is(equalTo(transaccionPoliza)));
            assertThat(colValorOriginal.getText().toString(), is(equalTo(valorOriginal)));
            assertThat(colValorNuevo.getText().toString(), is(equalTo(valorNuevo)));

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
