package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    //@FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_History']/div")
    @FindBy(xpath="//tr[13]/td/div/span")
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

    @FindBy(xpath="//li[2]")
    WebElementFacade itmRelacionadoConRenovacion;

    @FindBy(xpath="//td[3]/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    WebElementFacade txtFechaDesde;

    @FindBy(xpath="//tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    WebElementFacade txtFechaHasta;

    @FindBy(xpath="//td/div/div[2]/div/table")
    WebElementFacade table;

    @FindBy(xpath="//td[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    WebElementFacade txtProducto;

    public void buscarCuenta(String numCuenta) {
        Actions act = new Actions(getDriver());
        mnuCuenta.waitUntilEnabled();

        act.sendKeys(mnuCuenta,Keys.ARROW_DOWN).build().perform();
        act.moveToElement(txtNumCuenta).click().build().perform();
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(numCuenta);

        btnBuscarCuenta.waitUntilEnabled();
        btnBuscarCuenta.click();

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//
//            throw new RuntimeException(e);
//        }
        setImplicitTimeout(1, TimeUnit.SECONDS);
    }

    public void seleccionarHistorial() {
        mnuHistorial.waitUntilEnabled();
        mnuHistorial.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void buscarCuentaRelacionadoCon(){

        btnMostrarRelacionadoCon.waitUntilEnabled();
        btnMostrarRelacionadoCon.click();
        itmRelacionadoCon.waitUntilEnabled();
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

    public void buscarCuentaConMultiplesOpciones(String usuario, String fechaDesde, String fechaHasta){

        btnMostrarRelacionadoCon.waitUntilEnabled();
        btnMostrarRelacionadoCon.click();
        itmRelacionadoConRenovacion.click();
        txtUsuario.waitUntilEnabled();
        txtUsuario.type(usuario);
        txtFechaDesde.waitUntilEnabled();
        txtFechaDesde.type(fechaDesde);
        txtFechaHasta.waitUntilEnabled();
        txtFechaHasta.type(fechaHasta);

        btnBuscarItem.waitUntilEnabled();
        btnBuscarItem.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void validarDatosOpcionesMultiples(){

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        String usuario = txtUsuario.getValue().toString();

        try {

            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                assertThat(cells.get(1).getText(), is(equalTo(usuario)));
            }

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void validarResultadoProducto(){

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        String producto = txtProducto.getValue().toString();

        try {

            for (WebElement row : allRows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                assertThat(cells.get(4).getText(), is(equalTo(producto)));
            }

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
