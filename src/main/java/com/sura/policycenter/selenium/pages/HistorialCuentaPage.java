package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HistorialCuentaPage extends Guidewire {
    
    @FindBy(xpath=".//*[@id='TabBar:AccountTab-btnWrap']")
    private WebElementFacade mnuCuenta;
    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem-inputEl']")
    private WebElementFacade txtNumCuenta;
    @FindBy(xpath=".//*[@id='TabBar:AccountTab:AccountTab_AccountNumberSearchItem_Button']")
    private WebElementFacade btnBuscarCuenta;
    //@FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_History']/div")
    @FindBy(xpath="//tr[13]/td/div/span")
    private WebElementFacade mnuHistorial;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:relatedto-inputEl']")
    private WebElementFacade btnMostrarRelacionadoCon;
    @FindBy(xpath="//li[5]")
    private WebElementFacade itmRelacionadoCon;
    @FindBy(xpath="//td[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade btnMostrarProducto;
    @FindBy(xpath="//li[2]")
    private WebElementFacade itmProducto;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:user-inputEl']")
    private WebElementFacade txtUsuario;
    @FindBy(xpath=".//*[@id='AccountFile_History:HistoryScreenDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarItem;
    @FindBy(xpath="//td/div/div[2]/div/table/tbody/tr/td/div")
    private WebElementFacade itemTipoResultado;
    @FindBy(xpath="//td/div/div/div/div/div/div/span")
    private WebElementFacade colTipo;
    @FindBy(xpath="//div/div/div[2]/div/span")
    private WebElementFacade colUsuario;
    @FindBy(xpath="//div[3]/div/span")
    private WebElementFacade colFechaTransaccion;
    @FindBy(xpath="//div/div/div[4]/div/span")
    private WebElementFacade colDescripcion;
    @FindBy(xpath="//div[5]/div/span")
    private WebElementFacade colProducto;
    @FindBy(xpath="//div[6]/div/span")
    private WebElementFacade colPoliza;
    @FindBy(xpath="//div[7]/div/span")
    private WebElementFacade colTransaccionPoliza;
    @FindBy(xpath="//div[8]/div/span")
    private WebElementFacade colValorOriginal;
    @FindBy(xpath="//div[9]/div/span")
    private WebElementFacade colValorNuevo;
    @FindBy(xpath="//li[2]")
    private WebElementFacade itmRelacionadoConRenovacion;
    @FindBy(xpath="//td[3]/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade txtFechaDesde;
    @FindBy(xpath="//tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade txtFechaHasta;
    @FindBy(xpath="//td/div/div[2]/div/table")
    private WebElementFacade table;
    @FindBy(xpath="//td[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    private WebElementFacade txtProducto;

    public HistorialCuentaPage(WebDriver driver) {
        super(driver);
    }

    public void buscarCuenta(String numCuenta) {
        Actions act = new Actions(getDriver());
        mnuCuenta.waitUntilEnabled();
        act.sendKeys(mnuCuenta,Keys.ARROW_DOWN).build().perform();
        act.moveToElement(txtNumCuenta).click().build().perform();
        setImplicitTimeout(1, TimeUnit.SECONDS);
        waitABit(1000);
        txtNumCuenta.waitUntilEnabled();
        txtNumCuenta.type(numCuenta);
        btnBuscarCuenta.waitUntilEnabled();
        btnBuscarCuenta.click();
        setImplicitTimeout(1, TimeUnit.SECONDS);
    }

    public void seleccionarHistorial() {
        mnuHistorial.waitUntilEnabled();
        mnuHistorial.click();
        waitABit(3000);
    }

    public void buscarCuentaRelacionadoCon(){
        btnMostrarRelacionadoCon.waitUntilEnabled();
        btnMostrarRelacionadoCon.click();
        itmRelacionadoCon.waitUntilEnabled();
        itmRelacionadoCon.click();
        btnBuscarItem.click();
        waitABit(3000);
    }

    public void buscarCuentaProducto(){
        btnMostrarProducto.waitUntilEnabled();
        btnMostrarProducto.click();
        itmProducto.click();
        btnBuscarItem.click();
        waitABit(3000);
    }

    public void validarResultadoBusqueda(){
        assertThat(itemTipoResultado.getText().toString(), is(not(equalTo(""))));
        assertThat(itemTipoResultado.getText().toString(), is(not(equalTo(null))));
    }

    public void validarColumnasHistorialCuenta(){
        assertThat(colTipo.getText().toString(), is(not(equalTo(null))));
        assertThat(colUsuario.getText().toString(), is(not(equalTo(null))));
        assertThat(colFechaTransaccion.getText().toString(), is(not(equalTo(null))));
        assertThat(colDescripcion.getText().toString(), is(not(equalTo(null))));
        assertThat(colProducto.getText().toString(), is(not(equalTo(null))));
        assertThat(colPoliza.getText().toString(), is(not(equalTo(null))));
        assertThat(colTransaccionPoliza.getText().toString(), is(not(equalTo(null))));
        assertThat(colValorOriginal.getText().toString(), is(not(equalTo(null))));
        assertThat(colValorNuevo.getText().toString(), is(not(equalTo(null))));
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
        waitABit(3000);
    }

    public void validarDatosOpcionesMultiples(){
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        String usuario = txtUsuario.getValue().toString();
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            assertThat(cells.get(1).getText(), is(equalTo(usuario)));
        }
    }

    public void validarResultadoProducto(){
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        String producto = txtProducto.getValue().toString();
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            assertThat(cells.get(4).getText(), is(equalTo(producto)));
        }
    }
}
